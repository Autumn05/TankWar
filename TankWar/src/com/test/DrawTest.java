package com.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawTest extends JFrame{
	MyPanel mp = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawTest dt = new DrawTest();
	}
	
	public DrawTest(){
		mp = new MyPanel();
		this.add(mp);
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}


class MyPanel extends JPanel{
	//重写Jpanel的paint方法
	public void paint(Graphics g){
		//1. 调用父类完成初始化
		super.paint(g);
		//2. 画图
//		g.drawOval(50, 20, 30, 40);
//		g.drawRect(70, 80, 40, 50);
		Image im = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/tt.png"));
		g.drawImage(im, 40, 20, this);
		g.setColor(Color.red);
		g.drawString("好感+1", 100, 200);
		
	}
}
