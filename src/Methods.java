public class Methods {

    //Demo av method overloading
    public static void main(String[] args) {
        methodZero();
        methodOne(10); //10 as argument
        methodTwo(10,20);
        methodTwo(10.0, 20.0);
        methodTwo(10.0);
    }

    public static void methodZero() {
        System.out.println("This i method with zero parameters");
    }

    //Method overloading with just different returntypes is not allowed in Java
//    public static double methodZero() {
//        System.out.println("This i method with zero parameters");
//        return 0.0;
//    }

    //Method with one parameter
    public static void methodOne(int a) {
        //System.out.println("MethodOne: " + a);
        methodOne(a, 0);
    }

    //Method with two parameters
    public static void methodOne(int a, int b) {
        System.out.println("MethodOneWithTwoParameters: " + a + "," + b);
    }

    //Method with two parameters
    public static void methodTwo(double a, double b) {
        System.out.println("MethodTwoBeta: " + a + "," + b);
    }

    //Method with two parameters
    public static void methodTwo(double a) {
        System.out.println("MethodTwoWithOneParameter: " + a);
    }


}
