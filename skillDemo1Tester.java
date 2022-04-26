import static org.junit.Assert.*;
import org.junit.*;

public class skillDemo1Tester {
    @Test
    public void findMaxTester(){
        assertEquals(4, skillDemo1.findMax(new int[] {1,2,3}));
    }
}
