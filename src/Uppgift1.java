public class Uppgift1 {

    public static void main(String[] args) {
        boolean answer = isEven(100);
        System.out.println(answer);

        answer = isEven(97);
        System.out.println(answer);
    }

    public static boolean isEven(int talet){
        return talet % 2 == 0;
//
//        if( talet % 2 == 0 ){
//            //Jämnt tal
//            return true;
//        }
//       else{
//            //Udda tal
//            return false;
//        }
    }
}
