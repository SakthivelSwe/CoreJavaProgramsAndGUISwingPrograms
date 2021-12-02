package Polymorphism;

public class main {
    public static void main(String[] args){
        Car car=new Car();
        Bycycle bycycle=new Bycycle();
        Boat boat=new Boat();

        Vehical[] vehicals={car,bycycle,boat};

        for (Vehical x : vehicals){
            x.go();
        }
    }
}
