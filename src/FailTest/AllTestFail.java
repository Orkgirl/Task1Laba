package FailTest;

import Tests.ArrayTests;
import Tests.CalculatorTests;
import Tests.StringTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Îëÿ on 27.09.2015.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ArrayFail.class, CalculatorFail.class, StringFail.class})
public class AllTestFail {
}