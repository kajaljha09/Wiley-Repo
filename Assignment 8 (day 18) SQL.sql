use firstdb;
CREATE TABLE Employee (
    Employee_id int AUTO_INCREMENT PRIMARY KEY,
    First_name VARCHAR(50),
    Last_name VARCHAR(50),
    Salary int,
    Joining_date Date,
    Departement  VARCHAR(50) 
);
/* Employee table creation */
CREATE TABLE reward (
    Employee_ref_id int,
    date_reward Date,
    amount int,
    FOREIGN KEY (Employee_ref_id) REFERENCES Employee(Employee_id)
);



INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (1, 'Bob', 'Kinto', 1000000, "2019-01-20", "Finance");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (2, 'Jerry', 'Kansxo', 6000000, "2019-01-15", "IT");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (3, 'Philip', 'Jose', 8900000, "2019-02-05", "Banking");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (4, 'John', 'Abraham', 2000000, "2019-02-25", "Insurance");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (5, 'Michael', 'Mathew', 2200000, "2019-02-28", "Finance");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (6, 'Alex', 'chreketo', 4000000, "2019-05-10", "IT");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (7, 'Yohan', 'Soso', 1230000, "2019-06-20", "Banking");
/* queries to insert into reward */
INSERT INTO reward (Employee_ref_id, date_reward, amount) VALUES (1, '2019-05-11', '1000');
INSERT INTO reward (Employee_ref_id, date_reward, amount) VALUES (2, '2019-02-15', '5000');
INSERT INTO reward (Employee_ref_id, date_reward, amount) VALUES (3, '2019-04-22', '2000');
INSERT INTO reward (Employee_ref_id, date_reward, amount) VALUES (1, '2019-06-20', '8000');
-- #1 --
SELECT * FROM employee;

-- #2 --
SELECT first_name, last_name from employee;

-- #3 --
SELECT FIRST_NAME AS 'EMPLOYEE NAME' FROM EMPLOYEE;

-- #4 --
SELECT lower(LAST_NAME) AS LAST_NAME FROM EMPLOYEE; 

-- #5 --
SELECT UPPER(LAST_NAME) AS LAST_NAME FROM EMPLOYEE; 

-- #6 --
SELECT DISTINCT Departement FROM EMPLOYEE;

-- #7 --
SELECT substr(FIRST_NAME,1,4) FROM EMPLOYEE;

-- #8 --
SELECT POSITION('h' IN  'John') AS MatchPosition; 

-- SELECT @@version-- 

-- #9 --
SELECT RTRIM(FIRST_NAME) FROM EMPLOYEE;

-- #10 --
SELECT LTRIM(FIRST_NAME) FROM EMPLOYEE;

-- #11 --
SELECT FIRST_NAME, length(FIRST_NAME) FROM EMPLOYEE;

-- #12 --
SELECT replace(FIRST_NAME, 'o', '#') FROM EMPLOYEE;

-- #13 --
SELECT FIRST_NAME, year(Joining_date), month(Joining_date), day(Joining_date) FROM EMPLOYEE;

-- #14 --
SELECT * FROM EMPLOYEE order by FIRST_NAME;

-- #15 --
SELECT * FROM EMPLOYEE order by FIRST_NAME DESC;
 
 -- #16 --
SELECT * FROM EMPLOYEE order by FIRST_NAME, SALARY DESC;
 
 -- #17 --
SELECT * FROM EMPLOYEE WHERE FIRST_NAME = 'Bob';
  
  -- #18 --
SELECT * FROM EMPLOYEE WHERE FIRST_NAME = 'Bob' or FIRST_NAME = 'Alex' ;

-- #19 --
SELECT * FROM EMPLOYEE WHERE FIRST_NAME NOT IN ('Bob','Alex');

-- #20 --
SELECT * FROM employee WHERE FIRST_NAME LIKE 'J___';

-- #21 --
SELECT * FROM EMPLOYEE WHERE month(Joining_date) = '01';

-- #22 --
SELECT * FROM EMPLOYEE WHERE JOINING_DATE < '2019-03-01';
-- SELECT * FROM EMPLOYEE WHERE year(Joining_date) = '2019' AND month(Joining_date) < '03' AND day(Joining_date) > '01';--

-- #23 --
SELECT * FROM employee;
SELECT * FROM REWARD;

SELECT E.Employee_id, e.FIRST_NAME, e.JOINING_DATE, R.DATE_REWARD, DATEDIFF(r.DATE_REWARD, e.JOINING_DATE) AS 'DIFFERENCE IN DATES' FROM EMPLOYEE E, REWARD R WHERE E.Employee_id = R.Employee_ref_id;
SELECT E.Employee_id, e.FIRST_NAME, e.JOINING_DATE, R.DATE_REWARD, ABS(TIMESTAMPDIFF(DAY, r.DATE_REWARD, e.JOINING_DATE)) AS 'DIFFERENCE IN DATES' FROM EMPLOYEE E, REWARD R WHERE E.Employee_id = R.Employee_ref_id;
SELECT E.Employee_id, e.FIRST_NAME, e.JOINING_DATE, R.DATE_REWARD, ABS(TIMESTAMPDIFF(MONTH, r.DATE_REWARD, e.JOINING_DATE)) AS 'DIFFERENCE IN DATES' FROM EMPLOYEE E, REWARD R WHERE E.Employee_id = R.Employee_ref_id;
SELECT E.Employee_id, e.FIRST_NAME, e.JOINING_DATE, R.DATE_REWARD, ABS(TIMESTAMPDIFF(YEAR, r.DATE_REWARD, e.JOINING_DATE)) AS 'DIFFERENCE IN DATES' FROM EMPLOYEE E, REWARD R WHERE E.Employee_id = R.Employee_ref_id;
