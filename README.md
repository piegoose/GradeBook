# 📘 GradeBook – Nano MVP e-diary

A minimal **Spring Boot + PostgreSQL** application that manages a school schedule.  
This project is being built step by step to practice JPA, entity relationships, and building a REST API.

---

## 🚀 Technologies
- Java 17+
- Spring Boot 3 (Web, Data JPA, Validation)
- PostgreSQL 17
- Lombok
- Maven

---

## 📂 Domain Model

### Entities
- **Classroom**
  - `id: Long`
  - `name: String` (unique, required)
  - `schoolYear: LocalDate` (optional)
- **LessonSlot**
  - `id: Long`
  - `dayOfWeek: DayOfWeek` (enum, stored as `MONDAY`, `TUESDAY`, …)
  - `startTime: LocalTime`
  - `endTime: LocalTime` (optional)
  - `subject: String`
  - `classroom: Classroom` (`@ManyToOne`)
  - **UNIQUE**: `(classroom_id, day_of_week, start_time)`

---

## 📡 Planned REST API

### Classroom
- `POST /classrooms` – create a new classroom
- `GET /classrooms` – list classrooms

### Lesson Slots (Schedule)
- `POST /schedule` – add a lesson slot
- `GET /schedule?classroomId=1` – full schedule for a classroom
- `GET /schedule?classroomId=1&day=MONDAY` – schedule for a classroom on a specific day

---

## ⚙️ Configuration

`application.yml`:
```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/edziennik
    username: admin
    password: 12345
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true
logging:
  level:
    org.hibernate.SQL: debug
