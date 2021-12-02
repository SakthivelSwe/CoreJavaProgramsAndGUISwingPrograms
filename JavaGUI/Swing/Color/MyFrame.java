package JavaGUI.Swing.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button=new JButton("choose Color");
        button.addActionListener(this);

        label=new JLabel();
        label.setText("Nobody Cares Work hord ");
        label.setFont(new Font("MV Boli",Font.PLAIN,15));
        label.setBackground(Color.white);
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JColorChooser colorChooser=new JColorChooser();
            Color color=JColorChooser.showDialog(null,"I Choose color..my choise",Color.BLACK);
            label.setBackground(color);
        }

    }
}
