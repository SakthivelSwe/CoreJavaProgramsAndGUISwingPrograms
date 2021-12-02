package JavaGUI.Swing.progressBar;

import javax.swing.*;
import java.awt.*;

public class Progressbar {
    JFrame frame=new JFrame();
    JProgressBar bar=new JProgressBar();

    Progressbar(){
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setForeground(Color.RED);
        bar.setBackground(Color.black);
        bar.setFont(new Font("MV Boli",Font.BOLD,25));

        frame.add(bar);
        frame.setLayout(null);
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        fill();
    }
    public void fill(){
        int count=0;
        while(count<=100){
            bar.setValue(count);
            try {
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            count +=1;
        }
        bar.setString("Done :)");
    }
}
