# Data-Driven Selenium Project with CI/CD

## 📌 Project Overview
This project demonstrates data-driven test automation using Selenium and Java.  
It integrates a CI/CD pipeline using GitHub Actions to automatically run tests on push and pull requests.

## 🚀 Technologies Used
- Java
- Selenium WebDriver
- Maven
- TestNG / JUnit
- GitHub Actions

## ⚙️ CI/CD Workflow
- The GitHub Actions pipeline triggers on:
  - Push to `master`
  - Pull requests
  - Manual dispatch (`workflow_dispatch`)

- Steps in the pipeline:
  1. Checkout the code
  2. Setup Java and Maven
  3. Run tests using `mvn test`
  4. Upload test reports

## 📂 Test Reports
Test reports are available under:

## ▶️ Manual Run
You can also manually trigger the workflow via the "Run workflow" button in the Actions tab.

✅ Submission Checklist
Item	Status
Working GitHub Actions pipeline	✅
Selenium test code	✅
ci.yml file	✅
README.md with steps	✅
Test reports in repo	✅

