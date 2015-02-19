CREATE TABLE user (
id int AUTO_INCREMENT PRIMARY KEY,
userName VARCHAR(20),
password VARCHAR(20)
);

CREATE TABLE expenses (
id int AUTO_INCREMENT PRIMARY KEY,
user int,
description VARCHAR(20),
amount double,
dueDate DATE
);

CREATE TABLE debts (
id int AUTO_INCREMENT PRIMARY KEY,
user int,
description VARCHAR(20),
payAmount double,
dueDate date,
rate double,
totalLeft double
);