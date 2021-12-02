package BasicPart1;

import java.util.Scanner;

public class ex9SwapTwoVariable {
    public static void main(String[] args){

        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("input the x number:");
        x= sc.nextInt();
        System.out.println("input the y number");
        y=sc.nextInt();
        z=x;
        x=y;
        y=z;
        System.out.println("swapping number= " +x+ " and " +y);

    }
}
