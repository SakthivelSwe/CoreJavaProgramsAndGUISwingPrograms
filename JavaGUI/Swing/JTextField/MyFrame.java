package JavaGUI.Swing.JTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button=new JButton("sumbit");
        button.addActionListener(this);

        textField=new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("MV Boli",Font.PLAIN,25));
        textField.setForeground(new Color(0x00ff00));
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);



        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("welcome "+ textField.getText());
            button.setEnabled(false);
            textField.setEnabled(false);

        }

    }
}
