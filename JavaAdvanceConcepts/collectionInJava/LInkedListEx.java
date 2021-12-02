package collectionInJava;

import java.util.LinkedList;

public class LInkedListEx {
    public static void main(String[] args){
        LinkedList<String> books=new LinkedList<>();
        System.out.println(books.size());
        books.add("C");
        books.add("java");
        books.add("python");
        System.out.println(books.size());
        System.out.println(books.toString());
        books.addLast("js");
        System.out.println(books.toString());
        //books.removeFirst();
        books.contains("C++");
        System.out.println(books.toString());
    }
}
