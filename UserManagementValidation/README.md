
# User Management System :
### Using validation 

The user  Management System is a Spring Boot application that allows you to manage a list of user with the help of hashmap . It provides API endpoints for basic operations like creating, retrieving, updating, and deleting restaurants.

## Table of Contents

- [Introduction](#introduction)
- [dependency](#dependency)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [Installation](#installation)
- [Usage](#usage)
  - [API Endpoints](#api-endpoints)
- [Contributing](#contributing)


## Introduction

The User  Management System simplifies the management of User by providing a set of APIs to create, get ,update, and delete User information.

## Dependency
- Spring web 
- Lombok
- validation
## Features
-  used validatation in user id,name,DOB,etc .
- Used hashmap to storing the data .

- Create and manage user records.
- Retrieve user details by ID or get a list of all User.
- Update a user entity by it'is id  .
- Delete a user .
- post the user.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed.
- Mavan jar depandancy file created by spring initializr .
- Your favorite Integrated Development Environment (IDE) for Java (e.g., IntelliJ IDEA, Eclipse).
- A REST client (e.g., Postman, cURL) for testing API endpoints.

## Getting Started

Follow these steps to set up and run the  User Management System:

### Installation

1. Clone the repository to your local machine:

   ```shell
   git clone https://github.com/shashanklodhi1999/week_test.git
Open the project in your preferred IDE.

Run the Spring Boot application.

Using Maven:

shell
Copy code
mvn spring-boot:run
The application will start on http://localhost:8080.

 ## The following API endpoints are available:

- Get a user by ID:

URL: /getUserById/{id}
Method: GET
Example: http://localhost:8080/GetBYId/101

- Get All User :

URL: /GetAllUser
Method: GET
Example: http://localhost:8080/GetAllUser

-  Add a new User:

URL: /AddingUser
Method: POST
Example: http://localhost:8080/AddingUser
Request Body: JSON representing the User details.

- Delete the User by id :
Url: /deleteUser/{id}
Method:Delete
Example : http://localhost:8080/deleteUser/100

- Update the user:
Url:/updateById/{id}/userMail/{userMail}
Method: Post
PathVariable  is define as id and usermail 
Example : http://localhost:8080/updateById/100/userMail/user@gmail.com

# Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve this project.






