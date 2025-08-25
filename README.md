# Fake Java App - Secret Scanning Test

This repository contains a **fake Java application** designed for testing secret scanning and detection tools such as Gitleaks, TruffleHog, and GitHub Secret Scanning.  
All embedded secrets in this project are **dummy values** for testing purposes only.

---

## Features

- Multi-class Java project with realistic structure:
  - `MainApp.java` – Main entry point
  - `Config.java` – Configuration and environment setup
  - `Utils.java` – Helper functions with filler code
  - `Database.java` – Fake database access module
  - `Services.java` – Example service layer
- Fake secrets scattered throughout:
  - AWS keys
  - DB passwords
  - Stripe, GitHub, Twilio, Slack tokens
- Noisy loops, filler functions, and print statements to simulate a real application.
- Classes and methods contain ≥100 lines of code each to make manual detection harder.

---

## Requirements

- Java 11+ (or higher)
- No external libraries required
- Optional: Any SQL engine to test database interactions (fake)

---

## Installation

Clone the repository:

```bash
git clone https://github.com/fake-org/FakeJavaApp.git
cd FakeJavaApp/src
