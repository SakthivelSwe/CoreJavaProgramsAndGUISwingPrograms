package collectionInJava;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args){
        Vector<String> vector=new Vector<>();
        vector.add("Sunil");
        vector.add("riyaz");
        vector.add("tharun");
        vector.add("vel");
        System.out.println(vector);
        vector.add(2,"murugan");
        System.out.println(vector);
        vector.remove(2);
        System.out.println(vector);
    }
}
