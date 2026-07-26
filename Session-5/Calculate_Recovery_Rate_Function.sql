USE covid_db;

DELIMITER //

CREATE FUNCTION CalculateRecoveryRate(
    c_country VARCHAR(100)
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE rate DECIMAL(10,2);

    SELECT (recovered / confirmed) * 100
    INTO rate
    FROM covid_cases
    WHERE Country = c_country
    ORDER BY Date DESC
    LIMIT 1;

    RETURN rate;
END //

DELIMITER ;

SELECT CalculateRecoveryRate('India');
