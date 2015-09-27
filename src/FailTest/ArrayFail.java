package FailTest;

import Task.ChangingArrays;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class ArrayFail {
    ChangingArrays changingArrays;

    int [] actualArray;

    @Before
    public void setUp(){
        changingArrays = new ChangingArrays();
    }

    @Test
    public void arrayTask1Test1(){
        actualArray = new int []{-1, 1, 1, 4, -6, 4, 8, 4, 4};
        int[] expectedArrayTask1 =  {-1, 11, 1, 4, -6, 4, 8, 4, 4};
        assertNotEquals(expectedArrayTask1, changingArrays.swap(actualArray));
    }

    @Test
    public void arrayTask2Test() {
        actualArray = new int []{-1, 1, 1, 4, -6, 4, 8, 4, 4};
        assertNotEquals(8, changingArrays.sumOdd(actualArray));
    }

    @Test
    public void arrayTask3Test() {
        actualArray = new int []{-1, 1, 1, 4, -6, 4, 8, 4, 4};
        int[] expectedArrayTask3 =  {0, 0, 0, 4, 0, 4, 0, 4, 4};
        assertNotEquals(expectedArrayTask3, changingArrays.replaceByZero(actualArray));
    }

    @Test
    public void arrayTask4Test() {
        actualArray = new int []{-1, 1, 1, 4, -6, 4, 8, 4, 4};
        int[] expectedArrayTask4 =  {-1, 1, 1, 16, -6 , 4, 8 , 4, 4};
        assertNotEquals(expectedArrayTask4, changingArrays.tripleElement(actualArray));
    }

    @Test
    public void arrayTask5Test() {
        actualArray = new int []{-1, 1, 1, 4, -6, 4, 8, 4, 4};
        assertNotEquals(10, changingArrays.averageMinusMin(actualArray));
    }

    @Test
    public void arrayTask6Test() {
        actualArray = new int []{-1, 1, 1, 4, -6, 4, 8, 4, 4};
        List<Integer> expectedArrayTask6 =  Arrays.asList(1, 8, 4, 4, 4);
        assertNotEquals(expectedArrayTask6.toArray(), changingArrays.repeatedAndOdd(actualArray).toArray());
    }

}
