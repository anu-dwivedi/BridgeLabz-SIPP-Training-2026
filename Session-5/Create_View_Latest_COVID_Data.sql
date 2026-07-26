USE covid_db;

CREATE VIEW latest_covid_data AS
SELECT 
    Country,
    Date,
    confirmed,
    deaths,
    recovered
FROM covid_cases
WHERE Date = (
    SELECT MAX(Date)
    FROM covid_cases
);

SELECT * FROM latest_covid_data;
