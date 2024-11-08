package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {

    // Test to ensure that each Job object gets a unique ID
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        // Assert that job1 and job2 have different IDs
        assertNotEquals(job1.getId(), job2.getId());
    }

    // Test the constructor that sets all fields
    @Test
    public void testJobConstructorSetsAllFields() {
        // Arrange: Create a new Job object with specific data
        Job testJob = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );

        // Act & Assert: Test each field for correct type and value

        // Testing 'name' field
        assertEquals("Product tester", testJob.getName());
        assertTrue(testJob.getName() instanceof String);

        // Testing 'employer' field
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertTrue(testJob.getEmployer() instanceof Employer);

        // Testing 'location' field
        assertEquals("Desert", testJob.getLocation().getValue());
        assertTrue(testJob.getLocation() instanceof Location);

        // Testing 'positionType' field
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertTrue(testJob.getPositionType() instanceof PositionType);

        // Testing 'coreCompetency' field
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    }
    @Test
    public void testJobsForEquality() {
        Job job1 = new Job(
                "Software Developer",
                new Employer("LaunchCode"),
                new Location("St.Louis"),
                new PositionType("Full Stack"),
                new CoreCompetency("Java")
        );
        Job job2 = new Job(
                "Software Developer",
                new Employer("LaunchCode"),
                new Location("St.Louis"),
                new PositionType("Full Stack"),
                new CoreCompetency("Java")
        );
        // Act & Assert: Test that equals returns false for jobs with different IDS
        assertFalse(job1.equals(job2));
    }
    //Test that toString starts and ends with a newline character
   @Test
   public void testToStringStartsAndEndsWithNewLine(){
        //arrange: Create a Job object with sample data
       Job testJob= new Job(
               "Product tester",
               new Employer("ACME"),
               new Location("Desert"),
               new PositionType("Quality control"),
               new CoreCompetency("Persistence")
       );
       //Convert the Job object to a string
       String jobString= testJob.toString();
//  Check that the string starts with a newline character
       assertEquals(System.lineSeparator(), jobString.substring(0, System.lineSeparator().length()));

       //  Check that the string ends with a newline character
       assertEquals(System.lineSeparator(), jobString.substring(jobString.length() - System.lineSeparator().length()));
   }
   @Test
   public void testToStringContainsCorrectLabelsAndData(){
        // arrange a job with specific data
       Job testjob = new Job(
               "Product Tester",
               new Employer("ACME"),
               new Location("Desert"),
               new PositionType("Quality control"),
               new CoreCompetency("Persistence")
       );
       // convert the job object to a string
       String jobString = testjob.toString();


       //Expected output
       String expectedOutput= System.lineSeparator() +
               "ID: "+testjob.getId()+System.lineSeparator()+
               "Name: Product Tester" +System.lineSeparator()+
               "Employer: ACME"+ System.lineSeparator()+
               "Location: Desert"+ System.lineSeparator()+
               "Position Type: Quality control" + System.lineSeparator()+
               "Core Competency: Persistence" + System.lineSeparator();
// Assert: Check that the output matches the expected format
       assertEquals(expectedOutput, jobString);

       }

    @Test
    public void testToStringHandlesEmptyField() {
        // Arrange: Create a Job object with some empty fields
        Job testJob = new Job(
                "", // Empty name
                new Employer(""), // Empty employer
                new Location("Desert"),
                new PositionType(""), // Empty position type
                new CoreCompetency("Persistence")
        );

        // Act: Convert the Job object to a string
        String jobString = testJob.toString();

        // Expected output
        String expectedOutput = System.lineSeparator() +
                "ID: " + testJob.getId() + System.lineSeparator() +
                "Name: Data not available" + System.lineSeparator() +
                "Employer: Data not available" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Data not available" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();

        // Assert: Check that the output matches the expected format
        assertEquals(expectedOutput, jobString);
   }
}


