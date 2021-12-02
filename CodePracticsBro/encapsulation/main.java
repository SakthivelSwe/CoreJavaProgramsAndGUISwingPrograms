package encapsulation;

public class main {
    public static  void main(String[] args){
        Bike bike=new Bike("Tesla","Tesla2021",2021);
        bike.setyear(2021);
        System.out.println(bike.getmake());
        System.out.println(bike.getmodel());
        System.out.println(bike.getyear());
    }
}
