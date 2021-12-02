package collectionInJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args){
        HashMap hashmap=new HashMap();
        hashmap.put(1,"Sunil");
        hashmap.put(2,"Riyaz");
        hashmap.put(3,"tharun");
        hashmap.put(4,"vijay");
        hashmap.put(5,"murali");

        System.out.println(hashmap);
        //get the value
        System.out.println("Get the value in key 2");
        System.out.println(hashmap.get(2));
        //remove the value
        System.out.println("Remove the value in key 2");
        System.out.println(hashmap.remove(2));

        Iterator iterator=hashmap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> entry=(Map.Entry<Integer,String>)iterator.next();
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println("key "+key + "  values "+ value);
        }
    }
}
