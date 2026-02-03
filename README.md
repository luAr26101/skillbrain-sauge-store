# SkillBrain Deli Store

Simple full-stack demo app for a small deli storefront. The goal is to provide a clean, minimal example that can be easily modified by students.

**Tech stack**
- Frontend: Angular
- Backend: Spring Boot
- Database: H2 (in-memory)

**Project structure**
- `frontend/` Angular client
- `backend/` Spring Boot API

**Run locally**
1. Backend
   - `cd backend`
   - `./mvnw spring-boot:run`
2. Frontend (in a new terminal)
   - `cd frontend`
   - `npm install`
   - `npm start`

The frontend talks to the backend API and lets you browse products, add them to the cart, and place an order.

**Notes**
- This project is intended for learning and quick iteration.
