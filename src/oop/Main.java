package oop;

public class Main {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Martin", "555-123456");

        Course course = new Course("Java", teacher ,
                new Adress("Göteborg","Maskingatan",5),
                90, 12);

        Course course2 = new Course("Testning", teacher ,
                new Adress("Göteborg","Maskingatan",5),
                90, 12);
        
        System.out.println(course.getTeacher().getName());

        System.out.println( course );





//        Vehicle minivan = new Vehicle();
//        minivan.setFuelCap(50);
//        minivan.setMpg(2);
//        minivan.setPassengers(5);
//        minivan.setWorking(true);
//
//        System.out.println(minivan.getRange());
//
//        //Call constructor with arguments
//        Vehicle sportscar = new Vehicle(2,30,1,false);
//
//
//        System.out.println(sportscar.getRange());



//        Rectangle rect = new Rectangle();
//        Rectangle rect2 = new Rectangle();
//
//        rect.setHeight(10);
//        rect2.setHeight(20);
//
//        int i = rect.getHeight();
//
//        System.out.println(i);
//        System.out.println(rect2.getHeight());
//
//        System.out.println( rect.getWidth() );
//        int a = rect.getArea();
    }
}
