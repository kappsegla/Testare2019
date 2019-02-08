package files;

public class StringHandling {


    /**
     * Checks if first letter of input string is uppercase
     * @param input
     * @return true if first letter is uppercase
     */
    public static boolean isFirstLetterUpperCase(String input){
        return false;
    }

    /**
     * Creates a new String where first letter will be converted to uppercase
     * and the rest to lowercase.
     * @param input
     * @return a new string
     */
    public static String firstLetterToUpperCase(String input){

        String first = input.substring(0,1).toUpperCase();
        String rest = input.substring(1).toLowerCase();

        return first + rest;
    }


}
