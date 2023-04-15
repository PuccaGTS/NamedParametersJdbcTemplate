create table if not exists netology.customers (
id int auto_increment primary key,
name varchar(255),
surname varchar(255),
age int,
phone_number varchar(255)
);

create table if not exists netology.orders (
id int auto_increment primary key,
date date,
customer_id int,
product_name varchar(255),
amount int,
foreign key (customer_id) References netology.customers (id)
);

insert into netology.customers (name, surname, age, phone_number)
values ('Oleg', 'Olegov', 25, '31241241241'),
       ('Alexey', 'Ivanov', 10, '3122222241'),
       ('Ivan', 'Togov', 18, '345324242422'),
       ('alexey', 'Petrov', 14, '222222222222'),
       ('aLeXey', 'Rogov', 54, '1111111111');

insert into netology.orders (date, customer_id, product_name, amount)
values ('2023-01-02', '2', 'Bread', 5),
       ('2023-02-12', '3', 'Apple', 10),
       ('2023-03-04', '1', 'Table', 1),
       ('2023-04-01', '5', 'Cake', 4),
       ('2023-04-04', '4', 'Orange', 3);