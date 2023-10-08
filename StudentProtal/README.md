
# Student Portal Project

This project is a Student Portal that manages student records, laptops, courses, books, and addresses. It handles one-to-one, one-to-many, many-to-one, and many-to-many relationships between these entities.


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

The  Student Portal
  simplifies the creating  a student and course  by providing a set of APIs to create, get ,update, and delete User information of .

## Usage 
- The application provides RESTful API endpoints to manage student records, laptops, courses, books, and addresses.
- Use your preferred API client (e.g., swagger) or integrate with a frontend application to interact with the portal.
## Dependency
- MySql
- Swagger 
- spring data JPA
- Spring web 
- Lombok
- validation
## Features
### Entity Models
 Define the following entity models to     represent your data:

- Student (one to one mapping with address and one to many with course).
- laptops(one to one mapping with student).
- course (many to many mappinig with student),
- Books (many to one mapping with student).

## API Endpoints
The API provides endpoints for various actions, including:

- Creating student, laptops, addresses,books and course.
- Retrieving , student, laptops, addresses,books and course.
- Filtering student, laptops, addresses,books and course by its id .
- Deleting  by ID.

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
 
 ### Students:

- GET /students: Get a list of all students.
- GET /students/{studentId}: Get details of a specific student.
- POST /students: Create a new student.
- PUT /students/{studentId}: Update an existing student number.
- DELETE /students/{studentId}: Delete a student.
### Laptops:

- GET /laptops: Get a list of all laptops.
- GET /laptops/{laptopId}: Get details of a specific laptop.
- POST /laptops: Create a new laptop.
- PUT /laptops/{laptopId}: Update an existing laptop price.
- DELETE /laptops/{laptopId}: Delete a laptop.
### Courses:

- GET /courses: Get a list of all courses.
- GET /courses/{courseId}: Get details of a specific course.
- POST /courses: Create a new course.
- PUT /courses/{courseId}: Update an existing course duration .
- DELETE /courses/{courseId}: Delete a course.
### Books:

- GET /books: Get a list of all books.
- GET /books/{bookId}: Get details of a specific book.
- POST /books: Create a new book.
- PUT /books/{bookId}: Update an existing book.
- DELETE /books/{bookId}: Delete a book price.
### Addresses:

- GET /addresses: Get a list of all addresses.
- GET /addresses/{addressId}: Get details of a specific address.
- POST /addresses: Create a new address.
- PUT /addresses/{addressId}: Update an existing address.
- DELETE /addresses/{addressId}: Delete an address.

# Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve this project.
