# 👋 GreetingAPI

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![REST API](https://img.shields.io/badge/REST-API-blue?style=for-the-badge)

A simple **RESTful Greeting API** built with **Spring Boot (Java)**, developed as a lab exercise for the **Programming Application Framework** module.

---

## 📋 Project Details

| Field | Details |
|-------|---------|
| **Project Name** | GreetingAPI |
| **Module** | Programming Application Framework |
| **Framework** | Spring Boot |
| **Language** | Java |
| **Type** | REST API (Practice Project) |

---

## 🚀 Getting Started

### Prerequisites

- Java JDK 17 or higher
- Maven or Gradle
- Any IDE (IntelliJ IDEA / VS Code / Eclipse)

### Installation & Run

1. **Clone the repository**
```bash
   git clone https://github.com/chamika217/greetingapi.git
   cd GreetingAPI
```

2. **Build the project**
```bash
   mvn clean install
```

3. **Run the application**
```bash
   mvn spring-boot:run
```

4. **Access the API**
http://localhost:8080

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/greeting` | Returns a default greeting |
| `GET` | `/greeting?name=John` | Returns a personalized greeting |

### Sample Response

```json
{
  "id": 1,
  "content": "Hello, World!"
}
```

```json
{
  "id": 2,
  "content": "Hello, John!"
}
```

---

## 📁 Project Structure
GreetingAPI/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/greetingapi/
│   │   │       ├── GreetingApiApplication.java
│   │   │       ├── controller/
│   │   │       │   └── GreetingController.java
│   │   │       └── model/
│   │   │           └── Greeting.java
│   │   └── resources/
│   │       └── application.properties
├── pom.xml
└── README.md

---

## 🛠️ Built With

- [Spring Boot](https://spring.io/projects/spring-boot) — Java-based framework for building REST APIs
- [Maven](https://maven.apache.org/) — Dependency management and build tool

---

## 👤 Author

- **Name:** DILSHAN D.M.C
- **Student ID:** it23620216
- **Module:** Programming Application Framework

---

> *This project was developed as a hands-on lab exercise to practice building RESTful APIs using the Spring Boot framework.*
