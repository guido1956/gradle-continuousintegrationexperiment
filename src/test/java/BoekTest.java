import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoekTest {
    private Boek boek;

    @Before
    // throw exception weggelaten
    public void setUp() {
        boek = new Boek("Dit is een mooie titel");
    }

    @Test
    public void testTitel() {
        // test1
        String expectedResult = "De is een mooie titel";
        assertEquals(expectedResult, boek.getTitle());
        System.out.println("hoi again");

    }
}