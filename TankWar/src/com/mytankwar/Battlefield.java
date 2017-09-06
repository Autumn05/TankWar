package com.mytankwar;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JPanel;
import com.mytankwar.tank.*;
import com.mytankwar.bullet.*;
import java.awt.event.*;

public class Battlefield extends JPanel implements KeyListener,Runnable {
	Friend friend = null;
	ArrayList<Enemy> enemys = new ArrayList<Enemy>();
	int enemyNum = 5;
	public ArrayList<Bullet> bullets = new ArrayList<Bullet>();

	public Battlefield(){
		friend = new Friend(50, 250);
		for(int i =0; i < enemyNum; i++){
			Enemy enemy = new Enemy((i+1)*50, 50);
			enemys.add(enemy);
//			new Thread(enemy).start();
		}
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.fillRect(0, 0, 400, 400);
		friend.draw(g, friend.getDir(),friend.getX(), friend.getY());
		for(Enemy enemy: enemys){
			enemy.draw(g, enemy.getDir(),enemy.getX(), enemy.getY());
		}
		
		for(Bullet bullet: bullets){
			bullet.draw(g, bullet.getDirection(),bullet.getX(), bullet.getY());
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	
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
        case KeyEvent.VK_F : 
        	friend.setDirection(TankConstants.STOP); 
        	friend.fire(); 
        	break;	
        default: 
        	friend.setDirection(TankConstants.STOP); 
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
