package Swing;

import java.awt.Color;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextField;

public class java_exp_01rmb {

    public static void main(String[] args) {
        //创建组件并设置参数
        JFrame frame = new JFrame("人民币转换成美元");

//        frame.setResizable(false);//固定大小
        frame.setResizable(true);//可变大小

        JPanel panel = new JPanel();

        panel.setBackground(new Color(255, 250, 250));

        panel.setLayout(new GridLayout(5, 1, 10, 10));

        JLabel text1 = new JLabel("人民币：");

        JLabel text2 = new JLabel("美元：");

        JTextField rmbInput = new JTextField("");

        JTextField dollarOutput = new JTextField("");


        JButton bt = new JButton("转换");

        frame.setBounds(0, 0, 210, 250);

        panel.setBounds(0, 0, 200, 200);

        //添加组件
        panel.add(text1);

        panel.add(rmbInput);

        panel.add(text2);

        panel.add(dollarOutput);

        panel.add(bt);

        frame.add(panel);

        //窗体是否可见
        frame.setVisible(true);
        //frame.setVisible(false);

        //在按钮button上添加监听器
        bt.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

// TODO Auto-generated method stub

                double temp;

                JButton bt = (JButton) e.getSource();
                //输入异常处理Double.parseDouble将字符串转为double类型，可能会出现异常
                try {

                    temp = Double.parseDouble(rmbInput.getText());

                    dollarOutput.setText(""+temp / 6.1972);

                } catch (NumberFormatException n) {

                    dollarOutput.setText("你输入的金额错误！");

                }

            }

        });

    }

}