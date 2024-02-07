

## Test Scenarios For Any.do App 

|No.| Name |Expected Results|Preconditions|Test Data|Priority|
|--|:---:|--------------|:------:|:---:|:----:|
|1|Add Task |  The task should be successfully added to the list of tasks. The task title, description, and due date should be displayed correctly.|||1|
|2 | Edit Task |The task details should be updated with the new changes.|At least one task should exist in the   list.||2|
|3|Add Task with reminder|  The task should be successfully added to the list of tasks. The task title, description, and due date should be displayed correctly.|||1|
|4|Add Task to a created list|  The task should be successfully added to the selected list of tasks.|||1|
|5|Mark Task as Completed Test|The task should be visually marked as completed.|At least one task should exist in the   list.||1|
|6|Delete Task |The task should be successfully deleted from the list of tasks. |At least one task should exist in the   list.||2|
|7|Search Task|Tasks containing the search query in their title or description should be displayed only. |At least one task should exist in the   list.||2|
|8|Filter Task using priority|Tasks containing the priority query in their title or description should be displayed only. |At least one task should exist in the   list.||2|
|9|Edit Profile|Profile should be updated with the new change (updated photo and name)    |User should be logged in ||3|
|10|Add new tag to a task| New tag will be added and can be used for filtering the tagged task|||2|
|11|Check inserting same tag|Error will be displayed for repitition |||3|
|12|Add task with reminder in the past| reminder will not be allowed |||2|
|13|Add task with reminder now| reminder will not be allowed |||2|
|14|Add task with reminder after 5 minutes| reminder will occur after 5 min. |||2|
|15|Create a public board| board will be created with the ability to invite others  |||1|
|16|Share a board| board will be shared with a shortened URL using the desired platform  |||1|
|17|Create a private board| board will be created with no ability to invite others  |||1|
|18|Delete a  board| board will be deleted with all its tasks  |||1|
|19|Add empty task | No empty task will be added  |||2|
|20|Check disabling different App permisions | App will be working according to the allowed permisions only  |||2|
|21|Check Screen rotation with the app | App will be rotated.  |||2|
|22|Check Shaking option to remove completed tasks | Completed Tasks  will be removed.  |||3|
|23|Check switching themes| Theme will be switched in the whole app.  |||3|
|24|Check Integration with external apps like whatsapp| Integration will be done successfully  |||3|

---

## Test Cases for Login Page

### Valid Credentials Login Test

#### Preconditions:
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
