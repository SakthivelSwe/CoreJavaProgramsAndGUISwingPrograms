package JavaGUI.Swing.Generics;

public class genericsMethodEx {
    public static void main(String[] args){
        Integer[] myint={1,2,3,4,5};
        Double[]  mydouble={3.2,45.5,5.3,5.5};
        Character[] mychar={'S','U','N','I','L'};
        String[] mystring={"Sakthi","Swetha",};

        display(myint);
        display(mydouble);
        display(mychar);
        display(mystring);

    }
    public static <Thing> void display(Thing[] Array){
        for(Thing x : Array){
            System.out.print(x+" ");
        }
        System.out.println();

    }
}
