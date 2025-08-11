create database student_management_system_JDBC;
use student_management_system_JDBC;

create table students (
    s_id int auto_increment primary key,
    s_name varchar(100),
    s_rollNo varchar(20) unique,
    s_age int,
    s_dept varchar(100)
);

CREATE TABLE IF NOT EXISTS courses (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL UNIQUE
);


CREATE TABLE IF NOT EXISTS departments (
    dep_id INT PRIMARY KEY AUTO_INCREMENT,
    dep_name VARCHAR(100) NOT NULL UNIQUE,
    dep_code VARCHAR(20) NOT NULL UNIQUE
);
INSERT INTO departments (dep_name, dep_code) 
VALUES 
('BA LLB', 'LL23B'),
('BBA', 'BB23A'),
('MBA', 'MB23A'),
('Cyber Security', 'CS23Y'),
('Bs Software Engineering', 'SE23F'),
('MA English', 'E23F'),
('Environmental Science', 'ES23F'),
('Chemical Engineering', 'CH23E');




select * from student;
select * from courses;
select * from departments;
