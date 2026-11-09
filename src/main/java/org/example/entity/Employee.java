package org.example.entity;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstname = firstName;
        this.lastname = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String toString(){
        return "{ " + id + ", " + firstname + ", " + lastname + " }";
   }

}
