# Write your MySQL query statement below
WITH daily_amount AS(
    SELECT visited_on,
    SUM(amount) AS day_amount
    FROM Customer
    GROUP BY visited_on
),
moving_window AS(
    SELECT visited_on,
    SUM(day_amount)OVER (
        ORDER BY visited_on
        ROWS BETWEEN 6 PRECEDING AND CURRENT ROW
    )AS amount,
    AVG(day_amount) OVER(
        ORDER BY visited_on
        ROWS BETWEEN 6 PRECEDING AND CURRENT ROW
    )AS average_amount,
    ROW_NUMBER()OVER (ORDER BY visited_on)AS rn
    FROM daily_amount
)
SELECT visited_on,amount,
ROUND(average_amount,2) AS average_amount
FROM moving_window
WHERE rn>=7
ORDER BY visited_on ASC;