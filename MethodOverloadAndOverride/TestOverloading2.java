//method overloading : changing to datatype of arguments
class adder{
    static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
}
public class TestOverloading2 {
    public static void main(String[] args){
        System.out.println(adder.add(11,11));
        System.out.println(adder.add(12.3,14.5));
    }
}
