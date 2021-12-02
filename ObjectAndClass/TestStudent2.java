
//By Reference variable
class students{
    int id;
    String name;

}

public class TestStudent2 {
    public static void main(String[] args){
        students s1=new students();
        s1.id=100;
        s1.name="karthi";
        System.out.println(s1.id+" "+s1.name);
    }
}
