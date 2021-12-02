package BasicPart1;

import java.util.Scanner;

public class ex5RadiusFindPerimeterAndArea {
    //circle perimeter and area
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius");
        double radius= sc.nextDouble();
        System.out.println("Perimeter is= "+(2*Math.PI*radius));
        System.out.println("Area is = "+(Math.PI*radius*radius));
    }

}
