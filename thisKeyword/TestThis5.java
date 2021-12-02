//this:to invoke the current class constructor
//calling parameteriazed constructor from default constructor
class C{
    C(){
        this(5);
        System.out.println("hello C");
    }
    C(int x){
        System.out.println(x);
    }
}
public class TestThis5 {
    public static void main(String args[]){
        C c=new C();
    }
}
