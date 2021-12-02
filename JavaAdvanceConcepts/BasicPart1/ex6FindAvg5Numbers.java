package BasicPart1;

import java.util.Scanner;

public class ex6FindAvg5Numbers {
    public static void main(String[] args){
       // Scanner avg=new Scanner(System.in);

//        System.out.println("input FirstNumber:");
//        int num1=avg.nextInt();
//
//        System.out.println("input SecondNumber");
//        int num2=avg.nextInt();
//
//        System.out.println("input ThirdNumber");
//        int num3=avg.nextInt();
//
//        System.out.println("input FourthNumber");
//        int num4=avg.nextInt();
//
//        System.out.println("input fifthNumber");
//        int num5=avg.nextInt();
//
//        System.out.println("Average in five numbers= "+(num1+num2+num3+num4+num5)/5 );

        Scanner sc=new Scanner(System.in);
        System.out.println("input the numbers");
        double num=0;
        double x=1;
        int n=sc.nextInt();
        while(x<=n){
            System.out.println("input number"+"("+(int)x+")");
            num +=sc.nextInt();
            x += 1;
        }
        double avg= num/n;
        System.out.println("avgs num= "+avg);
    }
}
