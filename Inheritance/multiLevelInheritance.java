class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class dog extends Animal{
    void Bark(){
        System.out.println("barking...");
    }
}
class babydog extends dog{
    void weep(){
        System.out.println("weeping");
    }
}
public class multiLevelInheritance {
    public static void main(String[] args){
        babydog b=new babydog();
        b.weep();
        b.Bark();
        b.eat();
    }
}
