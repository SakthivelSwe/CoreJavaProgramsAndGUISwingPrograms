import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;
public class GuiProgram {
    public static void main(String[] args){
        String name=JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showInputDialog(null ,"Hello "+name);

        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showInputDialog(null,"your are "+age+" years old");

        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showInputDialog(null,"your are "+height+" cm inches");
    }
}
