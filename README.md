# CS421-Assignment

## Overview
This project is a REST API built using Spring Boot and MySQL for managing students and subjects related to the Software Engineering program. The API provides endpoints to retrieve a list of students and subjects categorized by academic year.

## Prerequisites
- Java 17 or later
- Spring Boot
- Maven
- MySQL Database (AWS or Local)
- Postman or CURL (for testing API requests)

### 1. Clone the Repository
git clone https://github.com/FazilFizzo-chaos/CS421-Assignment
cd CS421-Assignment

### 2. Configure Database
Edit `application.properties` on file path src/main/resources/application.properties to set up MySQL connection:


### 3. Build and Run the Application
mvn clean install
mvn spring-boot:run

## API Endpoints
### 1. Get List of Students
Endpoint:`GET /students`

Response:
json
[
    {"id": 1, "name": "Alice", "enrolledProgram": "Software Engineering"},
    {"id": 2, "name": "Bob", "enrolledProgram": "Software Engineering"},
    ...
]


### 2. Get Subjects by Academic Year
Endpoint:`GET /subjects`

Response
json
{
    "1": [
        {"id": 1, "name": "Introduction to Programming", "academicYear": 1},
        {"id": 2, "name": "Data Structures", "academicYear": 1}
    ],
    "2": [
        {"id": 3, "name": "Algorithms", "academicYear": 2},
        {"id": 4, "name": "Databases", "academicYear": 2}
    ]
}

## Adding Test Data
### Option 1: Manually Insert Data into MySQL

INSERT INTO student (name, enrolled_program) VALUES ('Alice', 'Software Engineering');
INSERT INTO subject (name, academic_year) VALUES ('Introduction to Programming', 1);


### Option 2: Use API to Add Data
i created data.sql on src/main/resources/data.sql for initial test data

## Running Tests
You can use Postman or CURL to test the API.

## Deployment
To deploy on AWS:
1. Package the app:
mvn package


