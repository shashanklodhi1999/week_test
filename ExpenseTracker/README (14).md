
# ExpenseTracker:
## Overview

This project provides a basic design for the backend of ExpenseTracker App . It includes the following features:

- user  authentication (sign up, sign in ,sing out)
- user profile management (update Patient details)
- user can add expencive .

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

The ExpenseTracker  App simplifies the creating a user  or sing up the user then he will be able to add their expense or delte the expense .

## Dependency
- Spring web 
- Lombok
- validation
- spring JPA
- Swagger 
- MySql drivers 
## Features
- user sing up with encrypting password .
- user sing in with Authenticate receive a token.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed.
- Mavan jar depandancy file created by spring initializr .
- Your favorite Integrated Development Environment (IDE) for Java (e.g., IntelliJ IDEA, Eclipse).
- A REST client (e.g., Postman, cURL) for testing API endpoints.

## Getting Started

Follow these steps to set up and run the  ExpenseTracker App:

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

### User
  controller 

- Post :- sing up
  URL: /usersignup 

- Post :- sing in
  URL: /usersignIn

- Delete :- sing out
  URL: /user/signOut

 - Post :- add expense 
   URL: /Expense

 - Delete :- delte expenses
   URL: /DeleteExpenseByID
 - Get :- get all expense
   URL :- /Expense
 - Update :-update price by id 
   URL :-/UpdateExpancePriceByid





# Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve this project.