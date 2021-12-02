package JavaGUI.Swing;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class joptionpane {
    public static void main(String[] args){

        JOptionPane.showMessageDialog(null,"hi i am sakthivel","title",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"do is it currect info","title",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"your computer is virus !!","title",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"what is your name?","title",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Error in your divies","Title",JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null,"dou even that confime","title",JOptionPane.YES_NO_CANCEL_OPTION);

        ImageIcon icon =new ImageIcon("E:\\png file\\jokeremoji.png");
        String[] response={"No,yes in confirm","thank you","something"};
        int answer=JOptionPane.showOptionDialog(null,"what you did it","optionmenu",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,response,0);
        System.out.println(answer);
    }
}
