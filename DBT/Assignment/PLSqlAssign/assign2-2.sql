DELIMITER $
DROP PROCEDURE IF EXISTS place_order;
CREATE PROCEDURE place_order (IN p_customer_id INT, IN p_product_id INT, IN p_qty INT)
BEGIN
    DECLARE stock_bal INT;
    DECLARE v_price DECIMAL(10,2);
    DECLARE v_discount INT;
    DECLARE v_discounted_price DECIMAL(10,2);
    DECLARE v_gst DECIMAL(10,2);
    DECLARE v_total_price DECIMAL(10,2);
    DECLARE v_cashback INT;
    DECLARE v_order_id INT;

    START TRANSACTION;

    -- Fetch stock and price
    SELECT stock, price INTO stock_bal, v_price 
    FROM ecom_product 
    WHERE product_id = p_product_id;

    -- Check stock availability
    IF stock_bal IS NULL THEN
        ROLLBACK;
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Product does not exist.';
    ELSEIF stock_bal < p_qty THEN
        ROLLBACK;
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Insufficient stock.';
    ELSE
        -- Generate random discount (5-30%)
        SET v_discount = FLOOR(RAND() * 26) + 5;
        -- Calculate discounted price
        SET v_discounted_price = v_price * (1 - v_discount / 100);
        -- Calculate GST (18% on discounted price)
        SET v_gst = v_discounted_price * 0.18;
        -- Calculate total price
        SET v_total_price = (v_discounted_price + v_gst) * p_qty;

        -- Reduce stock
        UPDATE ecom_product 
        SET stock = stock - p_qty 
        WHERE product_id = p_product_id;

        -- Insert order (assuming order_id is auto-increment)
        INSERT INTO ecom_order (customer_id, product_id, qty, total_price, order_date) 
        VALUES (p_customer_id, p_product_id, p_qty, v_total_price, NOW());

        -- Get the generated order_id
        SET v_order_id = LAST_INSERT_ID();

        -- Generate random cashback (0-100)
        SET v_cashback = FLOOR(RAND() * 101);
        -- (Optional: Insert cashback into a wallet table, e.g., INSERT INTO customer_wallet (customer_id, cashback) VALUES (p_customer_id, v_cashback);)

        COMMIT;
    END IF;
END $
DELIMITER ;