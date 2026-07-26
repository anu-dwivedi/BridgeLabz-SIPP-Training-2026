USE covid_db;

START TRANSACTION;

INSERT INTO covid_vaccinations
(Country, Date, total_vaccinations)
VALUES
('India', '2022-01-01', 1000000);

INSERT INTO covid_vaccinations
(Country, Date, total_vaccinations)
VALUES
('USA', '2022-01-01', 800000);

COMMIT;

ROLLBACK;
