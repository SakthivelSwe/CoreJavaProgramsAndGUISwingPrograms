//super keyword in real use
class person{
    int id;
    String name;
    person(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class emp extends person{
    float salary;
    emp(int id,String name,float salary){
        super(id, name);
        this.salary=salary;
    }
    void print(){
        System.out.println(id+" "+name+" "+salary);
    }
}
public class TestSuper4 {
    public static void main(String[] args){
        emp e=new emp(111,"sunil",50000);
        e.print();
    }
}
