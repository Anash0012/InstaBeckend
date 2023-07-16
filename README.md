
# *InstaBackend Basic*

This project is a basic web application that allows users to sign in, sign up, and manage their profile information. Additionally, users can create posts and view posts created by other users. The ap



## Technologies Used

- Spring Boot
- MySQL
- Java Persistence API (JPA)
- Swagger UI

## Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:

spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/<DatabaseName>
spring.datasource.username = <userName>
spring.datasource.password = <password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

## API End Points

The following endpoints are available in the API:

* User Controller:
```
POST /user/signup: create a new user account
POST /user/signin: authenticate a user and receive an authentication token
PUT /user: update user details
DELETE /user/signout: authenticate a user and delete authentication token
```

* Post Controller
```
POST /post: create a new post
GET /post: get all posts
```

## DataBase Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```

## Security

Authentication is implemented using an Authentication Token class. This token is generated upon successful sign-in and must be included in the headers of subsequent requests to authorized endpoints.

## Encryption

Sensitive user data, such as passwords, is encrypted using the MD5 hashing algorithm.

## Project Summary

The project is a basic web application built using Java and the Spring framework. It allows users to sign up, sign in, and manage their profile information. Users can also create and view posts. The application uses authentication tokens to secure user data and ensure that only authenticated users can access certain features. The API endpoints include user signup, signin, and update details, post creation and retrieval, and authentication token creation. 

