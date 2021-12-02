class operation{
    int squere(int n){
        return n*n;
    }
}
public class Circle {
    operation op;
    double pi=3.14;
    double area(int redius){
        op=new operation();
        int rsquere=op.squere(redius);
        return pi*rsquere;
    }
    public static void main(String[] args){
        Circle c=new Circle();
        double result=c.area(5);
        System.out.println(result);
    }
}
