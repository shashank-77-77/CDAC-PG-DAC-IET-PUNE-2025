DELIMITER $$

CREATE FUNCTION Encrypt_string(str VARCHAR(100))
RETURNS VARCHAR(100)
DETERMINISTIC
BEGIN
    DECLARE i INT DEFAULT 1;
    DECLARE result VARCHAR(100) DEFAULT '';
    
    WHILE i <= CHAR_LENGTH(str) DO
        SET result = CONCAT(
            result,
            CHAR(ASCII(SUBSTRING(str, i, 1)) + 1)
        );
        SET i = i + 1;
    END WHILE;

    RETURN result;
END$$

DELIMITER ;
