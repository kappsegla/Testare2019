public class Uppgift3 {

    public static void main(String[] args) {

        String inputText = "";
        String oldInputText = "";

        while(true) {
            inputText = Main.getString();

            if (inputText.equals(oldInputText)) {
                return;
            }
            oldInputText = inputText;
        }
    }
}
