DROP TABLE IF EXISTS Employee;

CREATE TABLE Employee (
    id INTEGER PRIMARY KEY NOT NULL,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    department VARCHAR(10)
);