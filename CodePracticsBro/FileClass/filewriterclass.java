package FileClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filewriterclass {
    public static void main(String[] args) {
        try{
            FileWriter writer=new FileWriter("C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\art.txt");
            writer.write("hi what to dooo");
            writer.append("\n hiiiii");
            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
