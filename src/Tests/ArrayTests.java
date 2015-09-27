package Tests;

import Task.ChangingArrays;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayTests {
    ChangingArrays changingArrays;

    int [] actualArray;

    @Before
    public void setUp(){
        changingArrays = new ChangingArrays();
    }

    @Test
    public void arrayTask1Test1(){
        actualArray = new int []{-1, 1, 1, 4, -6, 4, 8, 4, 4};
        int[] expectedArrayTask1 =  {1, -1, 1, 4, -6, 4, 8, 4, 4};
        assertArrayEquals(expectedArrayTask1, changingArrays.swap(actualArray));
    }

    @Test
    public void arrayTask2Test() {
        actualArray = new int []{-1, 1, 1, 4, -6, 4, 8, 4, 4};
        assertEquals(6, changingArrays.sumOdd(actualArray));
    }

    @Test
    public void arrayTask3Test() {
        actualArray = new int []{-1, 1, 1, 4, -6, 4, 8, 4, 4};
        int[] expectedArrayTask3 =  {0, 1, 1, 4, 0, 4, 8, 4, 4};
        assertArrayEquals(expectedArrayTask3, changingArrays.replaceByZero(actualArray));
    }

    @Test
    public void arrayTask4Test() {
        actualArray = new int []{-1, 1, 1, 4, -6, 4, 8, 4, 4};
        int[] expectedArrayTask4 =  {-1, 1, 1, 12, -6 , 4, 8 , 4, 4};
        assertArrayEquals(expectedArrayTask4, changingArrays.tripleElement(actualArray));
    }

    @Test
    public void arrayTask5Test() {
        actualArray = new int []{-1, 1, 1, 4, -6, 4, 8, 4, 4};
        assertEquals(8, changingArrays.averageMinusMin(actualArray));
    }

    @Test
    public void arrayTask6Test() {
        actualArray = new int []{-1, 1, 1, 4, -6, 4, 8, 4, 4};
        List<Integer> expectedArrayTask6 =  Arrays.asList(1 ,4, 4, 4);
        assertArrayEquals(expectedArrayTask6.toArray(), changingArrays.repeatedAndOdd(actualArray).toArray());
    }

}
