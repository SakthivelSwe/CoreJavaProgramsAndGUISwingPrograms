package JavaGUI.Swing;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.StyledEditorKit;
import java.awt.*;

public class jlabel {
    public static void main(String[] args){

        ImageIcon image=new ImageIcon("E:\\computer.jpg");
        Border border=BorderFactory.createLineBorder(Color.green,5);

        JLabel label=new JLabel();
        label.setText("Bro, dou you even the code?");
        label.setFont(new Font("MV Boli",Font.BOLD,20));
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setIconTextGap(3);
        label.setBorder(border);
        label.setForeground(new Color(0x00ff00));
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);


        JFrame frame=new JFrame();
        frame.setTitle("Jlabel Example");
        frame.setVisible(true);
        //frame.setSize(500,500);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        ImageIcon png=new ImageIcon("E:\\imagelogo1.png");
        frame.setIconImage(png.getImage());

    }
}
