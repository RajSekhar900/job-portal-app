# Job Portal App

A full-stack **Job Portal Web Application** built using **Spring Boot**, **Thymeleaf**, and **MySQL** that allows users to browse job listings and enables admin to manage jobs securely.

## Features

### User Features
- View all available jobs
- Search jobs by keyword
- View job details
- Responsive UI for easy navigation

### Admin Features
- Secure admin login using Spring Security
- Add new job listings
- Update existing jobs
- Delete job listings
- Manage job data securely

## Technologies Used

### Backend
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Spring Security
- Spring Services

### Frontend
- Thymeleaf
- HTML
- CSS

### Database
- MySQL

### Build Tool
- Maven

### Version Control
- Git
- GitHub

## Project Structure

```text
src/main/java/com/jobportal/
│── JobController.java
│── JobService.java
│── JobRepository.java
│── SecurityConfig.java
│── model/Job.java

src/main/resources/
│── templates/
│   │── index.html
│   │── job.html
│── static/
│   │── style.css
│── application.properties
