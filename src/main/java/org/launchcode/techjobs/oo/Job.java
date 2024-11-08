package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // Constructor to initialize a unique ID
    public Job() {
        id = nextId;
        nextId++;
    }

    // Constructor to initialize all fields except id
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); // Calls the first constructor to initialize 'id'
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // Custom equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Getters and Setters
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

    // Updated toString method
    @Override
    public String toString() {
        // Handling empty or null fields
        String jobName = (name == null || name.isEmpty()) ? "Data not available" : name;
        String jobEmployer = (employer == null || employer.getValue().isEmpty()) ? "Data not available" : employer.getValue();
        String jobLocation = (location == null || location.getValue().isEmpty()) ? "Data not available" : location.getValue();
        String jobPositionType = (positionType == null || positionType.getValue().isEmpty()) ? "Data not available" : positionType.getValue();
        String jobCoreCompetency = (coreCompetency == null || coreCompetency.getValue().isEmpty()) ? "Data not available" : coreCompetency.getValue();

        // Constructing the formatted string
        return System.lineSeparator() +
                "ID: " + id + System.lineSeparator() +
                "Name: " + jobName + System.lineSeparator() +
                "Employer: " + jobEmployer + System.lineSeparator() +
                "Location: " + jobLocation + System.lineSeparator() +
                "Position Type: " + jobPositionType + System.lineSeparator() +
                "Core Competency: " + jobCoreCompetency + System.lineSeparator();
    }
}



