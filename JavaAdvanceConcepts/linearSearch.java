import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args){
        int corpos[]=
                {
                        10,15,20,30,40,45,50
                };
        Scanner sc = new Scanner(System.in);
        int key= sc.nextInt();
        int keyPos=-1;
        for(int i=0;i<=corpos.length;i++){
            if(corpos[i]==key){
                keyPos = i;
                break;
            }

        }
        System.out.println("keyPos "+keyPos);
    }
}
