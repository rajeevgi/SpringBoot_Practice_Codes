# 🌟 Spring Boot Projects Overview

This repository contains multiple Spring Boot projects demonstrating login & registration systems, employee management, and session-based authentication using Spring MVC and Spring Data JPA.

---

## 📁 Projects

### 🔐 1. Login-And-Registration-Using-SpringJPA RestAPI

A basic login and registration system using Spring Boot, Spring Data JPA, and REST APIs.

**Features:**
- User Registration
- User Login
- Password encryption using BCrypt
- Validation and exception handling

**Technologies Used:**
- Spring Boot
- Spring Data JPA
- MySQL
- REST APIs

**How to Run:**
1. Clone the repository.
2. Update DB credentials in `application.properties`.
3. Run the project using your IDE or `mvn spring-boot:run`.
4. Test endpoints using Postman.

---

### 🔐 2. Session-based-login&register RestAPI

A session-based login and registration system with REST APIs using Spring Boot and HTTP session management.

**Features:**
- User Login and Logout with session handling
- User Registration
- REST APIs for authentication
- Session persistence

**Technologies Used:**
- Spring Boot
- Spring MVC
- Spring Session (HTTP)
- MySQL
- REST APIs

**How to Run:**
1. Clone the project.
2. Set DB credentials in `application.properties`.
3. Run using your IDE or `mvn spring-boot:run`.
4. Use Postman to test login/logout/session flow.

---

### 👨‍💼 3. Spring_MVC/employee_management_system_mvc

A CRUD-based employee management system using Spring MVC, JSP, and Spring Boot.

**Features:**
- Add, View, Update, Delete Employees
- MVC design pattern
- JSP-based frontend
- Basic validations

**Technologies Used:**
- Spring Boot
- Spring MVC
- Spring Data JPA
- JSP & JSTL
- MySQL

**How to Run:**
1. Clone the project.
2. Update MySQL configuration in `application.properties`.
3. Build and run the project using your IDE.
4. Access via browser at `http://localhost:8080/`.

---

### 📋 4. Employee_Management_System

A modern, REST API-based employee management system using Spring Boot and Spring Data JPA.

**Features:**
- RESTful CRUD operations for Employees
- Validation and Exception Handling
- DTO-based communication (if applicable)
- Separation of layers: Controller, Service, Repository

**Technologies Used:**
- Spring Boot
- Spring Data JPA
- MySQL
- REST APIs

**How to Run:**
1. Clone the repository.
2. Update `application.properties` with your DB config.
3. Run the application.
4. Use Postman to test CRUD endpoints (`/employees`).

--- 
---

### 📋 5. Library_Management_System RestAPI

A modern, REST API-based Library management system using Spring Boot and Spring Data JPA.

**Features:**
- RESTful CRUD operations for Library , Books, Authors
- One-to-many -> A Library can have multiple books.
- Many-to-many -> Books can be written by multiple Authors. 
- Validations using Spring validations
- Separation of layers: Controller, Service, Repository

**Technologies Used:**
- Spring Boot
- Spring Data JPA, Hibernate, Spring Validations
- MySQL
- REST APIs

**How to Run:**
1. Clone the repository.
2. Update `application.properties` with your DB config.
3. Run the application.
4. Use Postman to test CRUD endpoints (`/api`).

---

## ⚙️ Common Requirements

- Java 17+ (depending on your project setup)
- Maven
- MySQL Server
- IDE (IntelliJ, Eclipse, VS Code)

---

## 📌 Note

Make sure to create your MySQL database before running the application. The table structures will be auto-generated via JPA/Hibernate if configured properly.

---

## 🧑‍💻 Author

**Rajeev Gupta**

Feel free to fork, contribute, or reach out for improvements or queries.
