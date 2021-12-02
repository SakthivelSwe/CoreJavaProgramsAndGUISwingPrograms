package collectionInJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args){
        HashSet<String> hashset=new HashSet<>();
        //1.add
        hashset.add("sunil");
        hashset.add("riyaz");
        hashset.add("sunil");
        hashset.add("raja");
        hashset.add("tharun");
        System.out.println(hashset);
        //2.contains
        if(hashset.contains("tharun")){
            System.out.println("present in tharun");
        }else{
            System.out.println("dos't present in tharun");
        }

        //3.isEmety
        if(hashset.isEmpty()){
            System.out.println("set is empty");
        }else{
            System.out.println("set dos't empty");
        }

        //4.iterater
        System.out.println("");
        System.out.println("performing in iterater");
        Iterator<String> iterator= hashset.iterator();
        while(iterator.hasNext()){
            String value=iterator.next();
            System.out.println(value);
        }

        //size
        System.out.println(hashset.size());

    }
}
