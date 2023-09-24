
# JOB PORTAL  :
### Using validation and H2 Database

The JOB  PORTAL  is a Spring Boot application that allows you to manage a list of JOB profile  with the help of SQL Queey  . It provides API endpoints for basic operations like creating, retrieving, updating, and deleting restaurants.

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

The Job profile  simplifies the creating  a employee profile by providing a set of APIs to create, get ,update, and delete User information.

## Dependency
- H2 Database 
- Swagger 
- spring data JPA
- Spring web 
- Lombok
- validation
## Features
- we are using swagger to call the Api.
-  used validatation in user id,name,DOB,etc .

- Create and manage user records.
- Retrieve user details by ID or get a list of all Emp.
- Update a job  entity by it'is id  .
- Delete a profile .
- post the profile.


## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed.
- Mavan jar depandancy file created by spring initializr .
- Your favorite Integrated Development Environment (IDE) for Java (e.g., IntelliJ IDEA, Eclipse).
- A REST client (e.g., Postman, cURL) for testing API endpoints.

## Getting Started

Follow these steps to set up and run the  JOB PORTAL:

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

- Get a Job by ID:

URL: /GetEmpByID/{id}
Method: GET
Example: http://localhost:8080/GetEmpByID/100

- Get All Job :

URL: /GetAllEmpProfile
Method: GET
Example: http://localhost:8080/GetAllEmpProfile

-  Add a new JOB profile :

URL: /addingJobProfile
Method: POST
Example: http://localhost:8080/addingJobProfile
Request Body: JSON representing the User details.

URL: /addingMultipleEmp
Method: POST
Example: http://localhost:8080/addingMultipleEmp
Request Body: JSON representing the User details.


- Delete the JOB by id :
Url: /DeleteEmpById/{id}
Method:Delete
Example : http://localhost:8080/DeleteEmpById/100

- Delete the JOB by empolyee name :
Url: /DeleteEpmByJobType/{name}
Method:Delete
Example : http://localhost:8080/DeleteEpmByJobType/{name}

- Update Emp Salary By Idr:
Url:/UpdateEmpSalaryById
Method: Post
Request Body  is define.

- UpdateSalary By Location 
Url:/UpdateSalaryByLocationBPS/{location}
Method: Post
PathVariable  is define.

# Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve this project.
