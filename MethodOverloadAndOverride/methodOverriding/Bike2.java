//Example of method overriding
class Vehicle{
    void run(){
        System.out.println("vehicle running");
    }
}
public class Bike2 extends Vehicle {
    void run(){
        System.out.println("Bike has a running speed");
    }
    public static void main(String args[]){
        Bike2 b= new Bike2();
        b.run();
    }
}
