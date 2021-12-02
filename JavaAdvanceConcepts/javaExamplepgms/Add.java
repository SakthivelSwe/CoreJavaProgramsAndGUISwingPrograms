package javaExamplepgms;

public class Add {
    public void AddValues(int... variables){
        int total =0;
        for(int i=0;i<variables.length;i++){
            total=total+variables[i];
        }
        System.out.println(total);
    }
    public static void main(String[] args){
        Add a = new Add();
        a.AddValues(1,2);
        a.AddValues(20,30,50);
        a.AddValues(60,2,3,5,5,56);
    }
}
