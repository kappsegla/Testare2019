package oop;

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(0.0,0.0);
        Point point2 = new Point(3.0,0.0);

        Point point3 = new Point(point2);

        point3.setX(4.0);
        System.out.println(point2);
        System.out.println(point3);



        //double d = point1.distanceTo(point2);

        //System.out.println( d );



//        Teacher teacher = new Teacher("Martin", "555-123456");
//
//        Course course = new Course("Java", teacher ,
//                new Adress("Göteborg","Maskingatan",5),
//                90, 12);
//
//        Course course2 = new Course("Testning", teacher ,
//                new Adress("Göteborg","Maskingatan",5),
//                90, 12);
//
//

        //System.out.println(course.getTeacher().getName());

        //Use toString for printing course info
  //      System.out.println( course );





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
