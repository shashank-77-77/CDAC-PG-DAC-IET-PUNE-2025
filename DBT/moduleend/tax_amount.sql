DELIMITER $$

CREATE FUNCTION tax_amount(income DECIMAL(10,2))
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE tax DECIMAL(10,2);

    IF income BETWEEN 250000 AND 500000 THEN
        SET tax = income * 0.05;
    ELSEIF income > 500000 AND income <= 1000000 THEN
        SET tax = income * 0.20;
    ELSEIF income > 1000000 THEN
        SET tax = income * 0.30;
    ELSE
        SET tax = 0;
    END IF;

    RETURN tax;
END$$

DELIMITER ;