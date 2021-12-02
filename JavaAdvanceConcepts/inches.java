import java.util.Scanner;

public class inches {
//     inches convert to cms
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the inches");
        double inches=sc.nextDouble();
        double cms = inches*2.54;
        System.out.println("inches"+inches+" "+"convert to cms = "+cms);
    }
}
