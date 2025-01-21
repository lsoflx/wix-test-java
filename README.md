# Wix Test Java Project

This is a Java-based test automation project using Selenide, TestNG, and AssertJ for writing and executing automated tests for demoblaze.com.

## Prerequisites

Before you begin, ensure you have the following installed:


- **IDE**: IntelliJ IDEA, it will suggest to enable or download everything you need to run this project.

**All Following is for CLI including project setup**
- **Git**: Need to install git to be able to clone repo.
- **Java Development Kit (JDK) 23**: The project is configured to use JDK 23.
- **Maven**: The project uses Maven for dependency management and building.

## Project Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/lsoflx/wix-test-java.git
   ```
2. **Install Dependencies**:
   ```bash
   mvn clean install -DskipTests
   ```
3. **Configure Java Version**:
   
   Ensure your system is using JDK 23. You can verify this by running:
   ```bash
   java -version
   ```
   If needed, update your JAVA_HOME environment variable to point to JDK 23.


4. **Running Tests**:
   ```bash
   mvn test
   ```
   If you need different browser just use input parameter to command   
   -Dselenide.browser={browser}

   chrome is by default
   
