package JavaGUI.Swing;

import javax.swing.*;
import java.awt.*;

public class jframe {
    public static void main(String[] args){
        JFrame frame=new JFrame();
        frame.setTitle("JFrame is Thet here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(123,50,250));
    }
}
