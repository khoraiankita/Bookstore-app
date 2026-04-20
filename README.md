#Bookstore Application

A full-stack Bookstore Management System built using Spring Boot and REST APIs.

---

##Features

* Add, update, delete books (CRUD operations)
* Search books by title and author
* Filter books by category and price
* User authentication (Register/Login)
* Password encryption using Spring Security
* Cart system (add/remove books, total price)
* Modern UI with coffee & beige theme


##Tech Stack

* Backend: Java, Spring Boot
* Database: MySQL / H2
* Frontend: HTML, CSS, JavaScript
* Tools: Postman, Eclipse, GitHub


##Project Structure

* `controller` → API endpoints
* `model` → Entity classes
* `repository` → Database layer
* `static` → Frontend (HTML, CSS, images)


##How to Run

1. Clone the repository
2. Open in Eclipse / IntelliJ
3. Run `BookstoreApplication.java`
4. Open browser:

   ```
   http://localhost:8082/index.html
   ```


##API Testing

Use Postman for:

* GET /books
* POST /books
* PUT /books/{id}
* DELETE /books/{id}


##Author

Ankita Khorai
