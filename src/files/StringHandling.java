package files;

public class StringHandling {


    /**
     * Checks if first letter of input string is uppercase A-Z
     *
     * @param input
     * @return true if first letter is uppercase
     */
    public static boolean isFirstLetterUpperCase(String input) {

        if (input == null || input.length() < 1)
            return false;

        Character character = input.charAt(0);

        if (character >= 0x41 && character <= 0x5A) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Creates a new String where first letter will be converted to uppercase
     * and the rest to lowercase.
     *
     * @param input
     * @return a new string
     */
    public static String firstLetterToUpperCase(String input) {

        String first = input.substring(0, 1).toUpperCase();
        String rest = input.substring(1).toLowerCase();

        return first + rest;
    }


}
