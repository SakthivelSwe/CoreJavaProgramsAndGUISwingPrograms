package JavaGUI.Swing.DragandDrop;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
     DragandDrop dragandDrop=new DragandDrop();
    MyFrame(){
        this.add(dragandDrop);
        this.setTitle("Drag & Drop");
        this.setSize(600,600);
        //this.getContentPane().setBackground(Color.BLACK);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
