package methodoverriding;

public class dog extends animal{
    @Override
    void speak(){
        System.out.println("The dog speak in *bark*");
    }
}
