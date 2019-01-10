import java.lang.reflect.Array;
import java.util.Arrays;

public class Uppgift5 {

//    static String realPass1 = "piggy";
//    static String realPass2 = "snuff";
//    static String realPass3 = "bark";

    static String[] realPass = new String[3];
    static String[] pass = new String[3];

    public static void main(String[] args) {

        realPass[0] = "a";
        realPass[1] = "b";
        realPass[2] = "c";

        for (int i = 0; i < 5; i++) {
            boolean auth = isAuthorized();

            if( auth && i != 4)
            {
                System.out.println("Logged in!");
                return; //Return from main -> application ends
            }
            else if(auth)
            {
                System.out.println("Puh, on the last try.");
                break;  //Exit the loop
            }
            else
            {
                System.out.println("Fel!");
            }
        }
    }

    private static boolean isAuthorized() {

        for( int i = 0; i < 3 ; i++) {
            pass[i] = Main.getString();
        }

        //Sortera inmatade lösenord i bokstavsordning för att underlätta
        //jämförelse mot realPass som redan är sorterad. Gör att vi bara behöver
        //en jämförelse istället för 5 olika.
        Arrays.sort(pass);

        if( pass[0].equals(realPass[0]) &&
            pass[1].equals(realPass[1]) &&
            pass[2].equals(realPass[2]) ){

            return true;
        }

        return false;
    }
}
