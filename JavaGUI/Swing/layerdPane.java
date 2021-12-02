package JavaGUI.Swing;

import javax.swing.*;
import java.awt.*;

public class layerdPane {
    public static void main(String[] args){
        JLabel label1=new JLabel();
        label1.setBackground(Color.RED);
        label1.setBounds(50,50,200,200);
        label1.setOpaque(true);

        JLabel label2=new JLabel();
        label2.setBackground(Color.GREEN);
        label2.setBounds(100,100,200,200);
        label2.setOpaque(true);

        JLabel label3=new JLabel();
        label3.setBackground(Color.BLUE);
        label3.setBounds(150,150,200,200);
        label3.setOpaque(true);



        JLayeredPane layeredPane=new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

//        layeredPane.add(label1,Integer.valueOf(0));
//        layeredPane.add(label2,Integer.valueOf(2));
//        layeredPane.add(label3,Integer.valueOf(1));

        layeredPane.add(label1,layeredPane);
        layeredPane.add(label2,layeredPane.DEFAULT_LAYER);
        layeredPane.add(label3,layeredPane);

        JFrame frame=new JFrame("JLayerdPane");
        frame.setLayout(null);
        frame.add(layeredPane);
        frame.setSize(500,500);
        frame.setVisible(true);

    }
}
