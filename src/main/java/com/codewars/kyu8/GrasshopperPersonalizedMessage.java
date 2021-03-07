package com.codewars.kyu8;

/**
 * @author Zurbaevi Nika
 */
public class GrasshopperPersonalizedMessage {
    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}
