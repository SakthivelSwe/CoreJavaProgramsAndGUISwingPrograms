import java.util.Scanner;

public class RecursionEx {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("you can walk the how much meters? :  ");
        int distance=scan.nextInt();
        takeAStep(0,distance);
        }
        static void takeAStep(int i,int distance){
        if(i<distance){
            i++;
            System.out.println("*You can wald the steps "+i+" metar/s");
            takeAStep(i,distance);
        }else
        {
            System.out.println("your done the walking");
        }

    }
}
