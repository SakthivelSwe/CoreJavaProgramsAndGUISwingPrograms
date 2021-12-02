package JavaBasicPrograms;

public class factorial {
    static int factrialnum(int n){
        if(n==0){
            return 1;
        }else{
            return (n*factrialnum(n-1));
        }
    }
    public static void main(String[] args){
//        int i,fact=1;
//        int number=5;
//        for(i=1;i<=number;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial number"+number+"is: "+fact);
        int i,fact=1;
        int number=5;
        fact=factrialnum(number);
        System.out.println("factorial num"+number+"is: "+fact);
    }
}
