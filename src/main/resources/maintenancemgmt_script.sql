-- Create the database
DROP DATABASE IF EXISTS maintenancemgmtdb;

CREATE DATABASE maintenancemgmtdb;

USE maintenancemgmtdb;

CREATE TABLE staff (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  email VARCHAR(100) UNIQUE NOT NULL,
  phone VARCHAR(20),
  expertise VARCHAR(100),
  role VARCHAR(50) NOT NULL
);

CREATE TABLE buildings (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);

CREATE TABLE wings (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  building_id INT,
  FOREIGN KEY (building_id) REFERENCES buildings(id)
);

CREATE TABLE floors (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  wing_id INT,
  FOREIGN KEY (wing_id) REFERENCES wings(id)
);

CREATE TABLE rooms (
  id INT AUTO_INCREMENT PRIMARY KEY,
  number VARCHAR(10) NOT NULL,
  floor_id INT,
  FOREIGN KEY (floor_id) REFERENCES floors(id)
);

CREATE TABLE maintenance (
  id INT AUTO_INCREMENT PRIMARY KEY,
  description VARCHAR(255) NOT NULL,
  type VARCHAR(50) NOT NULL,  -- Consolidated maintenance types
  sub_type VARCHAR(50) NOT NULL,
  status VARCHAR(20) NOT NULL DEFAULT 'Open',
  priority VARCHAR(10) NOT NULL,
  room_id INT NOT NULL,
  assigned_staff_id INT,
  last_maintenance_date DATE,  -- Added for all maintenance types
  FOREIGN KEY (room_id) REFERENCES rooms(id),
  FOREIGN KEY (assigned_staff_id) REFERENCES staff(id)
);

-- Add additional fields as needed: costs, scheduled dates, equipment, vendors

CREATE TABLE work_orders (
  id INT AUTO_INCREMENT PRIMARY KEY,
  maintenance_id INT,
  description VARCHAR(255) NOT NULL,
  FOREIGN KEY (maintenance_id) REFERENCES maintenance(id)
);

CREATE TABLE maintenance_progress (
  id INT AUTO_INCREMENT PRIMARY KEY,
  work_order_id INT,
  started_at DATETIME,
  in_process_at DATETIME,
  completed_at DATETIME,
  description TEXT,
  replaced_materials TEXT,
  FOREIGN KEY (work_order_id) REFERENCES work_orders(id)
);

INSERT INTO staff (name, email, role) VALUES ('John Smith', 'john.smith@example.com', 'Electrician');
INSERT INTO buildings (name) VALUES ('Main Building');
INSERT INTO wings (name, building_id) VALUES ('West Wing', 1);
INSERT INTO floors (name, wing_id) VALUES ('Third Floor', 1);
INSERT INTO rooms (number, floor_id) VALUES ('301', 1);
INSERT INTO maintenance (description, type, sub_type, priority, room_id) VALUES ('Leaky faucet', 'Plumbing', 'Fixture', 'High', 1);
INSERT INTO work_orders (maintenance_id, description) VALUES
  (1, 'Replace broken light fixture in room 205');
  