package JavaGUI.Swing.comboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animal={"cat","dog","pig"};
        comboBox=new JComboBox(animal);
        comboBox.addActionListener(this);
        comboBox.addItem("mouse");
        comboBox.insertItemAt("cow",0);
        comboBox.setSelectedIndex(0);
        comboBox.removeItem("mouse");




        this.add(comboBox);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
        }

    }
}
