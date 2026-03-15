Spring MVC User Authentication

A simple User Authentication Web Application built using Spring MVC, JDBC, and MySQL following the MVC Design Pattern. This project demonstrates basic authentication features such as User Registration, Login, and Logout.

🚀 Features

User Registration

User Login Authentication

User Logout

Session Management

MVC Architecture

Database Integration using JDBC

🛠 Technologies Used

Java

Spring MVC

JDBC

MySQL

JSP

Servlet

Maven

Apache Tomcat

📂 Project Structure src ├── controller │ └── UserController.java ├── dao │ └── UserDao.java ├── model │ └── User.java ├── service │ └── UserService.java └── view ├── login.jsp ├── register.jsp └── home.jsp ⚙️ Setup Instructions

Import the project into Eclipse / IntelliJ IDEA as a Maven project.

Configure the MySQL database.

Example database table:

CREATE TABLE users ( id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100), email VARCHAR(100), password VARCHAR(100) );

Update database credentials in the configuration file.

Run the project on Apache Tomcat Server.

🎯 Purpose of the Project

This project was created to practice:

Spring MVC framework

JDBC database connectivity

MVC design pattern

Web authentication flow
