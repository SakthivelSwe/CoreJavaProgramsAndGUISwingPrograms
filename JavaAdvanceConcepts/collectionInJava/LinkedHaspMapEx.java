package collectionInJava;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHaspMapEx {
    public static void main(String[] args){
        LinkedHashMap linkedhashmap=new LinkedHashMap();
        linkedhashmap.put(1,"maaran");
        linkedhashmap.put(2,"veeran");
        linkedhashmap.put(3,"pratheep");
        linkedhashmap.put(4,"madhi");
        System.out.println(linkedhashmap);

        //get values;
        System.out.println(linkedhashmap.get(4));
        //remove values
        System.out.println(linkedhashmap.remove(3));
        //iterator
        Iterator iterator=linkedhashmap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry=(Map.Entry<Integer,String>)iterator.next();
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println("key "+key+" values "+value);
        }
    }
}
