package JavaBasicPrograms;

import java.util.Scanner;

public class PrimeNumber {
    //primeNumberUsingMethod
    static void checknumber(int n){
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" not prime number");
                    flag=1;
                    break;
                }
            }
            if (flag == 0) {

                System.out.println(n+" prime number");
            }
        }
    }
    public static void main(String[] args){
//        checknumber(1);
//        checknumber(3);
//        checknumber( 5);
//        checknumber(13);
//        checknumber(35);
        while (true) {
            Scanner sc = new Scanner(System.in);
            int n1 = sc.nextInt();
            checknumber(n1);
        }
    //primenumberfindFirstMethod
//        int i,m=0,flag=0;
//        int n=3;
//        m=n/2;
//        if(n==0||n==1){
//            System.out.println(n+"it not prime number");
//
//        }else{
//            for(i=2;i<=m;++i){
//                if(n%i==0){
//                    System.out.println(n+"it not prime number");
//                    flag=1;
//                    break;
//                }
//            }
//            if(flag==0){
//                System.out.println(n+" its prime number");
//            }
//        }
//
    }
}
