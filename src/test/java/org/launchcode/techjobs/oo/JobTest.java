package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {

    //test empty constructor
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }

    // test full constructor

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                        new CoreCompetency("Persistence"));

        assertEquals(testJob.getName(), "Product tester");
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    }

    // test equals method
    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertFalse(job1.equals(job2));
    }

    // test toString - Task 5

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJobI = new Job("Product tester I", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals(testJobI.toString(), "\nID: " + testJobI.getId() +"\n" +
                "Name: Product tester I\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n");
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJobII = new Job("Product tester II", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals(testJobII.toString(), "\nID: " + testJobII.getId() +"\n" +
                "Name: Product tester II\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n");
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJobIII = new Job("Product tester III", new Employer(""),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency(""));

        assertEquals(testJobIII.toString(), "\nID: " + testJobIII.getId() +"\n" +
                "Name: Product tester III\n" +
                "Employer: Data not available\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Data not available\n");
    }

}
