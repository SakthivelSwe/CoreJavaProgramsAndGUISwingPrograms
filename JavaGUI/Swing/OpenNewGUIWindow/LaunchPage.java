package JavaGUI.Swing.OpenNewGUIWindow;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_COLOR_BURNPeer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame=new JFrame();
    JButton myButton=new JButton("New Windoe");
    LaunchPage(){
        myButton.setBounds(100,150,180,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);

        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        NewWindow newWindow=new NewWindow();

    }
}
