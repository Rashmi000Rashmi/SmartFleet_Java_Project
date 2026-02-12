Day 1: Setup & Your First Spring Boot API
Welcome back! Today we focus on getting your machine ready and making sure you can run a simple Java backend application. Don't worry about being a "beginner" — we'll take it step by step.

1. The Tools of the Trade
You need to install these three things first:

JDK 21: The "engine" that runs Java. Download from Adoptium (Temurin).
IntelliJ IDEA (Community Edition): The best editor (IDE) for Java. Download here.
Postman: A tool to "talk" to your API once you build it. Download here.
2. Resources to Read (Java Refresh)
If you've forgotten the basics, spend 30 minutes on these:

Variables & Types: Java Basics
Object-Oriented Programming (OOP): Focus on Classes, Objects, and Methods.
Spring Boot in 10 minutes: What is Spring Boot?
3. Today's "Hello World" Task
We are going to create a simple "SmartFleet-Identity" service.

Step A: Generate the Project
Go to start.spring.io.
Choose these settings:
Project: Maven
Language: Java
Spring Boot: 3.4.x (latest stable)
Java: 21
Dependencies: Add Spring Web, Lombok, and Spring Boot DevTools.
Click GENERATE, download the ZIP, and unzip it.
Step B: Open and Run
Open IntelliJ and "Open" the unzipped folder.
Wait for it to download dependencies (watch the progress bar at the bottom).
Find SmartFleetApplication.java and click the green "Play" icon next to public static void main.
Step C: Your first Controller
Create a new file called HelloController.java in the same package:

java
package com.example.smartfleet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to SmartFleet! Your backend is alive.";
    }
}
Step D: Test it
Restart the app.
Open your browser and go to http://localhost:8080/hello.
What's Next?
Once you see "Your backend is alive", you have successfully set up your environment! Tomorrow, we will start with the Database (PostgreSQL).
