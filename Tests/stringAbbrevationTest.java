import com.LeetCode.Solutions.HackerTest.stringAbbrevation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class stringAbbrevationTest {
    @Test
    public void abbrevationTest(){
        String[] main = new String[]{"beFgH","beFgH","sYOCa","beFgH","ABC","LLZOSYAMQRMBTZXTQMQcKGLR","Pi"};
        String[] target = new String[]{"EFG","EFHI","YOCN","NO","B","LLZOSYAMBTZXMQKLR","P"};
   //     assertEquals("NO", stringAbbrevation.abbreviation(main[0],target[0]));
        assertEquals("YES", stringAbbrevation.abbreviation(main[6],target[6]));

        //assertEquals("NO", stringAbbrevation.abbreviation(main[1],target[1]));
    //    assertEquals("NO", stringAbbrevation.abbreviation(main[2],target[2]));
   //     assertEquals("NO", stringAbbrevation.abbreviation(main[3],target[3]));
    //    assertEquals("NO", stringAbbrevation.abbreviation(main[4],target[4]));
   //     assertEquals("NO", stringAbbrevation.abbreviation("beFgH","EFG"));
   //     assertEquals("YES", stringAbbrevation.abbreviation("dabc","ABC"));


    }
}
