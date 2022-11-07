import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CalcTests {

    @Test
    public void addTest(){
        assertEquals(10, calc.add(5,5));
    }
}
