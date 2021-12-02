package javaExamplepgms;

import java.util.Scanner;

public class armStrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        int clonedNumber=number;
        int totalDigits=0;
        while(clonedNumber>0){
            clonedNumber=clonedNumber/10;
            totalDigits++;
        }
        clonedNumber=number;
        int totalValue=0;
        while(clonedNumber>0){
            int rem=clonedNumber % 10;
            totalValue=totalValue+(int) Math.pow(rem,totalDigits);
            clonedNumber=clonedNumber/10;
        }
        if(totalValue==number){
            System.out.println("Armstrong");
        }else{
            System.out.println("not a Armstrong");
        }


    }
}
