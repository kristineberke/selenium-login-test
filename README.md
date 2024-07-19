# selenium-login-test
This repository contains an automated test case for login functionality using Selenium WebDriver. The test is written in Java and uses Eclipse as the IDE.

## Test Case: Login Functionality
Objective: Verify that a user can log in with valid credentials.

| Step | Test Step                    | Expected Result               | Test Data                  |
|------|------------------------------|-------------------------------|----------------------------|
| 1   | Browser is launched           | Browser is opened             |                            |
| 2   | Open the login page           | The login paged is opened in the browser | https://www.saucedemo.com/v1/ |
| 3    | User enters correct username and password | User should be able to type the username and password successfully      | Username: "standard_user"   Password: "secret_sauce" |
| 4   | User click on "Login" button | User is logged into portal successfully |                  |
| 5   | Browser is closed            |                               |                            |


## Prerequisites
- Java Development Kit (JDK)
- Eclipse IDE
- Selenium WebDriver
- Git

## Prerequisites
1. Clone the Repository 
To get a local copy of the repository, use the following command: git clone https://github.com/kristineberke/selenium-login-test.git

2. Navigate into the cloned directory: cd selenium-login-test

3. Import the Project into Eclipse
4. Add Selenium WebDriver to the Project (Download Selenium WebDriver, Add Selenium WebDriver to the Project)
5. Verify Java Development Kit (JDK) Installation
6. Check Maven Dependencies (If Using Maven: mvn install)
