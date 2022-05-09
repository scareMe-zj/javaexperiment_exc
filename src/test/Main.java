package test;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame("测试窗口");
        jf.setSize(500, 250);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton btn = new JButton("测试按钮");
        panel.add(btn);

        jf.setContentPane(panel);

        jf.setVisible(true);

    }
}
