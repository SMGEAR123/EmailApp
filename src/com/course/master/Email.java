package com.course.master;

import java.util.Scanner;

public class Email {
    // An example of encapsulation
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;

    // Constructor to receive first and last name

    public Email (String firstName, String lastName) {
        // Class-level variable
        this.firstName = firstName;// local variable
        this.lastName = lastName;

        // Call a method asking for the department
        this.department = this.setDepartment();

        System.out.println("Department is: " + this.department);

        // Call a method that returns a random password
        this.password = randomPassword(this.defaultPasswordLength);
        System.out.println("Your password is " + this.password);

        // Combine elements to generate email

    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n4 for None\nEnter a department code: ");
        //Accept User Input
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        System.out.println(deptChoice);

        String selectedDept = null;

        switch(deptChoice) {
            case 1:
                selectedDept = "Sales";
                break;
            case 2:
                selectedDept = "Development";
                break;
            case 3:
                selectedDept = "Accounting";
                break;
            case 4:
                selectedDept = "None";
                break;
            default:
                System.out.println("Setting to default department None. Try one of the selected department codes!");
                selectedDept = "None";
                break;
        }

//        System.out.println("Chosen Department is: " + selectedDept);
        return selectedDept;

    }

    public String getFullName() {
        String fullName = this.firstName + " " + this.lastName;

        return fullName;
    }

    public String getLastName() {
        return this.lastName;
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];// Creates password array with provided length

        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());// Get a random position from the passwordSet
            password[i] = passwordSet.charAt(rand);//Make each character in the password equal to a random passwordSet character
        }
        return new String(password);// Once the loop is finished the password will consist of random passwordSet Characters
    }


    // Set the mailbox capacity

    // Set the alternate email

    // Change the password


}