package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;
    private String newLine = System.lineSeparator();
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return String.format(newLine +
                "ID: %d" + newLine +
                "Name: %s" + newLine +
                "Employer: %s" + newLine +
                "Location: %s" + newLine +
                "Position Type: %s" + newLine +
                "Core Competency: %s" +
                newLine,
                this.getId(), this.getName(), this.getEmployer(), this.getLocation(), this.getPositionType(), this.getCoreCompetency()
        );
    }

    public int getId() {
        return id;
    }

    public String getName() {
        if(name == null){
            return "Data not available";
        }else {
            return name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        if(employer.toString().isEmpty()){
            employer.setValue("Data not available");
            return employer;
        } else {
            return employer;
        }
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        if(location.toString().isEmpty()){
            location.setValue("Data not available");
            return location;
        } else {
            return location;
        }
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        if(positionType.toString().isEmpty()){
            positionType.setValue("Data not available");
            return positionType;
        } else {
            return positionType;
        }
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        if(coreCompetency.toString().isEmpty()){
            coreCompetency.setValue("Data not available");
            return coreCompetency;
        } else {
        return coreCompetency;
        }
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
