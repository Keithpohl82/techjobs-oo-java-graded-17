package org.launchcode.techjobs.oo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.junit.Test;

public class JobTest {

    private String newLine = System.lineSeparator();

    @Test
    public void testSettingJobId(){
        Job testJob1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertNotEquals(testJob1.getId(), testJob2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        //5 assertTrue and 5 assertEquals tests
        assertTrue(testJob3 instanceof Job);
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester",testJob3.getName());
        assertEquals("ACME", testJob3.getEmployer().toString());
        assertEquals("Desert", testJob3.getLocation().toString());
        assertEquals("Quality control", testJob3.getPositionType().toString());
        assertEquals("Persistence", testJob3.getCoreCompetency().toString());
    }
    @Test
    public void testJobsForEquality(){
//        Job testJob4 = new Job("Product tester",
//                new Employer("ACME"),
//                new Location("Desert"),
//                new PositionType("Quality control"),
//                new CoreCompetency("Persistence"));
//        Job testJob5 = new Job("Product tester",
//                new Employer("ACME"),
//                new Location("Desert"),
//                new PositionType("Quality control"),
//                new CoreCompetency("Persistence"));
//
//        assertEquals(testJob4, testJob5);
   }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob6 = new Job("Junior Dev",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertEquals(testJob6.toString().startsWith(newLine),testJob6.toString().startsWith(newLine));
        assertEquals(testJob6.toString().endsWith(newLine),testJob6.toString().endsWith(newLine));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){

        Job testJob7 = new Job("Developer",
                new Employer("Microsoft"),
                new Location("St Louis"),
                new PositionType(""),
                new CoreCompetency("Back end"));
        assertEquals( newLine +
                "ID: 1" + newLine +
                "Name: Developer" + newLine +
                "Employer: Microsoft" + newLine +
                "Location: St Louis" + newLine +
                "Position Type: Data not available" + newLine +
                "Core Competency: Back end" +
                newLine, testJob7.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob8 = new Job("Product tester",
                new Employer("ACME"),
                new Location(""),
                new PositionType("Quality control"),
                new CoreCompetency(""));
        assertEquals( newLine +
                "ID: 1" + newLine +
                "Name: Product tester" + newLine +
                "Employer: ACME" + newLine +
                "Location: Data not available" + newLine +
                "Position Type: Quality control" + newLine +
                "Core Competency: Data not available" +
                newLine, testJob8.toString());

    }
}
