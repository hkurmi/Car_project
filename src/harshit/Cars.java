package harshit;

public class Cars extends Vehicle{
    private int windows;
    private String name;
    private String companyName;
public Cars(int Engine,String fuel,int wheels,String colour,int gears,int windows,String name,String companyName) {
    super(Engine, fuel, wheels, colour, gears);
    this.companyName = companyName;
    this.name = name;
    this.windows = windows;
}

    public int getWindows() {
        return windows;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void IncreasingSpeed(int speed){
    speed++;
    System.out.println("Car is moving with speed :"+speed);

    }
    public void DecSpeed(int speed){
        speed--;
        System.out.print("Car is moving with speed :"+speed);

    }


public void gears(int gears){
    System.out.println("Car is moving with gear:"+gears);
}
}

