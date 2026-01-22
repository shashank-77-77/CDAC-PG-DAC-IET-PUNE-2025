DELIMITER $$

CREATE PROCEDURE deleteEmployee(IN empID INT)
BEGIN
    DECLARE empCount INT DEFAULT 0;

    SELECT COUNT(*)
    INTO empCount
    FROM emp
    WHERE empno = empID;

    IF empCount = 0 THEN
        SELECT 'Employee could not be found' AS Message;
    ELSE
        DELETE FROM emp WHERE empno = empID;
        SELECT 'Employee deleted successfully' AS Message;
    END IF;
END$$

DELIMITER ;
