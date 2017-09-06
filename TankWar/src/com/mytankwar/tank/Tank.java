package com.mytankwar.tank;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import com.mytankwar.Battlefield;
import com.mytankwar.bullet.Bullet;


public class Tank implements Runnable{
	
	/**
	 * tank的寿命
	 */
	private int lives = 0;
	
	/**
	 * tank的等级
	 */
	private int level = 0;
	
	/**
	 * tank的速度
	 */
	private int speed = 0;
	
	/**
	 * 子弹
	 */
	private Bullet bullet = null;
	
	/**
	 * 颜色
	 */
	private Color color = null;
	
	/**
	 * 朝向 0-up 1-down 2-left 3-right 4-stop
	 */
	private int direction = 0; 
	
	/**
	 * 朝向 0-up 1-down 2-left 3-right 
	 */
	private int dir = direction; 
	
	/**
	 * 坐标x
	 */
	private int x = 0;
	
	/**
	 * 坐标y
	 */
	private int y = 0;
	
	Battlefield bf;
	
	public Tank(int x,int y){
		this.x = x;
		this.y = y;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Bullet getBullet() {
		return bullet;
	}

	public void setBullet(Bullet bullet) {
		this.bullet = bullet;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void draw(Graphics g,int direct, int x, int y){	
		g.setColor(color);
    	System.out.println("当前" + "draw,dir是“" + dir + "  direction是" + direction);
		switch(direct){
		case TankConstants.TOWARDS_UP:
//			向上
			g.fill3DRect(x, y, 5, 30, false); 
			g.fill3DRect(x+15, y, 5, 30, false);
			g.fill3DRect(x+5, y+5, 10, 20, false); 
			g.fillOval(x+5, y+10, 10, 10);
			g.drawLine(x+10, y+15, x+10, y-5);
			break;
		case TankConstants.TOWARDS_DOWN:
//			向上
			g.fill3DRect(x, y, 5, 30, false); 
			g.fill3DRect(x+15, y, 5, 30, false);
			g.fill3DRect(x+5, y+5, 10, 20, false); 
			g.fillOval(x+5, y+10, 10, 10);
			g.drawLine(x+10, y+15, x+10, y+35);
			break;
		case TankConstants.TOWARDS_LEFT:
//			向上
			g.fill3DRect(x, y, 30, 5, false);
			g.fill3DRect(x, y+15, 30, 5, false);
			g.fill3DRect(x+5, y+5, 20, 10, false); 
			g.fillOval(x+10, y+5, 10, 10);
			g.drawLine(x+15, y+10, x-5, y+10);
			break;
		case TankConstants.TOWARDS_RIGHT:
//			向上
			g.fill3DRect(x, y, 30, 5, false);
			g.fill3DRect(x, y+15, 30, 5, false);
			g.fill3DRect(x+5, y+5, 20, 10, false); 
			g.fillOval(x+10, y+5, 10, 10);
			g.drawLine(x+15, y+10, x+35, y+10);
			break;
		}
	}

	public void move(){
		switch(direction){
        case TankConstants.TOWARDS_UP: 
        	y -= speed;
        	break;
        case TankConstants.TOWARDS_DOWN: 
        	y += speed;
        	break;
        case TankConstants.TOWARDS_LEFT: 
        	x -= speed;
        	break;
        case TankConstants.TOWARDS_RIGHT: 
        	x += speed;
        	break;
        case TankConstants.STOP: 
        	break;
		}
		if(direction != TankConstants.STOP){
			dir = direction;
		}
    	System.out.println("当前" + "MOVE,dir是“" + dir + "  direction是" + direction);
	}
	
	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public void fire(){
		Bullet bullet = new Bullet(x, y);
		bullet.setDirection(this.getDirection());
		Thread th = new Thread(bullet);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
