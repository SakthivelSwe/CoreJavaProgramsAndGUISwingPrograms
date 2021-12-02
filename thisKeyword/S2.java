//this:to pass as an argument in the method
public class S2 {
    void m(S2 obj){
        System.out.println("method is invoked");
    }
    void n(){
        m(this);
    }
    public static void main(String[] args){
        S2 s1=new S2();
        s1.n();
    }
}
