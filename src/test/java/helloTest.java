import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class helloTest {



    @Test
    public void testHello(){
        assertEquals(0, Calculator.evaluate("5^2-25"));
    }
}
