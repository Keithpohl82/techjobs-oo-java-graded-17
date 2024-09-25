package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {

    ///////////////// All have /////////////////

    // private int id;
    // private static int nextId = 1;
    // private String value;
    // toString method that returns value.
    // A constructor that sets id = to nextid and nextid++
    // A constructor to set value and init id constructor this().
    // A Hashcode method.  - I am not sure what this method is doing
    // getid method
    // getvalue method
    // setvalue method
    // equals method - I am not sure what this method is doing

    //////////////////////////////////////////////

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField(){
        id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
