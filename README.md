# Invoice Generator (Java + Maven)

## Overview

This is a desktop-based Invoice Generator application built using Java. The application allows users to create invoices, manage data, and generate PDF documents efficiently. It uses JavaFX for the UI and iText for PDF generation, along with MySQL for data storage.

---

## Features

* Create and manage invoices
* Generate PDF invoices
* Store and retrieve invoice data from MySQL database
* User-friendly JavaFX interface
* JSON handling using Gson and org.json
* Email support using JavaMail

---

## Tech Stack

### Core

* Java (JDK 22)
* Maven

### Frontend

* JavaFX

### Backend / Logic

* Java

### Database

* MySQL

### Libraries / Dependencies

* JavaFX (controls, fxml)
* iText PDF (kernel, layout, forms, etc.)
* MySQL Connector
* Gson
* org.json
* JavaMail
* Log4j

---

## Project Structure

```
CreateInvoice/
│── src/
│   ├── application/       # Main application entry
│   ├── controllers/       # JavaFX controllers
│   ├── models/            # Data models
│   ├── utils/             # Utility classes
│
│── pom.xml                # Maven configuration
```

---

## Prerequisites

Make sure you have installed:

* Java JDK 22
* Maven
* MySQL Server

---

## Setup Instructions

### 1. Clone the Repository

```
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

---

### 2. Install Dependencies

Maven will automatically download all dependencies:

```
mvn clean install
```

---

### 3. Configure Database

* Create a MySQL database
* Update your database credentials in the project (likely in a config or connection class)

Example:

```
url = jdbc:mysql://localhost:3306/your_db
username = root
password = your_password
```

---

### 4. Run the Application

Run using Maven:

```
mvn javafx:run
```

OR run packaged JAR:

```
mvn clean package
java -jar target/CreateInvoice-0.0.1-SNAPSHOT.jar
```

---

## Build Executable JAR

```
mvn clean package
```

Output:

```
target/CreateInvoice-0.0.1-SNAPSHOT.jar
```

---

## Notes

* Ensure JavaFX is properly configured for your system
* If JavaFX runtime issues occur, add VM options:

```
--module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml
```

---

## Future Improvements

* Add authentication system
* Export invoices in multiple formats
* Add REST API support
* Improve UI/UX

---

## License

This project is for learning and personal use. Modify as needed.
