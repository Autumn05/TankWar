package com.mytankwar.tank;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;

public class Friend extends Tank {

	public Friend(int x, int y) {
		super(x, y);
		this.setDir(TankConstants.TOWARDS_UP);
		this.setColor(Color.RED);
		this.setSpeed(20);
	}

	public void addKeyListener(KeyAdapter keyAdapter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}


}
