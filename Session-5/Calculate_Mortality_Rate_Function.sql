USE covid_db;

DELIMITER //

CREATE FUNCTION CalculateMortalityRate(
    c_country VARCHAR(100),
    c_date DATE
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE rate DECIMAL(10,2);

    SELECT (deaths / confirmed) * 100
    INTO rate
    FROM covid_cases
    WHERE Country = c_country
    AND Date = c_date;

    RETURN rate;
END //

DELIMITER ;

SELECT CalculateMortalityRate('India','2022-01-01');
