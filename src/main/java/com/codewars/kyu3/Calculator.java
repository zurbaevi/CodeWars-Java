package com.codewars.kyu3;

import java.util.Stack;

/**
 * @author Zurbaevi Nika
 */
public class Calculator {
    public static Double evaluate(String expression) {
        String[] parts = expression.split(" ");
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < parts.length; i += 2) {
            if (i == 0 || parts[i - 1].equals("+")) stack.push(Double.valueOf(parts[i]));
            else if (parts[i - 1].equals("-")) stack.push(-Double.parseDouble(parts[i]));
            else if (parts[i - 1].equals("*")) stack.push(stack.pop() * Double.parseDouble(parts[i]));
            else if (parts[i - 1].equals("/")) stack.push(stack.pop() / Double.parseDouble(parts[i]));
        }
        double result = 0.0;
        while (!stack.isEmpty()) result += stack.pop();
        return result;
    }
}
