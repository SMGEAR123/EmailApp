package com.course.master;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    public void getFullNameTest() {
        Email testEmail = new Email("Roger", "Smith");

        String expectedResult = "Roger Smith";
        String result = testEmail.getFullName();

        assertEquals(expectedResult, result);
    }
    @Test
    public void getLastNameTest() {
        Email testEmail = new Email("Roger", "Smith");

        String result = testEmail.getLastName();

        String expectedResult = "Smith";

        assertEquals(expectedResult, result);

    }

}