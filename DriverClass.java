package com.mycompany.csc229_211review_lab02hw;

import java.util.Random;

/**
 * DriverClass is used to test the Student and Person classes.
 * It creates a Student object, assigns a random GPA,
 * and prints the student's details.
 */
public class DriverClass {
    public static void main(String[] args) {
        // Create a Student object with specified name and age
        Student std1 = new Student("Yahya Nawaz", (short) 22);

        // Generate a random GPA between 0.0 and 4.0
        Random random = new Random();
        double randomGpa = Math.round(random.nextDouble() * 4.0 * 100.0) / 100.0;
        std1.setGpa(randomGpa);

        // Print the student's details
        System.out.println(std1);
    }
}
