package FileClass;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class filereader {
    public static void main(String[] args){
        try{
           // File file =new File("C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\art.txt");
            FileReader reader=new FileReader("C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\poem.txt");
            int date=reader.read();
            while(date!=-1){
                System.out.print((char)date);
                date=reader.read();

            }
            reader.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
