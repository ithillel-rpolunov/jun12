import static junit.framework.Assert.assertEquals;

/**
 * Created by Vasya on 04.04.2016.
 */


import org.junit.Test;
import static junit.framework.Assert.*;

public class CalculateTest {
    @Test
    public void testCalA() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calA(2, 3);

        assertEquals(6, n);
    }
}
