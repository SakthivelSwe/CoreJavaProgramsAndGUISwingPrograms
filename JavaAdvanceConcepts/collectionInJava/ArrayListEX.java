package collectionInJava;

import java.util.ArrayList;

public class ArrayListEX {
    public static void main(String[] args){
        ArrayList<String> book=new ArrayList<>();
        book.add("C");
        book.add("C++");
        book.add("java");
        System.out.println("Books"+book.toString());
        book.add(1,"python");
        System.out.println("Books"+book.toString());
        book.remove("C");
        System.out.println("Books" + book.toString());

    }
}
