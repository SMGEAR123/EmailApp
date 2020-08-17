package com.course.master;

public class EmailApp {
    public static void main(String[] args) {
        // write your code here
        Email em1 = new Email("Roger", "Smith");

        System.out.println("Email created: " + em1.getFullName());
    }
}
