package com.tank;

import javax.swing.JFrame;

public class TankWar extends JFrame {
	WarPanel wp = null;
	
	public TankWar(){
		wp = new WarPanel();
		this.add(wp);
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TankWar tw = new TankWar();

	}

}
