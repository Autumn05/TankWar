package com.mytankwar.bullet;

import java.awt.Graphics;

import com.mytankwar.tank.TankConstants;

public class Bullet implements Runnable{

	/**
	 * 子弹的等级
	 */
	private int level = 0;
	
	/**
	 * 子弹的速度
	 */
	private int speed = 10;
	
	/**
	 * 坐标x
	 */
	private int x = 0;
	
	/**
	 * 坐标y
	 */
	private int y = 0;
	
	/**
	 * 朝向 0-up 1-down 2-left 3-right
	 */
	private int direction = 0;
	
	public Bullet(int x,int y){
		this.x = x;
		this.y = y;
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
	
	public void draw(Graphics g,int direct, int x, int y){	
		switch(direct){
		case TankConstants.TOWARDS_UP:
//			向上 
			g.fillOval(x+5, y+10, 3, 3);
			break;
		case TankConstants.TOWARDS_DOWN:
//			向上
			g.fillOval(x+5, y+10, 3, 3);
			break;
		case TankConstants.TOWARDS_LEFT:
//			向上
			g.fillOval(x+10, y+5, 3, 3);
			break;
		case TankConstants.TOWARDS_RIGHT:
//			向上
			g.fillOval(x+10, y+5, 3, 3);
			break;
		default:
//			向上 
			g.fillOval(x+5, y+10, 3, 3);
		}
	}

	@Override
	public void run() {
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
		}
    	System.out.println("当前子弹" + "MOVE,direction是" + direction);
		
	}
	
	
}
