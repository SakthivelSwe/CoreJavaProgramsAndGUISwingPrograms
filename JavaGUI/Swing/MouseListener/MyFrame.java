package JavaGUI.Swing.MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.FlavorEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {


    JLabel lable;
//    ImageIcon first;
//    ImageIcon second;
//    ImageIcon Third;
//    ImageIcon Four;

    MyFrame(){

        lable=new JLabel();
        lable.addMouseListener(this);
        lable.setBounds(190,150,150,150);
        lable.setBackground(Color.red);
        lable.setOpaque(true);

//        first=new ImageIcon("E:\\png file\\computer.jpg");
//        second=new ImageIcon("E:\\png file\\jokeremoji.png");
//        Third=new ImageIcon("E:\\png file\\singleemoji.png");
//        Four=new ImageIcon("E:\\png file\\face.png");

        this.add(lable);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
       // this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Your Clicked the Mouse");
        lable.setBackground(Color.green);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Your Pressed the Mouse");
        lable.setBackground(Color.BLACK);


    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("your Released the mouse");
        lable.setBackground(Color.BLUE);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("your Entered the mouse");
        lable.setBackground(Color.CYAN);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Your Exited the Mouse");
        lable.setBackground(Color.lightGray);
    }
}
