
#  Ecommerce
### using MySql Database 

The  Ecommerce project is a Spring Boot application designed to manage student information and university events. It provides a RESTful API for adding, updating, deleting, and retrieving students and events. The application uses an MYSQL  database to store data.

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

The  Ecommerce profile  simplifies the creating  a User and product  profile by providing a set of APIs to create, get ,update, and delete User information of .

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

- User
- Product
- Address
- Order

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

Follow these steps to set up and run the  Ecommerce applciation :

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
### User Controller
- post user entity 

URL: /UserCreated
Method: POST
Example: http://localhost:8080/UserCreated
date are in json format .

- Get Get User By ID :

URL: /GetUserByID
Method: GET
Example: http://localhost:8080/GetUserByID
### Address controller
- post Address

URL: /CreatedAddress
Method: POST
Example: http://localhost:8080/CreatedAddress
date are in json format .
### product controller 
- Create product 
URL: /Create product
Method: POST
Example: http://localhost:8080/Create product
date are in json format .
- Get Product By Id
Method :Get
URL: / GetProductById 
Example: http://localhost:8080/GetProductById 
- Delet product by  id
Method: - Delete
http://localhost:8080/DeleteProductById
Request parms is define for id .
### order controller 
- place a order 
URL: /CreatedOrder
Method: POST
Example: http://localhost:8080/CreatedOrder
date are in json format .
 - find the order by id,
 
 URL: / GetOrderBYid 
Example: http://localhost:8080/GetOrderBYid








# Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve this project.
