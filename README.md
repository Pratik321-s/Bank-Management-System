<!-- This project is a simple Bank Management System implemented in Java using Swing for the GUI and MySQL for database management.
Features

*User authentication (Login and Signup)
*Balance Enquiry
*Cash Withdrawal
*Fast Cash Withdrawal
*Deposit Money
*Change PIN
*Mini Statement

Prerequisites :

Before running the application, ensure you have the following installed:-

*Java Development Kit (JDK) 8 or later
*MySQL Database
*JDBC Driver for MySQL 

Installation and Setup

1. Clone the Repository

 git clone https://github.com/Pratik321-s/bank-management-system.git
 cd bank-management-system

2. Set Up the Database

Open MySQL and create a database named BankSystem:

CREATE DATABASE BankSystem;

Use the provided ConDB.java file to ensure the correct connection to the database.

Create necessary tables:

CREATE TABLE login (
    Card_Number VARCHAR(20),
    Pin VARCHAR(10)
);

CREATE TABLE bank (
    pin VARCHAR(10),
    date DATETIME,
    type VARCHAR(20),
    amount INT
);

3. Compile and Run the Project

javac *.java
java Login

Project Structure

├── BalanceEnquiry.java  # Balance checking functionality
├── ChangePin.java       # Allows users to change PIN
├── ConDB.java           # Database connection
├── Deposit.java         # Deposit funds
├── FastCash.java        # Quick withdrawal options
├── Login.java           # User authentication
├── Main.java            # Main menu for transactions
├── MiniStatement.java   # Recent transaction history
├── SignUp.java          # New user registration
├── SignUp2.java         # Additional registration details
└── README.md            # Project documentation

-->