//method overloading in type promotion
public class overloadingCalculation1 {
    void sum(int a,long b){

        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        overloadingCalculation1 obj=new overloadingCalculation1();
        obj.sum(20,30);
        obj.sum(50,4,6);
    }
}
