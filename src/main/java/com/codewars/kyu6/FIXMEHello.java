package com.codewars.kyu6;

import java.util.LinkedHashMap;

/**
 * @author Zurbaevi Nika
 */
class FIXMEHello extends LinkedHashMap<String, String> {
    FIXMEHello setAge(int age) {
        put("age", " I am " + age + ".");
        return this;
    }

    FIXMEHello setSex(char sex) {
        put("sex", sex == 'M' ? " I am male." : " I am female.");
        return this;
    }

    FIXMEHello setName(String name) {
        put("name", " My name is " + name + ".");
        return this;
    }

    String hello() {
        return "Hello." + String.join("", values());
    }
}
