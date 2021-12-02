package JavaGUI.Swing.RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class MyFrame extends JFrame implements ActionListener {


    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;

    MyFrame(){

     pizzaButton=new JRadioButton("Pizza");
      hamburgerButton=new JRadioButton("Hamburger");
      hotdogButton=new JRadioButton("Hotdog");

        ButtonGroup group=new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==pizzaButton){
            System.out.println("i order the Pizza");
        }else if(e.getSource()==hamburgerButton){
            System.out.println("i order the Hamburger");
        }else if(e.getSource()==hotdogButton){
            System.out.println("i order the hot dog");
        }

    }
}
