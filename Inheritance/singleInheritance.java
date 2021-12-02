class animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends animal{
    void bark(){
        System.out.println("bark...");
    }
}
public class singleInheritance {
    public static void main(String[] args){
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}
