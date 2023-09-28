
# University Event Management
### Using validation and H2 Database

The University Event Management project is a Spring Boot application designed to manage student information and university events. It provides a RESTful API for adding, updating, deleting, and retrieving students and events. The application uses an H2 in-memory database to store data.

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
### Student Management:

- Add a new student.
- Update a student's department.
- Delete a student.
- Get a list of all students.
- Get a student by their ID.
### Event Management:

- Add a new event.
- Update event details.
- Delete an event.
- Get a list of events by date.
### Validation Constraints:

- Age validation (between 18 - 25).
- First name validation (first letter should be capitalized).
- Department validation (enum: ME, ECE, CIVIL, CSE).


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
### EVENT CONTORLLER
- Get All Event:

URL: /GetAllEvents
Method: GET
Example: http://localhost:8080/GetAllEvents

- Get Event By date :

URL: /FindEventByDate
Method: GET
Example: http://localhost:8080/FindEventByDate
 data is given in request body

-  Add Event :

URL: /AddEvent
Method: POST
Example: http://localhost:8080/AddEvent
Request Body: JSON representing the date 
- Add no of Event
URL: /AddNoOfEvent
Method: POST
Example: http://localhost:8080/AddNoOfEvent
Request Body: JSON representing the data


- Delete the Event by id :
Url: /DeleteEventBYId 
Request param  is define.
Method:Delete
Example : http://localhost:8080/DeleteEventBYId


- Update Event date by it's id :
Url:/UpdateEventDateById
Method: Put
Request param  is define.
### Student Contorller
- Get Student BY ID:

URL: /GetStudentBYID
Method: GET
Example: http://localhost:8080/GetStudentBYID

- Get All Student :

URL: /GetAllStudent
Method: GET
Example: http://localhost:8080/GetAllStudent

-  Add Single Student :

URL: /AddSingleStudent
Method: POST
Example: http://localhost:8080/AddSingleStudent
Request Body: JSON representing the date 

- Add List OF Student
URL: /AddListOFStudent
Method: POST
Example: http://localhost:8080/AddListOFStudent
Request Body is define 


- delete Student  By ID :
Url: /deleteByID 
Request param  is define.
Method:Delete
Example : http://localhost:8080/deleteByID


- Update Student Department By id  :
Url:/UpdateStudentDepartment/{id}
Method: put
Request path  is define.


# Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve this project.
