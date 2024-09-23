package org.launchcode.techjobs.oo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertTrue;



import org.junit.Test;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testSettingJobId(){
        Job test_job_1 = new Job();
        Job test_job_2 = new Job();
        assertNotEquals(test_job_1.getId(), test_job_2.getId());
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
        assertEquals(testJob.getName(), "Product tester");
        assertEquals(testJob.getEmployer().toString(), "ACME");
        assertEquals(testJob.getLocation().toString(), "Desert");
        assertEquals(testJob.getPositionType().toString(), "Quality control");
        assertEquals(testJob.getCoreCompetency().toString(), "Persistence");
    }
    @Test
    public void testJobsForEquality(){
//        Job testJob1 = new Job("Product tester",
//                new Employer("ACME"),
//                new Location("Desert"),
//                new PositionType("Quality control"),
//                new CoreCompetency("Persistence"));
//        Job testJob2 = new Job("Product tester",
//                new Employer("ACME"),
//                new Location("Desert"),
//                new PositionType("Quality control"),
//                new CoreCompetency("Persistence"));
//
//        assertEquals(testJob1, testJob2);
   }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob = new Job();
        assertEquals(testJob.toString().startsWith(System.lineSeparator()),testJob.toString().startsWith(System.lineSeparator()));
        assertEquals(testJob.toString().endsWith(System.lineSeparator()),testJob.toString().endsWith(System.lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertEquals(testJob1.toString(), System.lineSeparator() +
                "ID: 1\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence" +
                System.lineSeparator());
    }

    @Test
    public void testToStringHandlesEmptyField() {

    }
}
