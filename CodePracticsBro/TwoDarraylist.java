import java.util.ArrayList;

public class TwoDarraylist {
    public static void main(String[] args){

        ArrayList<ArrayList<String>> cakeCutting=new ArrayList<>();
        ArrayList<String> cakeList=new ArrayList<>();
        cakeList.add("BlackForast");
        cakeList.add("Vennila");
        cakeList.add("plain");

        ArrayList<String> productList=new ArrayList<>();
        productList.add("ice");
        productList.add("cream");
        productList.add("ban");

        ArrayList<String> otherList=new ArrayList<>();
        otherList.add("cakeCandile");
        otherList.add("slicer");

        cakeCutting.add(cakeList);
        cakeCutting.add(productList);
        cakeCutting.add(otherList);

        System.out.println(cakeCutting.get(0).get(0));
    }
}
