package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {

    // Constructor that calls the JobField constructor to set the value and handle the id
    public PositionType(String value) {
        super(value);  // Calls the JobField constructor with the value
    }

    // Custom toString, equals, and hashCode methods (inherited from JobField)

    @Override
    public String toString() {
        return getValue();  // Returns the value inherited from JobField
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return getId() == that.getId();  // Compares PositionType objects by their id
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());  // Generates hash code based on id
    }

    // Getters and Setters (inherited from JobField)

    @Override
    public int getId() {
        return super.getId();  // Access the id from JobField
    }

    @Override
    public String getValue() {
        return super.getValue();  // Access the value from JobField
    }

    @Override
    public void setValue(String value) {
        super.setValue(value);  // Access the setter from JobField
    }
}

