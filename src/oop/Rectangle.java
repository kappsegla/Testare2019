package oop;

import java.awt.*;

public class Rectangle {

    //<editor-fold desc="Setters">
    public void setWidth(int w){
        width = w;
    }
    public void setHeight(int h){
        height = h;
    }
    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }
    //</editor-fold>
    //<editor-fold desc="Getters">
    public int getWidth(){
        return width;
    }


    public int getHeight() {
        return height;
    }

    public int getBorderWidth() {
        return borderWidth;
    }

    /**
     * Calculates area of the rectangle according to current width and height values.
     * Will calculate on each call.
     * @return Area of rectangle
     */
    public int getArea() {
        return width * height;
    }
    //</editor-fold>

    private int width;
    private int height;
    private int borderWidth;
}
