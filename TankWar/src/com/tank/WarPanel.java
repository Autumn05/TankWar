package com.tank;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.test.DrawTest;

public class WarPanel extends JPanel {
	Hero hero = null;
	
	public WarPanel(){
		hero = new Hero(10,10);
	}

	public void paint(Graphics g){
		super.paint(g);
		g.fillRect(0, 0, 400, 300);
		this.drawTank(hero.getX(), hero.getY(), g, 0, 1);
	}
	

	public void drawTank(int x, int y, Graphics g, int direct, int type){
		switch(type){
		case 0:
			g.setColor(Color.CYAN);
			break;
		case 1:
			g.setColor(Color.YELLOW);
			break;
		}
		
		switch(direct){
		case 0:
//			向上
			g.fill3DRect(x, y, 5, 30, false); 
			g.fill3DRect(x+15, y, 5, 30, false);
			g.fill3DRect(x+5, y+5, 10, 20, false); 
			g.fillOval(x+5, y+10, 10, 10);
			g.drawArc(50, 50, 100, 100, 30, 360);
			break;
		}
	}
}
