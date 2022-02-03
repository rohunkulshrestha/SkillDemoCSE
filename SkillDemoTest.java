import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest{

    @Test
    public void testMultiply()
    {
        assertEquals("Check whether it multiples correctly", 6, SkillDemo.multiply(2, 2));
    }

}
