//A real time example of method overriding
class  Bank{
    int getRateOfInterest(){

        return 0;
    }
}
class SBI extends Bank{
    int getRateOfInterest(){

        return 8;
    }
}
class ICICI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class AXSI extends Bank{
    int getRateOfInterest(){
        return 6;
    }
}
public class Test {
    public static void main(String[] args){
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXSI a=new AXSI();
        Bank b=new Bank();
        System.out.println(b.getRateOfInterest());
        System.out.println("SBI rate of interest:"+s.getRateOfInterest());
        System.out.println("ICICI rate of interest:"+i.getRateOfInterest());
        System.out.println("AXCI rate of interest:"+a.getRateOfInterest());
    }
}
