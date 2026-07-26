USE covid_db;

CREATE INDEX idx_infection_rate
ON covid_cases (infection_rate DESC);

SELECT Country, infection_rate
FROM covid_cases
ORDER BY infection_rate DESC
LIMIT 10;
