# Enterprise CMS
A simple WebApp to manage users on different departments
![plot](./DB_RELATION.png)

# Setup
## Configuration
 Make sure to install Spring Boot, you can check it on the [`official documentation`](https://spring.io)
## Cloning repository to your machine
```
$ git clone https://github.com/Matt-Ferraz/springboot-first.git
```
## Running the app
```
$ mvn spring-boot:run
```
This command will install all dependencies from pom.xml and start the app on PORT 8080

## Database 
It is important that you have the database file in the /User/{username}/ (or change it on `application.properties`) with the name following the application.properties file. And run the following command to create the tables needed for the database.
```SQL
CREATE TABLE tb_user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    department_id INT,
    -- Add more columns as needed
);
CREATE TABLE tb_department (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    -- Add more columns as needed
);
```