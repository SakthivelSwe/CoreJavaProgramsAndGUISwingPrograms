//this keyword can be used to return current class instance
class J{

    J getJ(){

        return this;
    }
    void msg(){

        System.out.println("Hello java");
    }
    
}
public class TestThis7 {
    public static void main(String[] args){

        new J().getJ().msg();
    }
}
