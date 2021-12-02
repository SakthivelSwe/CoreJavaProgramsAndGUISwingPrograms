
//1)this:to refer current class instance variable
//understanding the problem without this keyword
class Student{
    int rollno;
    String name;
    float fee;
    Student(int rollno,String name,float fee){
        rollno=rollno;
        name=name;
        fee=fee;
    }
    void display(){
        System.out.println(rollno+""+name+""+fee);
    }
}
public class TestThis1 {
    public static void main(String[] args){
        Student s1=new Student(111,"arul",5000f);
        Student s2=new Student(222,"sunil",6000f);
        s1.display();
        s2.display();
    }
}
