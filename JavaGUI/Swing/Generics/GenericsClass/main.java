package JavaGUI.Swing.Generics.GenericsClass;

public class main {
    public static void main(String[] args){
        MyGenericsClass<Integer> myint=new MyGenericsClass<>(3);
        MyGenericsClass<Double> mydob=new MyGenericsClass<>(3.2);
        MyGenericsClass<Character> mychar=new MyGenericsClass<>('x');
        MyGenericsClass<String> mystring=new MyGenericsClass<>("sunil");
        System.out.println(myint.getValue());
        System.out.println(mydob.getValue());
        System.out.println(mychar.getValue());
        System.out.println(mystring.getValue());

    }
}
