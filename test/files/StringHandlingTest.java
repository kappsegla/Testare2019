package files;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHandlingTest {

    @Test
    void firstLetterToUpperCase() {

        String testInput = "marTin";

        String testResult = StringHandling.firstLetterToUpperCase(testInput);

        assertEquals("Martin", testResult);
    }
}