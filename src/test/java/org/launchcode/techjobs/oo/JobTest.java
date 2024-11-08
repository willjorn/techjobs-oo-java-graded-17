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
        // Act & Assert: TESt that equals returns false for jobs with different IDS
        assertFalse(job1.equals(job2));
    }
    }

