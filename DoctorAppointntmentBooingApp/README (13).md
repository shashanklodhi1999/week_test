
# Doctor Appointment Booking App  :

## Overview

This project provides a basic design for the backend of Doctor Appointment Booking App . It includes the following features:

- Patient authentication (sign up, sign in ,sing out)
- Patient profile management (update Patient details)
- Doctor Appointment management (book Appointment cancle Appointment)

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

The Doctor Appointment Booking App simplifies the creating a Patient or sing up the Patient then he will be able to book Appointment or cancle or schedule the Appointment , Doctor can also create their account in this app.

## Dependency
- Spring web 
- Lombok
- validation
- spring JPA
- Swagger 
- MySql drivers 
## Features
- Patient sing up with encrypting password .
- Patient sing in with Authenticate receive a token.
- Admin can  only get all the user all Doctor details .

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed.
- Mavan jar depandancy file created by spring initializr .
- Your favorite Integrated Development Environment (IDE) for Java (e.g., IntelliJ IDEA, Eclipse).
- A REST client (e.g., Postman, cURL) for testing API endpoints.

## Getting Started

Follow these steps to set up and run the  Doctor Appointment Booking App:

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

### Patient  controller 

- Post :- sing up
  URL: /patient/signup 

- Post :- sing in
  URL: /patient/signIn

- Delete :- sing out
  URL: /patient/signOut

 - Post :- Book Appointment 
  URL: /patient/appointment/schedule

 - Delete :- cancle Appointment
  URL: /patient/appointment/{appointmentId}/cancel

- Get :- get Doctor qualification by its specialization
   URL :/doctors/qualification/{qual}/or/specialization/{spec}
### Doctor  controller 
- GET :- get all doctors
  URL: /doctors

- Get : get doctor by id
  URL: /doctor/{id}

### Admin  controller 
- GET :- get all patients
  URL: /patients

- Post : created doctor profile
  URL: /doctor

 - GET : find patient by it blood groups
   URL: /patients/bloodGroup/{bloodGroup}

# Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve this project.