# 🚀 Employee Management System

A Spring Boot based Employee Management System project to manage employee records with REST APIs and Thymeleaf templates.

---

## 📌 Features
- Add, view, update, and delete employees
- REST API endpoints for CRUD operations
- Thymeleaf templates for UI rendering
- Maven build system with wrapper support
- Easy deployment and testing

---

## 🛠 Tech Stack
- **Java 17**
- **Spring Boot 3.2.5**
- **Maven**
- **Thymeleaf**
- **GitHub for version control**

---

## ⚙️ Setup Instructions
Clone the repository and run the project:

```bash
git clone https://github.com/alpi10pal-a11y/employee-management-system.git
cd employee-management-system
./mvnw spring-boot:run
The application will start on http://localhost:8080

📂 Project Structure
Code
src/main/java/com/example/employee
 ├── EmployeeApplication.java
 ├── EmployeeController.java
 ├── EmployeeRestController.java
src/main/resources
 ├── application.properties
 ├── templates/
     ├── add.html
     ├── view.html
📡 API Endpoints
GET /api/employees → Get all employees

POST /api/employees → Add new employee

PUT /api/employees/{id} → Update employee

DELETE /api/employees/{id} → Delete employee

📌 Author
Developed by Alpi Pal  
💻 CodeChef Dev Team Member | Aspiring Data Scientist & Full‑Stack Developer
⭐ Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

📜 License
This project is licensed under the MIT License.