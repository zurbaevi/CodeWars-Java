package com.codewars.kyu7;

/**
 * @author Zurbaevi Nika
 */
public class FIXMEGetFullName {
    private final String firstName;
    private final String lastName;

    public FIXMEGetFullName(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return (firstName + " " + lastName).trim();
    }
}
