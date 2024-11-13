# Clickbus 🚍

Clickbus is a demo project for Spring Boot that demonstrates the creation and management of places using a RESTful API. This project uses Spring Boot, Spring WebFlux, and R2DBC for reactive database access.

## Table of Contents 📑

- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Built With](#built-with)

## Getting Started 🚀

These instructions will help you set up and run the project on your local machine for development and testing purposes.

## Prerequisites 📋

- Java 23 or higher
- Maven 3.6.5 or higher
- Docker (optional, for running the database)

## Installation 💻

1. Clone the repository:

  ```sh
  git clone https://github.com/Josepch1/back-end-test-clickbus.git
  cd back-end-test-clickbus
  ```

2. Build the project using Maven:

  ```sh
  ./mvnw clean package
  ```

## Running the Application ▶️

1. Start the application:

  ```sh
  java -jar target/clickbus-0.0.1-SNAPSHOT.jar
  ```

2. The application will be available at `http://localhost:8080`.

## API Endpoints 🌐

### Create a Place 🏠

- **URL:** `/places`
- **Method:** `POST`
- **Request Body:**

  ```json
  {
    "name": "Place Name",
    "state": "State Name"
  }
  ```
  
- **Response:**

  ```json
  {
    "id": 1,
    "name": "Place Name",
    "slug": "place-name",
    "state": "State Name",
    "createdAt": "2023-10-01T12:00:00",
    "updatedAt": "2023-10-01T12:00:00"
  }
  ```

## Built With 🛠️

- [Spring Boot](https://spring.io/projects/spring-boot) - Framework for building Java applications
- [Spring WebFlux](https://spring.io/projects/spring-webflux) - Reactive programming support for web applications
- [R2DBC](https://r2dbc.io/) - Reactive Relational Database Connectivity
- [H2 Database](https://www.h2database.com/) - In-memory database for development and testing
