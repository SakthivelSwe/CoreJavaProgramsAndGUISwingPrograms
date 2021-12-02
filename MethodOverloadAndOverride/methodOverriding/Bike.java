//understanding the problem without the methodoverriding
class vehicle{
    void run(){
        System.out.println("vehicle is running");
    }
}
public class Bike extends vehicle {
    public static void main(String[] args){
        Bike b=new Bike();
        b.run();
    }

}
