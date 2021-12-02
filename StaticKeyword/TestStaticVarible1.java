//use of static variable
class student{
    int rollno;
    String name;
    static String college="ITS";
    student(int r,String n){
        rollno=r;
        name=n;
    }
    void display(){

        System.out.println(rollno+" "+name+" "+college);
    }
}
public class TestStaticVarible1 {
    public static void main(String[] args){
        student s1=new student(222,"vel");
        student s2=new student(444,"sunil");
        student.college="kmg";
        s1.display();
        s2.display();
    }
}
