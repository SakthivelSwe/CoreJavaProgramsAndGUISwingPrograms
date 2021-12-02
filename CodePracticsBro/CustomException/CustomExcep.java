package CustomException;

import java.util.Scanner;

public class CustomExcep {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=scan.nextInt();
        try {
            checkAge(age);
        }
        catch (Exception e){
            System.out.println("A problem is Accure : "+e);
        }

    }
    static void checkAge(int age) throws AgeException{
        if(age<18){
            throw new AgeException("\n"+"your age must be 18+ now sign up");
        }else {
            System.out.println("you is now sign up");
        }
    }
}
