import java.util.Scanner;

public class MathClass {
    //hypotenuse
    //sqrt(x*x)+(y*y);
    public static void main(String[] args){
        double x;
        double y;
        double z;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value x: ");
        x=sc.nextDouble();

        System.out.println("Enter value y: ");
        y=sc.nextDouble();

        z=Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenues: "+ z);

        sc.close();
    }
}
