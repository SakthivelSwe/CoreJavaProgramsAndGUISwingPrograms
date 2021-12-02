package FileClass;

import java.io.File;

public class main {
    public static void main(String[] args){
        File file=new File("C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\sec_msg.txt");
        if(file.exists()){
            System.out.println("The file is existes!!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getAbsoluteFile());

        }else {
            System.out.println("Those file dosn't existes");
        }
    }
}
