package GetterAndSetter;

public class main {
    public static void main(String[] args){
        car Aadi=new car();
        Aadi.setDoors(4);
        System.out.println(Aadi.getDoors());
        Aadi.setGeers(5);
        System.out.println(Aadi.getGeers());
        Aadi.setModelName("Rx18");
        System.out.println(Aadi.getModelName());
        Aadi.setColor("Blue");
        System.out.println(Aadi.getColor());
    }
}
