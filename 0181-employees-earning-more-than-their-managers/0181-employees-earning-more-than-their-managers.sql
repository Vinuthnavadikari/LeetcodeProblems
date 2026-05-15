# Write your MySQL query statement below
-- SELECT e2.name as Employee
-- FROM employee e1
-- JOIN employee e2
-- ON e1.id=e2.managerId
-- WHERE e1.salary<e2.salary;
-- SELECT name as Employee
-- FROM Employee e
-- WHERE salary >(SELECT salary from Employee m WHERE m.id=e.managerId);
SELECT 
e.name AS Employee
FROM Employee e
WHERE e.salary>(SELECT m.salary FROM Employee m  WHERE m.id=e.managerId);