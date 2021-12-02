package JavaGUI.Swing.checkbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox chekcbox;
    ImageIcon xIcon;
    ImageIcon checkMarkIcon;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        xIcon=new ImageIcon("E:\\png file\\x.png");
        checkMarkIcon=new ImageIcon("E:\\png file\\chackmark.png");

        button=new JButton("sumbit");
        button.addActionListener(this);

        chekcbox=new JCheckBox();
        chekcbox.setText("I am not robot");
        chekcbox.setFont(new Font("Consola",Font.PLAIN,25));
        chekcbox.setSelectedIcon(checkMarkIcon);
        chekcbox.setIcon(xIcon);


        this.add(button);
        this.add(chekcbox);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==button){
         System.out.println(chekcbox.isSelected());
     }
    }
}
