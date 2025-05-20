# CRUD Operations using Spring Boot

This project demonstrates how to perform basic **CRUD (Create, Read, Update, Delete)** operations using **Spring Boot** and **Spring Data JPA**. It is designed as a beginner-friendly backend project to understand how REST APIs interact with a database.

---

## 🧰 Technologies Used

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **H2 / MySQL / PostgreSQL (choose one)**
- **Maven**
- **Lombok (for cleaner code)**
- **Postman (for API testing)**

---

## 📁 Project Structure

src
├── main
│ ├── java
│ │ └── com.crud.springboot_crud
│ │ ├── controller
│ │ ├── service
│ │ ├── repository
│ │ ├── entity
│ │ └── CrudApplication.java
│ └── resources
│ ├── application.properties

## Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/your-username/springboot-crud.git
cd springboot-crud

### 2.Open in your IDE (IntelliJ, Eclipse, VS Code)

### 3.Configure the database

spring.application.name=Springboot_Crud

spring.datasource.url=jdbc:mysql://localhost:3306/batch197
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver


spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

#spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql :true

Sample JSON Payload

Create Employee

json
{
  "name": "Anurag",
  "email": "anurag@gmail.com",
  "position": "Software Engineer"
}
