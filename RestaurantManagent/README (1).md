
# Restaurant Management System

The Restaurant Management System is a Spring Boot application that allows you to manage a list of restaurants. It provides API endpoints for basic operations like creating, retrieving, updating, and deleting restaurants.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [Installation](#installation)
- [Usage](#usage)
  - [API Endpoints](#api-endpoints)
- [Contributing](#contributing)


## Introduction

The Restaurant Management System simplifies the management of restaurants by providing a set of APIs to create, get ,update, and delete restaurant information.

## Features

- Create and manage restaurant records.
- Retrieve restaurant details by ID or get a list of all restaurants.
- Update a restaurant entity by it'is id  .
- Delete a restaurant .
- post the restaurant.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed.
- Mavan jar depandancy file created by spring initializr .
- Your favorite Integrated Development Environment (IDE) for Java (e.g., IntelliJ IDEA, Eclipse).
- A REST client (e.g., Postman, cURL) for testing API endpoints.

## Getting Started

Follow these steps to set up and run the Restaurant Management System:

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

- Get a restaurant by ID:

URL: /GetBYId/{id}
Method: GET
Example: http://localhost:8080/GetBYId/10

- Get a list of all restaurants:

URL: /restgetAllRestaurantaurants
Method: GET
Example: http://localhost:8080/getAllRestaurant

-  Add a new restaurant:

URL: /PostRestaurantDetails
Method: POST
Example: http://localhost:8080/PostRestaurantDetails
Request Body: JSON representing the restaurant details.

- Delete the resturent by id :
Url: /DeleteRestaurantById/{id}
Method:Delete
Example : http://localhost:8080/DeleteRestaurantById/10

- Update the restaurant:
Url:/UpdateDish/{id}
Method: Post
RequestParam is define in key and value
Example : http://localhost:8080/UpdateDish/10

# Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve this project.






