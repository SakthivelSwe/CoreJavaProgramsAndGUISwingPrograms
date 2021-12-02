public class Call {
    void invoke(printable p){
        if(p instanceof A){
            A a=(A)p;
            a.a();
        }
        if(p instanceof B){
            B b=(B)p;
            b.b();
        }
    }
}
