package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {

    // Constructor that calls the super constructor (JobField constructor)
    public Employer(String value) {
        super(value); // Call to JobField constructor to set value and handle id
    }

    // Custom toString, equals, and hashCode methods (these can be inherited from JobField)
    @Override
    public String toString() {
        return getValue();  // Returns the value inherited from JobField
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());  // Ensures uniqueness based on id
    }

    // Getters and Setters (inherited from JobField)
    public int getId() {
        return super.getId();  // Access the id from JobField
    }

    public String getValue() {
        return super.getValue();  // Access the value from JobField
    }

    public void setValue(String value) {
        super.setValue(value);  // Access the setter from JobField
    }
}
