import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Vasya on 04.04.2016.
 */
public class teststrTest {
    @Test
    public void teststr1 () throws Exception {
        Teststr teststr = new Teststr();
        String s = teststr.str1("1","4");
        System.out.println("test");

        assertTrue(s.contains("1 4"));
//                ("1 3");
    }
}
