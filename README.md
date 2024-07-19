# selenium-login-test
This repository contains an automated test case for login functionality using Selenium WebDriver. The test is written in Java and uses Eclipse as the IDE.

## Test Case: Login Functionality
Objective: Verify that a user can log in with valid credentials.
### Test Steps:
| Step | Test Step                    | Expected Result               | Test Data                  |
|------|------------------------------|-------------------------------|----------------------------|
| 1    | User enters correct username | Login page is displayed       | Username: "standard_user"  |
|      | and password                 |                               | Password: "secret_sauce"   |
| 2    | Enter valid username         | Username is entered            | ✅ Pass  |
| 3    | Enter valid password         | Password is entered            | ✅ Pass  |
| 4    | Click on the login button    | User is redirected to dashboard | ✅ Pass  |

## Prerequisites
- Java Development Kit (JDK)
- Eclipse IDE
- Selenium WebDriver
- Git
