package com.mytankwar.tank;

import java.awt.Color;

public class Enemy extends Tank {

	public Enemy(int x, int y) {
		super(x, y);
		this.setDirection(TankConstants.TOWARDS_DOWN);
		this.setColor(Color.BLUE);
		this.setSpeed(5);
	}

	@Override
	public void run() {
		int i = 20;
		while(i>0){
			this.move();
			System.out.println("move");
			i--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
