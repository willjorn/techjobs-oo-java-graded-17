# TechJobs, OO Edition Autograded Rubric for Java 17

For [this assignment](https://education.launchcode.org/java-web-development/assignments/tech-jobs-oo.html), students are asked to refactor a version of the TechJobs Console assignment to make the code object-oriented and to add some unit testing.

Assignment Requirements:

* finishing portions of a few classes
* writing unit tests in a TDD fashion
* using abstraction and inheritance strategically by refactoring the classes.

## Unit Tests
 
The starter code contains 6 unit test classes.  Each class contains tests for each main task of the assignment.  This allows students to run tests upon completion of a task before moving on to the next one.
 
`TestTaskTwo` verifies that students completed the `Location`, `CoreCompetency`, and `PositionType` classes.

`TestTaskThree` verifies that students created the `jobClass` and that it uses the other classes correctly to create `job` objects.  

`TestTaskFour` verifies students' unit tests exist within the application.  

`TestTaskFive` tests the unit tests the students created for their custom `ToString` method.  

`TestTaskSix` verifies that students used proper inheritance between `Location`, `Employer`, `CoreCompetency`, `PositionType` and `JobField`.  For example, `Employer` should extend `JobField`.  These tests focus on the existance of the extension rather than the behavior of the extension. 

`AbstractTest` verifies the behavior of the DRY code.  

Submission cannot be graded on unit tests alone.  The tests will provide answers to the code checks below, but should not replace a live demo.  Use the section below as a guide for what to look for before submitting your assignment.

### Appearance and Output:
 
Expected output from hardcoded job data:
 
```
ID: 1
Name: Product tester
Employer: ACME
Location: Desert
Position Type: Quality control
Core Competency: Persistence
 
 
ID: 2
Name: Web Developer
Employer: LaunchCode
Location: St. Louis
Position Type: Front-end developer
Core Competency: JavaScript
 
 
ID: 3
Name: Ice cream tester
Employer: Data not available
Location: Home
Position Type: UX
Core Competency: Tasting ability
```

## Submitting Your Work

To submit your work please follow the [Submission Instructions](https://education.launchcode.org/java-web-dev-curriculum/assignments/hello-world/index.html#submitting-your-work-on-canvas).
 
Does the hardcoded job data in `Main` print when the application is run?
 
Will an additional job be printed with a unique ID? Ask the student to create a new
`Job` object in Main. Verify that it gets printed with a unique ID.
