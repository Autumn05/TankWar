package com.test;

import java.awt.*;
import java.awt.event.*;

public class TestActionEvent {
    public static void main(String[] args) {
    Frame f = new Frame("TestActionEent");
    Button b1 = new Button("START");
    Button b2 = new Button("STOP");
    Monitor m = new Monitor();
    b1.addActionListener(m);  
    b2.addActionListener(m);    //  注册，告知事件源对象被m监听器所监听
    b2.setActionCommand("GAME OVER!");
    f.add(b1, BorderLayout.NORTH);
    f.add(b2, BorderLayout.SOUTH);
    f.pack();       //  根据内容确定Frame边框大小，类似外围包装上一层
    f.setVisible(true);
    }
}

class Monitor implements ActionListener {
    public void actionPerformed(ActionEvent e) {  //  事件信息被打包在了ActionEvent e中传递过来，等待处理
        System.out.println("A Button has been pressed!\n" + 
        "the relative info is:" + e.getActionCommand());   //  ActionCommand中默认信息为该Button的名字
    }
}
