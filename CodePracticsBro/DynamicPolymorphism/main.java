package DynamicPolymorphism;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Person person;
        System.out.println("Your which the Sex");
        System.out.println("(1=Boy) && (2=Girl):");
        int sex = sc.nextInt();
        if(sex==1){
            person=new Boy();
            person.loves();
        }else if(sex==2){
            person=new Girl();
            person.loves();
        }else{
            person=new Person();
            System.out.println("your selected in invalid");
            person.loves();
        }
    }
}
