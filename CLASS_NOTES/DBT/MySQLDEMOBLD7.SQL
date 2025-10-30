
DROP TABLE IF EXISTS A;
DROP TABLE IF EXISTS B;
DROP TABLE IF EXISTS EMP;
DROP TABLE IF EXISTS DEPT;
DROP TABLE IF EXISTS REPLACEDEPT;
DROP TABLE IF EXISTS BONUS;
DROP TABLE IF EXISTS SALGRADE;
DROP TABLE IF EXISTS DUMMY;
DROP TABLE IF EXISTS ITEM;
DROP TABLE IF EXISTS PRICE;
DROP TABLE IF EXISTS PRODUCT;

DROP TABLE IF EXISTS EMP_Cards;
DROP TABLE IF EXISTS emp_phone;
DROP TABLE IF EXISTS EMP1;
DROP TABLE IF EXISTS EMP2;
DROP TABLE IF EXISTS DEPT1;
DROP TABLE IF EXISTS DEPT2;
DROP TABLE IF EXISTS DEPT3;
DROP TABLE IF EXISTS regexpr;
DROP TABLE IF EXISTS temp1;
DROP TABLE IF EXISTS SORT;
DROP TABLE IF EXISTS Location;
DROP TABLE IF EXISTS TableA;
DROP TABLE IF EXISTS TableB;
DROP TABLE IF EXISTS TableAA;
DROP TABLE IF EXISTS TableBB;
DROP TABLE IF EXISTS HOBBY;
DROP TABLE IF EXISTS NEW;
DROP TABLE IF EXISTS BLANKTABLEA;
DROP TABLE IF EXISTS BLANKTABLEB;
DROP TABLE IF EXISTS NEAREST;
DROP TABLE IF EXISTS DEMODEPT1;
DROP TABLE IF EXISTS DEMODEPT2;
DROP TABLE IF EXISTS COALESCE;
DROP TABLE IF EXISTS DUPLICATE;
DROP TABLE IF EXISTS NULLIF;
DROP TABLE IF EXISTS STATUS;
DROP TABLE IF EXISTS SALESPERSON;
DROP TABLE IF EXISTS MENUCARD;
DROP TABLE IF EXISTS SOFTDRINK;
DROP TABLE IF EXISTS SETA;
DROP TABLE IF EXISTS SETB;
DROP TABLE IF EXISTS STATES;
DROP TABLE IF EXISTS STATION;
DROP TABLE IF EXISTS Z;
DROP TABLE IF EXISTS ORDERS;
DROP TABLE IF EXISTS CUSTOMERS;
DROP TABLE IF EXISTS SALESPEOPLE;
DROP TABLE IF EXISTS TASKS;
DROP TABLE IF EXISTS r1;
DROP TABLE IF EXISTS r2;
DROP TABLE IF EXISTS envelope;
DROP TABLE IF EXISTS docs;
DROP TABLE IF EXISTS tableA;
DROP TABLE IF EXISTS tableB;
DROP TABLE IF EXISTS warehouse;
DROP TABLE IF EXISTS sales_channel;
DROP TABLE IF EXISTS comments;
DROP TABLE IF EXISTS blog;
DROP TABLE IF EXISTS agent;
DROP TABLE IF EXISTS licence;
DROP TABLE IF EXISTS client;
DROP TABLE IF EXISTS books;
DROP TABLE IF EXISTS newbooks;
DROP TABLE IF EXISTS key_parts;

DROP TABLE If EXISTS mass_table;
DROP TABLE If EXISTS runners;
DROP TABLE If EXISTS races;
DROP TABLE If EXISTS revenue;

DROP TABLE If EXISTS candidate;
DROP TABLE If EXISTS votes;
DROP TABLE If EXISTS points;
DROP TABLE If EXISTS andor;
DROP TABLE If EXISTS stadium;
DROP TABLE IF EXISTS transactions;
DROP TABLE IF EXISTS empj;
drop table if EXISTS emp_attendance;
drop table if EXISTS vote_response;
drop table if EXISTS quarterly_revenue;
drop table if EXISTS yearly_revenue;
drop table if EXISTS numberString;
drop table if EXISTS stringNumber;

drop table if EXISTS server;
drop table if EXISTS runningServer;

drop table if EXISTS plumber;
drop table if EXISTS service;
drop table if EXISTS plumber_service_map;
drop table if EXISTS r;
drop table if EXISTS product_sales;
drop table if exists leadtable;
drop table if exists traintimetable;
drop table if exists pivot_table;
drop table if exists unpivot_table;

DROP TABLE IF EXISTS PRODUCTS;
DROP TABLE IF EXISTS ORD;
DROP TABLE IF EXISTS CUSTOMER;
drop table if exists orderDetails;

drop table if exists prescription;
drop table if exists doctorVisits;
drop table if exists patient;
drop table if exists doctor;
drop table if exists labTestList;
drop table if exists medicineList;

drop table if EXISTS rocket;

DROP VIEW IF EXISTS SALES;

drop table if exists job_list;
drop table if exists overtime;

drop table if exists sourceNames;
drop table if exists targetNames;
drop table if exists phonecall;
drop table if exists fullname;
drop table if exists missingNumbers;
drop table if exists shop;
drop table if exists leading_zeroes;
drop table if exists x;

/* ------------------------------ */

drop table if exists stages;
drop table if exists order_items;
drop table if exists Teams;
DROP TABLE IF EXISTS batch_schedule;

DROP TABLE IF EXISTS city;

DROP TABLE IF EXISTS ipl;

DROP TABLE IF EXISTS order1;
DROP TABLE IF EXISTS sales1;

DROP TABLE IF EXISTS null1;
DROP TABLE IF EXISTS null2;


DROP TABLE IF EXISTS ClassAndSubjects;

DROP TABLE IF EXISTS swapCity;

DROP TABLE IF EXISTS atm;

DROP TABLE IF EXISTS sourceCity;
DROP TABLE IF EXISTS targetCity;

DROP TABLE IF EXISTS cricketWinnerTeam;
DROP TABLE IF EXISTS brands;

DROP TABLE If EXISTS food;
DROP TABLE If EXISTS company;

DROP TABLE IF EXISTS food_category_tags;
DROP TABLE IF EXISTS food_items;

DROP TABLE IF EXISTS Activity;

DROP TABLE IF EXISTS bitwise;
DROP TABLE IF EXISTS airline_seats;

DROP TABLE IF EXISTS Facebook;
DROP TABLE IF EXISTS LinkedIn;
DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS room_assigned;

DROP TABLE IF EXISTS overlapping_dates;

DROP TABLE IF EXISTS hall_ticket;

DROP TABLE IF EXISTS stocks; 

DROP TABLE IF EXISTS cafe;

DROP TABLE IF EXISTS rooms;
DROP TABLE IF EXISTS room_staff;

DROP TABLE IF EXISTS fruits;

DROP TABLE IF EXISTS years;
DROP TABLE IF EXISTS year_of_service;

DROP TABLE IF EXISTS category;

DROP TABLE IF EXISTS cashPayments;
DROP TABLE IF EXISTS cardPayments;

DROP TABLE IF EXISTS onlineOrders;
DROP TABLE IF EXISTS fromStoreOrders;

DROP TABLE IF EXISTS repeatingNumbers;

DROP TABLE IF EXISTS countNumbers;

DROP TABLE IF EXISTS countNulls;

DROP TABLE IF EXISTS cNumbers;


DROP TABLE IF EXISTS fedex;
DROP TABLE IF EXISTS ups;
DROP TABLE IF EXISTS dhl;


DROP TABLE IF EXISTS trains;
DROP TABLE IF EXISTS reservations;

DROP TABLE IF EXISTS bankLoan;

DROP TABLE IF EXISTS population;

DROP TABLE IF EXISTS Managers;
DROP TABLE IF EXISTS Trainers;

DROP TABLE IF EXISTS betweenSalary;

DROP TABLE IF EXISTS categories;

DROP TABLE IF EXISTS bus_stops;
DROP TABLE IF EXISTS pune_metro_stations;

CREATE TABLE bus_stops(stop_id INT PRIMARY KEY, stop_name VARCHAR(100), route_no VARCHAR(50), city VARCHAR(50), next_stop_id INT, distance_to_next_km DECIMAL(4,2));

INSERT INTO bus_stops (stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) VALUES (1, 'Central Bus Station', 'R101', 'Pune', 2, 1.5),(2, 'Deccan Gymkhana', 'R101', 'Pune', 3, 2.0),(3, 'Kothrud Depot', 'R101', 'Pune', 4, 1.8),(4, 'Warje Naka', 'R101', 'Pune', 5, 2.4),(5, 'Chandani Chowk', 'R101', 'Pune', NULL, NULL),(6, 'Swargate', 'R102', 'Pune', 7, 2.3),(7, 'Camp', 'R102', 'Pune', 8, 1.7),(8, 'Koregaon Park', 'R102', 'Pune', 9, 2.5),(9, 'Kalyani Nagar', 'R102', 'Pune', 10, 3.0),(10, 'Viman Nagar', 'R102', 'Pune', NULL, NULL),(11, 'Shivajinagar', 'R103', 'Pune', 12, 1.2),(12, 'Aundh', 'R103', 'Pune', 13, 1.8),(13, 'Baner', 'R103', 'Pune', 14, 2.2),(14, 'Balewadi Stadium', 'R103', 'Pune', 15, 3.1),(15, 'Hinjewadi Phase 1', 'R103', 'Pune', NULL, NULL),(16, 'Thane Station', 'R104', 'Mumbai', 17, 2.0),(17, 'Teen Hath Naka', 'R104', 'Mumbai', 18, 1.3),(18, 'Mulund Check Naka', 'R104', 'Mumbai', 19, 3.5),(19, 'Vikhroli', 'R104', 'Mumbai', 20, 4.0),(20, 'Ghatkopar', 'R104', 'Mumbai', NULL, NULL),(21, 'Borivali Station', 'R105', 'Mumbai', 22, 1.7),(22, 'Kandivali', 'R105', 'Mumbai', 23, 2.4),(23, 'Malad', 'R105', 'Mumbai', 24, 1.9),(24, 'Goregaon', 'R105', 'Mumbai', 25, 2.6),(25, 'Andheri', 'R105', 'Mumbai', NULL, NULL),(26, 'Kharadi', 'R106', 'Pune', 27, 2.2),(27, 'Magarpatta', 'R106', 'Pune', 28, 2.5),(28, 'Hadapsar', 'R106', 'Pune', 29, 3.0),(29, 'Saswad Road', 'R106', 'Pune', 30, 4.1),(30, 'Uruli Kanchan', 'R106', 'Pune', NULL, NULL);

CREATE TABLE pune_metro_stations LIKE bus_stops;

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(1,'Chandni Chowk','Line-1', 'pune', 2, 1.7);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(2,'Kothrud Bus Depot','Line-1', 'pune', 3, 1.7);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(3,'Vanaz','Line-1', 'pune', 4, 1.7);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(4,'Anand Nagar','Line-1', 'pune', 5, 0.89 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(5,'Ideal Colony','Line-1', 'pune', 6, 1.7 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(6,'Nal Stop','Line-1', 'pune', 7,1.1 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(7,'Garware College','Line-1', 'pune', 8, 1.8 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(8,'Deccan Gymkhana','Line-1', 'pune', 9, 1.5);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(9,'Chhatrapati Sambhaji Udyan','Line-1', 'pune', 10, 1.8 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(10,'PMC Bhavan','Line-1', 'pune', 11, 1.2);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(11,'Civil Court (interchange station with the Line-2)','Line-1', 'pune', 12, 1.7);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(12,'Mangalwar Peth','Line-1', 'pune', 13, 1.0 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(13,'Pune Railway Station','Line-1', 'pune', 14, 1.4);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(14,'Ruby Hall Clinic','Line-1', 'pune', 15, 1.34 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(15,'Bund Garden','Line-1', 'pune', 16, .89);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(16,'Yerawada','Line-1', 'pune', 17, 1.56 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(17,'Kalyani Nagar','Line-1', 'pune', 18, .90);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(18,'Ramwadi','Line-1', 'pune', NULL, 1.2 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(19,'Bhakti Shakti','Line-2', 'pune', 20, 1.7);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(20,'Nigdi','Line-2', 'pune', 21, 0.89 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(21,'Akurdi','Line-2', 'pune', 22, 1.7 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(22,'Chinchwad','Line-2', 'pune', 23, 1.1 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(23,'PCMC Bhavan','Line-2', 'pune', 24, 1.8 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(24,'Sant Tukaram Nagar','Line-2', 'pune', 25, 1.5);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(25,'Nashik Phata','Line-2', 'pune', 26, 1.8 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(26,'Kasarwadi','Line-2', 'pune', 27, 1.2);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(27,'Phugewadi','Line-2', 'pune', 28, 1.7);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(28,'Dapodi','Line-2', 'pune', 29, 1.0 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(29,'Bopodi','Line-2', 'pune', 30, 1.4);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(30,'Khadki','Line-2', 'pune', 31, 1.34 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(31,'Range Hills','Line-2', 'pune', 32, .89);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(32,'Shivaji Nagar','Line-2', 'pune', 33, 1.56 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(33,'Chinchwad','Line-2', 'pune', 34, .90);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(34,'Kasba Peth','Line-2', 'pune', 35, 2.45 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(35,'Mandai','Line-2', 'pune', 36, 2.28);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(36,'Swargate','Line-2', 'pune', NULL, 1.98 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(37,'Market Yard','Line-2', 'pune', 38, 1.98 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(38,'Bibwewadi','Line-2', 'pune', 39, 1.98 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(39,'Padmavati','Line-2', 'pune', 40, 1.98 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(40,'Balaji Nagar','Line-2', 'pune', 41, 1.98 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(41,'Katraj','Line-2', 'pune', 42, 1.98 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(42,'Civil Court','Line-3', 'pune', 43, 1.7);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(43,'Shivaji Nagar','Line-3', 'pune', 44, 0.89 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(44,'Agriculture College','Line-3', 'pune', 45, 1.7 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(45,'R.B.I.','Line-3', 'pune', 46, 1.1 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(46,'University','Line-3', 'pune', 47, 1.8 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(47,'Sakal Nagar','Line-3', 'pune', 48, 1.5);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(48,'Krushi Anusadhan','Line-3', 'pune', 49, 1.8 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(49,'Baner','Line-3', 'pune', 50, 1.2);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(50,'Baner Gaon','Line-3', 'pune', 51, 1.7);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(51,'Balewadi Phata','Line-3', 'pune', 52, 1.0 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(52,'Laxmi Nagar','Line-3', 'pune', 53, 1.4);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(53,'Ram Nagar (Nashik Phata)','Line-3', 'pune', 54, 1.34 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(54,'NICMAR','Line-3', 'pune', 55, .89);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(55,'Balewadi Stadium','Line-3', 'pune', 56, 1.56 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(56,'Wakad Chowk','Line-3', 'pune', 57, .90);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(57,'Hinjewadi','Line-3', 'pune', 58, 2.45 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(58,'Shivaji Chowk','Line-3', 'pune', 59, 2.28);

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(59,'Pall India','Line-3', 'pune', 60, 1.98 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(60,'Wipro Phase II','Line-3', 'pune', 61, 1.98 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(61,'Infosys Phase II','Line-3', 'pune', 62, 1.98 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(62,'Dohler','Line-3', 'pune', 63, 1.98 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(63,'Embassy Quadron Business Park','Line-3', 'pune', 64, 1.98 );

insert into pune_metro_stations(stop_id, stop_name, route_no, city, next_stop_id, distance_to_next_km) values(64,'Megapolis Circle','Line-3', 'pune', NULL, 1.98 );

with recursive cte as (select 1 n union select n + 1 from cte where n<=64) update pune_metro_stations set distance_to_next_km = round(2 * rand() + 1 , 2);

CREATE TABLE categories (category_id INT PRIMARY KEY, category_name VARCHAR(50),parent_id INT);

INSERT INTO categories (category_id, category_name, parent_id) VALUES
(1, 'Electronics', NULL),
(2, 'Home Appliances', NULL),
(3, 'Fashion', NULL),
(4, 'Books', NULL),
(5, 'Sports', NULL),


(6, 'Mobiles', 1),
(7, 'Laptops', 1),
(8, 'Accessories', 1),
(9, 'Refrigerators', 2),
(10, 'Washing Machines', 2),
(11, 'Men', 3),
(12, 'Women', 3),
(13, 'Fiction', 4),
(14, 'Non-Fiction', 4),
(15, 'Outdoor', 5),


(16, 'Android Phones', 6),
(17, 'iPhones', 6),
(18, 'Gaming Laptops', 7),
(19, 'Ultrabooks', 7),
(20, 'Chargers', 8),
(21, 'Headphones', 8),
(22, 'Single Door', 9),
(23, 'Double Door', 9),
(24, 'Front Load', 10),
(25, 'Top Load', 10),
(26, 'Shirts', 11),
(27, 'Trousers', 11),
(28, 'Dresses', 12),
(29, 'Jewelry', 12),
(30, 'Adventure', 15),


(31, 'Budget Android', 16),
(32, 'Flagship Android', 16),
(33, 'Smart Watches', 8),
(34, 'Mountain Gear', 30),
(35, 'Camping Equipment', 30);


create table betweenSalary (id int, sal int);
INSERT INTO betweenSalary VALUES(1, 2000);

create table Managers(emp_id int, name varchar(10));
insert into Managers VALUES(1,'saleel'), (2, 'sharmin'), (3, 'vrushali'), (null,'neel');

CREATE TABLE Trainers(emp_id int, name varchar(10));
INSERT INTO Trainers VALUES(1,'ruhan'), (2, 'sharmin'),(3, 'saleel');

CREATE TABLE population(ID int primary key,	city varchar(40), area int, ward int, population int);

INSERT INTO population VALUES (1, 'Ahmedabad', '530', '48', '8253000');
INSERT INTO population VALUES (2, 'Surat', '462', '30', '7490000');
INSERT INTO population VALUES (3, 'Vadodara', '220', '19', '2233000');
INSERT INTO population VALUES (4, 'Rajkot', '170', '18', '1934000');
INSERT INTO population VALUES (5, 'Bhavnagar', '108', '13', '771000');
INSERT INTO population VALUES (6, 'Jamnagar', '126', '16', '623000');
INSERT INTO population VALUES (7, 'Junagadh', '160', '20', '415000');
INSERT INTO population VALUES (8, 'Gandhinagar', '326', '13', '410000');
INSERT INTO population VALUES (9, 'Anand', '48', '13', '374000');
INSERT INTO population VALUES (10, 'Navsari', '44', '13', '367000');
INSERT INTO population VALUES (11, 'Surendranagar', '59', '13', '329000');
INSERT INTO population VALUES (12, 'Morbi', '47', '13', '327000');
INSERT INTO population VALUES (13, 'Gandhidham', '63', '13', '322000');
INSERT INTO population VALUES (14, 'Nadiad', '45', '13', '292000');
INSERT INTO population VALUES (15, 'Bharuch', '44', '11', '290000');
INSERT INTO population VALUES (16, 'Patan', '44', '11', '283000');
INSERT INTO population VALUES (17, 'Porbandar', '38', '13', '282000');
INSERT INTO population VALUES (18, 'Mehsana', '31', '13', '247000');
INSERT INTO population VALUES (19, 'Bhuj', '56', '11', '244000');
INSERT INTO population VALUES (20, 'Veraval', '40', '11', '241000');
INSERT INTO population VALUES (21, 'Vapi', '22', '13', '223000');
INSERT INTO population VALUES (22, 'Valsad', '24', '11', '221000');
INSERT INTO population VALUES (23, 'Godhra', '20', '11', '211000');
INSERT INTO population VALUES (24, 'Palanpur', '40', '11', '182000');
INSERT INTO population VALUES (25, 'Himmatnagar', '21', '11', '181000');
INSERT INTO population VALUES (26, 'Kalol', '25', '11', '174000');
INSERT INTO population VALUES (27, 'Botad', '10', '11', '169000');
INSERT INTO population VALUES (28, 'Amreli', '65', '11', '153000');
INSERT INTO population VALUES (29, 'Gondal', '74', '11', '145000');
INSERT INTO population VALUES (30, 'Jetpur', '23', '11', '153000');
INSERT INTO population VALUES (31, 'Deesa', '20', '11', '111160');

CREATE TABLE bankLoan(loadID BIGINT AUTO_INCREMENT PRIMARY KEY, bankName VARCHAR(100),    accountNumber VARCHAR(30) NOT NULL, riskStatus int);

INSERT INTO bankLoan (bankName, accountNumber, riskStatus) VALUES ('State Bank of India', 'SBIN00012345', 0), ('HDFC Bank', 'HDFC00067890', 2), ('ICICI Bank', 'ICIC00054321', 1), ('Axis Bank', 'AXIS00098765', 0), ('Bank of Baroda', 'BARB0123456', 3), ('Canara Bank', 'CNRB0067890', 1), ('Punjab National Bank', 'PUNB0011223', 4), ('Kotak Mahindra Bank', 'KKBK0099887', 0);


CREATE TABLE onlineOrders(orderID int primary key, customerID varchar(10), product varchar(20), category varchar(20), quantity int, orderDate date, amount int);

INSERT INTO onlineorders VALUES('1001', 'C001', 'Laptop', 'Electronics', '1', '2025-07-01', 83000);
INSERT INTO onlineorders VALUES('1002', 'C002', 'Smartphone', 'Electronics', '2', '2025-07-02', 47000);
INSERT INTO onlineorders VALUES('1003', 'C003', 'Headphones', 'Electronics', '1', '2025-07-02', 2500);
INSERT INTO onlineorders VALUES('1004', 'C004', 'T-shirt', 'Clothing', '3', '2025-07-03', 1200);
INSERT INTO onlineorders VALUES('1005', 'C005', 'Sneakers', 'Footwear', '1', '2025-07-03', 3200);
INSERT INTO onlineorders VALUES('1006', 'C006', 'Book', 'Books', '2', '2025-07-04', 800);
INSERT INTO onlineorders VALUES('1007', 'C001', 'Power Bank', 'Electronics', '1', '2025-07-04', 1700);

CREATE TABLE fromStoreOrders(orderID int primary key, customerID varchar(10), product varchar(20), category varchar(20), quantity int, orderDate date, amount int);

INSERT INTO fromStoreOrders VALUES('2001', 'C001', 'T-shirt', 'Clothing', '2', '2025-07-01', 1200);
INSERT INTO fromStoreOrders VALUES('2002', 'C003', 'Smartphone', 'Electronics', '1', '2025-07-01', 35000);
INSERT INTO fromStoreOrders VALUES('2003', 'C007', 'Formal Shoes', 'Footwear', '1', '2025-07-02', 2000);
INSERT INTO fromStoreOrders VALUES('2004', 'C004', 'Jeans', 'Clothing', '1', '2025-07-03', 3500);
INSERT INTO fromStoreOrders VALUES('2005', 'C008', 'Book', 'Books', '3', '2025-07-04', 700);
INSERT INTO fromStoreOrders VALUES('2006', 'C002', 'Laptop', 'Electronics', '1', '2025-07-04', 93500);
INSERT INTO fromStoreOrders VALUES('2007', 'C009', 'Power Bank', 'Electronics', '1', '2025-07-05', 1800);
insert into fromStoreOrders values('2008', 'C021', 'Mouse', 'Electronics', 7, '2025-07-09', 350);
INSERT INTO fromStoreOrders VALUES('2009', 'C002', 'Smartphone', 'Electronics', '1', '2025-07-02', 82000);


CREATE TABLE trains(trainID INT PRIMARY KEY, trainName VARCHAR(50), source VARCHAR(50), destination VARCHAR(50));

CREATE TABLE reservations(reservationID INT PRIMARY KEY, trainID INT, passengerName VARCHAR(50), status VARCHAR(20));


INSERT INTO trains(trainID, trainName, source, destination) VALUES (1, 'Rajdhani', 'Delhi', 'Mumbai'), (2, 'Shatabdi', 'Delhi', 'Bhopal'), (3, 'Duronto', 'Mumbai', 'Kolkata'), (4, 'Intercity', 'Chennai', 'Bangalore'), (5, 'Deccan Queen', 'Pune', 'Mumbai'), (6, 'Ahmedabad SF Express', 'Baroda', 'Pune'), (7, 'Bikaner Express', 'Baroda', 'Pune');

INSERT INTO reservations(reservationID, trainID, passengerName, status) VALUES (201, 1, 'Saleel', 'Confirmed'),(202, 8, 'Sharmin', 'Cancelled'),(203, 9, 'Vrushali', 'Confirmed'), (204, 5, 'Ruhan', 'Confirmed'), (205, 5, 'Nitish', 'Confirmed'), (206, 8, 'Gau', 'Confirmed'),(207, 1, 'Boy', 'Cancelled');

create table countNulls(id int primary key AUTO_INCREMENT, ename varchar(10), city varchar(20), phone int);

insert into countNulls(ename, city, phone) values('saleel','baroda',null);
insert into countNulls(ename, city, phone) values('sharmin','pune',null);
insert into countNulls(ename, city, phone) values('ruhan',null,1111);
insert into countNulls(ename, city, phone) values('vrushali', null, 2222);
insert into countNulls(ename, city, phone) values('neel',null,3333);


Create table countNumbers(id int primary key auto_increment, c1 int);

insert into countNumbers(c1) values(1), (NULL), (NULL),(NULL),(NULL), (2), (NULL), (NULL),(NULL), (3), (NULL), (4), (5), (NULL), (NULL),(NULL), (NULL), (NULL),(NULL), (6);

create table fedex(tracking_id varchar(20), carrier varchar(20), status varchar(20), delivery_date date);

create table dhl(tracking_id varchar(20), carrier varchar(20), status varchar(20), delivery_date date);

create table ups(tracking_id varchar(20), carrier varchar(20), status varchar(20), delivery_date date);

INSERT INTO FEDEX(tracking_id, carrier, status, delivery_date) VALUES ('FEDEX100001', 'FedEx', 'Dispatched', '2025-07-04'), ('FEDEX100002', 'FedEx', 'In Transit', '2025-07-05'), ('FEDEX100006', 'FedEx', 'Pending', '2025-06-29'), ('FEDEX100003 ', 'FedEx', 'Delivered', '2025-07-03'), ('FEDEX100004', 'FedEx', 'Out for Delivery', '2025-07-07') , ('FEDEX100007', 'FedEx', 'Pending', '2025-01-09'), ('FEDEX100005', 'FedEx', 'Delayed', '2025-07-08');


INSERT INTO dhl(tracking_id, carrier, status, delivery_date) VALUES ('DHL100021', 'DHL', 'Delivered', '2025-07-04'), ('DHL100027', 'DHL', 'Pending', '2025-07-23'), ('DHL100022', 'DHL', 'In Transit', '2025-07-05'), ('DHL100023', 'DHL', 'Dispatched', '2025-07-06'), ('DHL100028', 'DHL', 'Pending', '2025-12-23') , ('DHL100024', 'DHL', 'Out for Delivery', '2025-07-07'), ('DHL100025', 'DHL', 'Delayed', '2025-07-08'), ('DHL100026', 'DHL', 'In Transit', '2025-07-03');


INSERT INTO ups(tracking_id, carrier, status, delivery_date) VALUES  ('UPS100032', 'UPS', 'Delivered', '2025-07-01'), ('UPS100042', 'UPS', 'Pending', '2025-11-11'), ('UPS100033', 'UPS', 'Dispatched', '2025-07-07'), ('UPS100034', 'UPS', 'Out for Delivery', '2025-07-08'), ('UPS100035', 'UPS', 'Delayed', '2025-07-09'), ('UPS100036', 'UPS', 'In Transit', '2025-07-03'), ('UPS100037', 'UPS', 'Delivered', '2025-07-05'), ('UPS100038', 'UPS', 'Dispatched', '2025-07-06'), ('UPS100039', 'UPS', 'Out for Delivery', '2025-07-04'), ('UPS100040', 'UPS', 'Delayed', '2025-07-12');

CREATE TABLE cNumbers(id INT PRIMARY KEY auto_increment,num INT);
  
insert into cNumbers values (default, 1),(default, 1),(default, 1),(default, 2),(default, 1),(default, 2),(default, 2),(default, 7),(default, 7),(default, 7),(default, 5),(default, 5),(default, 2),(default, 4),(default, 4),(default, 4);


CREATE TABLE repeatingNumbers(num int);

INSERT into repeatingNumbers values(1),(2),(3),(4);

CREATE TABLE cashPayments(student_id int, student_name varchar(10), amount int);

CREATE TABLE cardPayments(student_id int, student_name varchar(10), amount int);

INSERT into cashPayments values(27,'saleel',4000),(43,'sharmin',2000),(25,'ruhan',2600),(41,'vrushali',2200),(20,'nitish',3200),(7,'neel',3400),(14,'bandish',3200),(17,'naresh',3400),(27,'saleel',2500);

INSERT into cardPayments values(43,'sharmin',2300),(9,'bhuru',3200),(63,'bhavin',3000),(39,'boy',3400),(20,'nitish',1200),(27,'saleel',4000),(27,'saleel',3500);




CREATE TABLE category(Category varchar(50), SubCategory varchar(50), Price int);

INSERT into category values('Chips', 'Bingo', 10), ('Chips', 'Lays', 40), ('Chips', 'Kurkure', 60), ('Chocolate', 'Dairy Milk', 120), ('Chocolate', 'Five Star', 40), ('Chocolate', 'Perk', 25), ('Chocolate', 'Munch', 5), ('Biscuits', 'Oreo', 120), ('Sauce','Kissan', 30);


CREATE TABLE years (c1 year);

INSERT into years with recursive cte as(select 2000 n union select n + 1 from cte where n <  year(curdate())) select * from cte;

CREATE TABLE year_of_service(id int primary key auto_increment, year_of_service date);
truncate table year_of_service;

INSERT into year_of_service VALUES (default, '2021-05-30');
INSERT into year_of_service VALUES (default, '2022-09-12');
INSERT into year_of_service VALUES (default, '2023-11-19');
INSERT into year_of_service VALUES (default, '2024-02-01');
INSERT into year_of_service VALUES (default, '2025-08-04');
INSERT into year_of_service VALUES (default, '2024-07-21');
INSERT into year_of_service VALUES (default, '2022-12-18');
INSERT into year_of_service VALUES (default, '2020-02-07');
INSERT into year_of_service VALUES (default, '2027-09-23');
INSERT into year_of_service VALUES (default, '2030-11-01');
INSERT into year_of_service VALUES (default, '2024-06-19');
INSERT into year_of_service VALUES (default, '2025-05-18');
INSERT into year_of_service VALUES (default, '2023-01-30');
INSERT into year_of_service VALUES (default, '2028-11-18');
INSERT into year_of_service VALUES (default, '2026-02-07');
INSERT into year_of_service VALUES (default, '2026-03-26');
INSERT into year_of_service VALUES (default, '2021-03-12');
INSERT into year_of_service VALUES (default, '2024-05-19');
INSERT into year_of_service VALUES (default, '2026-11-01');
INSERT into year_of_service VALUES (default, '2027-05-04');
INSERT into year_of_service VALUES (default, '2026-06-21');
INSERT into year_of_service VALUES (default, '2023-11-01');
INSERT into year_of_service VALUES (default, '2022-05-04');
INSERT into year_of_service VALUES (default, '2024-06-21');
INSERT into year_of_service VALUES (default, '2029-05-04');
INSERT into year_of_service VALUES (default, '2027-06-21');
INSERT into year_of_service VALUES (default, '2028-11-18');
INSERT into year_of_service VALUES (default, '2029-02-07');
INSERT into year_of_service VALUES (default, '2030-03-26');
INSERT into year_of_service VALUES (default, '2026-09-23');
INSERT into year_of_service VALUES (default, '2023-11-18');
INSERT into year_of_service VALUES (default, '2020-02-07');
INSERT into year_of_service VALUES (default, '2023-03-26');
INSERT into year_of_service VALUES (default, '2020-09-23');


CREATE TABLE fruits(product varchar(15), amount int, country varchar(10)); 

INSERT into fruits VALUES ('banana', 1000, 'usa');
INSERT into fruits VALUES ('carrots', 1500, 'usa');
INSERT into fruits VALUES ('beans', 1600, 'usa');
INSERT into fruits VALUES ('orange', 2000, 'usa');
INSERT into fruits VALUES ('banana', 400, 'india');
INSERT into fruits VALUES ('carrots', 1200, 'india');
INSERT into fruits VALUES ('beans', 1500, 'india');
INSERT into fruits VALUES ('orange', 4000, 'india');
INSERT into fruits VALUES ('banana', 2000, 'canada');
INSERT into fruits VALUES ('carrots', 2000, 'canada');
INSERT into fruits VALUES ('beans', 2000, 'mexico');

CREATE TABLE rooms(room_id INT PRIMARY KEY, room_number VARCHAR(10), room_type VARCHAR(20), floor INT, status VARCHAR(20));  /* e.g., Available, Occupied, Maintenance */

CREATE TABLE room_staff(staff_id int, staff_name varchar(20));

INSERT INTO room_staff VALUES(1,'Saleel'), (2,'Rajat'), (3,'Pankaj');


INSERT INTO rooms (room_id, room_number, room_type, floor, status) VALUES (1, '101', 'Standard', 1, 'Available'), (2, '102', 'Deluxe', 1, 'Occupied'), (3, '103', 'Suite', 1, 'Maintenance'), (4, '104', 'Standard', 1, 'Available'), (5, '105', 'Deluxe', 1, 'Occupied'), (6, '106', 'Suite', 1, 'Maintenance'), (7, '107', 'Standard', 1, 'Available'), (8, '108', 'Deluxe', 1, 'Occupied'), (9, '109', 'Suite', 1, 'Maintenance'), (10, '110', 'Standard', 1, 'Available'), (11, '201', 'Deluxe', 2, 'Occupied'), (12, '202', 'Suite', 2, 'Maintenance'), (13, '203', 'Standard', 2, 'Available'), (14, '204', 'Deluxe', 2, 'Occupied'), (15, '205', 'Suite', 2, 'Maintenance'), (16, '206', 'Standard', 2, 'Available'), (17, '207', 'Deluxe', 2, 'Occupied'), (18, '208', 'Suite', 2, 'Maintenance'), (19, '209', 'Standard', 2, 'Available'), (20, '210', 'Deluxe', 2, 'Occupied'), (21, '301', 'Deluxe', 3, 'Occupied'), (22, '302', 'Suite', 3, 'Maintenance'), (23, '303', 'Standard', 3, 'Available'), (24, '304', 'Deluxe', 3, 'Occupied'), (25, '305', 'Suite', 3, 'Maintenance'), (26, '306', 'Standard', 3, 'Available'), (27, '307', 'Deluxe', 3, 'Occupied'), (28, '308', 'Suite', 3, 'Maintenance'), (29, '309', 'Standard', 3, 'Available'), (30, '310', 'Deluxe', 3, 'Occupied'), (31, '401', 'Deluxe', 4, 'Occupied'), (32, '402', 'Suite', 4, 'Maintenance'), (33, '403', 'Standard', 4, 'Available'), (34, '404', 'Deluxe', 4, 'Occupied'), (35, '405', 'Suite', 4, 'Maintenance'), (36, '406', 'Standard', 4, 'Available'), (37, '407', 'Deluxe', 4, 'Occupied'), (38, '408', 'Suite', 4, 'Maintenance'), (39, '409', 'Standard', 4, 'Available'), (40, '410', 'Deluxe', 4, 'Occupied');


CREATE TABLE cafe(order_id INT PRIMARY KEY, item VARCHAR(255) NOT NULL);

INSERT INTO cafe(order_id, item) VALUES (1, 'Chow Mein'), (2, 'Pizza'), (3, 'Veg Nuggets'), (4, 'Paneer Butter Masala'), (5, 'Spring Rolls'), (6, 'Veg Burger'), (7, 'Paneer Tikka'), (8, 'Paneer Cheese Masala'), (9, 'Onion Spring Rolls'), (10, 'Momos'), (11, 'Paneer Tikka Masala'), (12, 'Vada Pav'), (13, 'Masala Dosa');

create table stocks(day int primary key auto_increment, companyName varchar(40), stockPrice decimal(8,2), since year);

insert into stocks values(default, 'Reliance Industries Ltd', 1429.70, 1966);
insert into stocks values(default, 'Reliance Industries Ltd', 1429.70, NULL);
insert into stocks values(default, 'Reliance Industries Ltd', 1449.12, NULL);
insert into stocks values(default, 'Reliance Industries Ltd', 1200.98, NULL);
insert into stocks values(default, 'Reliance Industries Ltd', 1557.97, NULL);
insert into stocks values(default, 'Reliance Industries Ltd', 1432.27, NULL);
insert into stocks values(default, 'Reliance Industries Ltd', 2642.43, NULL);

insert into stocks values(default, 'Only Vimal', 3494.93, 1975);
insert into stocks values(default, 'Only Vimal', 2833.22, NULL);
insert into stocks values(default, 'Only Vimal', 1904.43, NULL);
insert into stocks values(default, 'Only Vimal', 4303.98, NULL);
insert into stocks values(default, 'Only Vimal', 2357.97, NULL);
insert into stocks values(default, 'Only Vimal', 1432.34, NULL);
insert into stocks values(default, 'Only Vimal', 5400.43, NULL);
insert into stocks values(default, 'Only Vimal', 1402.77, NULL);
insert into stocks values(default, 'Only Vimal', 1402.78, NULL);


insert into stocks values(default, 'Raymonds', 1254.00, 1925);
insert into stocks values(default, 'Raymonds', 2833.22, NULL);
insert into stocks values(default, 'Raymonds', 1904.43, NULL);
insert into stocks values(default, 'Raymonds', 4303.98, NULL);
insert into stocks values(default, 'Raymonds', 2357.97, NULL);
insert into stocks values(default, 'Raymonds', 3423.34, NULL);
insert into stocks values(default, 'Raymonds', 5313.43, NULL);
insert into stocks values(default, 'Raymonds', 6543.77, NULL);
insert into stocks values(default, 'Raymonds', 1402.78, NULL);
										 
CREATE TABLE hall_ticket(id int, status int);

INSERT INTO  hall_ticket VALUES (1, 1);
INSERT INTO  hall_ticket VALUES (2, 0);
INSERT INTO  hall_ticket VALUES (3, 1);
INSERT INTO  hall_ticket VALUES (4, 1);
INSERT INTO  hall_ticket VALUES (5, 1);
INSERT INTO  hall_ticket VALUES (6, 0);
INSERT INTO  hall_ticket VALUES (7, 1);
INSERT INTO  hall_ticket VALUES (8, 1);
INSERT INTO  hall_ticket VALUES (9, 0);
INSERT INTO  hall_ticket VALUES (10, 1);
INSERT INTO  hall_ticket VALUES (11, 0);
INSERT INTO  hall_ticket VALUES (12, 1);
INSERT INTO  hall_ticket VALUES (13, 0);
INSERT INTO  hall_ticket VALUES (14, 1);
INSERT INTO  hall_ticket VALUES (15, 1);
INSERT INTO  hall_ticket VALUES (16, 0);
INSERT INTO  hall_ticket VALUES (17, 1);
INSERT INTO  hall_ticket VALUES (18, 1);
INSERT INTO  hall_ticket VALUES (19, 1);
INSERT INTO  hall_ticket VALUES (20, 1);
INSERT INTO  hall_ticket VALUES (21, 0);
INSERT INTO  hall_ticket VALUES (22, 1);
INSERT INTO  hall_ticket VALUES (23, 0);
INSERT INTO  hall_ticket VALUES (24, 0);
INSERT INTO  hall_ticket VALUES (25, 1);
INSERT INTO  hall_ticket VALUES (26, 0);
INSERT INTO  hall_ticket VALUES (27, 1);
INSERT INTO  hall_ticket VALUES (28, 1);
INSERT INTO  hall_ticket VALUES (29, 1);
INSERT INTO  hall_ticket VALUES (30, 0);
INSERT INTO  hall_ticket VALUES (31, 0);

create table overlapping_dates(id int primary key auto_increment ,start_Date date, end_Date date);

insert into overlapping_Dates values(default, '2025-01-01','2025-01-12');
insert into overlapping_Dates values(default, '2025-01-18','2025-01-22');
insert into overlapping_Dates values(default, '2025-01-07','2025-01-15');
insert into overlapping_Dates values(default, '2025-01-23','2025-01-26');
insert into overlapping_Dates values(default, '2025-01-26','2025-01-28');


insert into overlapping_Dates values(default, '2025-01-30','2025-02-04');
insert into overlapping_Dates values(default, '2025-02-07','2025-02-10');
insert into overlapping_Dates values(default, '2025-02-09','2025-02-12');
insert into overlapping_Dates values(default, '2025-02-11','2025-02-16');

create table room_assigned(studentID int, roomNumber int, startDate date, endDate date);

insert into room_assigned values(1001,1,'2025-02-19','2025-03-14'); 
insert into room_assigned values(1002,2,'2025-04-13','2025-05-18'); 
insert into room_assigned values(1003,3,'2025-03-23','2025-06-23'); 
insert into room_assigned values(1005,4,'2025-06-14','2025-07-07'); 
insert into room_assigned values(1006,1,'2025-04-09','2025-06-19');
insert into room_assigned values(1007,2,'2025-03-08','2025-03-31'); 
insert into room_assigned values(1008,3,'2025-06-28','2025-07-29'); 
insert into room_assigned values(1009,5,'2025-07-21','2025-09-13'); 
insert into room_assigned values(1010,6,'2025-05-16','2025-06-30'); 
insert into room_assigned values(1011,5,'2025-11-05','2025-12-25'); 
insert into room_assigned values(1012,4,'2025-06-05','2025-07-29');
insert into room_assigned values(1013,9,'2025-08-03','2025-09-17');

insert into room_assigned values(1005,4,'2024-06-14','2025-07-07'); 
insert into room_assigned values(1006,1,'2024-04-09','2024-12-19');
insert into room_assigned values(1007,2,'2024-03-08','2024-11-30'); 
insert into room_assigned values(1008,3,'2024-06-28','2025-03-12'); 
insert into room_assigned values(1009,5,'2024-01-21','2025-01-27'); 

create table airline_seats(seat_id int, flight_id int, seat_number varchar(20), features int );

INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (101, 456, '12A', 73);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (102, 456, '01F', 521);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (103, 346, '17G', 50);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (104, 101, '15H', 521);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (105, 204, '09L', 336);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (106, 876, '24J', 141);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (107, 683, '34K', 1034);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (108, 386, '13A', 73);

INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (109, 372, '10K', 87);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (110, 372, '11K', 91);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (111, 372, '12K', 102);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (112, 372, '13K', 17);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (113, 372, '14K', 259);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (114, 372, '15K', 105);


INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (115, 502, '12K', 1);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (116, 502, '13K', 128);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (117, 502, '14K', 1);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (118, 502, '15K', 128);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (119, 503, '12K', 1);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (120, 503, '13K', 128);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (121, 503, '14K', 1);
INSERT INTO airline_seats (seat_id, flight_id, seat_number, features) VALUES (122, 503, '15K', 128);

create table bitwise(features varchar(30), bitvalue int);

insert into bitwise values('Window seat',1), ('Aisle seat',2), ('Exit row',4), ('Extra legroom',8), ('Near restroom',16), ('Power outlet available',32), ('USB charging',64), ('Reclining seat',128), ('Frist class seat',256), ('Business class seat',512), ('Economy class seat',1024);

CREATE TABLE Activity (machine_id INT, process_id INT, activity_type VARCHAR(10), timestamp DECIMAL(10,3));

INSERT INTO Activity (machine_id, process_id, activity_type, timestamp) VALUES (0, 0, 'start', 0.712), (0, 0, 'end', 1.520), (0, 1, 'start', 3.140), (0, 1, 'end', 4.120), (1, 0, 'start', 0.550), (1, 0, 'end', 1.550), (1, 1, 'start', 0.430), (1, 1, 'end', 1.420), (2, 0, 'start', 4.100), (2, 0, 'end', 4.512), (2, 1, 'start', 2.500), (2, 1, 'end', 5.000);

create table food_category_tags(tag int, type varchar(20));

/* 
fresh fruits		1 		   			- 1				= 1		(Perishable)
vegetables			1 	        		- 1 			= 1		(Perishable)
meat				1 and 64 and 1024  	- 1 + 64 + 1024 = 1089  (Perishable, Frozen, Meat)
fish				1 and 64		    - 1 + 64 		= 65    (Perishable, Frozen)
chicken				1 and 64 and 2048  	- 1 + 64 + 2048 = 2113  (Perishable, Frozen, Poultry)
juice				2 		    		- 2				= 2		(Beverage) 
tea					2 		    		- 2				= 2		(Beverage)
coffee          	2 		   			- 2				= 2		(Beverage)
coke     			2 		    		- 2				= 2		(Beverage)
bread				4 and 32    		- 4 + 32		= 36	(Bakery, Packaged)
cakes				4 and 32		    - 4 + 32		= 36	(Bakery, Packaged)
butter				16 and 32 			- 16 + 32		= 48	(Dairy, Packaged)
cheese          	16 and 32   		- 16 + 32		= 48	(Dairy, Packaged)
cookies         	4 and 32   		    - 4 + 32		= 36	(Bakery, Packaged)
bun					4					- 4				= 4		(Bakery)
milk				1 and 16   		    - 1 + 16		= 17	(Perishable, Dairy)
biscuits	    	32		    		- 32			= 32	(Packaged)
noodles				32		    		- 32			= 32	(Packaged)
frozen beans		64				    - 64			= 64	(Frozen)
chicken nuggets		64					- 64			= 64	(Frozen)
ice cream           64					- 64			= 64	(Frozen)
pie 				4					- 4				= 4		(Bakery)
instant noodles		512					- 512			= 512	(Instant)
ready rotis			512					- 512			= 512	(Instant)
frozen meals        512					- 512			= 512	(Instant)
namkeen				256					- 256 			= 256	(Snacks)
ladoos				1 and 256			- 1 + 256		= 257	(Perishable, Snacks)
chips				256					- 256			= 256	(Snacks)
samosa				256					- 256			= 256	(Snacks)
*/

insert into food_category_tags values(1,'Perishable'), (2,'Beverage'), (4,'Bakery'), (8,'Staple'), (16,'Dairy'), (32,'Packaged'), (64,'Frozen'), (128,'Spices'), (256,'Snacks'), (512,'Instant'), (1024,'Meat'), (2048,'Poultry');

create table food_items(category varchar(20), tag int, type varchar(40));

insert into food_items values('fresh fruits',1, '(Perishable)');
insert into food_items values('vegetables', 1, '(Perishable)');
insert into food_items values('meat', 1089, '(Perishable, Frozen, Meat)'); 
insert into food_items values('fish', 65, '(Perishable, Frozen)'); 
insert into food_items values('chicken', 2113,  '(Perishable, Frozen, Poultry)'); 
insert into food_items values('juice', 2, '(Beverage)'); 
insert into food_items values('tea', 2, '(Beverage)'); 
insert into food_items values('coffee', 2, '(Beverage)'); 
insert into food_items values('coke', 2, '(Beverage)'); 
insert into food_items values('bread', 36, '(Bakery, Packaged)'); 
insert into food_items values('cakes', 36,  '(Bakery, Packaged)'); 
insert into food_items values('butter', 48 ,'(Dairy, Packaged)'); 
insert into food_items values('cheese', 48, '(Dairy, Packaged)'); 
insert into food_items values('cookies', 36, '(Bakery, Packaged)'); 
insert into food_items values('milk', 17, '(Perishable, Dairy)'); 
insert into food_items values('biscuits', 32, '(Packaged)'); 
insert into food_items values('noodles', 32, '(Packaged)'); 
insert into food_items values('frozen beans', 64, '(Frozen)'); 
insert into food_items values('chicken nuggets', 64, '(Frozen)'); 
insert into food_items values('ice cream', 64, '(Frozen)'); 
insert into food_items values('instant noodles',  512, '(Instant)'); 
insert into food_items values('ready rotis', 512, '(Instant)'); 
insert into food_items values('frozen meals', 512, '(Instant)');
insert into food_items values('namkeen', 256, '(Snacks)'); 
insert into food_items values('ladoos', 257, '(Perishable, Snacks)'); 
insert into food_items values('chips', 256, '(Snacks)'); 
insert into food_items values('samosa', 256, '(Snacks)');
insert into food_items values('bun', 4, '(Bakery)');
insert into food_items values('pai', 4, '(Bakery)');
insert into food_items values('rice', 8, '(Staple)');
insert into food_items values('wheat', 8, '(Staple)');


create table brands(category varchar(20), brandName varchar(20));

insert into brands values('chocolates','5-star'),(null,'dairy milk'),(null,'perk'),(null,'eclair'),('Biscuits','britannia'),(null,'good day'),(null,'boost');

create table cricketWinnerTeam(Team1 varchar(20), Team2 varchar(20), winner varchar(20));

INSERT INTO cricketWinnerTeam values('India','SL','India');
INSERT INTO cricketWinnerTeam values('SL','Aus','Aus');
INSERT INTO cricketWinnerTeam values('SA','Eng','Eng');
INSERT INTO cricketWinnerTeam values('Eng','NZ','NZ');
INSERT INTO cricketWinnerTeam values('Aus','India','India');

CREATE TABLE student(studentID INT PRIMARY KEY, name VARCHAR(45), rnk int, emailID varchar(40), userName varchar(40));

CREATE TABLE Facebook(facebookID INT PRIMARY KEY, studentID INT, name VARCHAR(45), location VARBINARY(45));

CREATE TABLE LinkedIn(linkedInID INT PRIMARY KEY, studentID INT, name VARCHAR(45), location VARBINARY(45));

insert into student values(1001, 'Saleel', 1, 'saleel.songs@gmail.com', 'saleel.songs@gmail.com'), (1002, 'Sharmin', 1, 'sharmin@gmail.com', 'sharmin@gmail.com'), (1003, 'Vrushali', 2, 'vrusha@hotmail.com', 'vrushali@hotmail.com'), (1005, 'Ruhan', 3, 'ru@live.com', 'ruhan.live.com'), (1006, 'Neel', 2, 'nil@gmail.com', 'neel@gmail.com'), (1007, 'Deep', 1, 'deep@gmail.com', 'deep@gmail.com'), (1008, 'Nitish', 4, 'nity@live.com', 'nitish@live.com'), (1009, 'Gau', 5, 'gaurav@gmail.com', 'gau@gmail.com'), (1010, 'Mai', 4, 'mai@gmail.com', 'mai@gmail.com'), (1011, 'Bipin', 5, 'bipin@gmail.com', 'bipinpatil@gmail.com'), (1012, 'Natasha', 3, null, null), (1013, 'Bandish', 2, null, null);

insert into Facebook values(1, 1006, 'Gabbar Singh', 'Nasik'), (2, 1008, 'Shadow King', 'Pune'), (3, 1009, 'FB Star', 'Bombay'), (4, 1010, 'Ghost Rider', 'Surat'), (5, 1011, 'The Rockstar', 'Pune'), (6, 1009, 'Star-Track', 'Pune'), (7, 1010, 'Rider-gate', 'Surat'), (8, 1006, 'self-hosted', 'Baroda');

insert into LinkedIn values(1, 1006, 'Neel Save', 'Nasik'), (2, 1008, 'Nitish Patil', 'Pune'), (3, 1010, 'Gaurav', 'Anand'), (4, 1001, 'Saleel', 'Baroda'), (5, 1002, 'Sharmin', 'Nera'), (6, 1009, 'Rupal', 'Baroda'), (7, 1008, 'Akash', 'Baroda');

create table sourceCity(id int, cityName varchar(10));
create table targetCity(id int, cityName varchar(10));

insert into sourceCity values(1,'Baroda'),(2,'Surat'),(3,'Rajkot'),(4,'Anand');
insert into targetCity values(1,'Baroda'),(2,'Surat'),(4,'Bharuch'),(5,'Bhuj');

Create table atm (transactionID int, merchantID int, credit_card_id int, amount int);

insert into atm values (1, 101, 1, 100), (2, 101, 1, 100), (3, 101, 1, 100), (4, 102, 2, 300), (5, 102, 2, 400), (6, 103, 1, 150), (7, 103, 2, 225), (8, 104, 1, 127), (9, 104, 3, 145);

create table swapCity(id int, ename varchar(10), cityName varchar(10));

insert into swapCity values(1,'Saleel','Baroda'), (2,'Sharmin','Rajkot'), (3,'Vrushali','Surat'), (4,'Ruhan','Bharuch'), (5,'Nitish','Jamnagar'), (6,'Deep','Anand'), (7,'Neel','Bhuj');

create table ClassAndSubjects (class char, subjects varchar(10));
insert into ClassAndSubjects values('A','Maths'), ('B','English'), ('A','Science'), ('B','History'), ('A','Physics'), ('B','Maths'), ('A','Biology'), ('B','Social'), ('A','English'), ('B','Chemistry');

create table null1(id int, productName varchar(10));
create table null2(id int, price int);

insert into null1 values(1, 'Bread'),(2, 'Cheese'), (3, 'Butter'), (null, 'Jam');
insert into null2 values(1, 45),(2, 175), (3, 125), (null, 120), (null, 140);

CREATE TABLE sales1 (salesID INT PRIMARY KEY, customerName VARCHAR(100), amount DECIMAL(10,2), status_flags INT);

INSERT INTO sales1 VALUES (1, 'Saleel', 100.00, 3);
INSERT INTO sales1 VALUES (2, 'Sharmin', 80.00, 5);
INSERT INTO sales1 VALUES (3, 'Vrishali', 120.00, 19);
INSERT INTO sales1 VALUES (4, 'Ruhan', 1134.00, 7);
INSERT INTO sales1 VALUES (5, 'Bandish', 534.00, 9);
INSERT INTO sales1 VALUES (6, 'Supriya', 153.00, 4);
INSERT INTO sales1 VALUES (7, 'Nitish', 102.00, 2);
INSERT INTO sales1 VALUES (8, 'Neel', 78.00, 4);
INSERT INTO sales1 VALUES (9, 'KAushal', 38.00, 6);

CREATE TABLE order1 (CustomerId INT, ItemId INT, ItemName VARCHAR(100), Quantity INT, Price INT);

INSERT INTO order1 VALUES(1,1,'Butter',3,35), (1,2,'Bread',1,20), (1,3,'Soap',4,23), (1,4,'Biscuit',2,15), (2,10,'Chocolate',8,10), (2,11,'Ice-Cream',1,40), (2,12,'Almonds',2,110), (2,13,'Coke',5,25), (3,12,'Almonds',7,110), (3,13,'Coke',8,25);



CREATE TABLE ipl (Team_Names Varchar(100));

INSERT INTO ipl VALUES ('PBKS'),('RCB'),('GT'),('MI');

Create table city(id int, CityName varchar(100));

insert into city(id ,CityName) values (1,'Baroda'), (2,'Surat'), (3,'Bharuch'), (4,'Rajkot'), (5,'Jamnagar');

create table batch_schedule(batchID int primary key auto_increment, batchName varchar(10), startDate date, endDate date);

insert into batch_schedule values(default, 'Batch-1','2015-02-01', '2015-02-04'), (default, 'Batch-1','2015-02-02', '2015-02-05'),(default, 'Batch-1',  '2015-02-03', '2015-02-07'), (default, 'Batch-1','2015-02-04', '2015-02-06'), (default, 'Batch-1',  '2015-02-06', '2015-02-09'), (default, 'Batch-1','2015-02-08', '2015-02-10'), (default, 'Batch-1','2015-02-10', '2015-02-11');


CREATE TABLE Teams (TeamID INT PRIMARY KEY, Members TEXT);

INSERT INTO Teams (TeamID, Members) VALUES(1, 'Saleel, Sharmin, Vrushali, Gau'),(2, 'Kaushal, Natsha, Ruhan'),(3, 'Lalu, Brooke, Boy, Naru, Bhavin'),(4, 'Bhuru, Baba, Anoop, Meera, Boy'),(5, 'Dilu, Fredy'),(6, 'Daigo, Harshil, Boy, Raju, Bothyo'),(7, 'Bandish, Supriya, Sangita'),(8, 'Monika, Karishma, William, Varsha, Jack, Grace'),(9, 'Vasant, Neel'),(10, 'Nitish, Bipin, Mai, Didi');


CREATE TABLE order_items (orderdate DATE, item VARCHAR(255));

INSERT INTO order_items (orderdate, item) VALUES ('2024-03-01', 'Apple'), ('2024-03-01', 'Banana'), ('2024-03-01', 'Apple'), ('2024-03-02', 'Orange'), ('2024-03-02', 'Orange'), ('2024-03-02', 'Mango'), ('2024-03-03', 'Banana'), ('2024-03-03', 'Banana'), ('2024-03-03', 'Mango'), ('2024-03-03', 'Mango'),('2024-03-01', 'Grapes'), ('2024-03-01', 'Grapes'), ('2024-03-01', 'Banana'), ('2024-03-02', 'Orange'), ('2024-03-02', 'Kiwi'), ('2024-03-02', 'Mango'), ('2024-03-03', 'Kiwi'), ('2024-03-03', 'Banana'), ('2024-03-03', 'Kiwi'), ('2024-03-03', 'Grapes');


CREATE TABLE stages(CenterID VARCHAR(10), Case_ID INT, Stage1 DATE, Stage2 DATE, Stage3 DATE, Stage4 DATE, Stage5 DATE);

INSERT INTO stages(CenterID, Case_ID, Stage1, Stage2, Stage3, Stage4, Stage5) VALUES ('C1', 1, '2024-01-01', NULL, NULL, '2024-01-13', NULL), ('C1', 2, '2024-01-05', '2024-01-10', NULL, NULL, NULL), ('C2', 3, NULL, '2024-01-10', NULL, NULL, '2024-01-20'), ('C3', 4, '2024-01-05',  '2024-01-12', '2024-01-12', '2024-01-14', '2024-01-20'), ('C3', 5, '2024-01-10', '2024-01-15', NULL, NULL, NULL), ('C3', 6, NULL, NULL, NULL, '2024-01-15', NULL);


create table leading_zeroes(c1 int); 
insert into leading_zeroes values(7), (18), (299);



create table shop (itemName varchar(20), color varchar(20),size varchar(20), quantity int);

insert into shop values("skirt", "dark", "small", 2);
insert into shop values("skirt", "dark", "medium", 5);
insert into shop values("skirt", "dark", "large", 1);
insert into shop values("skirt", "pastel", "small", 11);
insert into shop values("skirt", "pastel", "medium", 9);
insert into shop values("skirt", "pastel", "large", 15);
insert into shop values("skirt", "white", "small", 2);
insert into shop values("skirt", "white", "medium", 5);
insert into shop values("skirt", "white", "large", 3);
insert into shop values("dress", "dark", "small", 2);
insert into shop values("dress", "dark", "medium", 6);
insert into shop values("dress", "dark", "large", 12);
insert into shop values("dress", "pastel", "small", 4);
insert into shop values("dress", "pastel", "medium", 3);
insert into shop values("dress", "pastel", "large", 3);
insert into shop values("dress", "white", "small", 2);
insert into shop values("dress", "white", "medium", 3);
insert into shop values("dress", "white", "large", 0);
insert into shop values("shirt", "dark", "small", 2);
insert into shop values("shirt", "dark", "medium", 6);
insert into shop values("shirt", "dark", "large", 6);
insert into shop values("shirt", "pastel", "small", 4);
insert into shop values("shirt", "pastel", "medium", 1);
insert into shop values("shirt", "pastel", "large", 2);
insert into shop values("shirt", "white", "small", 17);
insert into shop values("shirt", "white", "medium", 1);
insert into shop values("shirt", "white", "large", 10);
insert into shop values("pants", "dark", "small", 14);
insert into shop values("pants", "dark", "medium", 6);
insert into shop values("pants", "dark", "large", 0);
insert into shop values("pants", "pastel", "small", 1);
insert into shop values("pants", "pastel", "medium", 0);
insert into shop values("pants", "pastel", "large", 1);
insert into shop values("pants", "white", "small", 3);
insert into shop values("pants", "white", "medium", 0);
insert into shop values("pants", "white", "large", 2);
insert into shop values("pants", "brown", "medium", 12);
insert into shop values("pants", "brown", "large", 13);
insert into shop values("Jeans", "blue", "medium", 7);
insert into shop values("Jeans", "black", "medium", 4);
insert into shop values("Jeans", "white", "medium", 6);
insert into shop values("Jeans", "denim", "medium", 3);
insert into shop values("Jeans", "blue", "small", 8);
insert into shop values("Jeans", "black", "small", 9);
insert into shop values("Jeans", "white", "small", 23);
insert into shop values("Jeans", "grey", "small", 12);
insert into shop values("Jeans", "grey", "medium", 7);

create table missingNumbers(id int);

insert into missingNumbers values(1);
insert into missingNumbers values(2);
insert into missingNumbers values(3);
insert into missingNumbers values(4);
insert into missingNumbers values(6);
insert into missingNumbers values(7);
insert into missingNumbers values(8);
insert into missingNumbers values(9);
insert into missingNumbers values(15);
insert into missingNumbers values(16);
insert into missingNumbers values(19);
insert into missingNumbers values(20);
insert into missingNumbers values(21);
insert into missingNumbers values(22);
insert into missingNumbers values(25);
insert into missingNumbers values(26);
insert into missingNumbers values(27);

create table fullname(id int primary key auto_increment, ename varchar(100));

insert into fullname values(default, 'saleel');
insert into fullname values(default, 'saleel bagde');
insert into fullname values(default, 'saleel sudheer bagde');
insert into fullname values(default, 'sharmin bagde');
insert into fullname values(default, 'vrushali bagde');
insert into fullname values(default, 'vrushali saleel bagde');
insert into fullname values(default, 'sharmin sudheer bagde');
insert into fullname values(default, 'sharmin');
insert into fullname values(default, 'kaushal sudheer bagde');
insert into fullname values(default, 'ruhan bagde');
insert into fullname values(default, 'natasha kaushal bagde');

create table phonecall(id int primary key auto_increment, fromphone bigint, tophone bigint, calldate date, fromtime time, totime time, duration int);

insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884330, 9933898994, '2020-01-19', '04:30:00', '04:39:00');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884330, 9933898994, '2020-01-20', '16:30:10', '17:39:27');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9922050696, 9850884330, '2020-01-12', '14:12:00', '14:24:27');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9922050696, 9922987810, '2020-01-12', '12:03:06', '12:06:19');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850272629, 7570815432, '2020-01-07', '17:20:15', '17:27:19');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9922050696, '2020-01-08', '10:17:20', '10:27:19');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9840556372, 9922050696, '2020-01-07', '10:47:14', '10:59:00');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9922050696, '2020-01-10', '08:10:00', '08:14:26');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884779, 9922050696, '2020-01-10', '17:00:43', '17:17:06');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9922050696, '2020-01-10', '08:17:00', '08:21:26');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9922050696, '2020-01-10', '11:07:00', '11:14:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9665814327, 9850884228, '2020-01-11', '11:07:00', '11:14:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9665814327, '2020-01-11', '15:29:31', '15:32:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9850778812, '2020-01-02', '15:29:31', '15:32:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(7555284570, 9665814327, '2020-01-02', '13:02:31', '13:07:44');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(7555337795, 8555599169, '2020-01-02', '08:02:31', '08:07:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(8555599169, 9665814327, '2020-01-02', '08:02:31', '08:07:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 8555384318, '2020-01-02', '18:29:31', '18:32:35');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(8555384318, 8555599169, '2020-01-02', '15:29:31', '15:32:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850778812, 9850884228, '2020-01-02', '19:34:09' , '19:39:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(8555526091, 9933898994, '2020-01-03', '09:32:00' , '09:42:00');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884330, 9933898994, '2020-01-03', '16:30:10' , '17:39:27');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9922050696, 9850884330, '2020-01-03', '14:12:00' , '14:24:27');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9922050696, 9922987810, '2020-01-03', '12:03:06' , '12:06:19');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850272629, 7570815432, '2020-01-03', '11:00:06' , '11:09:19');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9922050696, '2020-01-03', '10:17:20' , '10:27:19');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(8555599169, 9840556372, '2020-01-03', '10:47:14' , '10:59:00');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9922050696, '2020-01-03', '08:00:00' , '08:14:26');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884779, 9922050696, '2020-01-03', '17:00:43' , '17:17:06');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9922050696, '2020-01-03', '08:17:00' , '08:21:26');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9840556372, '2020-01-03', '11:07:00' , '11:14:16');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9665814327, 9850884228, '2020-01-03', '11:19:00' , '11:34:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9665814327, '2020-01-03', '15:25:28' , '15:49:13');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9850778812, '2020-01-03', '15:29:31' , '15:32:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(7555284570, 9665814327, '2020-01-03', '08:02:31' , '08:18:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(7555337795, 8555599169, '2020-01-03', '12:02:31' , '12:07:45');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(8555599169, 9840556372, '2020-01-03', '18:02:31' , '19:09:32');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 8555384318, '2020-01-03', '15:29:31' , '15:32:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(8555384318, 8555599169, '2020-01-03', '10:00:31' , '10:32:54');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850778812, 9850884228, '2020-01-03', '19:34:09' , '19:39:37');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884330, 9933898994, '2020-01-04', '21:12:00', '21:45:26');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884330, 9933898994, '2020-01-04', '22:30:10', '22:39:27');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9922050696, 9850884330, '2020-01-04', '14:12:00', '14:24:27');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9922050696, 9922987810, '2020-01-04', '12:03:06', '12:06:19');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850272629, 7570815432, '2020-01-04', '11:23:06', '12:09:19');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9922050696, '2020-01-04', '10:17:20', '10:27:19');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9840556372, 9922050696, '2020-01-04', '10:47:14', '10:59:00');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9922050696, '2020-01-04', '10:00:00', '10:14:26');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884779, 9922050696, '2020-01-04', '17:00:43', '17:17:06');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9922050696, '2020-01-04', '08:17:00', '08:21:26');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(7555362937, 9922050696, '2020-01-04', '11:07:00', '11:14:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9665814327, 9850884228, '2020-01-04', '11:07:00', '11:14:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9665814327, '2020-01-04', '15:29:31', '15:32:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(7555362937, 9850778812, '2020-01-04', '15:29:31', '15:32:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(7555284570, 9665814327, '2020-01-04', '13:02:31', '13:07:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(7555337795, 8555599169, '2020-01-04', '08:02:31', '09:07:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(8555599169, 9665814327, '2020-01-04', '08:02:31', '08:07:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 8555384318, '2020-01-04', '19:29:31', '19:32:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(8555384318, 8555599169, '2020-01-04', '15:29:31', '15:32:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850778812, 9850884228, '2020-01-04', '19:34:09', '19:39:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(8555526091, 7555362937, '2020-01-04', '09:32:00', '09:42:00');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884330, 9933898994, '2020-01-04', '16:30:10', '17:39:27');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9922050696, 9850884330, '2020-01-04', '21:12:00', '21:36:27');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9922050696, 9922987810, '2020-01-04', '01:03:06', '01:06:19');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850272629, 7570815432, '2020-01-04', '11:00:06', '13:09:19');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(7555362937, 9922050696, '2020-01-04', '10:17:20', '10:27:19');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(8555599169, 9840556372, '2020-01-04', '10:47:14', '10:59:00');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9922050696, '2020-01-04', '08:00:00', '08:14:26');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884779, 7555515425, '2020-01-04', '17:00:43', '17:17:06');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 7555362937, '2020-01-04', '08:17:00', '08:21:26');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(7555515425, 9840556372, '2020-01-04', '11:07:00', '11:14:16');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9922050696, 9850884228, '2020-01-04', '11:19:00', '11:34:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 9665814327, '2020-01-04', '15:25:28', '15:49:13');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(7555515425, 9850778812, '2020-01-04', '15:29:31', '15:32:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(7555284570, 9665814327, '2020-01-04', '08:02:31', '08:18:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(7555337795, 8555599169, '2020-01-04', '12:02:31', '12:07:45');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(8555599169, 9840556372, '2020-01-04', '18:02:31', '18:09:32');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850884228, 8555384318, '2020-01-04', '15:29:31', '15:32:05');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(8555384318, 8555599169, '2020-01-04', '23:00:31', '23:47:54');
insert into phonecall(fromphone, tophone, calldate, fromtime, totime) values(9850778812, 7555515425, '2020-01-04', '19:34:09', '19:39:37');

create table sourceNames(id int primary key auto_increment, ename varchar(10));

insert into sourceNames values(1, 'A');
insert into sourceNames values(2, 'B');
insert into sourceNames values(3, 'C');
insert into sourceNames values(4, 'D');

create table targetNames(id int primary key auto_increment, ename varchar(10));

insert into targetNames values(1, 'A');
insert into targetNames values(2, 'B');
insert into targetNames values(3, 'X');
insert into targetNames values(5, 'Z');

create table job_list(id int primary key auto_increment, jobRole varchar(20), skills varchar(20));

insert into job_list values(default, 'Data Engineer', 'SQL');
insert into job_list values(default, null, 'redis');
insert into job_list values(default, null, 'mongoDB');
insert into job_list values(default, null, 'hBase');
insert into job_list values(default, null, 'Pig');
insert into job_list values(default, 'Web Developer', 'HTML');
insert into job_list values(default, null, 'CSS');
insert into job_list values(default, null, 'nodeJS');
insert into job_list values(default, null, 'React');
insert into job_list values(default, null, 'Javascript');
insert into job_list values(default, null, 'Angular');
insert into job_list values(default, null, 'Express');
insert into job_list values(default, 'Data Scientists', 'Python');
insert into job_list values(default, null, 'ML');
insert into job_list values(default, null, 'AI');
insert into job_list values(default, null, 'Ruby');
insert into job_list values(default, null, 'Power BI');
insert into job_list values(default, null, 'Excel');

CREATE TABLE overtime (employee_name VARCHAR(50) NOT NULL, department VARCHAR(50) NOT NULL, hours INT NOT NULL, PRIMARY KEY (employee_name , department));
INSERT INTO overtime(employee_name, department, hours) VALUES('Diane Murphy','Accounting',37), ('Mary Patterson','Accounting',74), ('Jeff Firrelli','Accounting',40), ('William Patterson','Finance',58), ('Gerard Bondur','Finance',47), ('Anthony Bow','Finance',66), ('Leslie Jennings','IT',90), ('Leslie Thompson','IT',88), ('Julie Firrelli','Sales',81), ('Steve Patterson','Sales',29), ('Foon Yue Tseng','Sales',65), ('George Vanauf','Marketing',89), ('Loui Bondur','Marketing',49), ('Gerard Hernandez','Marketing',66), ('Pamela Castillo','SCM',96), ('Larry Bott','SCM',100), ('Barry Jones','SCM',65);

create table labTestList(id int primary key auto_increment, name varchar(60), rate int);

create table medicineList(medicineID int primary key, name varchar(60), rate float(8,2));

create table patient(id int unique key auto_increment, patientID int primary key,patientName varchar(40),age int,gender char,place varchar(40),phoneNumber bigint);

create table doctor(id int unique key auto_increment, doctorID int primary key,doctorName varchar(40),place varchar(40),phoneNumber bigint);

create table doctorVisits(doctorID int ,patientID int, visitDate date, constraint fk_doctorID foreign key (doctorID) references doctor(doctorID), constraint fk_patientID foreign key(patientID) references patient(patientID));

insert into doctor(doctorID, doctorName, place, phoneNumber) values(1,'sharmin','pune',7050446610);
insert into doctor(doctorID, doctorName, place, phoneNumber) values(2,'ruhan','pune',6075991628);
insert into doctor(doctorID, doctorName, place, phoneNumber) values(7,'vrushali','mumbai',9922050696);
insert into doctor(doctorID, doctorName, place, phoneNumber) values(9,'neel','nashik',9900876931);
insert into doctor(doctorID, doctorName, place, phoneNumber) values(4,'omkar','baroda',9922878789);
insert into doctor(doctorID, doctorName, place, phoneNumber) values(21,'omkar','surat',9905606022);
insert into doctor(doctorID, doctorName, place, phoneNumber) values(22,'ramesh','surat',9890560655);
insert into doctor(doctorID, doctorName, place, phoneNumber) values(13,'pinky','baroda',9922223311);
insert into doctor(doctorID, doctorName, place, phoneNumber) values(15,'monika','surat',9905865747);
insert into doctor(doctorID, doctorName, place, phoneNumber) values(17,'mamta','surat',9890004004);

insert into patient(patientID, patientName, age, gender, place, phoneNumber) values(1,'saleel',32,'m','baroda', 9850884228);
insert into patient(patientID, patientName, age, gender, place, phoneNumber) values(2,'sangita',45,'f','surat', 9922047878);
insert into patient(patientID, patientName, age, gender, place, phoneNumber) values(3,'gita',45,'f','surat', 9850881223);
insert into patient(patientID, patientName, age, gender, place, phoneNumber) values(4,'rajan',27,'m','surat', 9850884003);
insert into patient(patientID, patientName, age, gender, place, phoneNumber) values(5,'karishma',45,'f','surat', null);
insert into patient(patientID, patientName, age, gender, place, phoneNumber) values(6,'suraj',54,'m','pune', 9922060503);
insert into patient(patientID, patientName, age, gender, place, phoneNumber) values(7,'vasant',72,'m','baroda', 9922947389);
insert into patient(patientID, patientName, age, gender, place, phoneNumber) values(8,'pankaj',53,'m','anand', 9850773992);
insert into patient(patientID, patientName, age, gender, place, phoneNumber) values(9,'bandish',45,'f','surat', 7075334434);
insert into patient(patientID, patientName, age, gender, place, phoneNumber) values(10,'supriya',45,'f','surat', 7075878912);
insert into patient(patientID, patientName, age, gender, place, phoneNumber) values(11,'monika',45,'f','surat', 9922987878);
insert into patient(patientID, patientName, age, gender, place, phoneNumber) values(12,'ramesh',56,'m','baroda', 9850667668);
insert into patient(patientID, patientName, age, gender, place, phoneNumber) values(13,'vina',45,'f','surat', null);
insert into patient(patientID, patientName, age, gender, place, phoneNumber) values(14,'vishal',45,'m','surat', 8800550550);

insert into doctorvisits(doctorID, patientID, visitDate) values(1, 1, '2019-04-07');
insert into doctorvisits(doctorID, patientID, visitDate) values(2, 4, '2019-01-23');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 2, '2019-04-07');
insert into doctorvisits(doctorID, patientID, visitDate) values(1, 1, '2019-04-11');
insert into doctorvisits(doctorID, patientID, visitDate) values(4, 5, '2019-01-23');
insert into doctorvisits(doctorID, patientID, visitDate) values(2, 4, '2019-01-25');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 5, '2019-01-25');
insert into doctorvisits(doctorID, patientID, visitDate) values(1, 1, '2019-05-01');
insert into doctorvisits(doctorID, patientID, visitDate) values(1, 3, '2019-04-14');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 2, '2019-04-11');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 3, '2019-04-21');
insert into doctorvisits(doctorID, patientID, visitDate) values(1, 4, '2019-01-27');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 2, '2019-05-12');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 5, '2019-01-27');
insert into doctorvisits(doctorID, patientID, visitDate) values(13, 5, '2019-01-30');
insert into doctorvisits(doctorID, patientID, visitDate) values(15, 2, '2019-05-16');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 3, '2019-04-28');
insert into doctorvisits(doctorID, patientID, visitDate) values(1, 1, '2019-05-24');
insert into doctorvisits(doctorID, patientID, visitDate) values(2, 3, '2019-05-05');
insert into doctorvisits(doctorID, patientID, visitDate) values(1, 1, '2019-05-30');
insert into doctorvisits(doctorID, patientID, visitDate) values(2, 3, '2019-05-05');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 2, '2019-05-19');
insert into doctorvisits(doctorID, patientID, visitDate) values(1, 2, '2019-06-01');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 3, '2019-05-12');
insert into doctorvisits(doctorID, patientID, visitDate) values(1, 1, '2019-06-01');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 3, '2019-05-12');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 3, '2019-06-19');
insert into doctorvisits(doctorID, patientID, visitDate) values(2, 3, '2019-06-20');
insert into doctorvisits(doctorID, patientID, visitDate) values(1, 3, '2019-05-13');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 3, '2019-05-14');
insert into doctorvisits(doctorID, patientID, visitDate) values(2, 2, '2019-06-21');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 2, '2019-06-22');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 2, '2019-06-23');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 1, '2019-06-07');
insert into doctorvisits(doctorID, patientID, visitDate) values(1, 1, '2019-06-11');
insert into doctorvisits(doctorID, patientID, visitDate) values(1, 4, '2019-01-30');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 5, '2019-02-09');
insert into doctorvisits(doctorID, patientID, visitDate) values(13,5, '2019-02-13');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 4, '2019-02-07');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 2, '2019-07-16');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 2, '2019-07-19');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 1, '2019-06-23');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 1, '2019-07-03');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 3, '2019-06-21');
insert into doctorvisits(doctorID, patientID, visitDate) values(1, 3, '2019-06-22');
insert into doctorvisits(doctorID, patientID, visitDate) values(2, 3, '2019-06-23');
insert into doctorvisits(doctorID, patientID, visitDate) values(22, 4, '2019-02-17');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 3, '2019-07-06');
insert into doctorvisits(doctorID, patientID, visitDate) values(17, 5, '2019-02-15');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 1, '2019-07-18');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 4, '2019-02-26');
insert into doctorvisits(doctorID, patientID, visitDate) values(13, 2, '2019-07-21');
insert into doctorvisits(doctorID, patientID, visitDate) values(15, 3, '2019-07-12');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 1, '2019-07-21');
insert into doctorvisits(doctorID, patientID, visitDate) values(15, 5, '2019-02-16');
insert into doctorvisits(doctorID, patientID, visitDate) values(1, 3, '2019-07-18');
insert into doctorvisits(doctorID, patientID, visitDate) values(17, 5, '2019-02-17');
insert into doctorvisits(doctorID, patientID, visitDate) values(17, 5, '2019-02-22');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 6, '2019-07-19');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 8, '2019-06-23');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 7, '2019-07-03');
insert into doctorvisits(doctorID, patientID, visitDate) values(22, 8, '2019-06-21');
insert into doctorvisits(doctorID, patientID, visitDate) values(1, 6, '2019-06-22');
insert into doctorvisits(doctorID, patientID, visitDate) values(2, 7, '2019-06-23');
insert into doctorvisits(doctorID, patientID, visitDate) values(22, 10, '2019-02-17');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 11, '2019-07-06');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 7, '2019-02-15');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 13, '2019-07-18');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 14, '2019-02-27');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 12, '2019-07-21');
insert into doctorvisits(doctorID, patientID, visitDate) values(13, 13, '2019-07-12');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 11, '2019-07-21');
insert into doctorvisits(doctorID, patientID, visitDate) values(4, 9, '2019-02-16');
insert into doctorvisits(doctorID, patientID, visitDate) values(1, 13, '2019-07-18');
insert into doctorvisits(doctorID, patientID, visitDate) values(21, 9, '2019-02-17');
insert into doctorvisits(doctorID, patientID, visitDate) values(21, 9, '2019-02-22');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 10, '2019-02-19');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 14, '2019-03-11');
insert into doctorvisits(doctorID, patientID, visitDate) values(7, 14, '2019-03-18');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 12, '2019-07-30');
insert into doctorvisits(doctorID, patientID, visitDate) values(15, 10, '2019-07-21');
insert into doctorvisits(doctorID, patientID, visitDate) values(9, 11, '2019-07-21');
insert into doctorvisits(doctorID, patientID, visitDate) values(4, 10, '2019-02-24');
insert into doctorvisits(doctorID, patientID, visitDate) values(1, 12, '2019-08-08');
insert into doctorvisits(doctorID, patientID, visitDate) values(21, 14, '2019-03-25');
insert into doctorvisits(doctorID, patientID, visitDate) values(21,13, '2019-07-23');
insert into doctorvisits(doctorID, patientID, visitDate) values(4, 10, '2019-08-24');

insert into labtestlist(name, rate) values('Urine Glucose', 150);
insert into labtestlist(name, rate) values('MDMA Screen Urine', 210);
insert into labtestlist(name, rate) values('Semen Analysis', 350);
insert into labtestlist(name, rate) values('Mantoux', 645);
insert into labtestlist(name, rate) values('Urine Cotinine', 120);
insert into labtestlist(name, rate) values('UPCR', 750);
insert into labtestlist(name, rate) values('Arterial Blood Gas', 125);
insert into labtestlist(name, rate) values('Triple Marker', 155);
insert into labtestlist(name, rate) values('Double Marker', 240);
insert into labtestlist(name, rate) values('Stool Elastase', 140);
insert into labtestlist(name, rate) values('Sweat Chloride', 120);
insert into labtestlist(name, rate) values('Colonoscopy with Polypectomy Biopsy', 1020);
insert into labtestlist(name, rate) values('Prostate Biopsy',1200);
insert into labtestlist(name, rate) values('Liver Biopsy', 1250);
insert into labtestlist(name, rate) values('Cervix Biopsy',1100);
insert into labtestlist(name, rate) values('Skin Biopsy', 950);
insert into labtestlist(name, rate) values('Hair Follicle Drug', 275);
insert into labtestlist(name, rate) values('Urine Drug', 345);
insert into labtestlist(name, rate) values('Fetal Fibronectin', 500);
insert into labtestlist(name, rate) values('First Trimester Screening', 370);
insert into labtestlist(name, rate) values('Opioid', 220);
insert into labtestlist(name, rate) values('Stool DNA', 775);
insert into labtestlist(name, rate) values('Pubic Lice', 480);
insert into labtestlist(name, rate) values('Synovial Fluid Analysis', 320);
insert into labtestlist(name, rate) values('10-Panel Drug', 129);
insert into labtestlist(name, rate) values('Amniocentesis', 645);
insert into labtestlist(name, rate) values('Bone Marrow Aspiration and Biopsy', 1200);
insert into labtestlist(name, rate) values('Cerebrospinal Fluid Analysis', 1500);
insert into labtestlist(name, rate) values('Oral Food Challenge',475);
insert into labtestlist(name, rate) values('Ova and Parasite', 950);
insert into labtestlist(name, rate) values('Pericardial Fluid Analysis',1300);
insert into labtestlist(name, rate) values('Peritoneal Fluid Analysis',1300);
insert into labtestlist(name, rate) values('Pleural Fluid Analysis',1300);


CREATE TABLE rockets (origin CHAR(20), destination CHAR(20), trip_time INT);

INSERT INTO rockets VALUES ('Earth', 'Venus', 3),('Venus', 'Earth', 3),('Earth', 'Mercury', 1),('Mercury', 'Venus', 3), ('Earth', 'Mars', 2), ('Mars', 'Earth', 2), ('Mars', 'Jupiter', 3), ('Jupiter', 'Saturn', 4), ('Saturn', 'Jupiter', 4), ('Saturn', 'Earth', 9);

create table orderDetails (id int primary key auto_increment, orderID int, customerID int , orderDate date, productName varchar(20), qty int, unitCost int);

insert into orderDetails values(default, 1, 2001, '2022-04-10','butter', 2, 65);
insert into orderDetails values(default, 1, 2001, '2022-04-10','bread', 2, 35);
insert into orderDetails values(default, 2, 2002, '2022-04-13','coffee', 2, 65);
insert into orderDetails values(default, 2, 2002, '2022-04-13','wheat', 1, 60);

insert into orderDetails values(default, 2, 2001, '2022-04-13','cheese', 2, 25);
insert into orderDetails values(default, 1, 2002, '2022-04-12','tea', 1, 125);

insert into orderDetails values(default, 1, 2004, '2022-04-15','cheese', 2, 25);
insert into orderDetails values(default, 1, 2005, '2022-04-14','rice', 1, 57);
insert into orderDetails values(default, 2, 2005, '2022-04-16','wheat', 1, 60);
insert into orderDetails values(default, 3, 2001, '2022-04-14','coffee', 2, 65);
insert into orderDetails values(default, 1, 2002, '2022-04-12','rice', 1, 57);
insert into orderDetails values(default, 1, 2003, '2022-04-13','jam', 1, 30);
insert into orderDetails values(default, 5, 2001, '2022-04-17','wheat', 1, 60);
insert into orderDetails values(default, 5, 2003, '2022-04-17','suger', 3, 45);
insert into orderDetails values(default, 3, 2001, '2022-04-14','bread', 2, 35);
insert into orderDetails values(default, 2, 2003, '2022-04-14','wheat', 1, 60);
insert into orderDetails values(default, 1, 2004, '2022-04-15','coffee', 2, 65);
insert into orderDetails values(default, 1, 2003, '2022-04-13','suger', 3, 45);
insert into orderDetails values(default, 1, 2004, '2022-04-15','rice', 2, 57);
insert into orderDetails values(default, 1, 2002, '2022-04-12','bread', 3, 35);
insert into orderDetails values(default, 1, 2004, '2022-04-15','jam', 1, 30);
insert into orderDetails values(default, 1, 2005, '2022-04-14','wheat', 1, 60);
insert into orderDetails values(default, 6, 2003, '2022-04-18','wheat', 1, 60);
insert into orderDetails values(default, 2, 2005, '2022-04-16','suger', 3, 45);
insert into orderDetails values(default, 1, 2004, '2022-04-15','bread', 2, 35);
insert into orderDetails values(default, 2, 2005, '2022-04-16','rice', 2, 57);
insert into orderDetails values(default, 3, 2003, '2022-04-15','rice', 2, 57);
insert into orderDetails values(default, 3, 2002, '2022-04-18','coffee', 2, 65);
insert into orderDetails values(default, 3, 2002, '2022-04-18','wheat', 1, 60);
insert into orderDetails values(default, 4, 2001, '2022-04-16','cheese', 2, 25);
insert into orderDetails values(default, 4, 2003, '2022-04-16','jam', 1, 30);
insert into orderDetails values(default, 4, 2003, '2022-04-16','wheat', 1, 60);
insert into orderDetails values(default, 5, 2001, '2022-04-17','rice', 1, 57);
insert into orderDetails values(default, 5, 2003, '2022-04-17','rice', 2, 57);


alter table orderDetails add total int generated always as (qty*unitCost);

CREATE TABLE pivot_table (
  id int primary key auto_increment,
  productName VARCHAR(100),
  storeLocation VARCHAR(50),
  totalSales INT
);

INSERT INTO pivot_table (id, productName, storeLocation, totalSales) VALUES
(default, 'Chair', 'North', 55),
(default, 'Desk', 'Central', 120),
(default, 'Couch', 'Central', 78),
(default, 'Chair', 'South', 23),
(default, 'Chair', 'South', 10),
(default, 'Chair', 'North', 98),
(default, 'Desk', 'West', 61),
(default, 'Couch', 'North', 180),
(default, 'Chair', 'South', 14),
(default, 'Desk', 'North', 45),
(default, 'Chair', 'North', 87),
(default, 'Chair', 'Central', 34),
(default, 'Desk', 'South', 42),
(default, 'Couch', 'West', 58),
(default, 'Couch', 'Central', 27),
(default, 'Chair', 'South', 91),
(default, 'Chair', 'West', 82),
(default, 'Chair', 'North', 37),
(default, 'Desk', 'North', 68),
(default, 'Couch', 'Central', 54),
(default, 'Chair', 'South', 81),
(default, 'Desk', 'North', 25),
(default, 'Chair', 'North', 46),
(default, 'Chair', 'Central', 121),
(default, 'Desk', 'South', 85),
(default, 'Couch', 'North', 43),
(default, 'Desk', 'West', 10),
(default, 'Chair', 'North', 5),
(default, 'Chair', 'Central', 16),
(default, 'Desk', 'South', 9),
(default, 'Couch', 'West', 22),
(default, 'Couch', 'Central', 59),
(default, 'Chair', 'South', 76),
(default, 'Chair', 'West', 48),
(default, 'Chair', 'North', 19),
(default, 'Desk', 'North', 3),
(default, 'Couch', 'West', 63),
(default, 'Chair', 'South', 81),
(default, 'Desk', 'North', 85),
(default, 'Chair', 'North', 90),
(default, 'Chair', 'Central', 47),
(default, 'Desk', 'West', 63),
(default, 'Couch', 'North', 28),
(default, 'Chair', 'East',89),
(default, 'Chair', 'East',11),
(default, 'Desk', 'East',110);

CREATE TABLE unpivot_table (
  id int primary key auto_increment,
  productName VARCHAR(100),
  northStore INT,
  southStore INT,
  eastStore INT,
  westStore INT,
  centralStore INT
);

insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Chair', 55, null, null, null,null );

insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Desk', null, null, null, null, 120);

insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Couch', null, null, null, null, 78);

insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Chair', null, 23, null, null, null);

insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Chair', null, 10, null, null, null);

insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Chair', 98, null, null, null, null);

insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Desk', null, null, null, 61, null);


insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Couch', 180, null, null, null, null);

insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Chair', null, 14, null, null, null);

insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Desk', 45, null, null, null, null);

insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Chair', 87, null, null, null, null);


insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Chair', null, null, null, null, 34);

insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Desk', null, 42, null, null, null);


insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Couch', null, null, null, 58, null);


insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Couch', null, null, null, null, 27);

insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Chair', null, 91, null, null, null);

insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Chair', null, null, null, 82, null);

insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Chair', 37, null, null, null, null);

insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Desk', 68, null, null, null, null);

insert into unpivot_table(productName, northStore, southStore, eastStore, westStore,  centralStore) values('Couch', null, null, null, null, 54);





























create table leadtable(c1 int primary key auto_increment, c2 int);

insert into leadtable values(default, 7),(default, 5),(default, 9),(default, 14),(default, 12),(default, 12),(default, 15),(default, 18),(default, 32),(default, 30),(default, 25);
 
create table traintimetable(id int auto_increment primary key, trainID int, stationname varchar(40),distance float, timing time);

insert into traintimetable(id, trainID, stationname, timing) values(default, 22863, 'mumbai central', '08:30:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 22863, 'surat', '12:40:13');
insert into traintimetable(id, trainID, stationname, timing) values(default, 22863, 'baroda', '14:42:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 22863, 'ahmednagar JN', '17:10:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 22863, 'surendranagar', '20:00:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 22863, 'rajkot JN', '23:40:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 22863, 'hapa', '00:05:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 22868, 'pune JN', '17:20:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 22868, 'uruli', '17:47:13');
insert into traintimetable(id, trainID, stationname, timing) values(default, 22868, 'daund chord line', '18:27:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 22868, 'ahmednagar', '20:10:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 22868, 'belapur', '21:15:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 22868, 'kopargaon', '21:57:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 22868, 'manmad JN', '23:25:13');
insert into traintimetable(id, trainID, stationname, timing) values(default, 22868, 'daund chord line', '18:27:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 22868, 'bhopal', '08:55:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12267, 'mumbai central', '23:00:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12267, 'ahmedabad JN', '05:00:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12267, 'surendranagar', '07:20:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12267, 'rajkot JN', '09:15:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12267, 'hapa', '12:45:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'HOWRAH JN', '23:25:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'BARDDHAMAN JN', '00:31:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'ASANSOL JN', '02:09:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'DHANBAD JN', '03:25:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'PARASNATH', '04:02:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'KODERMA', '04:54:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'GAYA JN', '06:30:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'ANUGRAHA NARAYAN ROAD', '07:20:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'DEHRI ON SONE', '07:40:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'SASARAM', '07:58:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'BHABUA ROAD', '08:38:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'PT DEEN DAYAL UPADHYAYA JN', '09:55:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'MIRZAPUR', '10:55:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'PRAYAGRAJ JN', '12:20:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'FATEHPUR', '13:32:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'KANPUR CENTRAL', '14:55:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'ETAWAH', '16:27:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'TUNDLA JN', '18:35:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'AGRA FORT', '19:30:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'ACHHNERA JN', '20:14:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'BHARATPUR JN', '20:44:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'GAYA JN', '06:30:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'JAIPUR', '00:05:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'NAWA CITY', '01:38:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'KUCHAMAN CITY', '01:55:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'MAKRANA JN', '02:03:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'DEGANA JN', '02:37:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'MERTA ROAD JN', '03:15:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12307, 'JODHPUR JN', '04:20:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12308, 'JAIPUR', '00:05:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12308, 'NAWA CITY', '01:38:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12308, 'KUCHAMAN CITY', '01:55:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12308, 'MAKRANA JN', '02:03:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12308, 'DEGANA JN', '02:37:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12308, 'MERTA ROAD JN', '03:15:00');
insert into traintimetable(id, trainID, stationname, timing) values(default, 12308, 'JODHPUR JN', '04:20:00');

update traintimetable set distance=0 where id=1;
update traintimetable set distance=262 where id=2;
update traintimetable set distance=129 where id=3;
update traintimetable set distance=100 where id=4;
update traintimetable set distance=130 where id=5;
update traintimetable set distance=116 where id=6;
update traintimetable set distance=75 where id=7;
update traintimetable set distance=0 where id=8;
update traintimetable set distance=30 where id=9;
update traintimetable set distance=87.1 where id=10;
update traintimetable set distance=71 where id=11;
update traintimetable set distance=61 where id=12;
update traintimetable set distance=44 where id=13;
update traintimetable set distance=41.84 where id=14;
update traintimetable set distance=249 where id=15;
update traintimetable set distance=728 where id=16;
update traintimetable set distance=0 where id=17;
update traintimetable set distance=534 where id=18;
update traintimetable set distance=131 where id=19;
update traintimetable set distance=106 where id=20;
update traintimetable set distance=191 where id=21;
update traintimetable set distance=2271 where id=22;
update traintimetable set distance=99.6 where id=23;
update traintimetable set distance=107 where id=24;
update traintimetable set distance=65.0 where id=25;
update traintimetable set distance=49 where id=26;
update traintimetable set distance=115 where id=27;
update traintimetable set distance=76 where id=28;
update traintimetable set distance=115 where id=29;
update traintimetable set distance=17 where id=30;
update traintimetable set distance=55 where id=31;
update traintimetable set distance=31 where id=32;
update traintimetable set distance=90 where id=33;
update traintimetable set distance=155.5 where id=34;
update traintimetable set distance=99 where id=35;
update traintimetable set distance=155 where id=36;
update traintimetable set distance=75 where id=37;
update traintimetable set distance=47 where id=38;
update traintimetable set distance=54 where id=39;
update traintimetable set distance=21 where id=40;
update traintimetable set distance=227 where id=41;
update traintimetable set distance=746 where id=42;
update traintimetable set distance=90 where id=43;
update traintimetable set distance=33 where id=44;
update traintimetable set distance=14 where id=45;
update traintimetable set distance=44 where id=46;
update traintimetable set distance=59 where id=47;
update traintimetable set distance=104 where id=48;
update traintimetable set distance=0 where id=49;
update traintimetable set distance=89 where id=50;
update traintimetable set distance=21 where id=51;
update traintimetable set distance=14 where id=52;
update traintimetable set distance=44 where id=53;
update traintimetable set distance=46 where id=54;
update traintimetable set distance=103 where id=55;

CREATE TABLE product_sales (
  product_name VARCHAR(20),
  store_location VARCHAR(20),
  num_sales INT
);

INSERT INTO product_sales (product_name, store_location, num_sales) VALUES
('Chair', 'North', 55),
('Desk', 'Central', 120),
('Couch', 'Central', 78),
('Chair', 'South', 23),
('Chair', 'South', 10),
('Chair', 'North', 98),
('Desk', 'West', 61),
('Couch', 'North', 180),
('Chair', 'South', 14),
('Desk', 'North', 45),
('Chair', 'North', 87),
('Chair', 'Central', 34),
('Desk', 'South', 42),
('Couch', 'West', 58),
('Couch', 'Central', 27),
('Chair', 'South', 91),
('Chair', 'West', 82),
('Chair', 'North', 37),
('Desk', 'North', 68),
('Couch', 'Central', 54),
('Chair', 'South', 81),
('Desk', 'North', 25),
('Chair', 'North', 46),
('Chair', 'Central', 121),
('Desk', 'South', 85),
('Couch', 'North', 43),
('Desk', 'West', 10),
('Chair', 'North', 5),
('Chair', 'Central', 16),
('Desk', 'South', 9),
('Couch', 'West', 22),
('Couch', 'Central', 59),
('Chair', 'South', 76),
('Chair', 'West', 48),
('Chair', 'North', 19),
('Desk', 'North', 3),
('Couch', 'West', 63),
('Chair', 'South', 81),
('Desk', 'North', 85),
('Chair', 'North', 90),
('Chair', 'Central', 47),
('Desk', 'West', 63),
('Couch', 'North', 28);



create table server(id int primary key, serverName varchar(20));

insert into server values(1,'server-1'), (2, 'server-2'), (3,'server-3'), (4, 'server-4'), (5,'server-5'), (6, 'server-6'), (7,'server-7'), (8, 'server-8'), (9,'server-9'), (10, 'server-10'), (11,'server-11'), (12, 'server-12'), (13, 'server-13'), (14, 'server-14'), (15, 'server-15'), (16, 'server-16'), (17, 'server-17'), (18, 'server-18'), (19, 'server-19'), (20, 'server-20'), (21, 'server-21'), (22, 'server-22');

create table runningServer(id int primary key, serverName varchar(20));

insert into runningServer values(6,'server-6'), (9,'server-9'), (7,'server-7'), (10,'server-10'), (14,'server-14'), (17,'server-17');



create table r(id int primary key auto_increment, c1 int); 
insert into r(c1) values(-2), (null),(1),(2),(-1),(null),(3),(-2),(null), (1), (5), (2), (null), (1),(null);


create table plumber(pid int, name varchar(20));
create table service(sid int, name varchar(20));
create table plumber_service_map(plumberID int, serviceID int);

insert into plumber values(1,'ramesh');
insert into plumber values(2,'keyur');
insert into plumber values(3,'rajesh');
insert into plumber values(4,'rajat');
insert into plumber values(5,'babu');
insert into plumber values(6,'bhavin');
insert into plumber values(7,'vasant');
insert into plumber values(8,'omkar');
insert into plumber values(9,'ninda');
insert into plumber values(10,'kapil');
insert into plumber values(11,'suraj');
insert into plumber values(12,'lalu');
insert into plumber values(13,'neeraj');
insert into plumber values(14,'vrajesh');
insert into plumber values(15,'anoop');
insert into plumber values(16,'jay');
insert into plumber values(17,'bhavin');
insert into plumber values(18,'jayesh');
insert into plumber values(19,'mangesh');

insert into service values(1,'s1');
insert into service values(2,'s2');
insert into service values(3,'s3');
insert into service values(4,'s3');
insert into service values(5,'s5');
insert into service values(6,'s6');
insert into service values(7,'s7');
insert into service values(8,'s8');
insert into service values(9,'s9');
insert into service values(10,'s10');
insert into service values(11,'s11');
insert into service values(12,'s12');
insert into service values(13,'s13');
insert into service values(14,'s14');
insert into service values(15,'s15');
insert into service values(16,'s16');
insert into service values(17,'s17');
insert into service values(18,'s18');
insert into service values(19,'s19');
insert into service values(20,'s20');
insert into service values(21,'s21');


insert into plumber_service_map values(1,1);
insert into plumber_service_map values(1,2);
insert into plumber_service_map values(1,3);
insert into plumber_service_map values(1,7);
insert into plumber_service_map values(1,10);
insert into plumber_service_map values(2,3);
insert into plumber_service_map values(2,6);
insert into plumber_service_map values(2,5);
insert into plumber_service_map values(2,3);
insert into plumber_service_map values(3,7);
insert into plumber_service_map values(4,9);
insert into plumber_service_map values(5,10);
insert into plumber_service_map values(6,4);
insert into plumber_service_map values(6,7);
insert into plumber_service_map values(6,2);
insert into plumber_service_map values(6,1);
insert into plumber_service_map values(6,10);
insert into plumber_service_map values(7,10);
insert into plumber_service_map values(7,11);
insert into plumber_service_map values(7,12);
insert into plumber_service_map values(8,6);
insert into plumber_service_map values(8,20);
insert into plumber_service_map values(9,16);
insert into plumber_service_map values(9,21);
insert into plumber_service_map values(10,21);
insert into plumber_service_map values(11,4);
insert into plumber_service_map values(11,5);
insert into plumber_service_map values(11,6);
insert into plumber_service_map values(12,9);
insert into plumber_service_map values(12,10);
insert into plumber_service_map values(13,1);
insert into plumber_service_map values(13,9);
insert into plumber_service_map values(13,10);
insert into plumber_service_map values(14,3);
insert into plumber_service_map values(14,4);
insert into plumber_service_map values(14,6);
insert into plumber_service_map values(15,7);
insert into plumber_service_map values(15,8);
insert into plumber_service_map values(15,19);
insert into plumber_service_map values(16,17);
insert into plumber_service_map values(16,18);
insert into plumber_service_map values(16,6);
insert into plumber_service_map values(17,13);
insert into plumber_service_map values(17,14);
insert into plumber_service_map values(17,15);

insert into plumber_service_map values(18,3);
insert into plumber_service_map values(18,2);
insert into plumber_service_map values(18,7);
insert into plumber_service_map values(18,8);

insert into plumber_service_map values(19,1);
insert into plumber_service_map values(19,2);
insert into plumber_service_map values(19,7);
insert into plumber_service_map values(19,9);
insert into plumber_service_map values(19,19);

create table quarterly_revenue(id int primary key AUTO_INCREMENT, year year, quarter varchar(10), amount float(8,2));

insert into quarterly_revenue values(default, 2017, 'Q1', 45000.57);
insert into quarterly_revenue values(default, 2017, 'Q2', 55000.00);
insert into quarterly_revenue values(default, 2017, 'Q3', 23000.13);
insert into quarterly_revenue values(default, 2017, 'Q4', 66000.00);
insert into quarterly_revenue values(default, 2020, 'Q1', 45000.57);
insert into quarterly_revenue values(default, 2020, 'Q2', 55000.00);
insert into quarterly_revenue values(default, 2020, 'Q3', 23000.13);
insert into quarterly_revenue values(default, 2020, 'Q4', 66000.00);
insert into quarterly_revenue values(default, 2018, 'Q1', 45000.57);
insert into quarterly_revenue values(default, 2018, 'Q2', 55000.00);
insert into quarterly_revenue values(default, 2018, 'Q3', 23000.13);
insert into quarterly_revenue values(default, 2018, 'Q4', 66000.00);
insert into quarterly_revenue values(default, 2019, 'Q1', 45000.57);
insert into quarterly_revenue values(default, 2019, 'Q2', 55000.00);
insert into quarterly_revenue values(default, 2019, 'Q3', 23000.13);
insert into quarterly_revenue values(default, 2019, 'Q4', 66000.00);
insert into quarterly_revenue values(default, 2020, 'Q1', 45000.57);
insert into quarterly_revenue values(default, 2020, 'Q2', 55000.00);
insert into quarterly_revenue values(default, 2020, 'Q3', 23000.13);
insert into quarterly_revenue values(default, 2020, 'Q4', 66000.00);
insert into quarterly_revenue values(default, 2021, 'Q1', 12500.35);
insert into quarterly_revenue values(default, 2021, 'Q2', 15000.55);
insert into quarterly_revenue values(default, 2021, 'Q3', 17000.27);
insert into quarterly_revenue values(default, 2021, 'Q4', 27000.35);
insert into quarterly_revenue values(default, 2022, 'Q1', 15000.45);
insert into quarterly_revenue values(default, 2022, 'Q2', 25000.64);
insert into quarterly_revenue values(default, 2022, 'Q3', 33000.73);
insert into quarterly_revenue values(default, 2022, 'Q4', 46000.75);
insert into quarterly_revenue values(default, 2023, 'Q1', 56483.65);
insert into quarterly_revenue values(default, 2023, 'Q2', 53783.78);
insert into quarterly_revenue values(default, 2023, 'Q3', 87345.67);
insert into quarterly_revenue values(default, 2023, 'Q4', 98357.00);

create table yearly_revenue(id int primary key AUTO_INCREMENT, year year,  amount float(8,2));

insert into yearly_revenue values(1, 2014, 7.75);
insert into yearly_revenue values(2, 2015, 9.23);
insert into yearly_revenue values(3, 2016, 5.44);
insert into yearly_revenue values(4, 2017, 7.77);
insert into yearly_revenue values(5, 2018, 1.68);
insert into yearly_revenue values(7, 2019, 5.87);
insert into yearly_revenue values(8, 2020, 3.35);
insert into yearly_revenue values(9, 2021, 4.61);
insert into yearly_revenue values(10, 2022, 6.83);
insert into yearly_revenue values(11, 2023, 2.90);


create table vote_response(candidateID int, response varchar(180));

insert into vote_response values(3, 'n,n,n,y,y,y,y,n,y,n,y,y,n,n,y,n,n,n,n,n,n,n,n,y,y,y,y,y,y,y,n,y,n,y,y,y,n,n,n,y,y,y,y,n,n,n,n,n,y');
insert into vote_response values(1, 'y,n,n,y,y,y,y,n,y,n,y,y,n,n,y,n,n,y,n,y,n,y,n,y,y,y,y,y,y,y,n,y,n,y,y,y,n,n,n,y,y,y,y,y,y,y,n,y,n,y,n,y,n,n,n,y,y,y,n');
insert into vote_response values(2, 'y,y,y,y,y,y,y,n,y,y,y,y,n,y,y,y,y,y,n,y,y,y,y,y,y,y,y,y,y,y,n,y,y,y,y,y,n,y,y,y,y,y,y,y,n,y,n');
insert into vote_response values(4, 'n,n,n,y,y,n,n,n,y,n,y,y,n,n,y,n,y,n,n,y,n,y,n,y,y,n,y,n,y,y,n,y,n,y,n,y,n,n,n,y,y,n,n');



CREATE TABLE `empj` (
  `id` int NOT NULL AUTO_INCREMENT,
  `document` json DEFAULT NULL,
  `insertedDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
);

insert into empj values( default, '{"empid":1020,"ename":"king","address": {"building": "1007", "coord": [-73.856077, 40.848447], "street": "Morris Park Ave", "zipcode": "10462"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["blue","black"], "fruit": [],"cards": [ { "aadhar":{"aadhar-No" :"93478", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}], "job":"president","mgr":null,"hiredate":{"$date":"1981-11-17T00:00:00.000Z"},"sal":5000,"comm":null,"deptno":10}', now());
insert into empj values( default, '{"empid":1021,"ename":"smith","address": {"building": "469", "coord": [-73.961704, 40.662942], "street": "Flatbush Avenue", "zipcode": "11225"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["red", "cyan", "gray"], "fruit": ["grapes", "Orange"],"cards": [ {"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}, {"PAN":{"PAN-No" :"smh838", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"aadhar":{"aadhar-No" :"43564", "isActive":true}}],"job":"manager","mgr":1020,"hiredate":{"$date":"1981-05-01T00:00:00.000Z"},"sal":3400,"comm":null,"deptno":10}', now());
insert into empj values( default, '{"empid":1022,"ename":"james","address": {"building": "351", "coord": [-73.98513559999999, 40.7676919], "street": "West   57 Street", "zipcode": "10019"},"isDocActive": true,"gender": "male","canVote": true, "canDrive":true,"color": ["Red","Blue","Green","Yellow"], "fruit": ["Indian Fig"],"cards": [ {"PAN":{"PAN-No" :"Kinj093", "isActive":false}}, { "aadhar":{"aadhar-No" :"73826", "isActive":true}}, {"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"manager","mgr":1020,"hiredate":{"$date":"1981-07-09T00:00:00.000Z"},"sal":4700,"comm":null,"deptno":20}', now());
insert into empj values( default, '{"empid":1023,"ename":"jack","address": {"building": "2780", "coord": [-73.98241999999999, 40.579505], "street": "Stillwell Avenue", "zipcode": "11224"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Air Force Blue","Apple Green"], "fruit": ["Orange"],"cards": [ {"voter":{"voterID":"Ind03o3", "isActive":true}}, { "aadhar":{"aadhar-No" :"12321", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}}, {"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"accountant","mgr":1022,"hiredate":{"$date":"1981-04-02T00:00:00.000Z"},"sal":2700,"comm":null,"deptno":30}', now());
insert into empj values( default, '{"empid":1023,"ename":"scott","address": {"building": "97-22", "coord": [-73.8601152, 40.7311739], "street": "63 Road", "zipcode": "11374"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Ash Grey", "White"], "fruit": [],"cards": [ { "aadhar":{"aadhar-No" :"93872", "isActive":true}}, {"voter":{"voterID":"Ind03o3","isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}}], "job":"salesman", "mgr":1023, "hiredate":{"$date":"1981-09-28T00:00:00.000Z"},"sal":2500,"comm":350,"deptno":30}', now());
insert into empj values( default, '{"empid":1024,"ename":"martin","address": {"building": "8825", "coord": [-73.8803827, 40.7643124], "street": "Astoria Boulevard", "zipcode": "11369"},"isDocActive": true,"gender": "male","canVote": true, "canDrive":true,"color": ["Banana Yellow"], "fruit": [],"cards": [ { "aadhar":{"aadhar-No" :"72877", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}}, {"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}], "job":"salesman", "mgr":1023, "hiredate":{"$date":"1981-02-20T00:00:00.000Z"},"sal":2900,"comm":735,"deptno":30}', now());
insert into empj values( default, '{"empid":1025,"ename":"crow","address": {"building": "2206", "coord": [-74.1377286, 40.6119572], "street": "Victory Boulevard", "zipcode": "10314"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Apple Green","Ash Grey"], "fruit": [],"cards": [ { "aadhar":{"aadhar-No" :"77876", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}}, {"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}], "job":"salesman", "mgr":1023,"hiredate":{"$date":"1981-09-08T00:00:00.000Z"},"sal":3200,"comm":null,"deptno":20}', now());
insert into empj values( default, '{"empid":1026,"ename":"blake","address": {"building": "7114", "coord": [-73.9068506, 40.6199034], "street": "Avenue U", "zipcode": "11234"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Brass","Bright Green"], "fruit": [],"cards": [ { "aadhar":{"aadhar-No" :"12321", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}}, {"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}], "job":"clerk", "mgr":1024,"hiredate":{"$date":"1981-12-03T00:00:00.000Z"},"sal":1200,"comm":null,"deptno":30}', now());
insert into empj values( default, '{"empid":1027,"ename":"richards","address": {"building": "6409", "coord": [-74.00528899999999, 40.628886], "street": "11 Avenue", "zipcode": "11219"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Charcoal","Cherry"], "fruit": [],"cards": [ { "aadhar":{"aadhar-No" :"83972", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}}, {"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}], "job":"clerk","mgr":1024,"hiredate":{"$date":"1981-02-22T00:00:00.000Z"},"sal":1500,"comm":null,"deptno":10}', now());
insert into empj values( default, '{"empid":1028,"ename":"peter","address": {"building": "1839", "coord": [-73.9482609, 40.6408271], "street": "Nostrand Avenue", "zipcode": "11226"},"isDocActive": true,"gender": "male","canVote": true, "canDrive":true,"color": ["Brown"], "fruit": ["banana","Jackfruit"],"cards": [ { "aadhar":{"aadhar-No" :"92783", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}}, {"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}], "job":"analyst", "mgr":1025,"hiredate":{"$date":"1981-12-03T00:00:00.000Z"},"sal":3500,"comm":null,"deptno":30}', now());
insert into empj values( default, '{"empid":1029,"ename":"bob","address": {"building": "2300", "coord": [-73.8786113, 40.8502883], "street": "Southern Boulevard", "zipcode": "10460"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Copper"], "fruit": [],"cards": [ { "aadhar":{"aadhar-No" :"73122", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}}, {"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}], "job":"manager", "mgr":1020,"hiredate":{"$date":"1980-12-17T00:00:00.000Z"},"sal":4900,"comm":null,"deptno":30}', now());
insert into empj values( default, '{"empid":1030,"ename":"saleel","address": {"building": "7715", "coord": [-73.9973325, 40.61174889999999], "street": "18 Avenue", "zipcode": "11214"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Coral"], "fruit": ["Dates","Orange"],"cards": [ { "aadhar":{"aadhar-No" :"73822", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}}, {"licence":{"licence-No":"LMV9478", "issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}, {"voter":{"voterID":"Ind03o3", "isActive":true}}], "job":"programmer", "mgr":1020, "hiredate":{"$date":"1982-12-09T00:00:00.000Z"},"sal":2900,"comm":null,"deptno":10}', now());
insert into empj values( default, '{"empid":1031,"ename":"sharmin","address": {"building": "1269", "coord": [-73.871194, 40.6730975], "street": "Sutter Avenue", "zipcode": "11208"},"isDocActive": false,"gender": "female","canVote": true, "canDrive":true,"color": ["Cream"], "fruit": ["Indian Fig"],"cards": [ { "aadhar":{"aadhar-No" :"16523", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}}, {"licence":{"licence-No":"LMV9478", "issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}], "job":"programmer", "mgr":1020,"hiredate":{"$date":"1983-01-12T00:00:00.000Z"},"sal":4999,"comm":null,"deptno":40}', now());
insert into empj values( default, '{"empid":1032,"ename":"vrushali","address": {"building": "1", "coord": [-73.96926909999999, 40.7685235], "street": "East   66 Street", "zipcode": "10065"},"isDocActive": true,"gender": "female","canVote": true, "canDrive":true,"color": ["Iceberg"], "fruit": ["Orange","Papaya", "Kiwi"],"cards": [ { "aadhar":{"aadhar-No" :"22343", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}}, {"licence":{"licence-No":"LMV9478", "issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"analyst", "mgr":1030, "hiredate":{"$date":"1982-02-23T00:00:00.000Z"}, "sal":4999, "comm":null, "deptno":20}', now());
insert into empj values( default, '{"empid":1033,"ename":"vasant","address": {"building": "705", "coord": [-73.9653967, 40.6064339], "street": "Kings Highway", "zipcode": "11223"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Bright Green"], "fruit": [],"cards": [ {"voter":{"voterID":"Ind03o3", "isActive":true}}, { "aadhar":{"aadhar-No" :"93824", "isActive":true}}, {"licence":{"licence-No":"LMV9478", "issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}}], "job":"salesman", "mgr":1029, "hiredate":{"$date":"1982-02-24T00:00:00.000Z"},"sal":2200,"comm":0,"deptno":40}', now());
insert into empj values( default, '{"empid":1034,"ename":"vasu","address": {"building": "203", "coord": [-73.97822040000001, 40.6435254], "street": "Church Avenue", "zipcode": "11218"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["India Green"], "fruit": ["Dates"],"cards": [{"PAN":{"PAN-No" :"Kinj093", "isActive":false}}, { "aadhar":{"aadhar-No" :"19826", "isActive":true}}, {"licence": {"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}},{"voter":{"voterID":"Ind03o3", "isActive":true}}, {"debit": {"bank":"BOI", "isActive":true}} ],"job":"salesman","mgr":1029,"hiredate":{"$date":"1980-02-14T00:00:00.000Z"},"sal":2200,"comm":250,"deptno":40}', now());
insert into empj values( default, '{"empid":1035,"ename":"rahul","address": {"building": "265-15", "coord": [-73.7032601, 40.7386417], "street": "Hillside Avenue", "zipcode": "11004"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Indian Red"], "fruit": ["Lychee","Indian Fig"],"cards": [ {"credit":{"bank":"SBI", "isActive":true}}, { "aadhar":{"aadhar-No" :"00998", "isActive":true}},{"OCI":{"country":"usa", "state":"NJ", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"clerk","mgr":1029,"hiredate":{"$date":"1981-12-31T00:00:00.000Z"},"sal":1200,"comm":null,"deptno":40}', now());
insert into empj values( default, '{"empid":1036,"ename":"raju","address": {"building": "6909", "coord": [-74.0259567, 40.6353674], "street": "3 Avenue", "zipcode": "11209"},"isDocActive": true,"gender": "male","canVote": true, "canDrive":true,"color": ["Indian Yellow"], "fruit": ["Crab apples"],"cards": [ { "aadhar":{"aadhar-No" :"55622", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"OCI":{"country":"usa", "state":"NJ", "isActive":true}}, {"voter":{"voterID":"Ind03o3", "isActive":true}}, {"licence":{"licence-No":"LMV9478", "issueDate":"2020-01-01", "expireDate":"2040-01-01", "isActive":true}}], "job":"administrator", "mgr":1031, "hiredate":{"$date":"1983-06-15T00:00:00.000Z"}, "sal":3400, "comm":null, "deptno":50}', now());
insert into empj values( default, '{"empid":1037,"ename":"ramu","address": {"building": "522", "coord": [-73.95171, 40.767461], "street": "East   74 Street", "zipcode": "10021"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Lemon"], "fruit": ["Jackfruit","banana", "Apple"],"cards": [ {"ATM":{"bank":"canara", "from":"2021-10-20", "to":"2025:12:21", "isActive":true}}, { "aadhar":{"aadhar-No" :"00983", "isActive":true}},{"ATM":{"bank":"BOI", "from":"2021-10-04", "to":"2027:12:21", "isActive":true}}, {"OCI":{"country":"usa", "state":"CA", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"clerk","mgr":1031,"hiredate":{"$date":"1983-07-12T00:00:00.000Z"},"sal":1400,"comm":null,"deptno":50}', now());
insert into empj values( default, '{"empid":1038,"ename":"neel","address": {"building": "284", "coord": [-73.9829239, 40.6580753], "street": "Prospect Park West", "zipcode": "11215"},"isDocActive": true,"gender": "male","canVote": true, "canDrive":true,"color": ["Apple Green"], "fruit": [],"cards": [{"OCI":{"country":"usa", "state":"IN", "isActive":true}}, { "aadhar":{"aadhar-No" :"00098", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"administrator","mgr":1030,"hiredate":{"$date":"1983-03-14T00:00:00.000Z"},"sal":4200,"comm":null,"deptno":10}', now());
insert into empj values( default, '{"empid":1039,"ename":"saleel","address": {"building": "129-08", "coord": [-73.839297, 40.78147], "street": "20 Avenue", "zipcode": "11356"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Cherry","Charcoal"], "fruit": [],"cards": [ {"ATM":{"bank":"BOI", "from":"2021-10-04", "to":"2027:12:21", "isActive":true}}, {"OCI":{"country":"usa", "state":"NY", "isActive":true}}, {"debit":{"bank":"BOI", "from":"2021-10-04", "to":"2027:12:21", "isActive":true}},{ "aadhar":{"aadhar-No" :"66675", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"analyst","mgr":1022,"hiredate":{"$date":"1982-12-09T00:00:00.000Z"},"sal":3700,"comm":null,"deptno":50}', now());
insert into empj values( default, '{"empid":1040,"ename":"amit","address": {"building": "759", "coord": [-73.9925306, 40.7309346], "street": "Broadway", "zipcode": "10003"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Indian Red"], "fruit": ["Crab apples"],"cards": [ { "aadhar":{"aadhar-No" :"66623", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"administrator","mgr":1029,"hiredate":{"$date":"1982-12-08T00:00:00.000Z"},"sal":3500,"comm":null,"deptno":50,"phone":[8.5088422e+07,{"$numberLong":"9822884228"}]}', now());
insert into empj values( default, '{"empid":1041,"ename":"dinesh","address": {"building": "3406", "coord": [-73.94024739999999, 40.7623288], "street": "10 Street", "zipcode": "11106"},"isDocActive": true,"gender": "male","canVote": true, "canDrive":true,"color": ["Air Force Blue"], "fruit": [],"cards": [ { "aadhar":{"aadhar-No" :"77767", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"programmer","mgr":1021,"hiredate":{"$date":"1982-12-09T00:00:00.000Z"},"sal":3500,"comm":null,"deptno":50,"phone":[8.5088422e+07,{"$numberLong":"9822884228"}],"skills":{"languages":["C++","JAVA"],"web":["php","java","jquery"]}}', now());
insert into empj values( default, '{"empid":1042,"ename":"amit","address": {"building": "502", "coord": [-73.976112, 40.786714], "street": "Amsterdam Avenue", "zipcode": "10024"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Orange"], "fruit": [],"cards": [ { "aadhar":{"aadhar-No" :"77787", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"administrator","mgr":1029,"hiredate":{"$date":"1981-11-03T00:00:00.000Z"},"sal":3500,"comm":null,"deptno":50,"phone":["9850884228","9822884228"]}', now());
insert into empj values( default, '{"empid":1043,"ename":"dinesh","address": {"building": "730", "coord": [-73.96805719999999, 40.7925587], "street": "Columbus Avenue", "zipcode": "10025"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Navy Blue"], "fruit": [],"cards": [ { "aadhar":{"aadhar-No" :"77789", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"programmer","mgr":1021,"hiredate":{"$date":"1981-11-04T00:00:00.000Z"},"sal":3500,"comm":null,"deptno":50,"phone":["020-25420200",{"$numberLong":"9822336644"}],"skills":{"languages":["C++","JAVA"],"web":["php","java","jquery"]}}', now());
insert into empj values( default, '{"empid":1044,"ename":"rudra","address": {"building": "18", "coord": [-73.996984, 40.72589], "street": "West Houston Street", "zipcode": "10012"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Lime"], "fruit": ["Indian Fig"],"cards": [ { "aadhar":{"aadhar-No" :"55543", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"programmer","mgr":1021,"hiredate":{"$date":"1981-11-04T00:00:00.000Z"},"sal":2400,"comm":null,"deptno":50,"phone":"020-25420212","skills":{"web":["php","java","jquery"],"database":["oracle","ms-sql server","mongodb"]}}', now());
insert into empj values( default, '{"empid":1045,"ename":"pankaj","address": {"building": "531", "coord": [-73.9634876, 40.6940001], "street": "Myrtle Avenue", "zipcode": "11205"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["White"], "fruit": ["Peach"],"cards": [ { "aadhar":{"aadhar-No" :"55565", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"programmer","mgr":1023,"hiredate":{"$date":"1980-02-17T00:00:00.000Z"},"sal":3600,"comm":null,"deptno":40,"phone":"022-2548345","skills":{"language":".NET","database":"ms-sql server"}}', now());
insert into empj values( default, '{"empid":1046,"ename":"anoop","address": {"building": "103-05", "coord": [-73.8642349, 40.75356], "street": "37 Avenue", "zipcode": "11368"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Navy Blue"], "fruit": [],"cards": [ { "aadhar":{"aadhar-No" :"83722", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"programmer","mgr":1029,"hiredate":{"$date":"1980-02-17T00:00:00.000Z"},"sal":2300,"comm":1200,"deptno":50,"phone":"022-2548345","skills":{"language":[".NET","java"],"database":"oracle","web":["json","jquery","javascript"]}}', now());
insert into empj values( default, '{"empid":1047,"ename":"nitish","address": {"building": "60", "coord": [-74.0085357, 40.70620539999999], "street": "Wall Street", "zipcode": "10005"},"isDocActive": true,"gender": "male","canVote": true, "canDrive":true,"color": ["Coral","Cream"], "fruit": [],"cards": [ { "aadhar":{"aadhar-No" :"99890", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"programmer","mgr":1039,"hiredate":{"$date":"1980-03-14T00:00:00.000Z"},"sal":1300,"comm":1200,"deptno":50,"phone":"022-2548345","skills":{"language":[".NET","java"],"database":{"rdbms":["oracle","db2"],"nosql":["mongodb","hive"]},"web":["json","jquery","javascript","php"]}}', now());
insert into empj values( default, '{"empid":1048,"ename":"neel","address": {"building": "195", "coord": [-73.9246028, 40.6522396], "street": "East   56 Street", "zipcode": "11203"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Orange"], "fruit": [],"cards": [ { "aadhar":{"aadhar-No" :"99099", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"programmer","mgr":1039,"hiredate":{"$date":"1980-03-14T00:00:00.000Z"},"sal":1800,"comm":1400,"deptno":50,"phone":"022-2534565","skills":{"language":"ruby","database":{"rdbms":["oracle","db2"],"nosql":["mongodb","hive","hbase"]}}}', now());
insert into empj values( default, '{"empid":1049,"ename":"arjun","address": {"building": "107", "coord": [-74.00920839999999, 40.7132925], "street": "Church Street", "zipcode": "10007"},"isDocActive": true,"gender": "male","canVote": true, "canDrive":true,"color": ["Sky Blue","Navy Blue","Blue"], "fruit": ["Lychee"],"cards": [ { "aadhar":{"aadhar-No" :"55434", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"auditor","mgr":1020,"hiredate":{"$date":"1984-05-05T00:00:00.000Z"},"sal":3200,"comm":null,"hra":1500,"da":1200,"deptno":20}', now());
insert into empj values( default, '{"empid":1050,"ename":"amol","address": {"building": "1006", "coord": [-73.84856870000002, 40.8903781], "street": "East 233 Street", "zipcode": "10466"},"isDocActive": false,"gender": "male","canVote": true, "canDrive":true,"color": ["Snow White"], "fruit": ["Orange"],"cards": [ { "aadhar":{"aadhar-No" :"44445", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"auditor","mgr":1047,"hiredate":{"$date":"1984-05-06T00:00:00.000Z"},"sal":3800,"comm":null,"hra":1000,"da":900,"deptno":20}', now());
insert into empj values( default, '{"empid":1051,"ename":"sangita","address": {"building": "56", "coord": [-73.991495, 40.692273], "street": "Court Street", "zipcode": "11201"},"isDocActive": false,"gender": "female","canVote": true, "canDrive":true,"color": ["White"], "fruit": ["Papaya"],"cards": [ { "aadhar":{"aadhar-No" :"99983", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"auditor","mgr":1040,"hiredate":{"$date":"1984-03-30T00:00:00.000Z"},"sal":3100,"comm":null,"hra":1000,"da":1500,"deptno":20}', now());
insert into empj values( default, '{"empid":1052,"ename":"gita","address": {"building": "7615", "coord": [-74.0228449, 40.6281815], "street": "5 Avenue", "zipcode": "11209"},"isDocActive": true,"gender": "female","canVote": true, "canDrive":true,"color": ["Indian Red"], "fruit": ["Kiwi"],"cards": [ { "aadhar":{"aadhar-No" :"44460", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"writer","language":["english","hindi"],"mgr":1049,"hiredate":{"$date":"1984-03-29T00:00:00.000Z"},"sal":2150,"comm":750,"hra":1300,"da":1700,"deptno":40}', now());
insert into empj values( default, '{"empid":1053,"ename":"sita","address": {"building": "120", "coord": [-73.9998042, 40.7251256], "street": "Prince Street", "zipcode": "10012"},"isDocActive": false,"gender": "female","canVote": true, "canDrive":true,"color": ["Snow White"], "fruit": ["Guava"],"cards": [ { "aadhar":{"aadhar-No" :"12233", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"writer","language":["english","hindi","marathi"],"mgr":1049,"hiredate":{"$date":"1984-03-30T00:00:00.000Z"},"sal":3755,"comm":750,"hra":1100,"da":1100,"deptno":40}', now());
insert into empj values( default, '{"empid":2001,"ename":"pinky","address": {"building": "1236", "coord": [-73.8893654, 40.81376179999999], "street": "238 Spofford Ave", "zipcode": "10474"},"isDocActive": true,"gender": "female","canVote": true, "canDrive":true,"color": ["India Green"], "fruit": ["banana","Jackfruit"],"cards": [ { "aadhar":{"aadhar-No" :"33434", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}}, {"voter":{"voterID":"Ind03o3", "isActive":true}},{"licence":{"licence-No":"LMV9478","issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}], "job":"Computer Programmer","mgr":1039, "hiredate":{"$date":"1983-07-17T00:00:00.000Z"}, "sal":3500,"comm":null,"deptno":10}', now());
insert into empj values( default, '{"empid":2002,"ename":"priti","address": {"building": "625", "coord": [-73.990494, 40.7569545], "street": "8 Avenue", "zipcode": "10018"},"isDocActive": false,"gender": "female","canVote": true, "canDrive":true,"color": ["Violet"], "fruit": [],"cards": [ { "aadhar":{"aadhar-No" :"55565", "isActive":true}}, {"PAN":{"PAN-No" :"Kinj093", "isActive":false}},{"voter":{"voterID":"Ind03o3", "isActive":true}}, {"licence":{"licence-No":"LMV9478", "issueDate":"2020-01-01","expireDate":"2040-01-01", "isActive":true}}],"job":"Computer Programmer", "mgr":1037, "hiredate":{"$date":"1983-07-17T00:00:00.000Z"}, "sal":5500,"comm":null,"deptno":20}', now());

CREATE TABLE transactions (
  _id int NOT NULL AUTO_INCREMENT,
  custId int DEFAULT NULL,
  transactionDate datetime DEFAULT NULL,
  type char(1) DEFAULT NULL,
  amount int DEFAULT NULL,
  PRIMARY KEY (_id)
);

INSERT INTO transactions VALUES
(default,1002,'2021-01-01 10:24:34','c',30000),
(default,1001,'2021-01-01 12:45:13','c',30000),
(default,1003,'2021-01-01 14:00:04','c',30000),
(default,1002,'2021-01-01 12:24:34','c',370000),
(default,1001,'2021-01-01 14:45:13','c',370000),
(default,1003,'2021-01-01 15:00:04','c',370000),
(default,1002,'2021-01-01 10:24:34','d',7000),
(default,1001,'2021-01-01 12:45:13','d',7500),
(default,1003,'2021-01-01 14:00:04','d',7000),
(default,1001,'2021-01-01 11:20:10','d',2000),
(default,1002,'2021-02-12 12:00:42','d',4000),
(default,1001,'2021-02-23 10:24:34','d',1500),
(default,1003,'2021-01-12 09:23:09','d',1000),
(default,1001,'2021-02-28 11:43:13','c',500),
(default,1002,'2021-03-13 12:23:31','d',500),
(default,1002,'2021-03-01 11:20:43','c',1500),
(default,1003,'2021-02-24 11:34:32','c',200),
(default,1002,'2021-04-30 14:20:32','d',6000),
(default,1001,'2021-02-27 11:43:10','d',2000),
(default,1001,'2021-03-17 09:15:23','c',1200),
(default,1003,'2021-04-06 09:13:22','d',4500),
(default,1003,'2021-02-04 11:32:43','d',4200),
(default,1001,'2021-05-14 10:17:10','c',600),
(default,1003,'2021-02-07 14:45:33','c',400),
(default,1002,'2021-04-29 15:53:23','c',1200),
(default,1002,'2021-06-23 09:53:54','c',1600),
(default,1003,'2021-03-06 11:50:34','d',3000),
(default,1002,'2021-04-30 14:20:33','d',3000),
(default,1001,'2021-05-14 10:17:13','c',600),
(default,1003,'2021-01-01 14:00:05','d',7000),
(default,1002,'2021-06-23 09:53:57','c',250),
(default,1001,'2021-05-14 10:17:18','d',5600),
(default,1003,'2021-03-06 11:50:37','c',200);

create table stadium (id int primary key, visit_date date, people int);

insert into stadium values(1, "2017-01-01", 10), (2, "2017-01-02", 109), (3, "2017-01-03", 150), (4, "2017-01-04", 99 ), (5, "2017-01-05", 145), (6, "2017-01-06", 1455), (7, "2017-01-07", 199), (8, "2017-01-09", 188), (9, "2017-01-10", 98), (10, "2017-11-09", 188);

create table andor (id int, c1 varchar(10), city varchar(10));
insert into andor values(1,'saleel','pune');
insert into andor values(2,'sharmin','pune');
insert into andor values(3,'ruhan','baroda');
insert into andor values(4,'saleel','baroda');

create table points (
  c1 INT
);

INSERT INTO points VALUES(1),(2),(-1),(3),(-2),(1);


CREATE TABLE candidate (
  id INT PRIMARY KEY,
  name VARCHAR(45) NULL,
  totalVotes INT NULL
);

INSERT INTO candidate (id, name) VALUES (1, 'Sanjay');
INSERT INTO candidate (id, name) VALUES (2, 'Sumeet');
INSERT INTO candidate (id, name) VALUES (3, 'Saleel');
INSERT INTO candidate (id, name) VALUES (4, 'Sagar');

CREATE TABLE votes (
  id INT PRIMARY KEY AUTO_INCREMENT,
  candidateID INT NULL
);
  
  
INSERT INTO votes VALUES ('1', '4');
INSERT INTO votes VALUES ('2', '3');
INSERT INTO votes VALUES ('3', '1');
INSERT INTO votes VALUES ('4', '2');
INSERT INTO votes VALUES ('5', '2');
INSERT INTO votes VALUES ('6', '1');
INSERT INTO votes VALUES ('7', '2');
INSERT INTO votes VALUES ('8', '3');
INSERT INTO votes VALUES ('9', '1');
INSERT INTO votes VALUES ('10', '2');
INSERT INTO votes VALUES ('11', '1');
INSERT INTO votes VALUES ('12', '2');
INSERT INTO votes VALUES ('13', '3');
INSERT INTO votes VALUES ('14', '1');
INSERT INTO votes VALUES ('15', '1');
INSERT INTO votes VALUES ('16', '4');
INSERT INTO votes VALUES ('17', '2');
INSERT INTO votes VALUES ('18', '4');
INSERT INTO votes VALUES ('19', '2');
INSERT INTO votes VALUES ('20', '1');
INSERT INTO votes VALUES ('21', '2');
INSERT INTO votes VALUES ('22', '1');
INSERT INTO votes VALUES ('23', '3');
INSERT INTO votes VALUES ('24', '3');
INSERT INTO votes VALUES ('25', '1');
INSERT INTO votes VALUES ('26', '1');
INSERT INTO votes VALUES ('27', '3');
  
  
  
CREATE TABLE food (
    item_id INT,
    item_name VARCHAR(45),
    item_unit VARCHAR(45),
    company_id INT  
);

CREATE TABLE company (
    company_id INT,
    company_name VARCHAR(45),
    company_city VARCHAR(45)
);

INSERT INTO food VALUES (1, 'biscuit', 'packet',18);
INSERT INTO food VALUES (4, 'cakes', 'Pcs', 15);
INSERT INTO food VALUES (6, 'cheez', 'packet', 16);
INSERT INTO food VALUES (5, 'butter', 'packet', 17);
INSERT INTO food VALUES (2, 'bread', 'packet', 19);
INSERT INTO food VALUES (7, 'eggs', 'Pcs', NULL);
INSERT INTO food VALUES (3, 'salt', 'packet', NULL);
INSERT INTO food VALUES (8, 'jam', 'bottle', 18);
INSERT INTO food VALUES (9, 'pizza', 'Pcs', 18);
INSERT INTO food VALUES (10, 'burger', 'Pcs', 16);
INSERT INTO food VALUES (11, 'juice', 'bottle', 16);
INSERT INTO food VALUES (12, 'milk', 'bottle', 17);
INSERT INTO food VALUES (13, 'ice-cream', 'packet', 18);
INSERT INTO food VALUES (14, 'nuts', 'packets', 17);

INSERT INTO company  VALUES (18, 'Akas Foods', 'pune');
INSERT INTO company  VALUES (15, 'Foodies', 'baroda');
INSERT INTO company  VALUES (16, 'Gold Foods', 'surat');
INSERT INTO company  VALUES (17, 'Natural Foons', 'pune');
INSERT INTO company  VALUES (19, 'J&S Foods', 'mumbai');




create table key_parts(c1 int, c2 int);

insert into key_parts values row(2,3), row(7,5), row(5,7), row(3,8), row(9,4), row(10,19), row(20,16), row(6,14), row(7,12), row(12,5), row(9,17), row(17,9), row(10,10), row(20,3), row(17,15), row(19,16), row(3,8), row(9,9), row(10,19), row(20,16), row(6,14), row(7,12), row(12,5), row(9,17), row(17,9), row(10,10);

CREATE TABLE books (ID int primary key auto_increment, 
bookName varchar(45), 
Type varchar(45), 
Cost int);

INSERT INTO books VALUES(default, 'DS', 'Hardcover', '950');
INSERT INTO books VALUES(default, 'DS', 'Hardcover', '950');
INSERT INTO books VALUES (default, 'JavaScript', 'Paperback', '700');
INSERT INTO books VALUES (default, 'JavaScript', 'Paperback', '700');
INSERT INTO books VALUES(default, 'Hbase','Paperback',760);
INSERT INTO books VALUES(default, 'Python','Hardcover',980);
INSERT INTO books VALUES(8, 'SQL','Hardcover',980);

CREATE TABLE newbooks (ID int primary key auto_increment, 
bookName varchar(45), 
Type varchar(45), 
Cost int);

INSERT INTO newbooks VALUES (default, 'Redis', 'Paperback', '850');
INSERT INTO newbooks VALUES (default, 'Redis', 'Paperback', '850');
INSERT INTO newbooks VALUES (default, 'JavaScript', 'Paperback', '700');
INSERT INTO newbooks VALUES (default, 'JavaScript', 'Paperback', '700');
INSERT INTO newbooks VALUES(default,'Hbase','Paperback',760);
INSERT INTO newbooks VALUES(7,'HTML','Paperback',900);
INSERT INTO newbooks VALUES(9,'CSS','Paperback',740);


CREATE TABLE runners (id int, name varchar(20));
INSERT INTO runners values(1, 'John Doe');
INSERT INTO runners values(2, 'Jane Doe');
INSERT INTO runners values(3, 'Alice Jones');
INSERT INTO runners values(4, 'Bobby Louis');
INSERT INTO runners values(5, 'Lisa Romero');

CREATE TABLE races(id int, event varchar(45), year year, winner_id int);
insert INTO races values(1, '100 meter dash', 2001, 2);
insert INTO races values(2, '500 meter dash', 2001, 3);
insert INTO races values(3, 'cross-country', 2001, 2);
insert INTO races values(4, '100 meter dash', 2000, 1);
insert INTO races values(5, '500 meter dash', 2000, 5);
insert INTO races values(6, 'cross-country', 2000, 4);
insert INTO races values(7, 'triathalon', null, NULL);


CREATE TABLE mass_table (weight float(4,2));

insert into mass_table values(26.43), (54.65), (34.463), (60.223), (62.73), (35.63), (47.43), (63.47);

CREATE TABLE agent (
agentID int PRIMARY KEY auto_increment,
agentName varchar(20),
phone varchar(10)
);


INSERT INTO agent(agentName, phone) VALUES ('Sai Travels', '9850883667');
INSERT INTO agent(agentName, phone) VALUES ('Raj Travels', '9922295489');
INSERT INTO agent(agentName, phone) VALUES ('Prime Travels', '9867889227');
INSERT INTO agent(agentName) VALUES ('4 Star Travles');
INSERT INTO agent(agentName, phone) VALUES ('7 Seas Travels', '9869884778');
INSERT INTO agent(agentName) VALUES ('Abhinav Travels');


CREATE TABLE licence (
  ID INT PRIMARY KEY,
  customerID INT,
  licenceClass VARCHAR(45),
  licenceType VARCHAR(128),
  licenceNumber VARCHAR(45),
  ValidFrom VARCHAR(45),
  ValidTo VARCHAR(45),
  agentID INT );

INSERT INTO licence VALUES ('1', '1', 'LMV', 'Light motor vehicles including motorcars, jeeps, taxis, delivery vans', 'RQFY8GZNDF9E', '********', '********', '1');
INSERT INTO licence VALUES ('2', '2', 'LMV', 'Light motor vehicles including motorcars, jeeps, taxis, delivery vans', 'ZFVHYH4OAHGS', '********', '********', '2');
INSERT INTO licence VALUES ('3', '1', 'HMV', 'Heavy Motor Vehicles', '20CMZQ6ERXJ4', '********', '********', '3');
INSERT INTO licence VALUES ('4', '2', 'HMV', 'Heavy Motor Vehicles', 'DNIE1K9R5BG6', '********', '********', '1');
INSERT INTO licence VALUES ('5', '3', 'LMV', 'Light motor vehicles including motorcars, jeeps, taxis, delivery vans', 'Y3CNWQ6MKPCG', '********', '********', '2');
INSERT INTO licence VALUES ('6', '3', 'HMV', 'Heavy Motor Vehicles', 'Y6DC2IRD2EWZ', '********', '********', '1');
INSERT INTO licence VALUES ('7', '4', 'HGMV', 'Heavy Goods Motor Vehicle', '2EFFSXY04OAW', '********', '********', '3');
INSERT INTO licence VALUES ('8', '5', 'HMV', 'Heavy Motor Vehicles', 'GC1BMWKCTVQ4', '********', '********', '2');
INSERT INTO licence VALUES ('9', '6', 'LMV', 'Light motor vehicles including motorcars, jeeps, taxis, delivery vans', '2148PC50IR3P', '********', '********', '1');
INSERT INTO licence VALUES ('10', '7', 'HPMV', 'Heavy passenger motor vehicle/Heavy transport vehicle', 'N4NODNCFJENP', '********', '********', '2');
INSERT INTO licence VALUES ('11', '8', 'HGMV', 'Heavy Goods Motor Vehicle', 'EBPW9M34FKOI', '********', '********', '2');
INSERT INTO licence VALUES ('12', '9', 'HPMV', 'Heavy passenger motor vehicle/Heavy transport vehicle', '940MGEL4HO00', '********', '********', '3');
INSERT INTO licence VALUES ('13', '10', 'LMV', 'Light motor vehicles including motorcars, jeeps, taxis, delivery vans', 'JWRDAETHDU5Z', '********', '********', '1');
INSERT INTO licence VALUES ('14', '11', 'HGMV', 'Heavy Goods Motor Vehicle', 'Z95XCS7W9NAU', '********', '********', '2');
INSERT INTO licence VALUES ('15', '12', 'HGMV', 'Heavy Goods Motor Vehicle', '1YJ12NQX8HAJ', '********', '********', '1');
INSERT INTO licence VALUES ('16', '13', 'LMV', 'Light motor vehicles including motorcars, jeeps, taxis, delivery vans', '1XMTETH8E6JS', '********', '********', '1');
INSERT INTO licence VALUES ('17', '14', 'HPMV', 'Heavy passenger motor vehicle/Heavy transport vehicle', '0WEMMTPVTBPM', '********', '********', '2');


CREATE TABLE blog (
ID int primary key,
blog text,
blogDate date
);

INSERT INTO blog (ID, blog, blogDate) VALUES ('1', 'WordPress.org - Among the best blog sites, the self-hosted version of WordPress is, by far the most popular blogging platform in the world. WordPress powers over 90 percent of all the blogs on the Internet. It’s often confused with its close cousin WordPress.com. We will cover the latter as well. You can learn more about the differences between the two platforms in this article.', '2019-03-17');
INSERT INTO blog (ID, blog, blogDate) VALUES ('2', ' WordPress.com: WordPress.com is a blog site hosting service by Automattic. You can get a free blog with basic features. For advanced functionality, you need to opt for one of their paid plans. It can be a great starting point for blogging. If you ever decide to have more control over your site, it’s relatively easy to move from WordPress.com to WordPress.org.', '2019-07-21');
INSERT INTO blog (ID, blog, blogDate) VALUES ('3', 'Wix.com: Wix is similar to Squarespace. It allows you to put together your web presence via drag and drop and comes with blogging ability that you can add to your site. You can read about adding Wix in this article.', '2019-03-19');
INSERT INTO blog (ID, blog, blogDate) VALUES ('4', 'Joomla.com: Next on our list of the best blog sites is another open-source content management system that you can use to build all kinds of websites. We have detailed information about it in WordPress vs. Joomla vs. Drupal and in the post on how to create a website with Joomla.', '2019-05-25');
INSERT INTO blog (ID, blog, blogDate) VALUES ('5', 'Medium.com: Medium is a publishing platform founded in 2012 by one of the people behind Twitter. By now, it has become a popular community for writers, bloggers, and journalists. In addition to the ability to write blog posts, it also comes with limited social networking functions. You can comment on other people’s content and “like” it (likes are called “claps” on Medium). The audience is built into the platform.', '2019-10-09');
INSERT INTO blog (ID, blog, blogDate) VALUES ('6', 'Ghost.org: This is a publishing platform focused only on blogging. The idea was to make a more streamlined and modern version of WordPress. As a consequence, the platform is built on JavaScript. It’s also available for a hosted or self-hosted version.', '2019-11-21');
INSERT INTO blog (ID, blog, blogDate) VALUES ('7', 'Squarespace.com: Squarespace is a drag-and-drop website builder which is aimed at small business owners. It’s a great all-in-one solution for non-technical people and offers hosting, domain registration, and the possibility for e-commerce. It also has blogging capabilities which are the reason why it’s among the best blog sites out there.', '2019-05-16');
INSERT INTO blog (ID, blog, blogDate) VALUES ('8', 'Weebly.com: Weebly is another site builder with a modular approach and a web-based interface. Pick a template and position your content as blocks in different areas.', '2019-07-27');
INSERT INTO blog (ID, blog, blogDate) VALUES ('9', 'Blogger.com: This free blog hosting service has been around for a long time. It was founded in 1999 and acquired by Google in 2003. As a consequence, you can sign up easily with your existing Google account.', '2019-08-14');
INSERT INTO blog (ID, blog, blogDate) VALUES ('10', 'Tumblr.com: The final entry for the best blog sites is Tumblr. The service is a micro-blogging platform optimized for short-form content. It also has a community behind it and social network features. Think of it as a middle ground between WordPress and Twitter.', '2019-12-30');

CREATE TABLE comments (
   ID INT PRIMARY KEY, 
   comment TEXT, 
   commentDate DATETIME,
   blogID INT,
   FOREIGN KEY(blogID) REFERENCES blog(ID)
) ;


INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('1', 'Some Comment for blog#1.1', '2019-03-17', '1');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('2', 'Some Comment for blog#4.1', '2019-05-25', '4');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('3', 'Some Comment for blog#2.1', '2019-07-21', '2');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('4', 'Some Comment for blog#4.2', '2019-05-25', '4');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('5', 'Some Comment for blog#5.1', '2019-10-10', '5');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('6', 'Some Comment for blog#4.3', '2019-05-25', '4');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('7', 'Some Comment for blog#4.4', '2019-05-26', '4');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('8', 'Some Comment for blog#8', '2019-07-27', '8');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('9', 'Some Comment for blog#10.1', '2019-12-30', '10');
INSERT INTO comments (ID, comment) VALUES ('10', 'Some Comment');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('11', 'Some Comment for blog#9.1', '2019-08-14', '9');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('12', 'Some Comment for blog#10.2', '2019-12-31', '10');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('13', 'Some Comment for blog#6.1', '2019-11-21', '6');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('14', 'Some Comment for blog#3.1', '2019-03-19', '3');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('15', 'Some Comment for blog#1.2', '2019-03-18', '1');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('16', 'Some Comment for blog#10.3', '2019-12-31', '10');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('17', 'Some Comment for blog#9.2', '2019-08-15', '9');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('18', 'Some Comment for blog#10.4', '2019-12-31', '10');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('19', 'Some Comment for blog#2.2', '2019-07-21', '2');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('20', 'Some Comment for blog#4.5', '2019-05-27', '4');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('21', 'Some Comment for blog#1.3', '2019-03-20', '1');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('22', 'Some Comment for blog#5.2', '2019-10-12', '5');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('23', 'Some Comment for blog#3.2', '2019-03-19', '3');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('24', 'Some Comment for blog#4.6', '2019-05-27', '4');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('25', 'Some Comment for blog#1.4', '2019-03-19', '1');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('26', 'Some Comment for blog#6.2', '2019-11-21', '6');
INSERT INTO comments (ID, comment, commentDate, blogID) VALUES ('27', 'Some Comment for blog#3.3', '2019-03-19', '3');


CREATE TABLE sales_channel (  
channel_id int,  
channel varchar(255)
);

insert into sales_channel values('1', 'Wholesale');
insert into sales_channel values('2', 'Retail');
insert into sales_channel values('3', 'Agents');
insert into sales_channel values('4', 'eCommerce');

CREATE TABLE warehouse (
warehouse_id int,
warehouse_name varchar(255),
channel_id int);

insert into warehouse values ('143', 'AC Warehouse', '1');
insert into warehouse values ('156', 'National', '2');
insert into warehouse values ('231', 'Global', '3');
insert into warehouse values ('254', 'NON-STOP', '2');
insert into warehouse values ('321', 'Migrant System', '2');
insert into warehouse values ('464', 'Blaze', '1');


CREATE TABLE tableA(id INT, name varchar(10));
CREATE TABLE tableB(id INT, name varchar(10));

INSERT INTO tableA VALUES(5,'aa'),(1,'a'), (2,'b'), (3,'y'), (null,'d'), (5,null),(1,null),(1,'b'),(8,'a');
INSERT INTO tableB VALUES(1,'a'), (2,'x'), (4,'b'), (null,'c'), (6,null),(null, null),(7,'z'),(2, null),(5,'z'),(9,'u');


CREATE TABLE envelope(id int, user_id int);
CREATE TABLE docs(idnum int, pageseq int, doctext varchar(100));

INSERT INTO envelope VALUES (1,1), (2,2), (3,3);

INSERT INTO docs(idnum,pageseq) VALUES (1,5), (2,6), (null,0);

CREATE TABLE IF NOT EXISTS r1 (c1 INT);
insert into r1 values(1),(2),(3),(4);

CREATE TABLE IF NOT EXISTS r2 (c1 INT, c2 VARCHAR(10));
insert into r2 values(1,'a'),(2,'b'),(1,'c'),(3,'d'),(2,'e'),(1,'f');


CREATE TABLE IF NOT EXISTS TASKS (id INT PRIMARY KEY AUTO_INCREMENT, title VARCHAR(255) NOT NULL,  completed BOOLEAN);

INSERT INTO TASKS VALUE(default, 'Task-1', 1);
INSERT INTO TASKS VALUE(default, 'Task0', 0);
INSERT INTO TASKS VALUE(default, 'Task1', 0);
INSERT INTO TASKS VALUE(default, 'Task2', 1);
INSERT INTO TASKS VALUE(default, 'Task3', False);
INSERT INTO TASKS VALUE(default, 'Task4', True);
INSERT INTO TASKS VALUE(default, 'Task5', null);
INSERT INTO TASKS VALUE(default, 'Task6', default);
INSERT INTO TASKS VALUE(default, 'Task7', 1>2);
INSERT INTO TASKS VALUE(default, 'Task8', 1<2);
INSERT INTO TASKS VALUE(default, 'Task9', 12);
INSERT INTO TASKS VALUE(default, 'Task10', 58);
INSERT INTO TASKS VALUE(default, 'Task11',.75);
INSERT INTO TASKS VALUE(default, 'Task12',.15);
INSERT INTO TASKS VALUE(default, 'Task13', 'a' = 'a');
INSERT INTO TASKS VALUE(default, 'Task14', null);



CREATE TABLE IF NOT EXISTS revenue (
    id INT PRIMARY KEY,
    q1 float(8,2),
    q2 float(8,2),
    q3 float(8,2),
    q4 float(8,2)
);

INSERT INTO revenue(id,q1,q2,q3,q4)
VALUES (1,100,120,110,130),
	(2,250,260,300,317),
	(3,125,560,100,278),
	(4,165,626,234,110),
	(5,500,670,542,310),
	(6,750,null,235,310),
	(7,350,160,145,310);


 create table products (
	ProductID int primary key auto_increment,
	ProductName varchar(40),
	SupplierID int,
	CategoryID int,
	QuantityPerUnit varchar(20),
	UnitPrice decimal(10,4) Default 0.0000,
	UnitsInStock int Default 0,
	UnitsOnOrder int Default 0,
	ReorderLevel int Default 0,
	Discontinued boolean
);

insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Chai', 1, 1, '10 boxes x 20 bags', 18.0000,39,0,10,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Chang', 1, 1, '24 - 12 oz bottles', 19.0000,17,40,25,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Aniseed Syrup', 1, 2, '12 - 550 ml bottles', 10.0000,13,70,25,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, "Chef Anton's Cajun Seasoning", 2, 2, '48 - 6 oz jars', 22.0000,53,0,0,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, "Chef Anton's Gumbo Mix", 2, 2, '36 boxes', 21.3500,0,0,0,1);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, "Grandma's Boysenberry Spread", 3, 2, '12 - 8 oz jars', 25.0000,120,0,25,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, "Uncle Bob's Organic Dried Pears", 3, 7, '12 - 1 lb pkgs.', 30.0000,15,0,10,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Northwoods Cranberry Sauce', 3, 2, '12 - 12 oz jars', 40.0000,6,0,0,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Mishi Kobe Niku', 4, 6, '18 - 500 g pkgs.', 97.0000,29,0,0,1);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Ikura', 4, 8, '12 - 200 ml jars', 31.0000,31,0,0,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Queso Cabrales', 5, 4, '1 kg pkg.', 21.0000,22,30,30,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Queso Manchego La Pastora', 5, 4, '10 - 500 g pkgs.', 38.0000,86,0,0,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Konbu', 6, 8, '2 kg box', 6.0000,24,0,5,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Tofu', 6, 7, '40 - 100 g pkgs.', 23.2500,35,0,0,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Genen Shouyu', 6, 2, '40 - 100 g pkgs.', 15.5000,39,0,5,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Pavlova', 7, 3, '32 - 500 g boxes', 17.4500,29,0,10,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Alice Mutton', 7, 6, '20 - 1 kg tins', 39.0000,0,0,0,1);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Carnarvon Tigers', 7, 8, '16 kg pkg.', 62.5000,42,0,0,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Teatime Chocolate Biscuits', 8, 3, '10 boxes x 12 pieces', 9.2000,25,0,5,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, "Sir Rodney's Marmalade", 8, 3, '30 gift boxes', 81.0000,40,0,0,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, "Sir Rodney's Scones", 8, 3, '24 pkgs. x 4 pieces', 10.0000,3,40,5,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, "Gustaf's Knckebrd", 9, 5, '24 - 500 g pkgs.', 21.0000,104,0,25,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Tunnbrd', 9, 5, '12 - 250 g pkgs.', 9.0000,61,0,25,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Guaran Fantstica', 10, 1, '12 - 355 ml cans', 4.5000,20,0,0,1);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'NuNuCa Nu-Nougat-Creme', 11, 3, '20 - 450 g glasses', 14.0000,76,0,30,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Gumbr Gummibrchen', 11, 3, '100 - 250 g bags', 31.2300,15,0,0,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Schoggi Schokolade', 11, 3, '100 - 100 g pieces', 43.9000,49,0,30,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Rssle Sauerkraut', 12, 7, '25 - 825 g cans', 45.6000,26,0,0,1);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Thringer Rostbratwurst', 12, 6, '50 bags x 30 sausgs.', 123.7900,0,0,0,1);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Nord-Ost Matjeshering', 13, 8, '10 - 200 g glasses', 25.8900,10,0,15,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Gorgonzola Telino', 14, 4, '12 - 100 g pkgs', 12.5000,0,70,20,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Mascarpone Fabioli', 14, 4, '24 - 200 g pkgs.', 32.0000,9,40,25,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Geitost', 15, 4, '500 g', 2.5000,112,0,20,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Sasquatch Ale', 16, 1, '24 - 12 oz bottles', 14.0000,111,0,15,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Steeleye Stout', 16, 1, '24 - 12 oz bottles', 18.0000,20,0,15,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Inlagd Sill', 17, 8, '24 - 250 g jars', 19.0000,112,0,20,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Gravad lax', 17, 8, '12 - 500 g pkgs.', 26.0000,11,50,25,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Cte de Blaye', 18, 1, '12 - 75 cl bottles', 263.5000,17,0,15,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Chartreuse verte', 18, 1, '750 cc per bottle', 18.0000,69,0,5,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Boston Crab Meat', 19, 8, '24 - 4 oz tins', 18.4000,123,0,30,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, "Jack's New England Clam Chowder", 19, 8, '12 - 12 oz cans', 9.6500,85,0,10,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Singaporean Hokkien Fried Mee', 20, 5, '32 - 1 kg pkgs.', 14.0000,26,0,0,1);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Ipoh Coffee', 20, 1, '16 - 500 g tins', 46.0000,17,10,25,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Gula Malacca', 20, 2, '20 - 2 kg bags', 19.4500,27,0,15,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Rogede sild', 21, 8, '1k pkg.', 9.5000,5,70,15,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Spegesild', 21, 8, '4 - 450 g glasses', 12.0000,95,0,0,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Zaanse koeken', 22, 3, '10 - 4 oz boxes', 9.5000,36,0,0,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Chocolade', 22, 3, '10 pkgs.', 12.7500,15,70,25,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Maxilaku', 23, 3, '24 - 50 g pkgs.', 20.0000,10,60,15,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Valkoinen suklaa', 23, 3, '12 - 100 g bars', 16.2500,65,0,30,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Manjimup Dried Apples', 24, 7, '50 - 300 g pkgs.', 53.0000,20,0,10,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Filo Mix', 24, 5, '16 - 2 kg boxes', 7.0000,38,0,25,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Perth Pasties', 24, 6, '48 pieces', 32.8000,0,0,0,1);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Tourtire', 25, 6, '16 pies', 7.4500,21,0,10,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Pt chinois', 25, 6, '24 boxes x 2 pies', 24.0000,115,0,20,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Gnocchi di nonna Alice', 26, 5, '24 - 250 g pkgs.', 38.0000,21,10,30,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Ravioli Angelo', 26, 5, '24 - 250 g pkgs.', 19.5000,36,0,20,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Escargots de Bourgogne', 27, 8, '24 pieces', 13.2500,62,0,20,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Raclette Courdavault', 28, 4, '5 kg pkg.', 55.0000,79,0,0,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Camembert Pierrot', 28, 4, '15 - 300 g rounds', 34.0000,19,0,0,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, "Sirop d'rable", 29, 2, '24 - 500 ml bottles', 28.5000,113,0,25,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Tarte au sucre', 29, 3, '48 pies', 49.3000,17,0,0,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Vegie-spread', 7, 2, '15 - 625 g jars', 43.9000,24,0,5,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Wimmers gute Semmelkndel', 12, 5, '20 bags x 4 pieces', 33.2500,22,80,30,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Louisiana Fiery Hot Pepper Sauce', 2, 2, '32 - 8 oz bottles', 21.0500,76,0,0,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Louisiana Hot Spiced Okra', 2, 2, '24 - 8 oz jars', 17.0000,4,100,20,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Laughing Lumberjack Lager', 16, 1, '24 - 12 oz bottles', 14.0000,52,0,10,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Scottish Longbreads', 8, 3, '10 boxes x 8 pieces', 12.5000,6,10,15,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Gudbrandsdalsost', 15, 4, '10 kg pkg.', 36.0000,26,0,15,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Outback Lager', 7, 1, '24 - 355 ml bottles', 15.0000,15,10,30,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Flotemysost', 15, 4, '10 - 500 g pkgs.', 21.5000,26,0,0,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Mozzarella di Giovanni', 14, 4, '24 - 200 g pkgs.', 34.8000,14,0,0,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Rd Kaviar', 17, 8, '24 - 150 g jars', 15.0000,101,0,5,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Longlife Tofu', 4, 7, '5 kg pkg.', 10.0000,4,20,5,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Rhnbru Klosterbier', 12, 1, '24 - 0.5 l bottles', 7.7500,125,0,25,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Lakkalikri', 23, 1, '500 ml', 18.0000,57,0,20,0);
insert into products(ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued) values(default, 'Original Frankfurter grne Soe', 12, 2, '12 boxes', 13.0000,32,0,15,0);

create table a (c1 int, c2 int);

insert into a values(1,1),(2,2),(3,3),(4,4);

create table b (c3 int, c4 int);

insert into b values(11,1),(12,2),(13,3),(14,4),(15,5),(16,6),(17,7),(18,8),(19,9),(20,2);


CREATE TABLE Z (C1 CHAR);
INSERT INTO Z VALUES('X');
INSERT INTO Z VALUES('y');


CREATE TABLE SALESPERSON (SID INT, SNAME varchar (10));

insert into SALESPERSON values (1001,'ALAN'), (1002,'CALVIN'), (1003,'CLIVE'), (1004,'DENNIS'), (1005,'EVAN'), (1006,'FOX'), (1007,'PETER');


CREATE TABLE STATES (STATEID varchar(2), STATENAME varchar(20));

INSERT INTO STATES VALUES ('AK','Alaska'), ('AL','Alabama'), ('AR','Arkansas'), ('AZ','Arizona'),('CA','California'), ('CO','Colorado'), ('CT','Connecticut'), ('FL','Florida'), ('GA','Georgia'), ('GU',NULL), ('HI','Hawaii'), ('IA','Iowa'), ('ID','Idaho'), ('IL','Illinois'), ('IN','Indiana'), ('KS','Kansas'), ('KY','Kentucky'), ('LA','Louisiana'), ('MA','Massachusetts'), ('MD','Maryland'), ('ME','Maine'), ('MI','Michigan'), ('MN','Minnesota'), ('MO','Missouri'), ('MS','Mississippi'), ('MT','Montana'), ('NV','Nevada'), ('NJ','New Jersey'), ('NM','New Mexico'), ('NY','New York'), ('OH','Ohio'), ('PA','Pennsylvania'), ('WA','Washington');


CREATE TABLE STATION
    (ID INT,
    CITY varchar(21),
    STATE varchar(2),
    LAT_N INT,
    LONG_W INT);

INSERT INTO STATION VALUES (794,'Kissee Mills','MO',140,73), (824,'Loma Mar','CA',49,131), (603,'Sandy Hook','CT',72,148), (478,'Tipton','IN',34,98), (619,'Arlington','CO',75,93), (711,'Turner','AR',50,101), (839,'Slidell','LA',85,152), (411,'Negreet','LA',99,105), (588,'Glencoe','KY',46,136), ( 665,'Chelsea','IA',99,60), (342,'Chignik Lagoon','AK',103,153), (733,'Pelahatchie','MS',39,28), (441,'Hanna City','IL',51,137), (811,'Dorrance','KS',102,122), (698,'Albany','CA',50 ,80), (325,'Monument','KS' ,71, 142), (414,'Manchester','MD' ,74, 37), (113,'Prescott','IA', 40 ,66), (971,'Graettinger','IA' ,95, 150), (266,'Cahone','CO' ,116 ,127), (617,'Sturgis','MS' ,36 ,126), (495,'Upperco','MD', 114 ,30), (473,'Highwood','IL',27,151), (959,'Waipahu','HI',106,34), (438,'Bowdon','GA',89,78), (571,'Tyler','MN',133,59), (92,'Watkins','CO',83,97), (399,'Republic','MI',75,130), (426,'Millville','CA',33,146), (844,'Aguanga','CA',80,66), (321,'Bowdon Junction','GA',86,34), (606,'Morenci','AZ',105,110), (957,'South El Monte','CA',74,80), (833,'Hoskinston','KY',66,66), (843,'Talbert','KY',40,59), (166,'Mccomb','MS',74,43), (339,'Kirk','CO',141 ,136), (909,'Carlock','IL',117,85), (829,'Seward','IL',72,90 ), (766,'Gustine','CA',111,141), (392,'Delano','CA',126,92), (555,'Westphalia','MI',33,144), (33,'Saint Elmo','AL',27,51), (728,'Roy','MT',41,52), (656,'Pattonsburg','MO',138,32), (394,'Centertown','MO',134,93), (366,'Norvell','MI',125,94), (96,'Raymondville','MO',71,148), (867,'Beaver Island','MI',82,165), (977,'Odin','IL',53,116), (741,'Jemison','AL',62,26), (436,'West Hills','CA',68,73), (323,'Barrigada','GU',61,148), (3,'Hesperia','CA',106,71), (814,'Wickliffe','KY',80,46), (375,'Culdesac','ID',48,78), (467,'Roselawn','IN',88,52), (604,'Forest Lakes','AZ',145,114), (551,'San Simeon','CA',38,28), (706,'Little Rock','AR',122,121), (647,'Portland','AR',84,45), (25,'New Century','KS',135,79), (250,'Hampden','MA',76,26), (124,'Pine City','MN',119,129), (547,'Sandborn','IN',56,94), (701,'Seaton','IL',128,78), (197,'Milledgeville','IL',91,113), (613,'East China','MI',109, 42), (630,'Prince Frederick','MD',105,58), (767,'Pomona Park','FL',101,163), (679,'Gretna','LA', 75,143), (896,'Yazoo City','MS',95, 85), (403,'Zionsville','IN',58, 36), (519,'Rio Oso','CA',29 ,106), (482,'Jolon','CA',67,53), (252,'Childs','MD',93,104), (600,'Shreveport','LA',136,39), (14,'Forest','MS',120,50), (260,'Sizerock','KY',116,113), (65,'Buffalo Creek','CO',48,148), (753,'Algonac','MI',119,80), (174,'Onaway','MI',109,56), (263,'Irvington','IL',97,68), (253,'Winsted','MN',69,73), (557,'Woodbury','GA',103,93), (897,'Samantha','AL',75,36), (98,'Hackleburg','AL',120,121), (423,'Soldier','KS',77,153), (361,'Arrowsmith','IL',28,109), (409,'Columbus','GA',67,47), (312,'Bentonville','AR',37,78), (854,'Kirkland','AZ',86,58), (160,'Grosse Pointe','MI',102,91), (735,'Wilton','ME',57,157), (608,'Busby','MT',104,30), (122,'Robertsdale','AL',98,85), (93,'Dale','IN',70,34), (67,'Reeds','MO',31,43), (906,'Hayfork','CA',35,117), (34,'Mcbrides','MI',74,36), (921,'Lee Center','IL',96,77), (401,'Tennessee','IL',55,156), (536,'Henderson','IA',78,78), (953,'Udall','KS',113,60), (370,'Palm Desert','CA',107,146), (614,'Benedict','KS',138, 96), (998,'Oakfield','ME',48,132), (805,'Tamms','IL',60,75), (235,'Haubstadt','IN',28,32), (820,'Chokio','MN',81,134), (650,'Clancy','MT',46,164), (791,'Scotts Valley','CA',120,91), (324,'Norwood','MN',144,35), (442,'Elkton','MD',103,157), (633,'Bertha','MN',40,105), (109,'Bridgeport','MI',51, 80), (780,'Cherry','IL',68,47), (492,'Regina','KY',132,90), (965,'Griffin','GA',39,152), (778,'Pine Bluff','AR',60,146), (337,'Mascotte','FL',121,146), (259,'Baldwin','MD',82,40), (955,'Netawaka','KS' ,109, 120), (752,'East Irvine','CA', 106 ,115), (886,'Pony','MT' ,99, 163), (200,'Franklin','LA' ,82, 32), (384,'Amo','IN' ,104, 159), (518,'Vulcan','MO',109,92), (188,'Prairie Du Rocher','IL',76,71), (161,'Alanson','MI',91,72), (486,'Delta','LA',137,50), (406,'Carver','MN',46,122), (940,'Paron','AR',59,104), (237,'Winchester','ID',38,80), (465,'Jerome','AZ', 122, 34), (591,'Baton Rouge','LA', 130 ,72), (570,'Greenview','CA', 81, 58), (429,'Lucerne Valley','CA', 36, 48), (278,'Cromwell','MN', 129, 54), (927,'Quinter','KS', 60 ,25), (59,'Whitewater','MO' ,83, 71), (218,'Round Pond','ME', 127, 124), (291,'Clarkdale','AZ', 58 ,74), (668,'Rockton','IL', 116 ,87), (682,'Pheba','MS', 91, 127), (775,'Eleele','HI',81,153), (527,'Auburn','IA',95,137), (108,'North Berwick','ME',71, 27), (190,'Oconee','GA',93,119), (232,'Grandville','MI',39,70), (405,'Susanville','CA',128,80), (273,'Rosie','AR',73,162), (813,'Verona','MO',110,153), (444,'Richland','GA',105,113), (899,'Fremont','MI',54,151), (738,'Philipsburg','MT',96,72), (215,'Kensett','IA',56,140), (743,'De Tour Village','MI',25,25), (377,'Koleen','IN' ,138, 111), (727,'Winslow','IL' ,113, 39), (363,'Reasnor','IA', 42, 163), (117,'West Grove','IA', 127, 99), (420,'Frankfort Heights','IL', 72, 30), (888,'Bono','AR',133,150), (784,'Biggsville','IL',86,139), (413,'Linthicum Heights','MD',128 ,68), (695,'Amazonia','MO' ,46 ,148), (609,'Marysville','MI', 86,133), (471,'Cape Girardeau','MO',74,91), (649,'Pengilly','MN',25,154), (946,'Newton Center','MA',48,145), (380,'Crane Lake','MN',73, 43), (383,'Newbury','MA',128,85), (44,'Kismet','KS',100 ,157), (433,'Canton','ME',99,106), (283,'Clipper Mills','CA',114, 57), (474,'Grayslake','IL',61,33), (233,'Pierre Part','LA',52 ,90), (990,'Bison','KS',132,75), (502,'Bellevue','KY',127,122), (327,'Ridgway','CO',77,110), (4,'South Britain','CT',66, 34), (228,'Rydal','GA',36,79), (642,'Lynnville','KY',25,146) , (885,'Deerfield','MO',40,36), (539,'Montreal','MO',129,127), (202,'Hope','MN',140,44), (593,'Aliso Viejo','CA',68,131), (521,'Gowrie','IA',130,128), (938,'Andersonville','GA',141,73), (919,'Knob Lick','KY',136,33), (528,'Crouseville','ME',37,82), (331,'Cranks','KY',56,27), (45,'Rives Junction','MI',94,117), (944,'Ledyard','CT',135,144), (949,'Norway','ME',84,88), (88,'Eros','LA',95,58), (878,'Rantoul','KS',32,119), (35,'Richmond Hill','GA',39,114), (17,'Fredericktown','MO',106,113), (447,'Arkadelphia','AR',99,50), (498,'Glen Carbon','IL',61,141), (351,'Fredericksburg','IN',45, 78), (774,'Manchester','IA',130,123), (116,'Mc Henry','MD',93,113), (963,'Eriline','KY',94,65), (643,'Wellington','KY',100,32), (781,'Hoffman Estates','IL',129, 53), (364,'Howard Lake','MN',126 ,78), (777,'Edgewater','MD',130 ,72), (15 ,'Ducor','CA',141 ,102), (910,'Salem','KY', 87 ,114), (612,'Sturdivant','MO',94, 86), (537,'Hagatna','GU',97,152), (970,'East Haddam','CT',116 ,132), (510,'Eastlake','MI',134, 39), (354,'Larkspur','CA', 107, 66), (983,'Patriot','IN', 83 ,46);


CREATE TABLE SETA (c1 INT);
insert into seta values (1), (2), (3), (4), (5), (6);


CREATE TABLE SETB (c1 INT);

insert into setb values (2), (3), (4), (5), (6), (7), (8);


CREATE TABLE MENUCARD (ID INT, NAME varchar(35), RATE INT);

insert into MENUCARD values (14, 'Onion Hamburger', 115), (6 , 'Extra Long Cheeseburger' , 100), (2 , 'Double Stacker' , 125), (8 , 'Double Cheeseburger' , 100),(13, 'Cheese Hamburger', 125), (4 , 'Hamburger' , 85 ), (11 , 'Classic Grilled Dog' , 95 ), (1 , 'Chili Cheese Grilled Dog' , 115 ), (7 , 'Flame Grilled Chicken Burger' , 135 ), (3 , 'Original Chicken Sandwich' , 55), (9 , 'McALLO TIKKI' , 45), (12 , 'Veg Maharaja Mac' , 75 ), (5 , 'Big Spicy Chicken Wrap' , 100 ), (15, 'Cheese Onion Hamburger', 145), (10 , 'McVeggie Schezwan' , 85 );


CREATE TABLE SOFTDRINK
(ID INT,
NAME varchar(25),
RATE INT);

INSERT INTO SOFTDRINK VALUES (1, 'Coca-Cola' , 45 ), (2, 'Mello Yello' , 75 ), (3, 'Diet Coke' , 60), (4, 'Frozen Fanta Cherry ' , 65 ), (5, 'Iced Tea' , 35 );


CREATE TABLE STATUS (id int primary key auto_increment, statusid INT, status varchar(12));

INSERT into STATUS values(default, 1,'New');
INSERT into STATUS values(default, 2,'Draft');
INSERT into STATUS values(default, 4,'Approved');
INSERT into STATUS values(default, 8,'Rejected');
INSERT into STATUS values(default, 16,'Cancel');
insert into STATUS values(default, 32,'In Process');
insert into STATUS values(default, 64,'Send');
insert into STATUS values(default, 128,'Hold');
insert into STATUS values(default, 256,'Selected');
insert into STATUS values(default, 512,'Received');
insert into STATUS values(default, 1024,'More');

CREATE TABLE NULLIF
(
  c1 INT,
  c2 INT);

insert into nullif values(1,1);
insert into nullif values(1,2);
insert into nullif values(2,1);
insert into nullif values(3,2);
insert into nullif values(3,3);
insert into nullif values(null,null);
insert into nullif values(3,1);
insert into nullif values(2,3);
insert into nullif values(2,2);
insert into nullif values(1,3);
insert into nullif values(4,null);
insert into nullif values(null,5);


CREATE TABLE DUPLICATE
 (    DEPTNO INT NOT NULL,
      DNAME varchar(10),
      LOC varchar(10),
      WALLETID INT
 );

insert into DUPLICATE values (10, 'SALES', 'PUNE', 1), (20, 'PURCHASE','BARODA', 2), (10, 'SALES','PUNE', 1), (30, 'ACCOUNTS', 'SURAT', 3), (40, 'HR', 'ANAND', 4), (30, 'ACCOUNTS', 'SURAT', 3), (50, 'ADMIN', 'MUMBAI', 5), (60, 'RND', 'DELHI', 6), (50, 'ADMIN', 'MUMBAI', 5), (70, 'OPERATIONS', 'BHARUCH', 7), (10, 'SALES', 'PUNE', 1), (20, 'PURCHASE','BARODA', 2), (10,'SALES','PUNE', 1), (30, 'ACCOUNTS', 'SURAT', 3), (40, 'HR', 'ANAND', 4), (30, 'ACCOUNTS', 'SURAT', 3), (50, 'ADMIN', 'MUMBAI', 5), (60, 'RND', 'DELHI', 6), (50, 'ADMIN', 'MUMBAI', 5), (70, 'OPERATIONS', 'BHARUCH', 7),(10, 'SALES', 'PUNE', 1), (20, 'PURCHASE','BARODA', 2), (10, 'SALES','PUNE', 1), (30, 'ACCOUNTS', 'SURAT', 3), (40, 'HR', 'ANAND', 4), (30, 'ACCOUNTS', 'SURAT', 3), (50, 'ADMIN', 'MUMBAI', 5), (60, 'RND', 'DELHI', 6), (50, 'ADMIN', 'MUMBAI', 5), (70, 'OPERATIONS', 'BHARUCH', 7), (10, 'SALES', 'PUNE', 1), (20, 'PURCHASE','BARODA', 2);


 CREATE TABLE COALESCE
  (    PID INT primary key,
       PNAME varchar(45),
       APRICE INT,
       SPRICE INT,
       DPRICE INT,
       NORTH varchar(5),
       SOUTH varchar(5),
       EAST varchar(5),
       WEST varchar(5),
	   primaryPhone int,
       BPHONE BIGINT(12),
       CPHONE BIGINT(12),
       HPHONE BIGINT(12)
  );

INSERT INTO COALESCE (PID, PNAME, SPRICE, NORTH, BPHONE) VALUES ('1001', 'Samsung Galaxy On7 (Gold, 8 GB)', '10975', 'Y', '111');
INSERT INTO COALESCE (PID, PNAME, DPRICE, SOUTH, CPHONE) VALUES ('1002', 'Samsung Galaxy On5 (Gold, 8 GB)', '9800', 'Y', '222');
INSERT INTO COALESCE (PID, PNAME, APRICE, DPRICE, EAST, HPHONE) VALUES ('1003', 'Samsung Galaxy On5 (Black, 8 GB)', '16000', '1400', 'Y', '333');
INSERT INTO COALESCE (PID, PNAME, WEST, BPHONE, HPHONE) VALUES ('1004', 'Moto G (3rd Generation) (Black, 16 GB)', 'Y', '444', '555');
INSERT INTO COALESCE (PID, PNAME, SPRICE, DPRICE, CPHONE) VALUES ('1005', 'Moto G (3rd Generation) (White, 16 GB)', '17000', '15550', '666');
INSERT INTO COALESCE (PID, PNAME, APRICE, SPRICE, DPRICE, HPHONE) VALUES ('1006', 'Moto G Turbo Edition (White, 16 GB)', '8000', '8700', '8600', '777');
INSERT INTO COALESCE (PID, PNAME, APRICE, SPRICE, DPRICE, NORTH, BPHONE, HPHONE) VALUES ('1007', 'Moto G Turbo Edition (Black, 16 GB)', '11200', '12700', '12450', 'Y', '888', '999');
INSERT INTO COALESCE (PID, PNAME, SOUTH, WEST) VALUES ('1008', 'Moto X Play (Black, 32 GB)', 'Y', 'Y');
INSERT INTO COALESCE (PID, PNAME, DPRICE, BPHONE) VALUES ('1009', 'Acer Liquid Z530 (Black, 16 GB)', '10500', '8877');
INSERT INTO COALESCE (PID, PNAME, DPRICE, EAST, WEST, HPHONE) VALUES ('1010', 'Acer Z630S (Black & Gold, 32 GB)', '8600', 'Y', 'Y', '5566');
INSERT INTO COALESCE (PID, PNAME, SPRICE, BPHONE, CPHONE, HPHONE) VALUES ('1011', 'HTC Desire 828 Dual Sim(Dark Grey, 16 GB)', '17200', '3331', '3332', '2223');
INSERT INTO COALESCE (PID, PNAME, APRICE, SPRICE, WEST) VALUES ('1012', 'HTC Desire 828 Dual Sim (Pearl White, 16 GB)', '25000', '27000', 'Y');
INSERT INTO COALESCE (PID, PNAME, APRICE, SOUTH) VALUES ('1013', 'Micromax Canvas Pulse 4G (Grey, 16 GB)', '12200', 'Y');
INSERT INTO COALESCE (PID, PNAME, SPRICE, NORTH, SOUTH, EAST, WEST, CPHONE) VALUES ('1014', 'Micromax Canvas Pulse 4G (Black, 16 GB)', '14500', 'Y', 'Y', 'Y', 'Y', '44447');
INSERT INTO COALESCE (PID, PNAME, DPRICE, SOUTH, EAST, WEST) VALUES ('1015', 'Micromax Canvas Pulse 4G (White, 16 GB)', '16500', 'Y', 'Y', 'Y');
INSERT INTO COALESCE (PID, PNAME, DPRICE, BPHONE, CPHONE) VALUES ('1016', 'Letv Le 1S (Gold, 16 GB)', '17000', '5566', '3475');
INSERT INTO COALESCE (PID, PNAME, SPRICE, SOUTH, WEST, HPHONE) VALUES ('1017', 'Letv Le 1S (Gold, 32 GB)', '16000', 'Y', 'Y', '55667');
INSERT INTO COALESCE (PID, PNAME, APRICE, EAST, WEST, HPHONE) VALUES ('1018', 'Letv Le 1S (Black, 16 GB)', '13450', 'Y', 'Y', '7763');
INSERT INTO COALESCE (PID, PNAME, SPRICE, EAST) VALUES ('1019', 'Letv Le 1S (White, 32 GB)', '12342', 'Y');


UPDATE coalesce SET `BPHONE` = '9922059378' WHERE (`PID` = '1001');
UPDATE coalesce SET `CPHONE` = '9850883662' WHERE (`PID` = '1002');
UPDATE coalesce SET `HPHONE` = '9750993114' WHERE (`PID` = '1003');
UPDATE coalesce SET `BPHONE` = '9799471220', `HPHONE` = '9860123442' WHERE (`PID` = '1004');
UPDATE coalesce SET `CPHONE` = '7700754312' WHERE (`PID` = '1005');
UPDATE coalesce SET `HPHONE` = '9850990887' WHERE (`PID` = '1006');
UPDATE coalesce SET `BPHONE` = '9850990889', `HPHONE` = '9850112331' WHERE (`PID` = '1007');
UPDATE coalesce SET `BPHONE` = '9850008776' WHERE (`PID` = '1009');
UPDATE coalesce SET `HPHONE` = '9850001001' WHERE (`PID` = '1010');
UPDATE coalesce SET `BPHONE` = '9850000111', `CPHONE` = '9850000112', `HPHONE` = '9850000113' WHERE (`PID` = '1011');
UPDATE coalesce SET `CPHONE` = '9850000113' WHERE (`PID` = '1014');
UPDATE coalesce SET `BPHONE` = '9850000114', `CPHONE` = '9850000115' WHERE (`PID` = '1016');
UPDATE coalesce SET `HPHONE` = '9850000116' WHERE (`PID` = '1017');
UPDATE coalesce SET `HPHONE` = '9850000117' WHERE (`PID` = '1018');

UPDATE coalesce SET `primaryPhone` = '1' WHERE (`PID` = '1001');
UPDATE coalesce SET `primaryPhone` = '2' WHERE (`PID` = '1002');
UPDATE coalesce SET `primaryPhone` = '1' WHERE (`PID` = '1003');
UPDATE coalesce SET `primaryPhone` = '3' WHERE (`PID` = '1004');
UPDATE coalesce SET `primaryPhone` = '2' WHERE (`PID` = '1005');
UPDATE coalesce SET `primaryPhone` = '3' WHERE (`PID` = '1006');
UPDATE coalesce SET `primaryPhone` = '1' WHERE (`PID` = '1007');
UPDATE coalesce SET `primaryPhone` = '1' WHERE (`PID` = '1008');
UPDATE coalesce SET `primaryPhone` = '2' WHERE (`PID` = '1009');
UPDATE coalesce SET `primaryPhone` = '1' WHERE (`PID` = '1010');
UPDATE coalesce SET `primaryPhone` = '2' WHERE (`PID` = '1011');
UPDATE coalesce SET `primaryPhone` = '3' WHERE (`PID` = '1012');
UPDATE coalesce SET `primaryPhone` = '2' WHERE (`PID` = '1013');
UPDATE coalesce SET `primaryPhone` = '2' WHERE (`PID` = '1014');
UPDATE coalesce SET `primaryPhone` = '1' WHERE (`PID` = '1015');
UPDATE coalesce SET `primaryPhone` = '2' WHERE (`PID` = '1016');
UPDATE coalesce SET `primaryPhone` = '3' WHERE (`PID` = '1017');
UPDATE coalesce SET `primaryPhone` = '2' WHERE (`PID` = '1018');
UPDATE coalesce SET `primaryPhone` = '1' WHERE (`PID` = '1019');


create table NEAREST (c1 INT, c2 varchar(10), c3 INT);

insert into NEAREST VALUES (1,'y',1);
insert into NEAREST VALUES (1,'y',100);
insert into NEAREST VALUES (2,'z', 1);
insert into NEAREST VALUES (2,'z',100);
insert into NEAREST VALUES (2,'z',300);
insert into NEAREST VALUES (1, 'y',110);
insert into NEAREST VALUES (1, 'y',140);
insert into NEAREST VALUES (1, 'y',160);
insert into NEAREST VALUES (1, 'y',200);
insert into NEAREST VALUES (1, 'y',210);
insert into NEAREST VALUES (1, 'y',211);
insert into NEAREST VALUES (2, 'z',150);
insert into NEAREST VALUES (2, 'z',250);
insert into NEAREST VALUES (2, 'z',170);
insert into NEAREST VALUES (2, 'z',175);
insert into NEAREST VALUES (2, 'z',177);
insert into NEAREST VALUES (2, 'z',179);

create table new (c1 INT, c2 INT, c3 INT, old varchar(10), new varchar(10));

create table blankTableA (c1 INT, c2 INT);

insert into blanktableA values(1,1);
insert into blanktableA values(2,2);
insert into blanktableA values(null,null);
insert into blanktableA values(null,null);
insert into blanktableA values(null,null);
insert into blanktableA values(3,3);
insert into blanktableA values(4,4);
insert into blanktableA values(null,null);
insert into blanktableA values(5,5);
insert into blanktableA values(null,null);
insert into blanktableA values(null,6);

CREATE TABLE blankTableB (c1 float(7,2), c2 float(7,2));

insert into blankTableB values(1.01,1.01);
insert into blankTableB values(1.02,1.02);
insert into blankTableB values(1.03,1.03);
insert into blankTableB values(1.04,1.04);
insert into blankTableB values(1.05,1.05);
insert into blankTableB values(1.06,1.06);
insert into blankTableB values(null,1.07);
insert into blankTableB values(1.08,1.08);
insert into blankTableB values(null,null);
insert into blankTableB values(1.09,1.09);
insert into blankTableB values(1.10,null);

CREATE TABLE HOBBY (HOBBYID INT, HOBBY CHAR(16), WALLETID  INT);

INSERT INTO HOBBY VALUES (1,'Windsurfing',1);
INSERT INTO HOBBY VALUES (2,'Fishing',2);
INSERT INTO HOBBY VALUES (3,'Swimming',3);
INSERT INTO HOBBY VALUES (4,'Shopping',4);
INSERT INTO HOBBY VALUES (5,'Bowling',5);
INSERT INTO HOBBY VALUES (6,'Reading',6);
INSERT INTO HOBBY VALUES (7,'Dancing',7);
INSERT INTO HOBBY VALUES (8,'Traveling',8);
INSERT INTO HOBBY VALUES (9,'Bungee Jumping',9);
INSERT INTO HOBBY VALUES (10,'Horse Riding',10);
INSERT INTO HOBBY VALUES (11,'Running',11);
INSERT INTO HOBBY VALUES (12,'Astrology',12);
INSERT INTO HOBBY VALUES (13,'Hang Gliding',13);

CREATE TABLE DEPT (
 DEPTNO              INT,
 DNAME               varchar(12),
 LOC                 varchar(10),
 PWD				 varchar(20),
 STARTEDON			 varchar(10),
 CONSTRAINT DEPT_PRIMARY_KEY PRIMARY KEY (DEPTNO));

INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK','r50mpm', '24/03/1989');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS','a12recmpm', '12/04/1989');
INSERT INTO DEPT VALUES (30,'SALES','CHICAGO','sales@2017', '13/04/1989');
INSERT INTO DEPT VALUES (40,'OPERATIONS','BOSTON','opr@123', '12/07/1989');
INSERT INTO DEPT VALUES (50,'HR','PUNE','PUN@8877', '22/12/1989');
INSERT INTO DEPT VALUES (60,'IT','BARODA','BRD@1122', '02/10/1989');

CREATE TABLE REPLACEDEPT (
 DEPTNO              INT,
 DNAME               varchar(12),
 LOC                 varchar(10),
 CONSTRAINT REPLACEDEPT_PRIMARY_KEY PRIMARY KEY (DEPTNO));

INSERT INTO REPLACEDEPT VALUES (10,'Finance','PUNE');
INSERT INTO REPLACEDEPT VALUES (20,'Forest','Odisha');
INSERT INTO REPLACEDEPT VALUES (50,'Tourism','Rajasthan');
INSERT INTO REPLACEDEPT VALUES (60,'Planning','Mumbai');


CREATE TABLE DEMODEPT1 as select * from DEPT;
ALTER TABLE DEMODEPT1 MODIFY COLUMN DEPTNO INT;
  
INSERT INTO DEMODEPT1 VALUES (50,'A','A',null,null);
INSERT INTO DEMODEPT1 VALUES (60,'B','B',null,null);
INSERT INTO DEMODEPT1 VALUES (70,'C','C',null,null);
INSERT INTO DEMODEPT1 VALUES (80,'D','D',null,null);
INSERT INTO DEMODEPT1 VALUES (90,'E','E',null,null);
INSERT INTO DEMODEPT1 VALUES (100,'F','F',null,null);

CREATE TABLE DEMODEPT2 as select * from DEPT;
ALTER TABLE DEMODEPT2 MODIFY COLUMN DEPTNO INT;

INSERT INTO DEMODEPT2 VALUES (110,'A1','A1',null,null);
INSERT INTO DEMODEPT2 VALUES (111,'B1','B1',null,null);
INSERT INTO DEMODEPT2 VALUES (112,'C1','C1',null,null);
INSERT INTO DEMODEPT2 VALUES (113,'D1','D1',null,null);
INSERT INTO DEMODEPT2 VALUES (114,'E1','E1',null,null);
INSERT INTO DEMODEPT2 VALUES (115,'F1','F1',null,null);


CREATE TABLE EMP (
 EMPNO               INT NOT NULL,
 ENAME               varchar(12),
 GENDER				 char,
 JOB                 varchar(20),
 MGR                 INT,
 HIREDATE            date,
 SAL                 INT,
 COMM                INT,
 DEPTNO              INT NOT NULL,
 BONUSID	         INT,
 `USER NAME`		 varchar(20),
 PWD				 varchar(20),
 PHONE 				 varchar(45),
 isActive			 boolean,
 CONSTRAINT EMP_FOREIGN_KEY_deptno FOREIGN KEY (DEPTNO) REFERENCES DEPT (DEPTNO),
 CONSTRAINT EMP_PRIMARY_KEY_empno PRIMARY KEY (EMPNO),
 CONSTRAINT EMP_FOREIGN_KEY_mgr FOREIGN KEY (MGR) REFERENCES EMP (EMPNO),
 CONSTRAINT CHK_PWD CHECK (length(PWD)>= 5));

INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7839,'KING','M','PRESIDENT',NULL,'1981-11-17',5000,NULL,10,1, true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7698,'BLAKE','M','MANAGER',7839,'1981-05-01',2850,NULL,30,1, true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7782,'CLARK','M','MANAGER',7839,'1981-06-09',2450,NULL,10,3, true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7566,'JONES','M','MANAGER',7839,'1981-04-02',2975,NULL,20,4, true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7654,'MARTIN','M','SALESMAN',7698,'1981-09-28',1250,1400,30,6, true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7499,'ALLEN','M','SALESMAN',7698,'1981-02-20',1600,300,30,4, true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7844,'TURNER','M','SALESMAN',7698,'1981-09-08',1500,0,30,5, true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7900,'JAMES','M','CLERK',7698,'1981-12-03',950,NULL,30,2, true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7521,'WARD','M','SALESMAN',7698,'1981-02-22',1250,500,30,1, true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7902,'FORD','M','ANALYST',7566,'1981-12-03',3000,NULL,20,4, false);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7369,'SMITH','M','CLERK',7902,'1980-12-17',800,NULL,20,2, false);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7788,'SCOTT','M','ANALYST',7566,'1982-12-09',3000,NULL,20,3,true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7876,'ADAMS','M','CLERK',7788,'1983-01-12',1100,NULL,20,1, true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7934,'MILLER','M','CLERK',7782,'1982-01-23',1300,1300,10,2, false);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7949,'ALEX','M','MANAGER',7698,'1982-01-24',1250,500,30,5, true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7945,'AARUSH','M','SALESMAN',7902,'1980-02-14',1350,2700,30,NULL,false);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7415,'AARAV','M','CLERK',7902,'1981-12-31',3350,NULL,10,null,false);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7919,'HOFFMAN','M','MANAGER',7566,'1982-03-24',4150,NULL,30,3,true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7920,'GRASS','M','SALESMAN',7919,'1980-02-14',2575,2700,30,5,true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7421,'THOMAS','M','CLERK',7920,'1981-07-19',1750,NULL,10,1,false);


INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (6001,'GITA','F','Compliance officers',7920,'1981-07-19',1750,NULL,30,1,true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (6473,'SHARMIN','F','Public Relation',7920,'1981-07-19',1750,NULL,20,1,true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (6129,'VRUSHALI','F','Compliance officers',7920,'1981-07-19',1750,NULL,50,1,true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (6781,'BANDISH','F','Public Relation',7920,'1981-07-19',1750,NULL,20,1,true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (9473,'SUPRIYA','F','ANALYST',7920,'1981-07-19',1750,NULL,50,1,true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (8433,'NATASHA','F','CLERK',7920,'1981-07-19',1750,NULL,30,1,true);
INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (9400,'SANGITA','F','Compliance officers',7920,'1981-07-19',1750,NULL,50,1,true);

INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7840,'FRED','M','vice PRESIDENT',7839,'1983-08-09',5000,NULL,20,1, true);

INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7888,'Ruhan','M','Network',7888,'1983-08-09',2000,NULL,60,1, true);

INSERT INTO EMP (EMPNO, ENAME, GENDER, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, BONUSID, isActive) VALUES (7889,'Neel','M','vice PRESIDENT',7839,'1983-08-09',1000,NULL,60,0, true);

UPDATE emp SET phone = '7032300023' WHERE (EMPNO = '7369');
UPDATE emp SET phone = '7032300084' WHERE (EMPNO = '7415');
UPDATE emp SET phone = '7032300011' WHERE (EMPNO = '7421');
UPDATE emp SET phone = '7032300096' WHERE (EMPNO = '7499');
UPDATE emp SET phone = '7132300034' WHERE (EMPNO = '7521');
UPDATE emp SET phone = '7132300039' WHERE (EMPNO = '7566');
UPDATE emp SET phone = '7132300050' WHERE (EMPNO = '7654');
UPDATE emp SET phone = '7132300027' WHERE (EMPNO = '7698');
UPDATE emp SET phone = '7032300001' WHERE (EMPNO = '7782');
UPDATE emp SET phone = '7132300081' WHERE (EMPNO = '7839');
UPDATE emp SET phone = '7132300086' WHERE (EMPNO = '7876');
UPDATE emp SET phone = '7132300042' WHERE (EMPNO = '7900');
UPDATE emp SET phone = '7132300055' WHERE (EMPNO = '7934');
UPDATE emp SET phone = '7156567183' WHERE (EMPNO = '7949');



CREATE TABLE BONUS (
 ID INT PRIMARY KEY,
 RATE float);

INSERT INTO BONUS VALUES(1,.5);
INSERT INTO BONUS VALUES(2,.75);
INSERT INTO BONUS VALUES(3,.25);
INSERT INTO BONUS VALUES(4,.15);
INSERT INTO BONUS VALUES(5,.55);
INSERT INTO BONUS VALUES(6,.54);
INSERT INTO BONUS VALUES(7,.34);
INSERT INTO BONUS VALUES(8,.14);
INSERT INTO BONUS VALUES(9,.27);
INSERT INTO BONUS VALUES(10,.32);

CREATE TABLE SALGRADE (
 GRADE               INT,
 LOSAL               INT,
 HISAL               INT);

INSERT INTO SALGRADE VALUES (1,700,1200);
INSERT INTO SALGRADE VALUES (2,1201,1400);
INSERT INTO SALGRADE VALUES (3,1401,2000);
INSERT INTO SALGRADE VALUES (4,2001,3000);
INSERT INTO SALGRADE VALUES (5,3001,4000);
INSERT INTO SALGRADE VALUES (6,4001,5000);
INSERT INTO SALGRADE VALUES (7,5001,6000);
INSERT INTO SALGRADE VALUES (8,6001,7000);
INSERT INTO SALGRADE VALUES (9,7001,8000);
INSERT INTO SALGRADE VALUES (10,8001,9999);

CREATE TABLE DUMMY (
 DUMMY               INT );

INSERT INTO DUMMY VALUES (0);

CREATE TABLE CUSTOMER (
 CUSTID              INT NOT NULL,
 NAME                varchar(45),
 ADDRESS             varchar(40),
 CITY                varchar(30),
 STATE               varchar(2),
 ZIP                 varchar(9),
 AREA                INT,
 PHONE               varchar(9),
 REPID               INT NOT NULL,
 CREDITLIMIT         float (9,2),
 COMMENTS            text,
 CONSTRAINT CUSTOMER_PRIMARY_KEY PRIMARY KEY (CUSTID),
 CONSTRAINT CUSTID_ZERO CHECK (CUSTID > 0));

CREATE TABLE ORD  (
 ORDID INT NOT NULL,
 ORDERDATE date,
 COMMPLAN varchar(1),
 CUSTID INT,
 SHIPDATE date,
 actualShipDate date,
 STATUSDATE date,
 STATUS VARCHAR(45),
 TOTAL float (8,2),
 CONSTRAINT TOTAL_ZERO CHECK (TOTAL >= 0),
 CONSTRAINT ORD_FOREIGN_KEY FOREIGN KEY (CUSTID) REFERENCES CUSTOMER (CUSTID),
 CONSTRAINT ORD_PRIMARY_KEY PRIMARY KEY (ORDID));

CREATE TABLE ITEM  (
 ORDID INT NOT NULL,
 ITEMID INT NOT NULL,
 PRODID INT,
 ACTUALPRICE float (8,2),
 QTY INT,
 ITEMTOT float (8,2),
 /*CONSTRAINT ITEM_FOREIGN_KEY FOREIGN KEY (ORDID) REFERENCES ORD (ORDID), */
 CONSTRAINT ITEM_PRIMARY_KEY PRIMARY KEY (ORDID,ITEMID));

CREATE TABLE PRODUCT (
 PRODID INT,
 DESCRIP varchar(30),
 PRICE INT,
 CONSTRAINT PRODUCT_PRIMARY_KEY PRIMARY KEY (PRODID));

CREATE TABLE PRICE (
 PRODID INT NOT NULL,
 STDPRICE float (8,2),
 MINPRICE float (8,2),
 STARTDATE datetime,
 ENDDATE datetime);
 
INSERT INTO CUSTOMER VALUES(109, 'Saleel Sports', '8 Vaibhav', 'baroda', 'GJ', '411038', 362, '9850-0483',2002, 8000, 'Very Good people');

INSERT INTO CUSTOMER VALUES(110, 'Raj Sports Center', '00-22 Kala Ghoda', 'baroda', 'GJ', '411038', 232, '9833-0434',2342, 25000, 'Very Good people');

INSERT INTO CUSTOMER (ZIP, STATE, REPID, PHONE, NAME, CUSTID, CREDITLIMIT,
  CITY, AREA, ADDRESS, COMMENTS)
VALUES ('96711', 'CA', '7844', '598-6609',
 'JOCKSPORTS',
 '100', '5000', 'BELMONT', '415', '345 VIEWRIDGE',
 'Very friendly people to work with -- sales rep likes to be called Mike.');

INSERT INTO CUSTOMER (ZIP, STATE, REPID, PHONE, NAME, CUSTID, CREDITLIMIT,
  CITY, AREA, ADDRESS, COMMENTS)
VALUES ('94061', 'CA', '7521', '368-1223',
 'TKB SPORT SHOP',
 '101', '10000', 'REDWOOD CITY', '415', '490 BOLI RD.',
 'Rep called 5/8 about change in order - contact shipping.');

INSERT INTO CUSTOMER (ZIP, STATE, REPID, PHONE, NAME, CUSTID, CREDITLIMIT,
  CITY, AREA, ADDRESS, COMMENTS)
VALUES ('95133', 'CA', '7654', '644-3341',
 'VOLLYRITE',
 '102', '7000', 'BURLINGAME', '415', '9722 HAMILTON',
 'Company doing heavy promotion beginning 10/89. Prepare for large orders during
 winter.');

INSERT INTO CUSTOMER (ZIP, STATE, REPID, PHONE, NAME, CUSTID, CREDITLIMIT,
  CITY, AREA, ADDRESS, COMMENTS)
VALUES ('97544', 'CA', '7521', '677-9312',
 'JUST TENNIS',
 '103', '3000', 'BURLINGAME', '415', 'HILLVIEW MALL',
 'Contact rep about new line of tennis rackets.');

INSERT INTO CUSTOMER (ZIP, STATE, REPID, PHONE, NAME, CUSTID, CREDITLIMIT,
  CITY, AREA, ADDRESS, COMMENTS)
VALUES ('93301', 'CA', '7499', '996-2323',
 'EVERY MOUNTAIN',
 '104', '10000', 'CUPERTINO', '408', '574 SURRY RD.',
 'Customer with high market share (23%) due to aggressive advertising.');

INSERT INTO CUSTOMER (ZIP, STATE, REPID, PHONE, NAME, CUSTID, CREDITLIMIT,
  CITY, AREA, ADDRESS, COMMENTS)
VALUES ('91003', 'CA', '7844', '376-9966',
 'K + T SPORTS',
 '105', '5000', 'SANTA CLARA', '408', '3476 EL PASEO',
 'Tends to order large amounts of merchandise at once. Accounting is considering
 raising their credit limit. Usually pays on time.');

INSERT INTO CUSTOMER (ZIP, STATE, REPID, PHONE, NAME, CUSTID, CREDITLIMIT,
  CITY, AREA, ADDRESS, COMMENTS)
VALUES ('94301', 'CA', '7521', '364-9777',
 'SHAPE UP',
 '106', '6000', 'PALO ALTO', '415', '908 SEQUOIA',
 'Support intensive. Orders small amounts (< 800) of merchandise at a time.');

INSERT INTO CUSTOMER (ZIP, STATE, REPID, PHONE, NAME, CUSTID, CREDITLIMIT,
  CITY, AREA, ADDRESS, COMMENTS)
VALUES ('93301', 'CA', '7499', '967-4398',  'WOMENS SPORTS',  '107', '10000', 'SUNNYVALE', '408', 'VALCO VILLAGE',  'First sporting goods store geared exclusively towards women. Unusual promotional style and very willing to take chances towards new products!');

INSERT INTO CUSTOMER (ZIP, STATE, REPID, PHONE, NAME, CUSTID, CREDITLIMIT,
  CITY, AREA, ADDRESS, COMMENTS) VALUES ('55649', 'MN', '7844', '566-9123',  'NORTH WOODS', '108', '8000', 'HIBBING', '612', '98 LONE PINE WAY', null);


INSERT INTO CUSTOMER (ZIP, STATE, REPID, PHONE, NAME, CUSTID, CREDITLIMIT,
  CITY, AREA, ADDRESS, COMMENTS) VALUES ('39007', 'GJ', '7869', '020-7865',  'South WOODS', '118', '8000', 'Baroda', '700', 'MG Road ', null);
  
  
  INSERT INTO CUSTOMER (ZIP, STATE, REPID, PHONE, NAME, CUSTID, CREDITLIMIT,
  CITY, AREA, ADDRESS, COMMENTS) VALUES ('45008', 'GJ', '7870', '022-7543',  'West WOODS', '117', '8000', 'Surat', '7433', 'GM Road, Patel Nagar', null);


INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('101.4', '1987-01-08','1987-01-08', NULL, '610', '1987-01-07', '101', 'A');

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('45', '1987-01-11', NULL, NULL, '611', '1987-01-11', '102', 'B');

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('5860', '1987-01-20', '1987-01-23', '1987-01-21', '612', '1987-01-15', '104', 'C');

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('2.4', '1986-05-30', '1986-06-02', NULL, '601', '1986-05-01', '106', 'A');

INSERT INTO ORD (TOTAL, SHIPDATE, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('56', '1986-06-20','1986-07-09', '602', '1986-06-05', '102', 'B');

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('698', '1986-05-30', NULL, '1986-07-04', '604', '1986-06-15', '106', 'A');

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('8324', '1986-07-30', '1986-08-02', '605', '1986-07-14', '106', 'A');

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('3.4', '1986-07-30', '1986-07-30', NULL, '606', '1986-07-14', '100', 'A');

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('97.5', '1986-08-15', NULL, '1986-08-19', '609', '1986-08-01', '100', 'B');

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('5.6', '1986-07-18', '1986-07-20', NULL, '607', '1986-07-18', '104', 'C');

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('35.2', '1986-07-25', '1986-07-25', NULL, '608', '1986-07-25', '104', 'C');

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('224', '1986-06-05', '1986-06-07',  '1986-06-10', '603', '1986-06-05', '102', null);

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate,  STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('4450', '1987-03-12', NULL, '1987-03-12', '620', '1987-03-12', '100', null);

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('6400', '1987-02-01', '1987-02-01', NULL, '613', '1987-02-01', '108', null);

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('23940', '1987-02-05', '1987-02-06', NULL, '614', '1987-02-01', '102', null);

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('764', '1987-02-10', '1987-02-10', '1987-02-10', '616', '1987-02-03', '103', null);

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('1260', '1987-02-04', '1987-02-04', NULL, '619', '1987-02-22', '104', null);

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('46370', '1987-03-03', '1987-03-03', NULL, '617', '1987-02-05', '105', null);

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('710', '1987-02-06', '1987-02-12', NULL, '615', '1987-02-01', '107', null);

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('3510.5', '1987-03-06', NULL, '1987-03-16', '618', '1987-02-15', '102', 'A');

INSERT INTO ORD (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)
 VALUES ('730', '1987-03-01', '1987-01-06', NULL, '621', '1987-03-15', '100', 'A');

INSERT INTO ord (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)  
VALUES ('1125', '1987-01-01', NULL, '1987-01-06', '622', '1986-12-31', '105', 'a');
  
INSERT INTO ord (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)  
VALUES ('145', '1987-04-08', NULL, '1987-04-13', '1987-04-07', '105', null);
 
 INSERT INTO ord (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)  
VALUES ('189', '1987-01-06', '1987-01-06', '1987-01-09', '624', '1987-01-06', '105', 'c');
  
INSERT INTO ord (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)  
VALUES ('1255', '1987-01-10', '1987-01-12', '1987-01-16', '625', '1987-01-09', '105', null);
 
 INSERT INTO ord (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)  
VALUES ('1675', '1987-02-01', null, '1987-02-06', '626', '1987-01-31', '107', null);
 
INSERT INTO ord (TOTAL, SHIPDATE, actualShipDate, STATUSDATE, ORDID, ORDERDATE, CUSTID, COMMPLAN)  
VALUES ('250', '1987-02-14', '1987-02-17', '1987-02-22', '627', '1987-02-13', '100', null);

INSERT INTO ord VALUES (628, '1987-03-13', 'A', 100, '1987-03-14', '1987-03-19', '1987-03-15', 'Shipped', 473.93);
INSERT INTO ord VALUES (629, '1987-03-14', 'A', 100, '1987-03-16', '1987-03-16', '1987-03-17', 'Shipped', 289.99);
INSERT INTO ord VALUES (630, '1987-02-21', 'D', 104, '1987-02-22', '1987-02-23', '1987-02-23', 'Delivered', 362.12);
INSERT INTO ord VALUES (631, '1987-02-23', 'F', 104, '1987-02-23', NULL, '1987-02-24', 'Delivered', 232.87);


INSERT INTO ord VALUES (632, '1987-03-13', 'A', Null, '1987-03-14', '1987-03-14', '1987-03-15', 'Shipped', 473.93);
INSERT INTO ord VALUES (633, '1987-03-14', 'A', Null, '1987-03-16', '1987-03-20', '1987-03-17', 'Shipped', 289.99);
INSERT INTO ord VALUES (634, '1987-02-21', 'D', Null, '1987-02-22', '1987-02-24', '1987-02-23', 'Delivered', 362.12);
INSERT INTO ord VALUES (635, '1987-02-23', 'F', Null, '1987-02-23', '1987-02-23', '1987-02-24', 'Delivered', 232.87);


INSERT INTO ITEM (QTY, PRODID, ORDID, ITEMTOT, ITEMID, ACTUALPRICE)
 VALUES ('1', '100890', '610', '58', '3', '58');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ( '1', '100861', '611', '45', '1', '45');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ( '100', '100860', '612', '3000', '1', '30');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ( '1', '200376', '601', '2.4', '1', '2.4');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ( '20', '100870', '602', '56', '1', '2.8');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ( '3', '100890', '604', '174', '1', '58');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ( '2', '100861', '604', '84', '2', '42');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ( '10', '100860', '604', '440', '3', '44');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ( '4', '100860', '603', '224', '2', '56');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ( '1', '100860', '610', '35', '1', '35');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ( '3', '100870', '610', '8.4', '2', '2.8');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ( '200', '200376', '613', '440', '4', '2.2');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ( '444', '100860', '614', '15540', '1', '35');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ( '1000', '100870', '614', '2800', '2', '2.8');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ( '20', '100861', '612', '810', '2', '40.5');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('150', '101863', '612', '1500', '3', '10');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('10', '100860', '620', '350', '1', '35');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('1000', '200376', '620', '2400', '2', '2.4');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('500', '102130', '620', '1700', '3', '3.4');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ( '100', '100871', '613', '560', '1', '5.6');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('200', '101860', '613', '4800', '2', '24');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('150', '200380', '613', '600', '3', '4');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('100', '102130', '619', '340', '3', '3.4');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('50', '100860', '617', '1750', '1', '35');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('100', '100861', '617', '4500', '2', '45');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('1000', '100871', '614', '5600', '3', '5.6');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('10', '100861', '616', '450', '1', '45');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('50', '100870', '616', '140', '2', '2.8');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('2', '100890', '616', '116', '3', '58');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('10', '102130', '616', '34', '4', '3.4');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('10', '200376' , '616', '24', '5', '2.4');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('100', '200380', '619', '400', '1', '4');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('100', '200376', '619', '240', '2', '2.4');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('4', '100861', '615', '180', '1', '45');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('1', '100871', '607', '5.6', '1', '5.6');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('100', '100870', '615', '280', '2', '2.8');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('500', '100870', '617', '1400', '3', '2.8');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('500', '100871', '617', '2800', '4', '5.6');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('500', '100890', '617', '29000', '5', '58');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('100', '101860', '617', '2400', '6', '24');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('200', '101863', '617', '2500', '7', '12.5');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('100', '102130', '617', '340', '8', '3.4');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('200', '200376', '617', '480', '9', '2.4');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('300', '200380', '617', '1200', '10', '4');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('5', '100870', '609', '12.5', '2', '2.5');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('1', '100890', '609', '50', '3', '50');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('23', '100860', '618', '805', '1', '35');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('50', '100861', '618', '2255.5', '2', '45.11');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('10', '100870', '618', '450', '3', '45');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('10', '100861', '621', '450', '1', '45');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('100', '100870', '621', '280', '2', '2.8');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('50', '100871', '615', '250', '3', '5');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('1', '101860', '608', '24', '1', '24');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('2', '100871', '608', '11.2', '2', '5.6');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('1', '100861', '609', '35', '1', '35');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('1', '102130', '606', '3.4', '1', '3.4');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('100', '100861', '605', '4500', '1', '45');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('500', '100870', '605', '1400', '2', '2.8');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('5', '100890', '605', '290', '3', '58');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('50', '101860', '605', '1200', '4', '24');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('100', '101863', '605', '900', '5', '9');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('10', '102130', '605', '34', '6', '3.4');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('100', '100871', '612', '550', '4', '5.5');

INSERT INTO ITEM ( QTY , PRODID , ORDID , ITEMTOT , ITEMID , ACTUALPRICE)
 VALUES ('50', '100871', '619', '280', '4', '5.6');


INSERT INTO PRICE (STDPRICE, STARTDATE, PRODID, MINPRICE, ENDDATE)
 VALUES ('4.8', '1985-01-01', '100871', '3.2', '1985-12-01');

INSERT INTO PRICE (STDPRICE, STARTDATE, PRODID, MINPRICE, ENDDATE)
 VALUES ('58', '1985-01-01', '100890', '46.4', null);

INSERT INTO PRICE (STDPRICE, STARTDATE, PRODID, MINPRICE, ENDDATE)
 VALUES ('54', '1984-06-01', '100890', '40.5', '1984-05-31');

INSERT INTO PRICE (STDPRICE, STARTDATE, PRODID, MINPRICE, ENDDATE)
 VALUES ('35', '1986-06-01', '100860', '28', null);

INSERT INTO PRICE (STDPRICE, STARTDATE, PRODID, MINPRICE, ENDDATE)
 VALUES ('32', '1986-01-01', '100860', '25.6', '1986-05-31');

INSERT INTO PRICE (STDPRICE, STARTDATE, PRODID, MINPRICE, ENDDATE)
 VALUES ('30', '1985-01-01', '100860', '24', '1985-12-31');

INSERT INTO PRICE (STDPRICE, STARTDATE, PRODID, MINPRICE, ENDDATE)
 VALUES ('45', '1986-06-01', '100861', '36', null);

INSERT INTO PRICE (STDPRICE, STARTDATE, PRODID, MINPRICE, ENDDATE)
 VALUES ('42', '1986-01-01', '100861', '33.6', '1986-05-31');

INSERT INTO PRICE (STDPRICE, STARTDATE, PRODID, MINPRICE, ENDDATE)
 VALUES ('39', '1985-01-01', '100861', '31.2', '1985-12-31');

INSERT INTO PRICE (STDPRICE, STARTDATE, PRODID, MINPRICE, ENDDATE)
 VALUES ('2.8', '1986-01-01', '100870', '2.4', null);

INSERT INTO PRICE (STDPRICE, STARTDATE, PRODID, MINPRICE, ENDDATE)
 VALUES ('2.4', '1985-01-01', '100870', '1.9', '1985-12-01');

INSERT INTO PRICE (STDPRICE, STARTDATE, PRODID, MINPRICE, ENDDATE)
 VALUES ('5.6', '1986-01-01', '100871', '4.8', null);

INSERT INTO PRICE (STDPRICE, STARTDATE, PRODID, MINPRICE, ENDDATE)
 VALUES ('24', '1985-02-15', '101860', '18', null);

INSERT INTO PRICE (STDPRICE, STARTDATE, PRODID, MINPRICE, ENDDATE)
 VALUES ('12.5', '1985-02-15', '101863', '9.4', null);

INSERT INTO PRICE (STDPRICE, STARTDATE, PRODID, MINPRICE, ENDDATE)
 VALUES ('3.4', '1985-08-18', '102130', '2.8', null);

INSERT INTO PRICE (STDPRICE, STARTDATE, PRODID, MINPRICE, ENDDATE)
 VALUES ('2.4', '1986-10-15', '200376', '1.75', null);

INSERT INTO PRICE (STDPRICE, STARTDATE, PRODID, MINPRICE, ENDDATE)
 VALUES ('4', '1986-10-15', '200380', '3.2', null);

CREATE INDEX PRICE_INDEX ON PRICE(PRODID, STARTDATE);

INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES ('100860', 'ACE TENNIS RACKET I', 110);
INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES ('100861', 'ACE TENNIS RACKET II', 105);
INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES ('100870', 'ACE TENNIS BALLS-3 PACK', 125);
INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES ('100871', 'ACE TENNIS BALLS-6 PACK', 155);
INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES ('100890', 'ACE TENNIS NET', 150);
INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES ('101860', 'SP TENNIS RACKET', 110);
INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES ('101863', 'SP JUNIOR RACKET', 117);
INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES ('102130', 'RH: "GUIDE TO TENNIS"', 145);
INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES ('200376', 'SB ENERGY BAR-6 PACK', 110);
INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES ('200380', 'SB VITA SNACK-6 PACK',110);
INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES (200455,'ACE TENNIS RACKET I',180);
INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES (200450,'ACE TENNIS RACKET II',190);
INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES (300120,'ACE TENNIS BALLS-3 PACK',120);
INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES (300121,'ACE TENNIS BALLS-3 PACK',500);
INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES (300075,'ACE TENNIS BALLS-6 PACK',800);
INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES (300076,'ACE TENNIS BALLS-6 PACK',100);
INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES (300078,'ACE TENNIS NET',400);
INSERT INTO PRODUCT (PRODID, DESCRIP, PRICE)  VALUES (300079,'SP TENNIS RACKET',345);

CREATE VIEW SALES AS
SELECT REPID, ORD.CUSTID, CUSTOMER.NAME CUSTNAME, PRODUCT.PRODID,
DESCRIP PRODNAME, SUM(ITEMTOT) AMOUNT
FROM ORD, ITEM, CUSTOMER, PRODUCT
WHERE ORD.ORDID = ITEM.ORDID
AND ORD.CUSTID = CUSTOMER.CUSTID
AND ITEM.PRODID = PRODUCT.PRODID
GROUP BY REPID, ORD.CUSTID, NAME, PRODUCT.PRODID, DESCRIP;

CREATE TABLE LOCATION(
LOCATIONID INT,
LOCATIONNAME varchar(10),
CONSTRAINT LOCATIONID_PRIMARY_KEY PRIMARY KEY (LOCATIONID));

INSERT INTO LOCATION VALUES (1,'NEW YORK');
INSERT INTO LOCATION VALUES (2,'DALLAS');
INSERT INTO LOCATION VALUES (3,'CHICAGO');
INSERT INTO LOCATION VALUES (4,'BOSTON');
INSERT INTO LOCATION VALUES (5,upper('California'));
INSERT INTO LOCATION VALUES (6,upper('Florida'));
INSERT INTO LOCATION VALUES (7,upper('Indiana'));
INSERT INTO LOCATION VALUES (8,upper('Maryland'));
INSERT INTO LOCATION VALUES (9,upper('Nevada'));
INSERT INTO LOCATION VALUES (10,upper('London'));
INSERT INTO LOCATION VALUES (11,upper('Geneva'));
INSERT INTO LOCATION VALUES (12,upper('roma'));
INSERT INTO LOCATION VALUES (13,upper('sydney'));
INSERT INTO LOCATION VALUES (14,upper('tokyo'));
INSERT INTO LOCATION VALUES (15,upper('toronto'));
INSERT INTO LOCATION VALUES (16,upper('venice'));
INSERT INTO LOCATION VALUES (17,upper('singapore'));
INSERT INTO LOCATION VALUES (18,upper('beijing'));
INSERT INTO LOCATION VALUES (19,upper('new delhi'));
INSERT INTO LOCATION VALUES (20,upper('mumbai'));



 CREATE TABLE DEPT1 (
 DEPTNO        INT NOT NULL,
 DNAME         varchar(20),
 LOCATIONID    INT,
 CONSTRAINT DEPT1_PRIMARY_KEY1 PRIMARY KEY (DEPTNO));

INSERT INTO DEPT1 VALUES (10,'ACCOUNTING','1');
INSERT INTO DEPT1 VALUES (20,'RESEARCH','2');
INSERT INTO DEPT1 VALUES (30,'SALES','3');
INSERT INTO DEPT1 VALUES (40,'OPERATIONS','4');
INSERT INTO DEPT1 VALUES (50,'PURCHASE','5');
INSERT INTO DEPT1 VALUES (60,'PRODUCTION','6');
INSERT INTO DEPT1 VALUES (70,'CONTROLS','7');
INSERT INTO DEPT1 VALUES (80,upper('Operations Research'),'8');
INSERT INTO DEPT1 VALUES (90,'FINANCE','1');
INSERT INTO DEPT1 VALUES (100,'IT','2');
INSERT INTO DEPT1 VALUES (110,'IT SUPPORT','3');
INSERT INTO DEPT1 VALUES (120,'SHIPPING','4');
INSERT INTO DEPT1 VALUES (130,'IT HELPDESK','1');
INSERT INTO DEPT1 VALUES (140,'RETAIL SALES','2');
INSERT INTO DEPT1 VALUES (150,'IT NETWORK','3');
INSERT INTO DEPT1 VALUES (160,'PUBLIC RELATIONS','4');
INSERT INTO DEPT1 VALUES (170,upper('Materials Science'),'1');
INSERT INTO DEPT1 VALUES (180,upper('Career Services'),'2');
INSERT INTO DEPT1 VALUES (190,upper('Commercial'),'5');
INSERT INTO DEPT1 VALUES (200,upper('Economics'),'6');
insert into dept1 values(201,'HRD',5);

CREATE TABLE EMP1 (
 EMPNO          INT NOT NULL,
 ENAME          varchar(12),
 JOB            varchar(20),
 MGR            INT,
 HIREDATE       datetime,
 SAL            float(7,2),
 COMM           float(7,2),
 DEPTNO         INT NOT NULL,
 HOBBYID 		INT,
 BONUSID		INT,
 CONSTRAINT EMP1_FOREIGN_KEY1 FOREIGN KEY (DEPTNO) REFERENCES DEPT1 (DEPTNO),
 CONSTRAINT EMP1_PRIMARY_KEY1 PRIMARY KEY (EMPNO),
 CONSTRAINT EMP1_SELF_KEY1 FOREIGN KEY (MGR) REFERENCES EMP1 (EMPNO));


INSERT INTO EMP1 VALUES (7839,'KING','PRESIDENT',NULL,'1981-11-17 04:20:24',5000,NULL,10,1,1);
INSERT INTO EMP1 VALUES (7698,'BLAKE','MANAGER',7839,'1981-05-01 05:54:43',2850,NULL,30,'2',3);
INSERT INTO EMP1 VALUES (7782,'CLARK','MANAGER',7839,'1981-06-09 02:12:12',2450,NULL,10,'3',5);
INSERT INTO EMP1 VALUES (7566,'JONES','MANAGER',7839,'1981-04-02 12:45:19',2975,NULL,20,'4',7);
INSERT INTO EMP1 VALUES (7654,'MARTIN','SALESMAN',7698,'1981-09-28 14:26:00',1250,1400,30,'2',4);
INSERT INTO EMP1 VALUES (7499,'ALLEN','SALESMAN',7698,'1981-02-20 07:30:00',1600,300,30,'5',8);
INSERT INTO EMP1 VALUES (7844,'TURNER','SALESMAN',7698,'1981-09-08 08:45:00',1500,0,30,NULL,10);
INSERT INTO EMP1 VALUES (7900,'JAMES','CLERK',7698,'1981-12-03 09:25:00',950,NULL,30,'3',8);
INSERT INTO EMP1 VALUES (7521,'WARD','SALESMAN',7698,'1981-02-22 10:15:00',1250,500,30,1,3);
INSERT INTO EMP1 VALUES (7902,'FORD','ANALYST',7566,'1981-12-03 11:00:00',3000,NULL,20,NULL,2);
INSERT INTO EMP1 VALUES (7369,'SMITH','CLERK',7902,'1980-12-17 17:36:00',800,NULL,20,NULL,1);
INSERT INTO EMP1 VALUES (7788,'SCOTT','ANALYST',7566,'1982-12-09 16:12:00',3000,NULL,20,'2',1);
INSERT INTO EMP1 VALUES (7876,'ADAMS','CLERK',7788,'1983-01-12 18:33:00',1100,NULL,20,'3',4);
INSERT INTO EMP1 VALUES (7934,'MILLER','CLERK',7782,'1982-01-23 20:20:00',1300,NULL,10,'4',3);
INSERT INTO EMP1 VALUES (5001,'AARON','SALESMAN',7902,'1981-11-17 04:29:24',4500,1200,60,'6',9);
INSERT INTO EMP1 VALUES (5002,upper('Alexander'),'MANAGER',7369,'1981-05-01 05:12:43',2950,NULL,70,'7',10);
INSERT INTO EMP1 VALUES (5003,upper('Brooke'),'CLERK',5002,'1981-06-09 02:17:12',2222,NULL,100,'8',10);
INSERT INTO EMP1 VALUES (6001,upper('Bruce'),upper('Personal assistant'),5002,'1981-04-02 12:35:19',4975,NULL,80,'9',6);
INSERT INTO EMP1 VALUES (6002,upper('Christopher'),upper('Personal assistant'),7844,'1981-09-28 14:26:00',4250,NULL,180,'10',3);
INSERT INTO EMP1 VALUES (6003,upper('Clive'),upper('Assistant'),7698,'1981-02-20 07:40:00',3600,NULL,120,1,1);
INSERT INTO EMP1 VALUES (7005,upper('Dirk'),upper('Assistant'),7698,'1981-09-08 08:15:00',1500,NULL,60,'10',6);
INSERT INTO EMP1 VALUES (7006,upper('Eli'),upper('Personal assistant'),7521,'1981-12-03 09:35:00',5400,NULL,70,'2',7);
INSERT INTO EMP1 VALUES (7007,upper('Ely'),upper('Assistant'),7788,'1981-02-22 10:10:00',5250,NULL,140,'2',7);
INSERT INTO EMP1 VALUES (8009,upper('Shelley'),'MANAGER',7839,'1981-12-03 11:00:00',6000,NULL,180,NULL,1);
INSERT INTO EMP1 VALUES (8003,upper('Thomas'),upper('Personal assistant'),8009,'1980-12-17 17:36:00',4900,NULL,50,NULL,2);
INSERT INTO EMP1 VALUES (7388,upper('Troy'),'ANALYST',8009,'1982-12-09 16:12:00',4100,NULL,160,'5',5);
INSERT INTO EMP1 VALUES (7877,upper('Stephen'),upper('Assistant'),7788,'1983-01-12 18:33:00',1100,NULL,130,'5',9);
INSERT INTO EMP1 VALUES (4934,upper('Sherlock'),'CLERK',8009,'1982-01-23 20:20:00',1600,NULL,40,'2',1);
INSERT INTO EMP1 VALUES (2099,upper('Sherlock'),'CLERK',8009,'1982-01-23 20:22:00',1600,NULL,40,'5',6);
INSERT INTO EMP1 VALUES (2877,upper('Stephen'),upper('Assistant'),7788,'1983-01-12 18:35:00',1100,NULL,40,'5',3);
INSERT INTO EMP1 VALUES (3000,'Aaron','Salesman',7877,'1981-11-17 04:29:24',4500,1200,60,'5',4);
INSERT INTO EMP1 VALUES (3001,('Alexander'),'Manager',7369,'1981-05-01 05:12:43',2950,NULL,90,'9',1);
INSERT INTO EMP1 VALUES (3002,('Brooke'),'Clerk',5002,'1981-06-09 02:17:12',2222,NULL,50,'6',3);
INSERT INTO EMP1 VALUES (3003,('Bruce'),('Personal Assistant'),5002,'1981-04-02 12:35:19',4975,NULL,120,'2',5);
INSERT INTO EMP1 VALUES (3467,('Christopher'),('Personal Assistant'),7844,'1981-09-28 14:26:00',4250,NULL,190,'6',7);
INSERT INTO EMP1 VALUES (3267,('Clive'),('Assistant'),5002,'1981-02-20 07:40:00',3600,NULL,50,'9',8);
INSERT INTO EMP1 VALUES (3598,('Dirk'),('Assistant'),7698,'1981-09-08 08:15:00',1500,NULL,60,NULL,6);
INSERT INTO EMP1 VALUES (3189,('Eli'),('Personal Assistant'),3001,'1981-12-03 09:35:00',5400,NULL,30,'2',1);
INSERT INTO EMP1 VALUES (3745,lower('Ely'),lower('Assistant'),7788,'1981-02-22 10:10:00',5250,NULL,150,'12',2);
INSERT INTO EMP1 VALUES (3244,lower('Shelley'),'manager',7839,'1981-12-03 11:00:00',6000,NULL,170,'2',4);
INSERT INTO EMP1 VALUES (9822,lower('Troy'),'analyst',3000,'1982-12-09 16:12:00',3100,NULL,40,'9',6);
INSERT INTO EMP1 VALUES (9341,lower('Thomas'),lower('Personal assistant'),9822,'1980-12-17 17:36:00',4900,NULL,200,NULL,1);
INSERT INTO EMP1 VALUES (9874,lower('Stephen'),lower('Assistant'),3001,'1983-01-12 18:33:00',1100,NULL,170,NULL,9);
INSERT INTO EMP1 VALUES (9452,lower('Sherlock'),'clerk',9822,'1982-01-23 20:20:00',1600,NULL,130,NULL,4);
INSERT INTO EMP1 VALUES (9434,lower('Sherlock'),'clerk',9874,'1982-01-23 20:22:00',1600,NULL,40,NULL,5);
INSERT INTO EMP1 VALUES (9277,lower('Stephen'),lower('Assistant'),3467,'1983-01-12 18:35:00',1100,NULL,110,NULL,4);
INSERT INTO EMP1 VALUES (6345,lower('Jay'),'analyst',8009,'1982-12-09 17:12:00',-3100,NULL,50,NULL,null);
INSERT INTO EMP1 VALUES (6774,lower('Joe'),lower('Assistant'),7788,'1983-01-13 18:33:00',-1100,NULL,190,'12',null);
INSERT INTO EMP1 VALUES (6342,lower('Joel'),'clerk',8009,'1982-01-23 22:20:00',-1600,NULL,50,NULL,null);
INSERT INTO EMP1 VALUES (6980,lower('Louis'),'clerk',8009,'1982-01-23 21:22:00',-1600,NULL,30,NULL,null);
INSERT INTO EMP1 VALUES (6843,lower('Matthew'),lower('Assistant'),7788,'1983-01-12 19:35:00',-1100,NULL,100,NULL,null);
INSERT INTO EMP1 VALUES (1000,'Alice','Manager',7839,'1983-08-12 19:35:00',9000,NULL,150,'13',1);
INSERT INTO EMP1 VALUES (1001,'Victor','Assistant Manager',1000,'1983-12-25 11:35:00',8000,NULL,150,'13',4);
INSERT INTO EMP1 VALUES (1002,'Jack','Assistant',1001,'1983-12-25 11:35:00',7000,NULL,150,NULL,4);
INSERT INTO EMP1 VALUES (1003,'William','Assistant',1001,'1984-12-30 12:00:02',7000,NULL,150,'13',1);
INSERT INTO EMP1 VALUES (1004,'Rose','Assistant Manager',1000,'1985-01-30 12:24:00',8000,NULL,150,NULL,7);
INSERT INTO EMP1 VALUES (1005,'Kate','Assistant Analyst',7388,'1985-01-30 12:24:00',3000,NULL,160,NULL,9);
INSERT INTO EMP1 VALUES (1006,'William','Salesman',7388,'1980-02-13 21:00:00',23700,1200,160,NULL,8);
INSERT INTO EMP1 VALUES (1007,'Matthew','Salesman',1005,'1980-02-28 21:00:07',4700,1200,160,'13',3);
INSERT INTO EMP1 VALUES (1008,'MAI','SALESGIRL',1000,'2001-12-25 11:35:00',8000,111,150,'8',2);
INSERT INTO EMP1 VALUES (1009,'ZARIA','SALESGIRL',1001,'2002-12-25 11:35:00',7000,555,150,'8',6);
INSERT INTO EMP1 VALUES (1010,'MAYA','SALESGIRL',1001,'2003-12-30 12:00:00',7000,120,150,'8',7);
INSERT INTO EMP1 VALUES (1011,'ROSE','SALESGIRL',1000,'2004-01-30 12:24:09',18000,250,150,'8',3);
INSERT INTO EMP1 VALUES (1012,'KATE','SALESGIRL',7388,'2005-01-30 12:24:00',3000,900,160,'8',9);
INSERT INTO EMP1 VALUES (1013,'TINA','SALESGIRL',7388,'2006-02-13 21:00:00',13700,2400,160,'8',10);
INSERT INTO EMP1 VALUES (1014,'MARY','SALESGIRL',1005,'2007-02-28 21:00:00',20000,1550,160,'8',1);
INSERT INTO EMP1 VALUES (1015,'TESSA','SALESGIRL',1005,'2008-02-28 21:00:00',14700,1100,160,'8',5);
INSERT INTO EMP1 VALUES (1016,'STEVEN','Assistant',1004,'1983-01-12 18:35:07',-9500,NULL,40,NULL,null);

UPDATE EMP1 SET SAL = '8000.48' WHERE (EMPNO = '1004');
UPDATE EMP1 SET SAL = '7000.79' WHERE (EMPNO = '1003');
UPDATE EMP1 SET SAL = '7000.15', COMM = '120.79' WHERE (EMPNO = '1010');
UPDATE EMP1 SET SAL = '6000.99' WHERE (EMPNO = '3244');
UPDATE EMP1 SET SAL = '4250.98' WHERE (EMPNO = '3467');
UPDATE EMP1 SET SAL = '4975.30' WHERE (EMPNO = '3003');
UPDATE EMP1 SET SAL = '5250.70' WHERE (EMPNO = '7007');
UPDATE EMP1 SET COMM = '1200.40' WHERE (EMPNO = '5001');
UPDATE EMP1 SET COMM = '1200.73' WHERE (EMPNO = '3000');

CREATE TABLE EMP_Cards (
  ID INT primary key auto_increment,
  empID INT,
  name varchar(45),
  isActive bool,
  FOREIGN KEY(empID) REFERENCES emp1(empno));


INSERT INTO emp_cards (empID, name, isActive) VALUES (7839, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7839, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7839, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7839, 'Voter ID', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7839, 'Passport', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7839, 'Debit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7839, 'Credit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7698, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7698, 'Driving Licence', '0');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7698, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7698, 'Voter ID', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7698, 'Debit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7782, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7782, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7782, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7782, 'Passport', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7782, 'Debit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7566, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7566, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7566, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7566, 'Passport', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7566, 'Debit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7566, 'Credit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7654, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7654, 'Driving Licence', '0');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7654, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7654, 'Voter ID', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7654, 'Passport', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7654, 'Debit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7654, 'Credit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7499, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7499, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7844, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7844, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7900, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7900, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7900, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7900, 'Voter ID', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7521, 'Driving Licence', '0');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7521, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7521, 'Debit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7521, 'Credit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7902, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7902, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7902, 'Passport', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7902, 'Voter ID', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7369, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7788, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7788, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7788, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7876, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7876, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7876, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7876, 'Voter ID', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (5003, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (5003, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (5003, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (5003, 'Voter ID', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (5003, 'Passport', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (5003, 'Debit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (5003, 'Credit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7005, 'Aadhaar', '0');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7005, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7006, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7006, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7006, 'Passport', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (8009, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (8009, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (8009, 'Passport', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (8003, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (8003, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (8003, 'Credit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7388, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7388, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7388, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7388, 'Voter ID', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7388, 'Passport', '0');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7388, 'Credit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7388, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3267, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3267, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3267, 'Voter ID', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7388, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7388, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (7388, 'Voter ID', '0');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3001, 'Credit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3001, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3001, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3002, 'Passport', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3002, 'Voter ID', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3002, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3002, 'Debit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3002, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3003, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3003, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3003, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3244, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3244, 'Voter ID', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3244, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (3244, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (9434, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (9434, 'Voter ID', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (9434, 'Passport', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (9434, 'Debit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (6980, 'Credit', '0');
INSERT INTO emp_cards (empID, name, isActive) VALUES (6980, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (6980, 'PAN', '0');
INSERT INTO emp_cards (empID, name, isActive) VALUES (6843, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (6843, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (6843, 'Passport', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1003, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1003, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1003, 'Passport', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1009, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1009, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1009, 'Credit', '0');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1010, 'Aadhaar', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1010, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1010, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1010, 'Voter ID', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1011, 'Passport', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1011, 'Credit', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1011, 'Aadhaar', '0');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1011, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1011, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1014, 'Voter ID', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1014, 'Driving Licence', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1014, 'PAN', '1');
INSERT INTO emp_cards (empID, name, isActive) VALUES (1016, 'Voter ID', '1');


CREATE TABLE emp_phone (
  ID INT primary key,
  empID INT,
  number varchar(45),
  isActive bool,
  FOREIGN KEY(empID) REFERENCES emp1(empno));
  
  
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('1', '7839', '7032300034', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('2', '7698', '7032300039', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('3', '7782', '7032300050', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('4', '7566', '7032300027', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('5', '7654', '7032300001', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('6', '7499', '7032300079', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('7', '7844', '7032300081', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('8', '7900', '7032300054', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('9', '7521', '7032300059', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('10', '7902', '7032300086', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('11', '7369', '7032300082', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('12', '7788', '7032300042', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('13', '7876', '7032300055', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('14', '5003', '7032300013', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('15', '7005', '7032300099', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('16', '7006', '7032300023', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('17', '8009', '7032300084', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('18', '8003', '7032300011', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('19', '7388', '7032300066', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('20', '3267', '7032300096', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('21', '7839', '7132300034', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('22', '7698', '7132300039', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('23', '7782', '7132300050', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('24', '7566', '7132300027', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('25', '7654', '7032300001', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('26', '7499', '7132300079', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('27', '1011', '7132300081', '0');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('28', '1016', '7132300054', '0');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('29', '1015', '7132300059', '0');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('30', '1016', '7132300086', '0');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('31', '2099', '7132300082', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('32', '2099', '7132300042', '0');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('33', '7876', '7132300055', '0');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('34', '7876', '7132300055', '0');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('35', '7876', '7132300055', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('36', '7499', '7134567123', '0');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('37', '1000', '7156567123', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('38', '1002', '7156567134', '1');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('39', '1003', '7156563423', '0');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('40', '1004', '7156567183', '0');
INSERT INTO emp_phone (ID, empID, number, isActive) VALUES ('41', '1005', '7146566412', '1');
  

CREATE TABLE EMP2(
 EMPNO          INT NOT NULL,
 ENAME          varchar(12),
 JOB            varchar(20),
 HIREDATE       datetime,
 SAL            float(7,2),
 COMM           float(7,2),
 DEPTNO         INT NOT NULL,
 HOBBYID		INT,
 BONUSID		INT,
 CONSTRAINT EMP2_FOREIGN_KEY2 FOREIGN KEY (DEPTNO) REFERENCES DEPT1 (DEPTNO),
 CONSTRAINT EMP2_PRIMARY_KEY2 PRIMARY KEY (EMPNO));

insert into emp2 select empno,ename,job,hiredate,sal,comm,deptno,hobbyid,BONUSID from emp1;

create table regexpr(C1 varchar(40));

INSERT INTO regexpr VALUES ('abcde');
INSERT INTO regexpr VALUES ('12345');
INSERT INTO regexpr VALUES ('1a4A5');
INSERT INTO regexpr VALUES ('12a45');
INSERT INTO regexpr VALUES ('12aBC');
INSERT INTO regexpr VALUES ('12abc');
INSERT INTO regexpr VALUES ('12ab5');
INSERT INTO regexpr VALUES ('12aa5');
INSERT INTO regexpr VALUES ('12AB5');
INSERT INTO regexpr VALUES ('ABCDE');
INSERT INTO regexpr VALUES ('123-5');
INSERT INTO regexpr VALUES ('12.45');
INSERT INTO regexpr VALUES ('1a4b5');
INSERT INTO regexpr VALUES ('1 3 5');
INSERT INTO regexpr VALUES ('1  45');
INSERT INTO regexpr VALUES ('1   5');
INSERT INTO regexpr VALUES ('a  b  c  d');
INSERT INTO regexpr VALUES ('a b  c   d    e');
INSERT INTO regexpr VALUES ('a              e');
INSERT INTO regexpr VALUES ('Steven');
INSERT INTO regexpr VALUES ('Stephen');
INSERT INTO regexpr VALUES ('STEVEN');
INSERT INTO regexpr VALUES ('STEPHEN');
INSERT INTO regexpr VALUES ('111.222.3333');
INSERT INTO regexpr VALUES ('222.333.4444');
INSERT INTO regexpr VALUES ('333.444.5555');
INSERT INTO regexpr VALUES ('abcdefabcdefabcxyz');
INSERT INTO regexpr VALUES ('SA/1001 SA/1002 SA/1003');
INSERT INTO regexpr VALUES ('sa/1001 sa/1002 sa/1003 sa/1004');
INSERT INTO regexpr VALUES ('Sa/1001 Sa/1002 Sa/1003 Sa/1004 Sa/1005');
	

create table temp1
(col1 INT,
 col2 varchar(25)
);

insert into temp1 values(1,'25%');
insert into temp1 values(2,'1.st%');
insert into temp1 values(3,'30.12%');
insert into temp1 values(4,'12^4');
insert into temp1 values(5,'1^2^3');
insert into temp1 values(6,'56*12*.12');
insert into temp1 values(7,'1st INT');
insert into temp1 values(8,'Rs. 1000');
insert into temp1 values(9,'$5000');
insert into temp1 values(10,'ABB+');
insert into temp1 values(11,'_ABB');
insert into temp1 values(12,'A_BB');
insert into temp1 values(13,'CNN');
insert into temp1 values(14,'C_N_N');
insert into temp1 values(15,'CN_N');
insert into temp1 values(16,'ABB_');
insert into temp1 values(17,'AB_B');
insert into temp1 values(18,'%ABB');
insert into temp1 values(19,'A%B%B');
insert into temp1 values(20,'L&T');
insert into temp1 values(21,'L_&_T');
insert into temp1 values(22,'ABB-200');
insert into temp1 values(23,'ABB:200');
insert into temp1 values(24,'ABB_200');
insert into temp1 values(25,'ABB/200/300');
insert into temp1 values(26,'AC/100, AC/200, AC/300');
insert into temp1 values(27,'A_B\C');
insert into temp1 values(28,'A_B_\C');
insert into temp1 values(29,'A\_BC');


create table sort
(	
 no1 INT,
 no2 char(10)
);

insert into sort values ('1','1'), ('2','2'), ('3','3'), ('4','4'), ('5','5'), 
('6','6'), ('7','7'), ('8','8'), ('9','9'), ('10','10'), ('11','11'), ('12','12'),
 ('19','19'), ('18','18'), ('13','13'), ('14','14'),(99,NULL),(102,NULL),(null,NULL),(0,NULL),(NULL,NULL),
 ('20','20'), ('27','27'), ('29','29'), ('21','21'), 
 ('22','22'), ('23','23'), ('31','31'), ('45','45'), ('39','39'), ('40','40'), ('400','400'), 
 ('300','300'), ('200','200'), ('100','100'), ('-1','-1'), ('-2','-2'), ('-3','-3'), (NULL,'01'), 
 (NULL,'03'), (NULL,'02');
 

create table tableAA
(col1 INT,
 col2 INT);

insert into tableaa values (1,2), (3,4), (5,6), (7,8), (9,10), (11,12), (13,14);


create table tableBB
(col3 INT,
 col4 INT);

insert into tablebb values (5,7), (3,8), (1,4), (8,7), (Null,10), (11,12);


CREATE TABLE SALESPEOPLE (SNUM INT PRIMARY KEY, SNAME VARCHAR(10), CITY VARCHAR(10), COMM FLOAT);
CREATE TABLE CUSTOMERS (CNUM INT  PRIMARY KEY, CNAME VARCHAR (10), CITY VARCHAR (10), RATING FLOAT, SNUM INT, CONSTRAINT FK_SNUM FOREIGN KEY(SNUM) REFERENCES SALESPEOPLE(SNUM));

CREATE TABLE ORDERS (ONUM INT PRIMARY KEY, AMT FLOAT, ODATE DATETIME, CNUM INT , SNUM INT, type varchar(10), paymentType varchar(20), registered bool , CONSTRAINT FK_CNUM FOREIGN KEY(CNUM) REFERENCES CUSTOMERS(CNUM) , CONSTRAINT FK_ORDERS_SNUM FOREIGN KEY(SNUM) REFERENCES SALESPEOPLE(SNUM));


INSERT into SALESPEOPLE(SNUM, SNAME, CITY, COMM) values (1001,'Rajan','London',.12);
INSERT into SALESPEOPLE(SNUM, SNAME, CITY, COMM) values (1002,'Natasha','San Jose',.13);
INSERT into SALESPEOPLE(SNUM, SNAME, CITY, COMM) values (1004,'Monika','London',.11);
INSERT into SALESPEOPLE(SNUM, SNAME, CITY, COMM) values (1007,'James','Derby',.15);
INSERT into SALESPEOPLE(SNUM, SNAME, CITY, COMM) values (1003,'Alax','New York',.10);
INSERT into SALESPEOPLE(SNUM, SNAME, CITY, COMM) values (1005,'Moor','London',.26);
INSERT into SALESPEOPLE(SNUM, SNAME, CITY, COMM) values (1006,'Jack','Leeds',.26);
INSERT into SALESPEOPLE(SNUM, SNAME, CITY, COMM) values (1008,'Cooper','Wells',.19);
INSERT into SALESPEOPLE(SNUM, SNAME, CITY, COMM) values (1009,'Leo','Wells',.26);

INSERT into CUSTOMERS(CNUM, CNAME, CITY, RATING, SNUM) values (2001,'Santosh','London',100,1001);
INSERT into CUSTOMERS(CNUM, CNAME, CITY, RATING, SNUM) values (2002,'Joe','Rome',200,1003);
INSERT into CUSTOMERS(CNUM, CNAME, CITY, RATING, SNUM) values (1001,'Saleel','Baroda',250,1007);
INSERT into CUSTOMERS(CNUM, CNAME, CITY, RATING, SNUM) values (2003,'Raj','San Jose',200,1002);
INSERT into CUSTOMERS(CNUM, CNAME, CITY, RATING, SNUM) values (2004,'Grass','Berlin',300,1002);
INSERT into CUSTOMERS(CNUM, CNAME, CITY, RATING, SNUM) values (2006,'Raja','London',100,1001);
INSERT into CUSTOMERS(CNUM, CNAME, CITY, RATING, SNUM) values (1037,'Nitish','Pune',250,1007);
INSERT into CUSTOMERS(CNUM, CNAME, CITY, RATING, SNUM) values (2008,'William','San Jose',300,1007);
INSERT into CUSTOMERS(CNUM, CNAME, CITY, RATING, SNUM) values (2007,'Jackson','Rome',100,1004);
INSERT into CUSTOMERS(CNUM, CNAME, CITY, RATING, SNUM) values (2009,'Smith','Berlin',300,1007);
INSERT into CUSTOMERS(CNUM, CNAME, CITY, RATING, SNUM) values (2010,'ADAMS','Berlin',250,1007);


INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3001,18.69,'1996-10-03 12:30', 2008, 1007, 'Online','Credit Cards');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3003,767.19,'1996-10-03 13:45', 2001, 1001, 'Online','Debit Cards');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3002,1900.10,'1996-10-03 12:30',2007,1004, 'Online','Wallets');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3005,5160.45,'1996-10-03 14:00',2003,1002, 'Online','Debit Cards');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3006,1098.16,'1996-10-03 13:37',2008,1007, 'Online','Wallets');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3009,1713.23,'1996-10-04 15:21',2002,1003, 'Online','Credit Cards');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE, paymentType) values (3050,1900.10,'1996-10-03 12:05',null,1004, 'Direct', 'PhonePe');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3007,75.75,'1996-10-04 15:21',2002,1003, 'Online', 'Credit Cards');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3008,4723.00,'1996-10-05 12:07',2006,1001, 'Online','COD');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3010,1309.95,'1996-10-06 13:12',2004,1002, 'Online','EMI Options');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3011,9891.88,'1996-10-06 13:09',2006,1001, 'Online','EMI Options');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE, paymentType) values (2322, 750.10,'1996-10-03 12:05',null,1004, 'Direct', 'PhonePe');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE, paymentType) values (2475, 750.10,'1996-10-03 12:05',null,1004, 'Direct', 'PhonePe');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE, paymentType) values (2364, 750.10,'1996-10-03 12:07',null,1004, 'Direct', 'PhonePe');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3012,3455.78,'1996-10-04 15:21',2002,1003, 'Online','COD');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3013,1245.98,'1996-10-04 16:32',2002,1003, 'Online','EMI Options');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3014,3721.53,'1996-10-05 12:45',2006,1001, 'Online','COD');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3015,734.50,'1996-10-06 13:16',2004,1002, 'Online','EMI Options');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3016,1729.67,'1996-10-06 13:18',2006,1001, 'Online','Wallets');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3017,18.69,'1996-10-03 12:30', 2001, 1007, 'Online','Credit Cards');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3018,767.19,'1996-10-03 12:05', 2002, 1001, 'Online','Wallets');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3019,1900.10,'1996-10-03 12:05',2007,1004, 'Online','EMI Options');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3020,5160.45,'1996-10-03 14:00',2003,1007, 'Online','COD');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3021,1098.16,'1996-10-03 13:37',2008,1007, 'Online','Debit Cards');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3022,1713.23,'1996-10-04 15:21',2002,1003, 'Online','COD');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3023,75.75,'1996-10-04 16:02',2002,1004, 'Online','Wallets');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3024,4723.00,'1996-10-05 12:07',2006,1002, 'Online','Credit Cards');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3025,1309.95,'1996-10-06 13:12',2002,1002, 'Online','Wallets');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3026,9891.88,'1996-10-06 13:09',2006,1001, 'Online','Wallets');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3027,3455.78,'1996-10-04 15:21',2002,1003, 'Online','COD');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3028,1245.98,'1996-10-04 16:32',2002,1003, 'Online','Debit Cards');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3029,3721.53,'1996-10-05 12:45',2006,1001, 'Online','Credit Cards');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3030,734.50,'1996-10-06 13:16',2004,1002, 'Online','COD');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) values (3031,1729.67,'1996-10-06 13:07',2006,1007, 'Online','Wallets');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (3032, 3434.55, '1996-01-26 17:09:12', 2006,1007, 'Online','Wallets');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (3033, 522.23, '1996-12-24 14:23:00', 2002,1002, 'Online','COD');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (3074, 457.40, '1996-04-19 05:13:00', 2008,1007, 'Online','EMI Options');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (3049, 500.58, '1996-03-14 07:45:19', 2001,1003, 'Online','COD');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (3119, 125.50, '1996-07-26 18:37:00', 2007,1001, 'Online','Wallets');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (4001, 145.20, '1996-05-13 20:47:00', 2008,1003, 'Online','EMI Options');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (4012, 245.60, '1996-03-06 13:07:00', 2001,1002, 'Online','Wallets');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (4021, 600.65, '1996-08-12 13:07:00', 2001,1002, 'Online','Wallets');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (4054, 1200.80, '1996-11-22 13:07:00',2004,1003, 'Online','COD');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (5015, 2133.35, '1996-06-23 13:07:00',2004,1007, 'Online','EMI Options');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (5053, 1500.50, '1996-01-01 13:07:00',2006,1007, 'Online','EMI Options');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (5099, 790.75, '1996-04-24 13:07:00', 2002,1007, 'Online','EMI Options');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (5014, 980.65, '1996-08-23 13:07:00', 2002,1007, 'Online','Wallets');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (5016, 1000.95, '1996-03-12 13:07:00',2002,1007, 'Online','COD');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (6501, 125.45, '1996-06-13 13:07:00', 2001,1001, 'Online','EMI Options');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (5011, 138.35, '1996-09-14 13:07:00', 2001,1007, 'Online','COD');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (6502, 535.25, '1996-08-24 13:07:00', 2006,1004, 'Online','COD');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (6503, 1100.25, '1996-07-26 13:07:00',2006,1007, 'Online','Wallets');
INSERT INTO orders(ONUM, AMT, ODATE, CNUM, SNUM, TYPE,paymentType) VALUES (6504, 1350.75, '1996-07-21 13:07:00',2008,1007, 'Online','COD');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE, paymentType) values (6605,1900.10,'1996-10-03 12:05',null,1004, 'Direct', 'PhonePe');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE, paymentType) values (6606,5160.45,'1996-10-03 14:00',null,1002, 'Direct', 'Paytm');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE, paymentType) values (6607,1098.16,'1996-11-03 13:37',null,1007, 'Direct', 'COD');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE, paymentType) values (6608,1713.23,'1996-11-04 15:21',null,1003, 'Direct', 'GPay');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE, paymentType) values (5056,750.10,'1996-10-03 12:05',null,1007, 'Direct', 'PhonePe');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE, paymentType) values (5020,950.45,'1996-10-03 14:00',null,1007, 'Direct', 'Paytm');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE, paymentType) values (5034,120.16,'1996-11-03 13:37',null,1003, 'Direct', 'COD');
INSERT into ORDERS(ONUM, AMT, ODATE, CNUM, SNUM, TYPE, paymentType) values (5001,325.23,'1996-11-04 15:21',null,1002, 'Direct', 'GPay');

update orders set type='Online';
update orders set type='Cash' where paymentType='COD';

update orders set registered=true where type='Online';
update orders set registered=false where type='Cash';
update orders set registered=0 where cnum is null;

alter table orders add column delivery_partner varchar(12);

UPDATE ord SET STATUS = 'In Process' WHERE (ORDID = '601');
UPDATE ord SET STATUS = 'On Hold' WHERE (ORDID = '602');
UPDATE ord SET STATUS = 'Cancelled' WHERE (ORDID = '603');
UPDATE ord SET STATUS = 'Resolved' WHERE (ORDID = '604');
UPDATE ord SET STATUS = 'Disputed' WHERE (ORDID = '605');
UPDATE ord SET STATUS = 'Shipped' WHERE (ORDID = '606');
UPDATE ord SET STATUS = 'Shipped' WHERE (ORDID = '608');
UPDATE ord SET STATUS = 'Shipped' WHERE (ORDID = '611');
UPDATE ord SET STATUS = 'Shipped' WHERE (ORDID = '613');
UPDATE ord SET STATUS = 'Shipped' WHERE (ORDID = '617');
UPDATE ord SET STATUS = 'Shipped' WHERE (ORDID = '621');
UPDATE ord SET STATUS = 'In Process' WHERE (ORDID = '607');
UPDATE ord SET STATUS = 'In Process' WHERE (ORDID = '610');
UPDATE ord SET STATUS = 'In Process' WHERE (ORDID = '615');
UPDATE ord SET STATUS = 'In Process' WHERE (ORDID = '619');
UPDATE ord SET STATUS = 'On Hold' WHERE (ORDID = '609');
UPDATE ord SET STATUS = 'On Hold' WHERE (ORDID = '618');
UPDATE ord SET STATUS = 'Cancelled' WHERE (ORDID = '612');
UPDATE ord SET STATUS = 'Cancelled' WHERE (ORDID = '620');
UPDATE ord SET STATUS = 'In Process' WHERE (ORDID = '614');
UPDATE ord SET STATUS = 'Resolved' WHERE (ORDID = '616');
UPDATE ord SET STATUS = 'Delivered' WHERE (ORDID = '622');
UPDATE ord SET STATUS = 'Delivered' WHERE (ORDID = '623');
UPDATE ord SET STATUS = 'Delivered' WHERE (ORDID = '624');
UPDATE ord SET STATUS = 'Delivered' WHERE (ORDID = '625');
UPDATE ord SET STATUS = 'shipped' WHERE (ORDID = '626');
UPDATE ord SET STATUS = 'Delivered' WHERE (ORDID = '627');

update EMP set `user name` = ename;
update EMP set `user name` = upper("Always Teste") where empno = 7499;
update EMP set `user name` = upper("Big Ben") where empno = 7698;
update EMP set `user name` = upper("Crazy Anyone") where empno = 7876;
update EMP set `user name` = upper("Crazy Leader") where empno = 7900;
update EMP set `user name` = upper("ConBrio") where empno = 7902;
update EMP set `user name` = upper("Interval") where empno = 7919;
update EMP set `user name` = upper("QuarterNote") where empno = 7934;
update EMP set `user name` = upper("QuarterRest") where empno = 7949;
update EMP set `user name` = upper("Tritone") where empno = 7369;
update EMP set `user name` = upper("Honeycomb") where empno = 7566;
update EMP set `user name` = upper("Life Racer") where empno = 7654;
update EMP set `user name` = upper("White Sand") where empno = 7788;
update EMP set `user name` = upper("Sand Dust") where empno = 7844;
update EMP set `user name` = upper("Sand Stone") where empno = 7840;


update EMP set pwd = (select dept.pwd from dept where emp.deptno = dept.deptno);
UPDATE EMP SET PWD=NULL WHERE EMPNO=7415;
UPDATE EMP SET PWD='ABCDEF' WHERE EMPNO=7945;
UPDATE EMP SET PWD=NULL WHERE EMPNO=9400;
UPDATE EMP SET PWD='XYZ@1234' WHERE EMPNO=9473;

delete from emp_cards where  not exists (select True from emp where emp_cards.empid = emp.empno);
delete from emp_phone where not exists (select True from emp where emp_phone.empid = emp.empno);


UPDATE emp_phone SET number = '7132300253' WHERE (ID = '33');
UPDATE emp_phone SET number = '7132307673' WHERE (ID = '34');
UPDATE emp_phone SET number = '7132300235' WHERE (ID = '21');
UPDATE emp_phone SET number = '7132387250' WHERE (ID = '23');
UPDATE emp_phone SET number = '7132398039' WHERE (ID = '22');
UPDATE emp_phone SET number = '7032306752' WHERE (ID = '5');


create table client (clientID int, clientName varchar(10), city varchar(10)) as select cnum clientID, cname clientName, city from customers;

set @cnt :=0;
update client set clientId = @cnt := @cnt + 1;

insert into client values (10, 'Omkar','Pune'),  (11, 'Sumit', 'Baroda'), (12, 'Martin', 'Rome'), (13, 'Smith', 'Rome'), (14, 'Vasant', 'Pune'), (15, 'ABC','Pune'),  (16, 'PQR', 'Baroda'), (17, 'XYZ', 'Rome');



create table emp_attendance (empno int, datePresent varchar(80));
insert into emp_attendance(empno) select empno from emp;

update emp_attendance set datepresent= '1,2,5,7,9,10,12,15' where empno=7415;
update emp_attendance set datepresent= '1,2,5,7,9,10,12,15,16,17,18,19' where empno=7421;
update emp_attendance set datepresent= '1,2,5,7,9,10,12,15,18,29' where empno=7782;
update emp_attendance set datepresent= '1,2,5,7,9,10,12,15,16,17,18,19' where empno=7839;
update emp_attendance set datepresent= '1,2,5,7,9,10,12,15,16,17,20,21,22' where empno=7934;
update emp_attendance set datepresent= '1,2,5,7,9,10,12,15,16,17,18,19' where empno=;
update emp_attendance set datepresent= '1,2,5,7,9,10,12,15' where empno=6473;
update emp_attendance set datepresent= '1,2,5,7,9,10,12,15,16,17,18,19' where empno=6781;
update emp_attendance set datepresent= '1,2,3,4,5,7,9,10,12,15' where empno=7369;
update emp_attendance set datepresent= '1,2,3,5,7,8,9,10,11,12,15,16,17,18,19' where empno=7566;
update emp_attendance set datepresent= '1,2,3,4,5,7,9,10,12,15,21,22,23,24,25,26,27' where empno=7788;
update emp_attendance set datepresent= '1,2,5,7,9,10,12,15,16,17,18,19' where empno=7876;
update emp_attendance set datepresent= '1,2,5,7,9,10,12,15,16,17' where empno=7902;
update emp_attendance set datepresent= '1,2,5,7,9,10,12,15' where empno=6001;
update emp_attendance set datepresent= '1,2,5,7,9,10,12,15,17,19,20' where empno=7499;
update emp_attendance set datepresent= '1,2,5,7,9,10,12,15' where empno=7521;
update emp_attendance set datepresent= '1,2,3,4,5,7,9,10,12,15,21,22,23,24,25,26,27,28,29,30' where empno=7654;
update emp_attendance set datepresent= '1,2,5,7,9,10,12,15' where empno=7698;
update emp_attendance set datepresent= '1,2,5,7,9,10,12,15' where empno=7844;
update emp_attendance set datepresent= '1,2,5,7,9,10,12,15' where empno=7900;
update emp_attendance set datepresent= '1,2,3,4,5,7,9,10,12,15,21,22,23,24,25,26,27' where empno=7919;
update emp_attendance set datepresent= '1,2,3,4,5,6,7,8,9,10,12,15' where empno=7920;
update emp_attendance set datepresent= '1,2,3,4,5,6,7,8,9,10,12,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30' where empno=7945;
update emp_attendance set datepresent= '1,2,3,4,5,6,7,8,9,10,12,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30' where empno=7949;
update emp_attendance set datepresent= '1,2,3,4,5,6,7,8,9,10,12,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30' where empno=8433;
update emp_attendance set datepresent= '1,2,3,4,5,6,7,8,9,10,12,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30' where empno=6129;
update emp_attendance set datepresent= '1,2,3,4,5,6,7,8,9,10,12,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30' where empno=9400;
update emp_attendance set datepresent= '1,2,3,4,5,6,7,8,9,10,12,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30' where empno=9473;


create table numberString (c1 varchar(45) primary key);
insert into numberString select concat(empno,ename) from emp;

insert into numberString values('1saleel');
insert into numberString values('34sharmin');
insert into numberString values('743ruhan');
insert into numberString values('56731vrushali');
insert into numberString values('836379bandish');
insert into numberString values('7657822ajay');

create table stringNumber as select * from numberString where 1=2;
insert into stringNumber select concat(ename,empno) from emp;
	
insert into stringNumber values('saleel1');
insert into stringNumber values('sharmin34');
insert into stringNumber values('ruhan743');
insert into stringNumber values('vrushali56731');
insert into stringNumber values('bandish836379');
insert into stringNumber values('ajay7657822');

CREATE TABLE x(c1 date);

commit;