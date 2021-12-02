package JavaBasicPrograms;

public class ArmStrongNumber {
    public static void main(String[] args){
        int c=0,a,temp;
        int n=371;
        temp=n;
        while(n>0){
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c){
            System.out.println("This number is an Armstrong");
        }else{
            System.out.println("This number is't an Armstrong");
        }
    }
}
