package test;

import javax.swing.*;

public class Helloworldswing {
    public static void main(String[] args) {
        JFrame frame=new JFrame("HelloworldSwing");
        final JLabel label=new JLabel("helloworld");
        frame.getContentPane().add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();//最小形式呈现
        frame.setVisible(true);
    }
}
