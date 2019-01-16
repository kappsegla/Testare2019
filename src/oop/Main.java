package oop;

import org.w3c.dom.css.Rect;

public class Main {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle();
        Rectangle rect2 = new Rectangle();

        rect.setHeight(10);
        rect2.setHeight(20);

        int i = rect.getHeight();

        System.out.println(i);
        System.out.println(rect2.getHeight());

        System.out.println( rect.getWidth() );
        int a = rect.getArea();
    }
}
