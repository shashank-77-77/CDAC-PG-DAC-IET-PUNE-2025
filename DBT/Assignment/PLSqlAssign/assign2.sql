drop procedure if EXISTS place_order;
 DELIMITER $
 CREATE PROCEDURE place_order (IN p_customer_id INT, IN p_product_id INT, IN p_qty INT)
 /*•	Create a procedure place_order(p_customer_id, p_product_id, p_qty)
•	Check if stock is available.
•	If yes, reduce stock, insert into orders, and calculate bill with 18% GST.
•	If not, raise an exception.
•	Assign random discounts between 5% and 30% whenever a product is added.
•	Whenever a new order is placed, assign a random cashback (0 to ₹100).

*/

 BEGIN
 -- •	Check if stock is available.
 DECLARE stock_bal int;
 DECLARE p_price int;
 START TRANSACTION;
 
select  stock INTO  stock_bal from ecom_product 
WHERE product_id=  p_product_id;

select price into p_price from ecom_product where product_id=p_product_id;
 
  IF stock_bal IS NULL THEN
        ROLLBACK;
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Product does not exist.';
    ELSEIF stock_bal < p_qty THEN
        ROLLBACK;
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Insufficient stock.';
    ELSE
	
update ecom_product 
 set stock= stock- p_qty
 where product_id=p_product_id;
 
 
 INSERT INTO ecom_order (customer_id,product_id,qty, total_price, order_date) VALUES (p_customer_id,p_product_id,p_qty, p_price*p_qty*1.18,NOW());
COMMIT;
END IF;
 
 
 END $
 DELIMITER ;
 
 /*+------------+--------------+-------+-------+
| product_id | product_name | price | stock |
+------------+--------------+-------+-------+
|        100 | bread        |    30 |    10 |
|        101 | jam          |    50 |    20 |
|        102 | butter       |    60 |    15 |
|        103 | biscuit      |    10 |    25 |
|        104 | chocolate    |   100 |     5 |
+------------+--------------+-------+-------+
5 rows in set (0.00 sec)*/
 
 /*+----------+-------------+------------+------+-------------+------------+
|  | customer_id | product_id | qty  | total_price | order_date |
+----------+-------------+------------+------+-------------+------------+
|        1 |         200 |        100 |    2 |          60 | 2025-11-13 |
|        2 |         201 |        101 |    3 |         120 | 2025-11-13 |
+----------+-------------+------------+------+-------------+------------+
2 rows in set (0.00 sec)*/