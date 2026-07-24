# Q7 – Employees Hired in 1994

## Assignment

Create a report that displays the last name and hire date for all employees who were hired in 1994.

## SQL Query

SELECT last_name, hire_date
FROM employees
WHERE hire_date >= '01-JAN-1994'
  AND hire_date < '01-JAN-1995';

## Explanation

This query displays the last name and hire date of employees hired during the year 1994.

The WHERE condition filters the employees whose hire date is from 01-JAN-1994 to 31-DEC-1994.

## Result

The query was executed successfully in Oracle SQL Developer.

No rows were returned because there are no employees in the HR sample database who were hired during the year 1994.

Therefore, the result is empty. This is an expected result and not a SQL error.

