package JavaBasicPrograms;

import java.util.*;

public class palindromeStrings {
    public static void main(String[] args){
        String original,reverse="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values in palindrome");
        original =sc.nextLine();
        int length=original.length();
        for(int i=length - 1;i>=0;i--) {
            reverse = reverse + original.charAt(i);

        }
        if (original.equals(reverse)) {
            System.out.println("it is a palindrome");
        }else {
            System.out.println("it is not a palindrome");
        }
    }
}
