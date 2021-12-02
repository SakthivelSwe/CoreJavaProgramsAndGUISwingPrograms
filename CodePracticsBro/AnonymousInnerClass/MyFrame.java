package AnonymousInnerClass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JButton button1=new JButton("button #1");
    JButton button2=new JButton("button #2");
    JButton button3=new JButton("button #3");
  MyFrame(){
      this.add(button1);
      this.add(button2);
      this.add(button3);
      button1.setBounds(50,100,100,100);
      button2.setBounds(100,100,100,100);
      button3.setBounds(150,100,100,100);

      button1.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              System.out.println("you click in button #1");
          }
      });
      button2.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              System.out.println("you click in button #2");
          }
      });
      button3.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              System.out.println("you click in button #3");
          }
      });

      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(420,420);
      this.setLayout(null);
      this.setVisible(true);
  }
}
