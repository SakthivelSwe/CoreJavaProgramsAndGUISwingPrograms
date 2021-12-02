class animal {
}
class dog1 extends animal{
    static void method(animal a){
        if(a instanceof dog1){
            dog1 d=(dog1)a;
            System.out.println("ok downcasting executed");
        }
    }
    public static void main(String args[]){
        animal a = new dog1();
        dog1.method(a);
        dog1 d=new dog1();
        System.out.println(d instanceof animal);
    }
}

