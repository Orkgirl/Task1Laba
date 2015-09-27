package Tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Task.Calculator;


public class CalculatorTests {
    public Calculator calculatorTests = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(4, calculatorTests.add(2, 2));
    }

    @Test
    public void testSub() {
        assertEquals(0, calculatorTests.sub(2, 2));
        assertEquals(-1, calculatorTests.sub(100, 101));
    }

    @Test
    public void testMult() {
        assertEquals(4, calculatorTests.mult(2, 2));
        assertEquals(0, calculatorTests.mult(2, 0));
        assertEquals(25000000, calculatorTests.mult(5000, 5000));
    }

    @Test
    public void testDiv() {
        assertEquals(1, calculatorTests.div(2, 2));
        assertEquals(0, calculatorTests.div(0, 2));
        assertEquals(-1, calculatorTests.div(-300000, 300000));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivZero() {
        assertEquals(0, calculatorTests.div(2, 0));
    }

}