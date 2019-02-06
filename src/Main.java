import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static int getInt(){
        int tal = 0;

        try {
            tal = scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Felaktig inmatning!");
        }
        return tal;
    }

    public static String getString() {
        return scanner.nextLine();
    }


}
