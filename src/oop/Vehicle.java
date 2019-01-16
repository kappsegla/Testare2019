package oop;

public class Vehicle {
    private int passengers;
    private int fuelCap;
    private float mpg;
    private boolean working;

    //Default Constructor
    public Vehicle(){
        passengers = 5;
        fuelCap = 50;
        mpg = 2;
        working = true;
    }

    //Constructor with parameters
    public Vehicle( int passengers, int fuelCap, float mpg, boolean working){
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
        this.working = working;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(int fuelCap) {
        this.fuelCap = fuelCap;
    }

    public float getMpg() {
        return mpg;
    }

    public void setMpg(float mpg) {
        this.mpg = mpg;
    }

    public float getRange(){
        return fuelCap * mpg;
    }
}
