package ThreadJoinMethod;

public class joinThread3 extends Thread {
    @Override
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("t3= "+i);
        }
    }
}
