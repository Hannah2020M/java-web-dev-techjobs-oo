package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    // TODO: Add two constructors - one to initialize a unique ID and a second to
    //  initialize the  other five fields. The second constructor should also call
    //  the first in order to initialize  the 'id' field.
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

    }//end of constructor Job with arguments

    //toString() method Step 5 in asgnmt2 instructions
    @Override
    public String toString() {

        // created a toString method that passes the first test.
        // Since the test only checks if the returned string starts
        // and ends with a blank line, make that happen.
        String labelsAndFields = "" + "\n" +
                "ID: " + this.getId() + "\n";

        if (this.getName().equals("")) {
            labelsAndFields += "Name: " + "Data not available\n";
        } else {
            labelsAndFields += "Name: " + this.getName() + "\n";
        }

        if (this.getEmployer().equals(null) || this.employer.getValue().equals("")) {
            labelsAndFields += "Employer: " + "Data not available\n";
        } else {
            labelsAndFields += "Employer: " + this.getEmployer() + "\n";
        }

        if (this.getLocation().equals(null) || this.location.getValue().equals("")) {
            labelsAndFields += "Location: " + "Data not available\n";
        } else {
            labelsAndFields += "Location: " + this.getLocation() + "\n";
        }

        if (this.getPositionType().equals(null) || this.positionType.getValue().equals("")) {
            labelsAndFields += "Position Type: " + "Data not available\n";
        } else {
            labelsAndFields += "Position Type: " + this.getPositionType() + "\n";
        }

        if (this.getCoreCompetency().equals(null) || this.coreCompetency.getValue().equals("")) {
            labelsAndFields += "Core Competency: " + "Data not available\n";
        } else {
            labelsAndFields += "Core Competency: " + this.getCoreCompetency() + "\n";
        }

        return labelsAndFields;

    }




    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal"
    //  when their id fields   match.
    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }


    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field
    //  EXCEPT nextID   and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
