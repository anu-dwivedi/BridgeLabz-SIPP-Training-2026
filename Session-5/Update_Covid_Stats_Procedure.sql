USE covid_db;

DELIMITER //

CREATE PROCEDURE UpdateCovidStats(
    IN p_country VARCHAR(100),
    IN p_date DATE,
    IN p_confirmed INT,
    IN p_deaths INT,
    IN p_recovered INT
)
BEGIN

    UPDATE covid_cases
    SET confirmed = p_confirmed,
        deaths = p_deaths,
        recovered = p_recovered
    WHERE Country = p_country
    AND Date = p_date;

END //

DELIMITER ;

CALL UpdateCovidStats('India','2022-01-01',1000,20,800);
