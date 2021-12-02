import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        if(number<0){
            System.out.println("The most of the positive number");
        }else{
            Boolean flag=Boolean.TRUE;
            for(int i=2;i<number;i++){
                if(number%i==0){
                    flag=Boolean.FALSE;
                    break;
                }

            }
            if(flag==Boolean.TRUE){
                System.out.println("primeNumbwe");
            }else{
                System.out.println("not primeNumber");
            }
        }
    }
}
