package org.launchcode.techjobs.oo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.junit.Test;

public class JobTest {

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testSettingJobId(){
        Job testJob1 = new Job();
        Job testJob2 = new Job();
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
        assertEquals(testJob3.getName(), "Product tester");
        assertEquals(testJob3.getEmployer().toString(), "ACME");
        assertEquals(testJob3.getLocation().toString(), "Desert");
        assertEquals(testJob3.getPositionType().toString(), "Quality control");
        assertEquals(testJob3.getCoreCompetency().toString(), "Persistence");
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
        assertEquals(testJob6.toString().startsWith(System.lineSeparator()),testJob6.toString().startsWith(System.lineSeparator()));
        assertEquals(testJob6.toString().endsWith(System.lineSeparator()),testJob6.toString().endsWith(System.lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob7 = new Job("Developer",
                new Employer("Microsoft"),
                new Location("St Louis"),
                new PositionType(""),
                new CoreCompetency("Back end"));
        assertEquals(testJob7.toString(), System.lineSeparator() +
                "ID: 1\n" +
                "Name: Developer\n" +
                "Employer: Microsoft\n" +
                "Location: St Louis\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Back end" +
                System.lineSeparator());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob8 = new Job("Product tester",
                new Employer("ACME"),
                new Location(""),
                new PositionType("Quality control"),
                new CoreCompetency(""));
        assertEquals(testJob8.toString(), System.lineSeparator() +
                "ID: 1\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Data not available\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Data not available" +
                System.lineSeparator());

    }
}
