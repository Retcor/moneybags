CREATE TABLE user (
id int AUTO_INCREMENT PRIMARY KEY,
user_name VARCHAR(20),
password VARCHAR(20)
);

CREATE TABLE expense (
id int AUTO_INCREMENT PRIMARY KEY,
user_id int,
description VARCHAR(20),
amount double,
due_date DATE
);

CREATE TABLE debt (
id int AUTO_INCREMENT PRIMARY KEY,
user_id int,
description VARCHAR(20),
pay_amount double,
due_date date,
rate double,
total_left double
);