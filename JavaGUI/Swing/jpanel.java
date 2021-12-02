package JavaGUI.Swing;

import javax.swing.*;
import java.awt.*;

public class jpanel {
    public static void main(String[] args){

        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,250,250);

        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(250,0,250,250);

        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(0,250,500,250);


        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);
    }
}
