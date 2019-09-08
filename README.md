# Todo App Angular7 SpringBoot2

A **Basic Todo Management Application** using Angular, Spring Boot and Spring Security Frameworks.

We will be using **Angular** (Frontend Framework), **TypeScript Basics, Angular Cli**(To create Angular projects), **Spring Boot** (REST API Framework), **Spring** (Dependency Management),  **Spring Security** (Authentication and Authorization - Basic and JWT),**BootStrap** (Styling Pages), **Maven** (dependencies management), **Node** (npm), **H2 Database, Visual Studio Code** (TypeScript IDE), **Eclipse** (Java IDE) and **Tomcat Embedded Web Server**.

## Step-by-step guide

1. Download the source files to your local folder(Todo-Angular7-Spring-Boot2-App-master.zip) and unzip them or
GIT clone the source code into your local system
*#git clone https://github.com/ChandanKolambe/Todo-Angular7-Spring-Boot2-App.git*

2. Once the files are mapped, import the project **todo-rest** as a Maven project in Eclipse from unzipped folder "Todo-Angular7-Spring-Boot2-App-master" and import the **frontend/todo** folder in Visual Studio Code.

3. Once successfully imported the project in Eclipse, right-click on the project and click ˜**Update Maven**

4. On the pop-up, click "Select All Projects" and also select the "Force update of Snapshots" option and run the **maven update**

This should allow your source to get all the dependent files that are required for a successful completion of the build.

### Prerequisites

Step 1: Ensure that **Java, Node, NPM, Angular CLI** is installed on system and tools required : Eclipse, Visual Studio Code.

Step 2: How to check version - demo on Mac:

    + For Node:     *#node -v (Response: v12.8.0)*
    + For Java:     *#java -version (Response: java version "1.8.0_202")*
    + For NPM:      *#npm -v (Response: 6.11.2)*
    + For Angular CLI:    *#ng --version (Response: Angular CLI: 8.3.0)*

### How to start Todo App
  
Step 1: Navigate to **~/Todo-Angular7-Spring-Boot2-App-master/todo-rest/TodoRestApplication** in Eclipse and run the file as Java Application.
    
Step 2: Navigate to **~/Todo-Angular7-Spring-Boot2-App-master/frontend/todo** and execute command line
    *#npm install --save-dev @angular-devkit/build-angular*

Step 3: Once all packages are added successfully, execute command line
    *#ng serve*

Step 4: Open browser and go to **http://localhost:4200**
    Frontend is running on port 4200 and backend is running on port 8081
    
Step 4: To Login, Username : "user" and Password : "pass".

### Database

Step 1: Open browser and go to **http://localhost:8081/h2-console**
    
Step 2: You will see login dialogue box to H2 Database.
Please ensure that the details are as follows : 

    + Driver Class:   org.h2.Driver
    + JDBC URL:       jdbc:h2:mem:testdb
    + User Name:      sa
    + Password:       keep password field empty

Step 3: Click on Connect.
