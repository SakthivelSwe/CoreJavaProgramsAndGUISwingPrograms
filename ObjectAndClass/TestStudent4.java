// initialization through method
class student4{
    int rollno;
    String name;
    void insertRecord(int r, String n){
        rollno=r;
        name=n;
    }

    void displayInformation()
    {
        System.out.println(rollno+"  "+name);
    }
}
public class TestStudent4 {
    public static void main(String[] args) {
        student4 s1 = new student4();
        student4 s2 = new student4();
        s1.insertRecord(111, "vel");
        s2.insertRecord(222, "arul");
        s1.displayInformation();
        s2.displayInformation();
    }
}
