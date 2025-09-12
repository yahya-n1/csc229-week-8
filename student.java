package com.mycompany.csc229_211review_lab02hw;

/**
 * Student class represents a student as a child of the abstract class Person.
 * This class adds a GPA field and implements the abstract methods from Person.
 */
public class Student extends Person {
    // GPA field
    private double gpa;

    /**
     * Constructor for Student class.
     * Calls the parent class constructor to set name and age.
     *
     * @param name Student's name
     * @param age  Student's age
     */
    public Student(String name, short age) {
        super(name, age);
    }

    // Getter for GPA
    public double getGpa() {
        return gpa;
    }

    // Setter for GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Implement abstract method getAddress()
    @Override
    public String getAddress() {
        return "Address for " + getName() + " is not set yet.";
    }

    // Implement abstract method setAddress()
    @Override
    public void setAddress(String address) {
        // You could store address in a field if needed
    }

    // ToDo 7: Add toString method
    @Override
    public String toString() {
        return "Student{name='" + getName() + "', age=" + getAge() + ", gpa=" + gpa + "}";
    }
}
