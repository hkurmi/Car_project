package harshit;

public class Vehicle {
    private int Engine;
    private String fuel;
    private int wheels;
    private String colour;
    private int gears;

    public int getEngine() {
        return Engine;
    }

    public String getFuel() {
        return fuel;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColour() {
        return colour;
    }

    public int getGears() {
        return gears;
    }

    public Vehicle(int Engine, String fuel, int wheels, String colour, int gears){
        this.colour=colour;
        this.Engine=Engine;
        this.fuel=fuel;
        this.gears=gears;
        this.wheels=wheels;

    }


}
