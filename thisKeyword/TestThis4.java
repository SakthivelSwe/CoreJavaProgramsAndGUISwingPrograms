//this:to invoke the current class constructor
//calling default constructor from parametarized constructor
class B{
    B(){
        System.out.println("hello B");
    }
    B(int x){
        this();
        System.out.println(x);
    }
}
public class TestThis4 {
    public static void main(String[] args){
        B b=new B(10);
    }
}
