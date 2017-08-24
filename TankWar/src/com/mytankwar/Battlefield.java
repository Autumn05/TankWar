package com.mytankwar;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JPanel;
import com.mytankwar.tank.Enemy;
import com.mytankwar.tank.Friend;
import com.mytankwar.tank.TankConstants;
import java.awt.event.*;

public class Battlefield extends JPanel implements KeyListener,Runnable {
	Friend friend = null;
	ArrayList<Enemy> al = new ArrayList<Enemy>();
	int enemyNum = 5;

	public Battlefield(){
		friend = new Friend(50, 250);
		for(int i =0; i < enemyNum; i++){
			Enemy enemy = new Enemy((i+1)*50, 50);
			al.add(enemy);
			new Thread(enemy).start();
		}
		
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.fillRect(0, 0, 400, 400);
		friend.draw(g, friend.getDirection(),friend.getX(), friend.getY());
		for(Enemy enemy: al){
			enemy.draw(g, enemy.getDirection(),enemy.getX(), enemy.getY());
		}	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Typed");	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
        case KeyEvent.VK_DOWN: 
        	friend.setDirection(TankConstants.TOWARDS_DOWN);
        	break;
        case KeyEvent.VK_UP: 
        	friend.setDirection(TankConstants.TOWARDS_UP);
        	break;
        case KeyEvent.VK_LEFT: 
        	friend.setDirection(TankConstants.TOWARDS_LEFT); 
        	break;
        case KeyEvent.VK_RIGHT: 
        	friend.setDirection(TankConstants.TOWARDS_RIGHT); 
        	break;
        default: 
        	;
       }
    	friend.move();
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	
	}

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.repaint();
		}
	}
}
