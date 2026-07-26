USE covid_db;

EXPLAIN
SELECT c.Country,
       c.Date,
       v.total_vaccinations
FROM covid_cases c
JOIN covid_vaccinations v
ON c.Country = v.Country
AND c.Date = v.Date
WHERE c.Country = 'India'
ORDER BY c.Date;

SHOW INDEX FROM covid_cases;
SHOW INDEX FROM covid_vaccinations;
