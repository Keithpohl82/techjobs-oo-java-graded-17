package org.launchcode.techjobs.oo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.junit.Test;



public class JobTest {

    private String newLine = System.lineSeparator();

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob = new Job("Product tester",
                new Employer("ACME"),
                new Location(""),
                new PositionType("Quality control"),
                new CoreCompetency(""));
        assertEquals( newLine +
                "ID: " + testJob.getId()  + newLine +
                "Name: Product tester" + newLine +
                "Employer: ACME" + newLine +
                "Location: Data not available" + newLine +
                "Position Type: Quality control" + newLine +
                "Core Competency: Data not available" +
                newLine, testJob.toString());
    }



    @Test
    public void testSettingJobId(){
        Job testJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertNotEquals(testJob2.getId(), testJob.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        //5 assertTrue and 5 assertEquals tests
        assertTrue(testJob instanceof Job);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester",testJob.getName());
        assertEquals("ACME", testJob.getEmployer().toString());
        assertEquals("Desert", testJob.getLocation().toString());
        assertEquals("Quality control", testJob.getPositionType().toString());
        assertEquals("Persistence", testJob.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality(){
        Job testJob4 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job testJob5 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertNotEquals(testJob4, testJob5);
   }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob = new Job("Junior Dev",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertEquals(testJob.toString().startsWith(newLine),testJob.toString().startsWith(newLine));
        assertEquals(testJob.toString().endsWith(newLine),testJob.toString().endsWith(newLine));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob = new Job("Product tester",
                new Employer("ACME"),
                new Location(""),
                new PositionType("Quality control"),
                new CoreCompetency(""));

        assertEquals( newLine +
                "ID: " + testJob.getId() + newLine +
                "Name: Product tester" + newLine +
                "Employer: ACME" + newLine +
                "Location: Data not available" + newLine +
                "Position Type: Quality control" + newLine +
                "Core Competency: Data not available" +
                newLine, testJob.toString());
    }
}
