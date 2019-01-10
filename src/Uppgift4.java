public class Uppgift4 {


    public static void main(String[] args) {
        int tal1 = Main.getInt();
        int tal2 = Main.getInt();
        double mean = meanValue(tal1, tal2);
        System.out.println(mean);
    }

    public static double meanValue(int a, int b){

        double m = (a + b) / 2.0;
        return m;
    }
}
