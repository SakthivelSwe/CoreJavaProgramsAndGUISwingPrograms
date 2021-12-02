package JavaBasicPrograms.RandomNumbers;

import java.util.Random;

public class RandomCalssEx {
    public static void main(String[] args) {
        Random random = new Random();
        //geting the int random values
        int x =random.nextInt(50);
        int y=random.nextInt(1000);
        System.out.println("The integer random class values are");
        System.out.println(x);
        System.out.println(y);
        //geting the float random values
        float f=random.nextFloat();
        float i=random.nextFloat();
        System.out.println("The floating random class values are");
        System.out.println(f);
        System.out.println(i);
        //getting tht double random values
        double a=random.nextDouble();
        double b=random.nextDouble();
        //getting the boolean random values
        boolean c=random.nextBoolean();
        boolean d=random.nextBoolean();
        System.out.println("The boolean random class values are");
        System.out.println(c);
        System.out.println(d);
        //getting the long random values
        long m=random.nextLong();
        long n= random.nextLong();
        System.out.println("The long random class values are");
        System.out.println(m);
        System.out.println(n);

    }
}
