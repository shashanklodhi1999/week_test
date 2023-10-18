
# User Management System :


The user  Management System is a Spring Boot application that allows you to manage a list of user with the help of List . It provides API endpoints for basic operations like creating, retrieving, updating, and deleting user.

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
- maven 
- validation
## Features
- Used List to storing the data .

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



- Get All User :

URL: /users
Method: GET
Example: http://localhost:8080/users

-  Add a new User:

URL: /users
Method: POST
Example: http://localhost:8080/users
Request Body: JSON representing the User details.

- Delete the User by id :
Url: /deleteUser/{id}
Method:Delete
Example : http://localhost:8080/deleteUser/100

- Update the user password:
Url:/user/password
Method: Post
PathVariable  is define as id and usermail 
Example : http://localhost:8080/user/password
data is sending in json format.

# Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve this project.