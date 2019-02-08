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

    @Test
    void isFirstLetterUpperCaseAToZReturnsTrue() {

        String testInput = "Martin";

        boolean result = StringHandling.isFirstLetterUpperCase(testInput);

        assertTrue(result);
    }

    @Test
    void isFirstLetterUpperCaseaTozReturnsFalse() {

        String testInput = "martin";

        boolean result = StringHandling.isFirstLetterUpperCase(testInput);

        assertFalse(result);
    }


    @Test
    void isFirstLetterUpperCaseEmptyStringReturnsFalse() {
        String testInput = "";

        boolean result = StringHandling.isFirstLetterUpperCase(testInput);

        assertFalse(result);
    }

    @Test
    void isFirstLetterUpperCaseNullValueReturnsFalse() {
        String testInput = null;

        boolean result = StringHandling.isFirstLetterUpperCase(testInput);

        assertFalse(result);
    }

    @Test
    void isFirstLetterUpperCaseSpecialLetterReturnsTrue(){
        String testInput = "Ѝartin";  //0x40D

        boolean result = StringHandling.isFirstLetterUpperCase(testInput);

        assertTrue(result);
    }
}