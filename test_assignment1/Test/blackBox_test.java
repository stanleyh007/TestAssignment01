import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static junit.framework.TestCase.assertEquals;

public class blackBox_test
{
    blackBox blackBoxTest;


    @Before
    public void setUp() {
        blackBoxTest = new blackBox();
    }

    @After
    public void tearDown() {
        blackBoxTest = null;
    }

    @Test
    public void isSaverTicket(){
        assertEquals(true, blackBoxTest.isSaverTicket("12:30"));
    }

    @Test
    public void isNotSaverTicket(){
        assertEquals(false, blackBoxTest.isSaverTicket("16:20"));
    }

    @Test
    public void isRushHour(){
        assertEquals(true, blackBoxTest.isRushHour(LocalTime.of(9, 0)));
    }
}
