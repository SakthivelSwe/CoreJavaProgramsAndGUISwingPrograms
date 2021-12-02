package JavaGUI.Swing;

import javax.swing.*;
import java.awt.*;

public class flowlayout {
    public static void main(String[] args){
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel=new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.lightGray);

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);

    }
}
