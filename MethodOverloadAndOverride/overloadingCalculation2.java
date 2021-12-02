//method overloading with type promotion in match found
public class overloadingCalculation2 {
    void sum(int a,int b){
        System.out.println("int args is invoked");
    }
    void sum(double a,double b){

        System.out.println("double args in invoked");
    }
    public static void main(String args[]){
        overloadingCalculation2 obj=new overloadingCalculation2();
        obj.sum(59.4,49.5);
    }
}
