package FailTest;

import Task.ChangingStrings;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertNotEquals;

public class StringFail {
    ChangingStrings changingStrings;
    ArrayList<String> actualList = new ArrayList<String>(Arrays.asList(new String[]{"pn5nm", "zzzz", "4qq", "kl", "j"}));



    @Before
    public void setUp() {
        changingStrings = new ChangingStrings();
    }

    @Test
    public void stringTestTask1(){
        ArrayList<String> expectedResult = new ArrayList<String>(Arrays.asList(new String[] {"kl", "pn5nm"}));
        assertNotEquals(expectedResult.toArray(), changingStrings.maxMinString(actualList).toArray());
    }

    @Test
    public void stringTestTask2(){
        ArrayList<String> expectedResult = new ArrayList<String>(Arrays.asList(new String[] {"zzzz", "4qq"}));
        assertNotEquals(expectedResult.toArray(), changingStrings.biggerAverageString(actualList).toArray());
    }

    @Test
    public void stringTestTask3(){
        ArrayList<String> expectedResult = new ArrayList<String>(Arrays.asList(new String[] {"j"}));
        assertNotEquals(expectedResult.toArray(), changingStrings.lessAverageString(actualList).toArray());
    }

    @Test
    public void stringTestTask6(){
        ArrayList<String> expectedResult = new ArrayList<String>(Arrays.asList(new String[] {"pn5nm"}));
        //assertNotEquals(expectedResult.toArray(), (changingStrings.wordOfNumber(actualList).toArray));
    }
}
