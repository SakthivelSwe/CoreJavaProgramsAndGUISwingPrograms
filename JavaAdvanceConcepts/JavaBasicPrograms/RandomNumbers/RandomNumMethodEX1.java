package JavaBasicPrograms.RandomNumbers;
import java.lang.Math;
public class RandomNumMethodEX1 {
    public static void main(String[] args){
        System.out.println("1st Random Number: "+Math.random());
        System.out.println("2st Random Number: "+Math.random());
        System.out.println("3st Random Number: "+Math.random());
        System.out.println("4st Random Number: "+Math.random());

        //another method using farmula (Math.random)*(max-min+1)+min
        int min=100;
        int max=400;
        System.out.println("The float random numbers in "+ min +"and " +max);
        double a=Math.random()*(max-min+1)+min;
        System.out.println(a);
        System.out.println("The int random number in "+min+"and"+max);
        int b=(int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
    }
}
