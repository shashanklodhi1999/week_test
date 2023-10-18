
# Hotel management system  :

## Overview

This project provides a basic design for the backend of Hotel management. It includes the following features:

- book the room with the some service . 
- User profile management (update room  details)
- Post management (save and retrieve posts)

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

The Hotel backend application  simplifies the creating a bookig a room  in hotel .and give specification of room service. 

## Dependency
- Spring web 
- Lombok
- validation
- spring JPA
- Swagger 
- H2 database  
-
## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed.
- Mavan jar depandancy file created by spring initializr .
- Your favorite Integrated Development Environment (IDE) for Java (e.g., IntelliJ IDEA, Eclipse).
- A REST client (e.g., Postman, cURL) for testing API endpoints.

## Getting Started

Follow these steps to set up and run the  Hotel management system :

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

### Room Controller

- Post :- Book room 
  URL: /room 

- Post :- Book no of room 
  URL: /rooms

- Get :- Get all rooms
  URL: /rooms

- Get : get room by id 
  URL: /rooms/id/{id}  

- Get : get get room by price 
  URL: /rooms/price/{price}  

 - Get : get get available room 
  URL: /rooms/price/{price}/and/availablest 

 - Get : get get ac room  
  URL: /rooms/AC/or/availablet  

- Delete : Delete room by its id   
  URL: /rooms/ids
  

# Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve this project.