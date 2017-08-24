package com.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventTest extends JFrame implements ActionListener{


	EventPanel ep = null;
	JButton btn1 = null;
	JButton btn2 = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventTest et = new EventTest();
	}
	
	public EventTest(){
		ep = new EventPanel();
		btn1 = new JButton("上");
		btn2 = new JButton("下");
		
		this.add(btn1,BorderLayout.NORTH);
		this.add(ep);
		this.add(btn2,BorderLayout.SOUTH);
		
		btn1.addActionListener(this);
		btn1.setActionCommand("上");

		btn2.addActionListener(this);
		btn2.setActionCommand("下");
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		System.out.println("OK");
		if(a.getActionCommand().equals("上")){
			System.out.println("上被点击");
			
		}
	}

}


class EventPanel extends JPanel{
	public void paint(Graphics g){
		super.paint(g);
		g.fillRect(0, 0, 400, 300);
		g.setColor(Color.yellow);
		g.fillOval(10, 20, 30, 30);
	}
	
	public void move(){
		
	}
	
}