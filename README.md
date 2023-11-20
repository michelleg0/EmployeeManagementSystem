# Project 1
    Keap has reached out to our software company and would like us
    to create an Employee Management System.

    In our two person company, I am the Project Manager and you are
    the Software Engineer. I will be giving you the requirements, 
    testing the functionality of the program, and suggesting changes.

    The requirements are listed below.

### Requirements
1. The program should have a menu with the following options:
   1. Enter employee details. [Create a string variable to hold employee details]
   2. See list of employees. [Create for loop to view students in array]
   3. Delete employee. [Array List]
   4. Update employee. [Array List]
   5. Exit.
2. For each menu the details are as follows:
   1. In employee details menu, we would like to capture the following:
      1. Employee first name [String variable]
      2. Employee last name [String variable]
      3. Employee date of birth []
      4. Employee SSN [Int variable]
      5. Employee salary (upto 2 decimal points)
      6. Employee department [String variable]
      7. Employee active/not-active -- this is to identify ex-employee. [Boolean variable - will need to implement similar code block as yes/no from the previous activity]
   2. In the list employee option, the program should print out all the employees with all their details. [ System.out.println(employee) & for loop]
   3. CHALLENGE - I would like to delete an employee.
      1. In delete employee option the program should ask for SSN of employee to search for.
      2. We are using SSN because that is always going to be unique. 
      3. Then you will have to loop through the employee array list and search for the employee based on SSN.
      4. Once the employee has been indentified, remove them from the array list.
      5. I recommend googling "how to delete an item from arraylist in java".
   4. EXTRA CHALLENGE - I would like to update details of an existing employee.
      1. In update employee option, the program should ask for SSN of employee to search for.
      2. We are using SSN because that is always going to be unique.
      3. Then you will have to loop through the employee array list and search for the employee based on SSN.
      4. I recommend googling "search an arraylist in java".
      5. Once you have identified the employee that will be updated, the program should repeat asking employee detail questions.
      6. Remove that employee from arraylist and add the new details.



Notes:
Which employee would you like to delete? - Enter the SSN
Then pick how you would like to go about deleting the employee - SSN is a unique identifieer
