package harshit;

public class Main {
    public static void main(String[]args){
        Model Jugati =new Model(1,"petrol",4,"RED",5,4
                ,"jugati","TATA",150,20,"BBX%^HI");

    System.out.println(Jugati.getTopspeed());
        for (int i=0;i<=Jugati.getTopspeed();i++){
            Jugati.IncreasingSpeed(i);
        }

    Jugati.gears(3);
    }

}
