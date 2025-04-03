package test;

import main.RPNCalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class RPNCalculatorTest {

    @Test
    public void testSimpleAddition() {
        assertEquals(5, new RPNCalculator().evaluate("2 3 +"));
    }

    @Test
    public void testSimpleSubtraction() {
        assertEquals(1, new RPNCalculator().evaluate("4 3 -"));
    }

    @Test
    public void testSimpleMultiplication() {
        assertEquals(12, new RPNCalculator().evaluate("4 3 *"));
    }

    @Test
    public void testComplexExpression() {
        assertEquals(14, new RPNCalculator().evaluate("5 1 2 + 4 * + 3 -"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperator() {
        new RPNCalculator().evaluate("2 3 &"); // Niepoprawny operator
    }

}
