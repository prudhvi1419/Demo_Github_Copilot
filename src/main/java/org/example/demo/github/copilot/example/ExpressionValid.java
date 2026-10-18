package org.example.demo.github.copilot.example;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Validates whether brackets in a string are correctly paired and nested.
 */
public class ExpressionValid {

    public static void main(String[] args) {
        String expression = "[{()}]";
        System.out.println(expression + " is valid: " + isValid(expression));
    }

    public static boolean isValid(String expression) {
        if (expression == null) {
            return false;
        }

        Deque<Character> openings = new ArrayDeque<>();
        for (char current : expression.toCharArray()) {
            if (current == '(' || current == '[' || current == '{') {
                openings.push(current);
            } else if (current == ')' || current == ']' || current == '}') {
                if (openings.isEmpty() || !matches(openings.pop(), current)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return openings.isEmpty();
    }

    private static boolean matches(char opening, char closing) {
        return (opening == '(' && closing == ')')
                || (opening == '[' && closing == ']')
                || (opening == '{' && closing == '}');
    }
}
