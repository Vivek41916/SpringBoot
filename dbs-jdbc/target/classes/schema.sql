CREATE TABLE EMP (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    salary int,
    PRIMARY KEY (id)
);
INSERT INTO EMP (name, salary)
VALUES ('Venkat',49000);
INSERT INTO EMP (name, salary)
VALUES ('Sai',95000);
INSERT INTO EMP (name, salary)
VALUES ('Harsha',75000);
create TABLE Student (
    sno int ,
    name varchar(200),
    phoneno int
);
INSERT INTO Student (sno,name, phoneno)
VALUES (333,'Ramya',984);