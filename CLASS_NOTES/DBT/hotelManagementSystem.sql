drop table if exists Payment;
drop table if exists Bookings;
drop table if exists Rooms;
drop table if exists RoomType;
drop table if exists Customer_Service;
drop table if exists Role_Service;
drop table if exists Service;
drop table if exists Staff;
drop table if exists Role;
drop table if exists Customers;


CREATE TABLE Customers (
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(20) UNIQUE,
    address VARCHAR(255)
);

CREATE TABLE Role (
    RoleID INT AUTO_INCREMENT PRIMARY KEY,
    RoleName VARCHAR(50) NOT NULL,
    Description VARCHAR(255)
);

CREATE TABLE Staff (
    staff_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    role VARCHAR(50),
    email VARCHAR(100) UNIQUE,
    phone VARCHAR(20) UNIQUE,
    RoleID INT,
    FOREIGN KEY (RoleID) REFERENCES Role(RoleID)
);

CREATE TABLE Service (
    serviceTypeID INT AUTO_INCREMENT PRIMARY KEY,
    ServiceName VARCHAR(100) NOT NULL,
    Description VARCHAR(255)
);

CREATE TABLE Role_Service (
    RoleID INT,
    serviceTypeID INT,
    Remarks VARCHAR(255),
    PRIMARY KEY (RoleID, serviceTypeID),
    FOREIGN KEY (RoleID) REFERENCES Role(RoleID),
    FOREIGN KEY (serviceTypeID) REFERENCES Service(serviceTypeID)
);

CREATE TABLE Customer_Service (
    customer_id INT,
    serviceTypeID INT,
    request_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    remarks VARCHAR(255),
    PRIMARY KEY (customer_id, serviceTypeID, request_date),
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
    FOREIGN KEY (serviceTypeID) REFERENCES Service(serviceTypeID)
);

CREATE TABLE RoomType (
    room_type_id INT AUTO_INCREMENT PRIMARY KEY,
    type_name VARCHAR(50) NOT NULL,
    price_per_night DECIMAL(10,2) NOT NULL
);

CREATE TABLE Rooms (
    room_id INT AUTO_INCREMENT PRIMARY KEY,
    room_number VARCHAR(10) UNIQUE NOT NULL,
    room_type_id INT NOT NULL,
    floor INT,
    status ENUM('Available', 'Occupied', 'Maintenance', 'Cleaning') DEFAULT 'Available',
    FOREIGN KEY (room_type_id) REFERENCES RoomType(room_type_id)
);

CREATE TABLE Bookings (
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT NOT NULL,
    room_id INT NOT NULL,
    staff_id INT,
    check_in_date DATE NOT NULL,
    check_out_date DATE,
    booking_status ENUM('Checked-Out', 'Checked-In','Booked', 'Cancelled', 'Completed') DEFAULT 'Booked',
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
    FOREIGN KEY (room_id) REFERENCES Rooms(room_id),
    FOREIGN KEY (staff_id) REFERENCES Staff(staff_id)
);

CREATE TABLE Payment (
    payment_id INT AUTO_INCREMENT PRIMARY KEY,
    booking_id INT NOT NULL,
    amount DECIMAL(10,2) NOT NULL,
    payment_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    payment_method ENUM('Card', 'UPI', 'Cash', 'Online') NOT NULL,
	paid DECIMAL(10,2) NOT NULL default 0,
    FOREIGN KEY (booking_id) REFERENCES Bookings(booking_id)
);


INSERT INTO Role (RoleName, Description) VALUES
('Receptionist', 'Handles bookings and customer queries'),
('Housekeeping', 'Responsible for room cleaning and upkeep'),
('Manager', 'Manages hotel operations'),
('Chef', 'Prepares meals and supervises kitchen'),
('Security', 'Ensures guest safety');


INSERT INTO Staff (name, role, email, phone, RoleID) VALUES
('Alice Johnson', 'Receptionist', 'alice@hotel.com', '9876543210', 1),
('Bob Smith', 'Housekeeping', 'bob@hotel.com', '9876543211', 2),
('Charlie Brown', 'Manager', 'charlie@hotel.com', '9876543212', 3),
('David Miller', 'Chef', 'david@hotel.com', '9876543213', 4),
('Eva Green', 'Security', 'eva@hotel.com', '9876543214', 5),
('Frank Wilson', 'Receptionist', 'frank@hotel.com', '9876543215', 1),
('Grace Lee', 'Housekeeping', 'grace@hotel.com', '9876543216', 2),
('Hannah White', 'Chef', 'hannah@hotel.com', '9876543217', 4),
('Ian Scott', 'Security', 'ian@hotel.com', '9876543218', 5),
('Julia Adams', 'Manager', 'julia@hotel.com', '9876543219', 3);


INSERT INTO Customers (name, email, phone, address) VALUES
('John Doe', 'john@example.com', '9998887770', 'Mumbai'),
('Jane Smith', 'jane@example.com', '9998887771', 'Delhi'),
('Michael Clark', 'mike@example.com', '9998887772', 'Bangalore'),
('Emily Davis', 'emily@example.com', '9998887773', 'Chennai'),
('Daniel Lewis', 'daniel@example.com', '9998887774', 'Pune'),
('Sophia Hall', 'sophia@example.com', '9998887775', 'Hyderabad'),
('Liam Young', 'liam@example.com', '9998887776', 'Kolkata'),
('Olivia King', 'olivia@example.com', '9998887777', 'Jaipur'),
('Noah Wright', 'noah@example.com', '9998887778', 'Ahmedabad'),
('Ava Lopez', 'ava@example.com', '9998887779', 'Surat'),
('William Allen', 'william@example.com', '9998887780', 'Nagpur'),
('Isabella Scott', 'isabella@example.com', '9998887781', 'Indore'),
('James Harris', 'james@example.com', '9998887782', 'Lucknow'),
('Mia Turner', 'mia@example.com', '9998887783', 'Patna'),
('Benjamin Baker', 'benjamin@example.com', '9998887784', 'Bhopal'),
('Charlotte Hill', 'charlotte@example.com', '9998887785', 'Kanpur'),
('Lucas Nelson', 'lucas@example.com', '9998887786', 'Agra'),
('Amelia Carter', 'amelia@example.com', '9998887787', 'Varanasi'),
('Henry Mitchell', 'henry@example.com', '9998887788', 'Rajkot'),
('Evelyn Perez', 'evelyn@example.com', '9998887789', 'Thane'),
('saleel', 'saleel@gmail.com', '9850884228', 'Baroda'),
('sharmin', 'sharmin@gmail.com', '9865778776', 'Pune');


INSERT INTO Service (ServiceName, Description) VALUES
('Room Cleaning', 'Daily cleaning service'),
('Room Booking', 'Reservation of rooms'),
('Food Delivery', 'Deliver food to rooms'),
('Laundry', 'Washing and ironing clothes'),
('Spa', 'Relaxation and wellness services');


INSERT INTO Role_Service (RoleID, serviceTypeID, Remarks) VALUES
(1, 2, 'Receptionist handles bookings'),
(2, 1, 'Housekeeping does room cleaning'),
(4, 3, 'Chef manages food delivery'),
(2, 4, 'Housekeeping manages laundry'),
(3, 5, 'Manager oversees spa services');


INSERT INTO RoomType (type_name, price_per_night) VALUES
('Standard', 2000.00),
('Deluxe', 3500.00),
('Suite', 5000.00);


INSERT INTO rooms (room_id, room_number, room_type_id, floor, status) VALUES
(1, '101', 1, 1, 'Available'),
(2, '102', 2, 1, 'Occupied'),
(3, '103', 3, 1, 'Cleaning'),
(4, '104', 1, 1, 'Available'),
(5, '105', 2, 1, 'Maintenance'),

(6, '201', 1, 2, 'Available'),
(7, '202', 2, 2, 'Occupied'),
(8, '203', 3, 2, 'Available'),
(9, '204', 1, 2, 'Cleaning'),
(10,'205', 2, 2, 'Available'),

(11,'301', 3, 3, 'Occupied'),
(12,'302', 1, 3, 'Available'),
(13,'303', 2, 3, 'Maintenance'),
(14,'304', 1, 3, 'Available'),
(15,'305', 3, 3, 'Occupied'),

(16,'401', 2, 4, 'Available'),
(17,'402', 1, 4, 'Cleaning'),
(18,'403', 3, 4, 'Available'),
(19,'404', 2, 4, 'Occupied'),
(20,'405', 1, 4, 'Available'), 
(21,'406', 3, 2, 'Maintenance'), 
(22,'407', 3, 1, 'Available'), 
(23,'408', 3, 3, 'Available');


INSERT INTO bookings(booking_id, customer_id, room_id, staff_id, check_in_date, check_out_date, booking_status) VALUES
(1, 1, 1, 1, '2025-01-05', '2025-01-08', 'Checked-Out'),
(2, 2, 2, 2, '2025-01-10', '2025-01-15', 'Checked-Out'),
(3, 3, 3, 3, '2025-01-12', '2025-01-14', 'Cancelled'),
(4, 4, 4, 4, '2025-01-15', '2025-01-20', 'Checked-Out'),
(5, 5, 5, 3, '2025-01-18', '2025-01-22', 'Checked-Out'),

(6, 6, 6, 5, '2025-02-01', '2025-02-05', 'Checked-Out'),
(7, 7, 7, 6, '2025-02-03', '2025-02-06', 'Cancelled'),
(8, 8, 8, 4, '2025-02-05', '2025-02-08', 'Checked-Out'),
(9, 9, 9, 1, '2025-02-07', '2025-02-10', 'Checked-Out'),
(10,10, 10,2, '2025-02-10', '2025-02-14', 'Checked-In'),

(11,11, 11,5, '2025-02-12', '2025-02-16', 'Booked'),
(12,12, 12,6, '2025-02-15', '2025-02-20', 'Booked'),
(13,13, 13,7, '2025-02-18', '2025-02-22', 'Checked-In'),
(14,14, 14,5, '2025-02-20', '2025-02-24', 'Cancelled'),
(15,15, 15,4, '2025-02-22', '2025-02-25', 'Checked-In'),

(16,16, 16,5, '2025-03-01', '2025-03-05', 'Checked-In'),
(17,17, 17,1, '2025-03-02', '2025-03-06', 'Booked'),
(18,18, 18,2, '2025-03-03', '2025-03-07', 'Cancelled'),
(19,19, 19,1, '2025-03-05', '2025-03-09', 'Booked'),
(20,20, 20,2, '2025-03-07', '2025-03-12', 'Checked-In'),

(21,1, 1, 3, '2025-03-10', '2025-03-15', 'Booked'),
(22,12, 2, 5, '2025-03-12', '2025-03-18', 'Checked-In'),
(23,14, 3, 7, '2025-03-15', '2025-03-19', 'Booked'),
(24,17, 4, 8, '2025-03-16', '2025-03-20', 'Checked-Out'),
(25,19, 5, 8, '2025-03-18', '2025-03-22', 'Booked'),
(26, 6, 2, 6, '2025-03-25',	'2025-03-27', 'Checked-In'),
(27, 7, 1, 7, '2025-03-25',	'2025-03-29', 'Checked-In'),
(28, 15, 11, 4, '2025-03-26', '2025-03-30','Checked-Out');


INSERT INTO Payment (booking_id, amount, payment_date, payment_method, paid) VALUES
(1, 8000, '2025-09-05 10:00:00', 'Card', 8000),
(2, 14000, '2025-09-06 12:00:00', 'UPI', 6500),
(4, 6000, '2025-09-07 09:30:00', 'Cash', 4500),
(5, 10500, '2025-09-08 15:00:00', 'Online', 10000),
(7, 4000, '2025-09-09 11:00:00', 'UPI', 4000),
(8, 10500, '2025-09-10 14:00:00', 'Card', 10500),
(10, 6000, '2025-09-11 18:00:00', 'Cash', 4500);


INSERT INTO Customer_Service (customer_id, serviceTypeID, request_date, remarks) VALUES
(1, 1, '2025-09-01 09:00:00', 'Requested room cleaning'),
(2, 3, '2025-09-02 13:00:00', 'Ordered lunch'),
(3, 4, '2025-09-03 10:30:00', 'Laundry service required'),
(4, 5, '2025-09-04 17:00:00', 'Spa appointment'),
(5, 2, '2025-09-05 08:00:00', 'Booking assistance needed'),
(6, 1, '2025-09-06 09:30:00', 'Cleaning before checkout'),
(7, 3, '2025-09-07 20:00:00', 'Ordered dinner'),
(8, 4, '2025-09-08 11:00:00', 'Laundry requested'),
(9, 5, '2025-09-09 15:30:00', 'Spa relaxation session'),
(10, 2, '2025-09-10 12:00:00', 'Asked about room availability');
