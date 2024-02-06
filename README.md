## Test Cases for Login Page

### Valid Credentials Login Test

### Preconditions:
- Ensure the user has valid credentials (username and password).

#### Test Steps:
1. Navigate to the login page.
2. Enter valid username and password.
3. Click on the login button.

#### Expected Result:
* Verify that the user is successfully logged in and redirected to the expected products page.

---

### Invalid Credentials Login Test

#### Preconditions:
- Ensure the user has invalid credentials.

#### Test Steps:
1. Navigate to the login page.
2. Enter invalid username and/or password.
3. Click on the login button.

#### Expected Result:
* an error message is displayed indicating invalid credentials.
* the user is not logged in and remains on the login page.

---

### Locked out Credentials Login Test

#### Preconditions:
- Ensure the user has locked out user credentials.

#### Test Steps:
1. Navigate to the login page.
2. Enter locked out username and password.
3. Click on the login button.

#### Expected Result:
* an error message is displayed indicating locked out credentials.
* the user is not logged in and remains on the login page.

---

### Blank Credentials Login Test

#### Test Steps:
1. Navigate to the login page.
2. Leave both username and password fields blank.
3. Click on the login button.

#### Expected Result:
* an error message is displayed indicating required fields are empty.

---

### Blank Username Login Test

#### Test Steps:
1. Navigate to the login page.
2. Leave username blank and enter password field.
3. Click on the login button.

#### Expected Result:
* an error message is displayed indicating required field is empty.

---

### Blank Password Login Test

#### Test Steps:
1. Navigate to the login page.
2. Leave password blank and enter username field.
3. Click on the login button.

#### Expected Result:
* an error message is displayed indicating required field is empty.

---
