CREATE DATABASE IF NOT EXISTS StudentManagement;
USE StudentManagement;

CREATE TABLE IF NOT EXISTS department (
    dep_id INT PRIMARY KEY,
    dep_name VARCHAR(100) NOT NULL,
    dep_code VARCHAR(20) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS student (
    stu_id VARCHAR(20) PRIMARY KEY,
    stu_name VARCHAR(100) NOT NULL,
    stu_roll VARCHAR(50) NOT NULL,
    dep_id INT,
    FOREIGN KEY (dep_id) REFERENCES department(dep_id)
);

select * from StudentManagement.student;
select * from StudentManagement.department;