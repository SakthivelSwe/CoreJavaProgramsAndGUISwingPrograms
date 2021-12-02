//super is used to invoke parent class constructor
class animals{
    animals(){
        System.out.println("animals is created");
    }
}
class dogs extends animals{
    dogs(){
        super();
        System.out.println("dogs is created");
    }
}
public class TestSuper3 {
    public static void main(String[] args){
        dogs d=new dogs();
    }
}
