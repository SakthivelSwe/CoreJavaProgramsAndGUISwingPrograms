//this:to pass as an argument in the constructor
class D{
    A4 obj;
    D(A4 obj){
        this.obj=obj;
    }
    void display(){
        System.out.println(obj.data);
    }
}
class A4 {
    int data=10;
    A4(){
        D d=new D(this);
        d.display();
    }
    public static void main(String[] args){
        A4 a=new A4();
    }
}
