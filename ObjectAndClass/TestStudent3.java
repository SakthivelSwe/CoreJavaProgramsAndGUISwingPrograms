//Multiple object and store in formation in reference variable
class Students{
    int id;
    String name;
}
public class TestStudent3 {
    public static void main(String[] args){
        Students s1=new Students();
        Students s2=new Students();
        s1.id=101;
        s1.name="sunil";
        s2.id=102;
        s2.name="riyaz";
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }
}
