package JavaGUI.Swing.Botton;

import com.sun.javafx.font.FontFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingButton extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    SwingButton(){
        ImageIcon icon=new ImageIcon("E:\\png file\\pointer.png");
        ImageIcon image=new ImageIcon("E:\\png file\\singleeyeemoji.png");


      label=new JLabel();
      label.setBounds(190,250,150,200);
      label.setIcon(image);
      label.setVisible(false);

        button=new JButton();
        button.setText("I am Button");
        button.setBounds(125,100,200,150);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setIconTextGap(-4);
        button.setForeground(Color.blue);
        button.setBackground(Color.lightGray);
        button.setFont(new Font("Comic sans",Font.BOLD,20));
        button.setFocusable(false);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.addActionListener(this);

        this.setTitle("Button");
        this.setLayout(null);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
//            System.out.println("Yes!! I'M Button");
//            button.setEnabled(false);
            label.setVisible(true);
        }

    }
}
