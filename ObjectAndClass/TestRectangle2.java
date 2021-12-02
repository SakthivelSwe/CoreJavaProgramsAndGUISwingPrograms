class rectangle{
    int length;
    int width;
    void insert(int l,int w){
        length=l;
        width=w;
    }
    void calculate()
    {
        System.out.println(length*width);
    }
}
public class TestRectangle2 {
    public static void main(String args[])
    {
        rectangle r1=new rectangle(),
                r2=new rectangle();
        r1.insert(11,3);

        r2.insert(1,33);
        r1.calculate();
        r2.calculate();
    }
}
