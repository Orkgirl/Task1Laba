package Tests;
import Task.ChangingStrings;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class StringTests {
    ChangingStrings changingStrings;
    ArrayList<String> actualList = new ArrayList<String>(Arrays.asList(new String[] {"pn5nm", "zzzz", "4qq", "kl", "j"}));

    @Before
    public void setUp() {
        changingStrings = new ChangingStrings();
    }

    @Test
    public void stringTestTask1(){
        ArrayList<String> expectedResult = new ArrayList<String>(Arrays.asList(new String[] {"j", "pn5nm"}));
        assertArrayEquals(expectedResult.toArray(), changingStrings.maxMinString(actualList).toArray());
    }

    @Test
    public void stringTestTask2(){
        ArrayList<String> expectedResult = new ArrayList<String>(Arrays.asList(new String[] {"pn5nm", "zzzz"}));
        assertArrayEquals(expectedResult.toArray(), changingStrings.biggerAverageString(actualList).toArray());
    }

    @Test
    public void stringTestTask3(){
        ArrayList<String> expectedResult = new ArrayList<String>(Arrays.asList(new String[] {"kl", "j"}));
        assertArrayEquals(expectedResult.toArray(), changingStrings.lessAverageString(actualList).toArray());
    }

    @Test
    public void stringTestTask6(){
        ArrayList<String> expectedResult = new ArrayList<String>(Arrays.asList(new String[] {"j", "pn5nm"}));
        //assertArrayEquals(expectedResult.toArray(), (changingStrings.wordOfNumber(actualList).toArray));
    }





}
