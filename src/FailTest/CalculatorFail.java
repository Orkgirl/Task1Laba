package FailTest;

import Task.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;


public class CalculatorFail {


        private Calculator calculator = new Calculator();

        @Test
        public void testAdd() {
            assertNotEquals(Integer.MAX_VALUE, calculator.add(Integer.MAX_VALUE, 1));
        }

        public void testSub() {
            assertNotEquals(Integer.MIN_VALUE - 1, calculator.sub(Integer.MIN_VALUE, 1));
            assertNotEquals(1, calculator.sub(100, 101));
            assertNotEquals(-1, calculator.sub(101, 100));
        }

        @Test
        public void testMult() {
            assertNotEquals(Integer.MAX_VALUE, calculator.mult(Integer.MAX_VALUE / 2 , Integer.MAX_VALUE / 2));
            assertNotEquals(90000000000l, calculator.mult(300000, 300000));
            assertNotEquals(5, calculator.mult(5, 0));

        }

        @Test(expected = ArithmeticException.class)
        public void testDiv() {
            assertNotEquals(5, calculator.div(5, 0));
            assertEquals(0, calculator.div(1, 0));
        }


}
