package com.codewars.kyu8;

/**
 * @author Zurbaevi Nika
 */
public class AbbreviateATwoWordName {
    static String abbrevName(String name) {
        return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
    }
}
