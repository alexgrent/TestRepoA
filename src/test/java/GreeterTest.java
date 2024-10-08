import org.example.Greeter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GreeterTest {

    @Test
    public void testMain() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        Greeter.main(new String[]{});
        String expectedOutput = "Test project A\n";
        assertEquals(expectedOutput, outputStream.toString());
        System.setOut(originalOut);
    }
}
