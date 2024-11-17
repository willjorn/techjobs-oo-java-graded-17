package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField {

    // Constructor that calls the JobField constructor
    public CoreCompetency(String value) {
        super(value);  // Calls the JobField constructor with the value
    }

    // Override toString method to return the value of the CoreCompetency (inherited from JobField)
    @Override
    public String toString() {
        return getValue();  // Returns the value inherited from JobField
    }

    // Override equals and hashCode to use the id from JobField
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoreCompetency that = (CoreCompetency) o;
        return getId() == that.getId();  // Compares CoreCompetency objects by their id
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());  // Generates hash code based on id
    }
}
