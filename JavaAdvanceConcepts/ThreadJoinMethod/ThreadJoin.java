package ThreadJoinMethod;

public class ThreadJoin {
    public static void main(String[] args){
        joinThread1 t1=new joinThread1();
        joinThread2 t2=new joinThread2();
        joinThread3 t3=new joinThread3();
        t1.start();
        try{
            t1.join();
        }catch (InterruptedException e){
            System.out.println(e);
        }
        t2.start();
        t3.start();

    }
}
