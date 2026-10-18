package org.example.demo.github.copilot.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExpressionValidTest {

    @Test
    void acceptsCorrectlyNestedBrackets() {
        assertTrue(ExpressionValid.isValid("[{()}]"));
        assertTrue(ExpressionValid.isValid("()[]{}"));
        assertTrue(ExpressionValid.isValid(""));
    }

    @Test
    void rejectsMismatchedOrUnbalancedBrackets() {
        assertFalse(ExpressionValid.isValid("[(])"));
        assertFalse(ExpressionValid.isValid("(()"));
        assertFalse(ExpressionValid.isValid("())"));
        assertFalse(ExpressionValid.isValid("]"));
    }

    @Test
    void rejectsNonBracketCharacters() {
        assertFalse(ExpressionValid.isValid("[{(*&^%$)}/]"));
        assertFalse(ExpressionValid.isValid("(a)"));
    }

    @Test
    void rejectsNull() {
        assertFalse(ExpressionValid.isValid(null));
    }
}