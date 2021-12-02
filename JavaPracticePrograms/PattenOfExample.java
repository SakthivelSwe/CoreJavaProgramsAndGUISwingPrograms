import java.util.Scanner;

public class PattenOfExample {
    public static void main(String[] args){

        System.out.println("Hello,How much stars show you?");
        Scanner scan=new Scanner(System.in);
        int numberOfStars=scan.nextInt();

        for(int i=0;i<=numberOfStars;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=numberOfStars-1;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
