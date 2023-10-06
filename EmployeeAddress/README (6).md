
# Employee and Address Management System

This is a simple Spring Boot application that manages employee and address information. It provides CRUD (Create, Read, Update, Delete) operations for employees and addresses using RESTful endpoints.

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

The  Employee and Address Management System
  simplifies the creating  a User and product  profile by providing a set of APIs to create, get ,update, and delete User information of .

## Dependency
- MySql
- Swagger 
- spring data JPA
- Spring web 
- Lombok
- validation
## Features
### Entity Models
- Define the following entity models to     represent your data:

- Employee (OneTone mappting with address)

- Address

 Used one to one relationship beetween order and address, user, product .

## API Endpoints
The API provides endpoints for various actions, including:

- Creating users, products, addresses, and orders.
- Retrieving users, products, and orders.
- Filtering products by category.
- Deleting products by ID.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed.
- Mavan jar depandancy file created by spring initializr .
- Your favorite Integrated Development Environment (IDE) for Java (e.g., IntelliJ IDEA, Eclipse).
- A REST client (e.g., Postman, cURL) for testing API endpoints.

## Getting Started

Follow these steps to set up and run the  Employee and Address Management System
 :

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
### Employee Controller
- post Employee entity 

URL: /Employee
Method: POST
Example: http://localhost:8080/Employee
date are in json format .

- Get Employee :

URL: /Employee
Method: GET
Example: http://localhost:8080/Employee
-Get find By empid  

URL: /FindById
Method: GET
Example: http://localhost:8080/UdtatingDetalies

-  Delete Employee by id

URL: /RemoveTheEmp
Method: GET
Example: http://localhost:8080/RemoveTheEmp


- Put find By empid  
URL: /UdtatingDetalies
Example: http://localhost:8080/UdtatingDetalies




### Address controller
- post Address entity 

URL: /Address
Method: POST
Example: http://localhost:8080/Address
date are in json format .

- Get Employee :

URL: /Address 
Method: GET
Example: http://localhost:8080/Address

URL: /FindById
Method: GET find address by id 
Example: http://localhost:8080/FindAddressById

-  Delete Employee by id

URL: /RemoveTheAddress
Method: GET
Example: http://localhost:8080/RemoveTheEmp


- Put find updateing state name  
URL: /UdtatingDetalies
Example: http://localhost:8080/UpdatinDetelies

# Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve this project.
