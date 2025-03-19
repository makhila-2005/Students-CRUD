# Students CRUD Application

This is a **CRUD (Create, Read, Update, Delete) application** for managing student records. The project provides an interface to perform basic operations on student data using a **Spring Boot** backend.

## Features

- Add new students with details such as name, age, and course.
- View a list of all students.
- Edit student details.
- Delete student records.
- RESTful API implementation.

## Technologies Used

- Backend: Spring Boot
- Database: MySQL
- Other: Spring Data JPA

## Installation & Setup

1. **Clone the Repository**
   ```sh
   git clone https://github.com/makhila-2005/Students-CRUD.git
   cd Students-CRUD
   ```

2. **Configure Database**
   - Ensure MySQL is installed and running.
   - Update `application.properties` with database credentials.

3. **Build and Run the Application**
   ```sh
   mvn spring-boot:run
   ```

4. **Access the API**
   The application runs on:
   ```
   http://localhost:8090
   ```

## API Endpoints

| Method | Endpoint           | Description         |
|--------|-------------------|---------------------|
| GET    | /students         | Get all students   |
| POST   | /students         | Add a new student  |
| PUT    | /students/{id}    | Update a student   |
| DELETE | /students/{id}    | Delete a student   |

## Contribution

If you’d like to contribute:
1. Fork the repository.
2. Create a new branch.
3. Make your changes.
4. Submit a pull request.

## License

This project is licensed under the MIT License.

---


