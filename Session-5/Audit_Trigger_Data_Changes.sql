USE covid_db;

CREATE TABLE IF NOT EXISTS covid_cases_audit (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Country VARCHAR(100),
    old_confirmed INT,
    new_confirmed INT,
    old_deaths INT,
    new_deaths INT,
    changed_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

DELIMITER //

CREATE TRIGGER before_covid_update
BEFORE UPDATE ON covid_cases
FOR EACH ROW
BEGIN

    INSERT INTO covid_cases_audit(
        Country,
        old_confirmed,
        new_confirmed,
        old_deaths,
        new_deaths
    )
    VALUES(
        OLD.Country,
        OLD.confirmed,
        NEW.confirmed,
        OLD.deaths,
        NEW.deaths
    );

END //

DELIMITER ;
