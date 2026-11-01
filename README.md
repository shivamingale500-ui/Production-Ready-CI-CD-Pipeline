# Production-Ready CI/CD Pipeline with Automated Quality Gates 🚀

## 📌 Project Overview

This project demonstrates the implementation of a production-ready Continuous Integration and Continuous Deployment (CI/CD) pipeline using GitHub Actions, AWS, Docker, and automated quality gates.

The pipeline automates the complete software delivery lifecycle, starting from source code management to production deployment.

Before deploying an application, the pipeline performs automated testing, code quality analysis, security vulnerability scanning, and Docker image validation.

Only applications that successfully pass all configured quality gates are allowed to proceed to deployment.

The project follows a controlled DEV-to-PROD deployment strategy with manual production approval.

## 🎯 Project Objectives

- Automate application build and deployment.
- Implement automated unit testing.
- Enforce coding standards using Checkstyle.
- Analyze code quality using SonarCloud.
- Detect security vulnerabilities using Trivy.
- Build and scan Docker images.
- Push approved images to AWS ECR.
- Deploy applications to AWS ECS.
- Implement separate DEV and PROD environments.
- Prevent unsuccessful builds from reaching production.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java 17 | Application development |
| Maven | Build and dependency management |
| JUnit 5 | Unit testing |
| Checkstyle | Code standards validation |
| JaCoCo | Code coverage |
| SonarCloud | Code quality analysis |
| Trivy | Security vulnerability scanning |
| Docker | Containerization |
| GitHub Actions | CI/CD automation |
| AWS ECR | Docker image registry |
| AWS ECS | Container deployment |
| AWS IAM OIDC | Secure AWS authentication |
| Amazon CloudWatch | Application monitoring |
| Git & GitHub | Version control |

## 🏗️ CI/CD Architecture

```text
             Developer
                 |
                 v
          GitHub Repository
                 |
                 v
          GitHub Actions
                 |
                 v
          Maven Build
                 |
                 v
          Unit Testing
                 |
                 v
          Checkstyle
                 |
                 v
          SonarCloud
                 |
                 v
          Quality Gate
                 |
                 v
          Trivy Scan
                 |
                 v
          Docker Build
                 |
                 v
       Docker Image Security Scan
                 |
                 v
             AWS ECR
                 |
                 v
          DEV Deployment
                 |
                 v
          DEV Verification
                 |
                 v
       Manual Production Approval
                 |
                 v
          PROD Deployment
                 |
                 v
       Production Verification
```

## 📂 Project Structure

```text
Production-Ready-CI-CD-Pipeline/
│
├── src/
│   ├── main/
│   │   └── java/com/example/
│   │       └── App.java
│   │
│   └── test/
│       └── java/com/example/
│           └── AppTest.java
│
├── .github/
│   └── workflows/
│       └── ci-cd.yml
│
├── Dockerfile
├── pom.xml
├── checkstyle.xml
├── .gitignore
└── README.md
```

## ⚙️ Prerequisites

Install or configure the following:

- Java JDK 17
- Apache Maven
- Git
- Docker
- GitHub Account
- SonarCloud Account
- Trivy
- AWS Account
- AWS ECR Repository
- AWS ECS Cluster and Service
- AWS IAM OIDC Role

## 🚀 Local Application Execution

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR-USERNAME/Production-Ready-CI-CD-Pipeline.git
```

### 2. Navigate to the Project

```bash
cd Production-Ready-CI-CD-Pipeline
```

### 3. Validate the Maven Configuration

```bash
mvn validate
```

### 4. Run Unit Tests

```bash
mvn test
```

### 5. Build and Verify the Application

```bash
mvn clean verify
```

### 6. Generate Code Coverage

```text
target/site/jacoco/index.html
```

Open this file in a browser to view the JaCoCo coverage report.

## 🔍 Automated Quality Gates

The pipeline implements multiple quality checks.

### 1. Unit Testing

**Tool:** JUnit 5

- Executes automated unit tests.
- Validates application functionality.
- Stops the pipeline when tests fail.

### 2. Code Quality Analysis

**Tool:** SonarCloud

Checks for:

- Bugs
- Code smells
- Security hotspots
- Code duplication
- Maintainability issues
- Code coverage

The pipeline waits for the configured SonarCloud Quality Gate result.

### 3. Coding Standards

**Tool:** Checkstyle

- Validates Java coding conventions.
- Detects selected coding standard violations.
- Prevents invalid code from proceeding.

### 4. Security Vulnerability Scanning

**Tool:** Trivy

Scans for:

- Dependency vulnerabilities
- Exposed secrets
- Configuration issues
- Container image vulnerabilities

HIGH and CRITICAL findings are configured to fail the security gate.

### 5. Docker Image Validation

- Builds Docker images.
- Scans container images.
- Prevents vulnerable images from being published when the configured scan fails.

## ☁️ AWS Infrastructure

### Amazon ECR

Stores approved Docker images.

### Amazon ECS

Runs and manages containerized applications.

### AWS IAM

Provides controlled access to AWS resources.

### AWS OIDC

Enables GitHub Actions to assume an AWS IAM role without storing permanent AWS access keys.

### Amazon CloudWatch

Provides logs and monitoring for deployed containers.

## 🔄 Deployment Strategy

The project follows a controlled deployment process.

### Development Environment

- Automated deployment after all required CI quality gates pass.
- Application deployment to AWS ECS DEV.
- Verify deployment health.
- Check application logs.

### Production Environment

- Production deployment is blocked until DEV succeeds.
- Manual approval is required.
- The same tested Docker image digest is promoted to production.
- Verify the production deployment.

## 🛡️ Failure Handling

The pipeline is designed to prevent unsuccessful builds from reaching production.

| Failure Scenario | Expected Action |
|---|---|
| Maven build failure | Stop pipeline |
| Unit test failure | Stop pipeline |
| Checkstyle failure | Stop pipeline |
| SonarCloud gate failure | Stop pipeline |
| Trivy security failure | Stop pipeline |
| Docker build failure | Stop pipeline |
| ECR push failure | Stop deployment |
| DEV deployment failure | Block PROD |
| Approval not granted | Keep PROD waiting |

## 📊 Expected Project Outcomes

- Automated CI/CD implementation.
- Improved code quality.
- Early detection of security vulnerabilities.
- Automated Docker image creation.
- Secure AWS deployment.
- Controlled DEV and PROD environments.
- Reduced manual deployment errors.
- Better software delivery reliability.

## 🔮 Future Enhancements

- Integrate Kubernetes using Amazon EKS.
- Implement Infrastructure as Code using Terraform.
- Add automated integration testing.
- Integrate OWASP dependency scanning.
- Implement automated rollback.
- Add Prometheus and Grafana monitoring.
- Introduce blue-green deployments.
- Implement deployment notifications.

## 👨‍💻 Author

**Shivam Ingale**

Aspiring DevOps Engineer | AWS Cloud Enthusiast

### Technical Skills

- AWS Cloud
- Docker
- Terraform
- GitHub Actions
- Jenkins
- CI/CD
- Linux
- Maven
- Git & GitHub
- Infrastructure as Code

**GitHub:** https://github.com/shivamingale500-ui

---

⭐ If you find this project useful, feel free to explore the repository.

**Build | Test | Secure | Automate | Deploy 🚀**
