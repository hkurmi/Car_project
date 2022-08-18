package harshit;

public class Model extends Cars{
    private int topspeed;
    private int fueltank;
    private String ModelNumber;

    public int getTopspeed() {
        return topspeed;
    }

    public int getFueltank() {
        return fueltank;
    }

    public String getModelNumber() {
        return ModelNumber;
    }

    public Model(int Engine, String fuel, int wheels, String colour, int gears, int windows,
                 String name, String companyName, int topspeed, int fueltank, String ModelNumber ) {
        super(Engine, fuel, wheels, colour, gears, windows, name, companyName);
        this.fueltank=fueltank;
        this.ModelNumber=ModelNumber;
        this.topspeed=topspeed;

    }



}
