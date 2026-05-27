# Task 3: Java Application using Gradle

## What is Gradle?
Gradle is a **build tool** for Java projects. It automates:
- Compiling your Java code
- Running tests
- Packaging your app into a `.jar` file

Think of it like a helper that does all the boring steps for you!

---

## Project Structure
```
task3-java-gradle/
├── build.gradle         # Gradle build instructions (like a recipe)
├── settings.gradle      # Project name
├── Jenkinsfile          # CI/CD pipeline for Jenkins
├── README.md            # This file
└── src/
    ├── main/
    │   └── java/com/codealpha/
    │       └── HelloWorld.java     # Main Java program
    └── test/
        └── java/com/codealpha/
            └── HelloWorldTest.java # Test file
```

---

## Requirements
- Java JDK 11 or higher
- Gradle 7+ (or use the wrapper)

Check versions:
```bash
java -version
gradle -version
```

---

## How to Run

### Option 1: Run directly
```bash
# Compile and run the app
gradle run
```

### Option 2: Build first, then run
```bash
# Build (creates .jar file)
gradle build

# Run the app
gradle run
```

### Run Tests only
```bash
gradle test
```

---

## Expected Output
```
=============================
  Hello from CodeAlpha!
  Java + Gradle Project
=============================
Welcome, BTech Student! Your Gradle build works!
```

---

## Key Concepts Learned
| Concept | What it does |
|---|---|
| `build.gradle` | Tells Gradle how to build your project |
| `gradle build` | Compiles code + runs tests + creates JAR |
| `gradle run` | Runs your main class |
| `gradle test` | Runs all test files |
| `dependencies {}` | Where you add external libraries |
| `plugins {}` | Adds features like `java` or `application` |
| CI/CD with Jenkins | Automates build on every code push |
