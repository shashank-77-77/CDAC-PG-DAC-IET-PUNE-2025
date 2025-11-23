drop procedure if exists transfer_funds;
DELIMITER $
create procedure transfer_funds(p_from_acc INT, p_to_acc INT, p_amount INT)

BEGIN
/*•	If balance is insufficient then all transactions should be rollbacked.*/
	  DECLARE sender_balance INT;
	DECLARE sender_exists INT default 0;
	DECLARE receiver_exists INT default 0;
	
	-- Start a transaction (so we can rollback if needed)
    START TRANSACTION;
	
	-- Check if sender account exists and get balance
	select COUNT(*), balance INTO sender_exists, sender_balance from accounts WHERE acc_no = p_from_acc group by balance;
	
	-- Check if receiver account exists
	SELECT COUNT(*) INTO receiver_exists FROM accounts 
	WHERE acc_no = p_to_acc;
/*if dout search*/

 -- Validate: Accounts must exist, amount must be positive, and sender must have sufficient balance
    IF sender_exists = 0 THEN
        -- Rollback and signal error
        ROLLBACK;
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Sender account does not exist.';
    ELSEIF receiver_exists = 0 THEN
        ROLLBACK;
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Receiver account does not exist.';
    ELSEIF p_amount <= 0 THEN
        ROLLBACK;
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Transfer amount must be positive.';
    ELSEIF sender_balance < p_amount THEN
        -- Insufficient balance: Rollback all changes
        ROLLBACK;
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Insufficient balance in sender account. Transaction rolled back.';
    ELSE
/*Deduct amount from sender, add to receiver.*/
UPDATE accounts 
SET balance=balance - p_amount
WHERE acc_no = p_from_acc;

UPDATE accounts
SET balance= balance + p_amount
WHERE acc_no = p_to_acc;

/*insert a log entry into transaction_history.*/
INSERT INTO transaction_history (from_acc,to_acc,amount, txn_date) VALUES (p_from_acc,p_to_acc,p_amount,NOW());
 END IF;
END $
DELIMITER ;


/*
•	Write a procedure transfer_funds(p_from_acc, p_to_acc, p_amount)
•	Deduct amount from sender, add to receiver.
•	If balance is insufficient then all transactions should be rollbacked.
•	Insert a log entry into transaction_history.
1.	CREATE TABLE accounts (acc_no INT PRIMARY KEY, cust_name VARCHAR(50), balance INT);

2.	CREATE TABLE transaction_history (txn_id INT AUTO_INCREMENT PRIMARY KEY, from_acc INT, to_acc INT, amount INT, txn_date DATE DEFAULT CURDATE

*/