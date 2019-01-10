import java.util.InputMismatchException;
import java.util.Scanner;

public class Uppgift2 {


    public static void main(String[] args) {

        while (true) {
            int tal = Main.getInt();
            if (tal >= 0 && tal < 10) {
                System.out.println("Grattis, i Intervallet");
                return;
            }
        }
    }
}