package collectionInJava;

import javax.naming.Name;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetEx{
    public static void main(String[] args){
        TreeSet<String> Names=new TreeSet();
        //add
        Names.add("sunil");
        Names.add("Riyaz");
        Names.add("sunil");
        Names.add("vijay");
        System.out.println(Names);

        //containes
        if(Names.contains("vijay")){
            System.out.println("vijay present in TreeSet");
        }else{
            System.out.println("vijay dosn't present in TreeSet");
        }

        //isEmpty
        if(Names.isEmpty()){
            System.out.println("TreeSet is Empty");
        }else{
            System.out.println("TreeSet is dosn't Empty");
        }

        //iterator
        Iterator<String> iterator=Names.iterator();
        while(iterator.hasNext()){
            String value=iterator.next();
            System.out.println(value);
        }

        //size
        System.out.println(Names.size());

        //remove
        System.out.println(Names.remove("vijay"));
    }
}
