package JavaGUI.Swing.OpenNewGUIWindow;

import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame=new JFrame();
    JLabel label=new JLabel();


    NewWindow(){
        label.setBounds(0,0,250,20);
        label.setFont(new Font(null,Font.PLAIN,25));
        label.setText("Hello!!!");

        frame.add(label);
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
