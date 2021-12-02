//Real uses of this() constructor
class student{
    int rollno;
    String name,course;
    float fee;
    student(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    student(int rollno,String name,String course,float fee){
        this(rollno,name,course);
        this.fee=fee;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+course+" "+fee);
    }
}
public class TestThis6 {
    public static void main(String[] args){
        student s1=new student(111,"vel","java");
        student s2=new student(222,"sunil","java",4999);
        s1.display();
        s2.display();
    }
}
