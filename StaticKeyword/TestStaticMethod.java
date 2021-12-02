//use static method
class Student{
    int rolleno;
    String name;
    static String college="VIT";
    static void change(){
        college="kmg";
    }
    Student(int r,String n){
        rolleno=r;
        name=n;
    }
    void display(){
        System.out.println(rolleno+" "+name+" "+college);
    }

}
public class TestStaticMethod {
    public static void main(String[] args){
        Student.change();
        Student s1=new Student(333,"sanjiv");
        Student s2=new Student(555,"karan");
        Student s3=new Student(777,"murugan");
        s1.display();
        s2.display();
        s3.display();

    }
}
