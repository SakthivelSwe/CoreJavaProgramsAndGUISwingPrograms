import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args){

        ArrayList<String> food=new ArrayList<>();

        food.add("Biriyani");
        food.add("chickenRice");
        food.add("idali");

        food.set(0,"chapathi");
        food.remove(2);
        food.clear();

        for (int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}
