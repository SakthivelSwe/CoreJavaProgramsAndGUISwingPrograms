import java.util.Scanner;
import java.lang.String;
public class alphabets {
    /* A=65 ,Z=90
       a=97 ,z=122
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if( c>=65 && c>=90 || (c >=90 && c>=122)){
                System.out.println(c + " " + "it is a alphabets");
            }else{
                System.out.println("it is a small alphabets");
            }
        }

    }
}