package superClass;

public class main {
    public static void main(String[] args){
        Hero hero1=new Hero("Ironman",50,"Brain$$$");
        System.out.println(hero1.name+"\n"+hero1.age+"\n"+hero1.power);

        Hero hero2=new Hero("captainAmerica",173,"superSoldor");
        System.out.println(hero2.toString());
    }
}
