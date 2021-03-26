import org.junit.jupiter.api.Test;

import static com.LeetCode.Solutions.HackerTest.stringValidity.checkValidity;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class stringValidityTest {
    @Test
    public void testMethod() {

        String input = "<as>asd</as>";
        //assertEquals(2, commonChild("Harry","Sally"));
        assertEquals(true, checkValidity(input));


    }
}
