import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class whiteBox_test
{
    whiteBox whiteBoxTest;

    public whiteBox_test() {

    }

    @Before
    public void setUp() {
        whiteBoxTest = new whiteBox();
    }

    @After
    public void tearDown() {
        whiteBoxTest = null;
    }

    @Test
    public void noNumbers(){
        String[] args = new String[0];
        assertEquals("No numbers", whiteBoxTest.testCase(args));
    }

    @Test
    public void atLeastOneNumber(){
        String[] args = new String[1];
        args[0] = "17";
        assertEquals("Minimum = 17; maximum = 17", whiteBoxTest.testCase(args));
    }


    @Test
    public void exactlyTwoNumbers(){
        String[] args = new String[2];
        args[0] = "27";
        args[1] = "29";
        assertEquals("Minimum = 27; maximum = 29", whiteBoxTest.testCase(args));
    }

}
