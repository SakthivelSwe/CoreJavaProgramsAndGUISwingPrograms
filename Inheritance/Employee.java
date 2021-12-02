class Employee {
    float salary=40000;
}
class programmer extends Employee{
    int bones=10000;
    public static void main(String[] args){
        programmer p=new programmer();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("bones of programmer is:"+p.bones);
    }
}
