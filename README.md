# RentACar Application

## Overview

This Java Spring Boot application manages a car rental system, providing RESTful APIs for CRUD operations on brands, models, and customers. It uses Spring Data JPA for data persistence and Jakarta Bean Validation for validation. The application includes exception handling for business-specific errors.

## Table of Contents

- [Brand Service](#brand-service)
- [Customer Service](#customer-service)
- [Model Service](#model-service)
- [Brand Manager](#brand-manager)
- [Customer Manager](#customer-manager)
- [Model Manager](#model-manager)
- [Request and Response Classes](#request-and-response-classes)
- [Exception Handling](#exception-handling)
- [Controllers](#controllers)
- [How to Run](#how-to-run)
- [Dependencies](#dependencies)
- [Contributing](#contributing)

## Brand Service

The `BrandService` interface defines operations for brands, including retrieving all, getting by ID, adding, updating, and deleting brands.

## Customer Service

The `CustomerService` interface defines operations for customers, including retrieving all and adding new customers.

## Model Service

The `ModelService` interface defines operations for models, including retrieving all and adding new models.

## Brand Manager

The `BrandManager` class implements `BrandService`, providing logic for brand operations. Brand-specific rules are in `BrandBusinessRules`.

## Customer Manager

The `CustomerManager` class implements `CustomerService`, providing logic for customer operations. Customer-specific rules are in `CustomerBusinessRules`.

## Model Manager

The `ModelManager` class implements `ModelService`, providing logic for model operations.

## Request and Response Classes

Various classes define data structures for communication between client and server.

## Exception Handling

The `GlobalExceptionHandler` class handles business exceptions and validation errors, returning detailed responses.

## Controllers

### Brands Controller

Handles HTTP requests related to brands: retrieving all, getting by ID, adding, updating, and deleting.

### Customers Controller

Handles HTTP requests related to customers: retrieving all and adding new customers.

### Models Controller

Handles HTTP requests related to models: retrieving all and adding new models.

## How to Run

Run the application using the `main` method in `RentACarApplication`. Ensure dependencies and a compatible Java runtime are installed.

### Dependencies
- Spring Boot
- Spring Data JPA
- Jakarta Bean Validation
- ModelMapper

### Contributing
Feel free to contribute by submitting issues or pull requests. Your feedback and contributions are highly appreciated!
