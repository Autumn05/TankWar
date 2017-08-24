package com.mytankwar;

import javax.swing.JFrame;

public class War extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Battlefield bf = null;
	
	public War(){
		bf = new Battlefield();
		this.add(bf);
		this.addKeyListener(bf);
		this.setSize(400, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		new Thread(bf).start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		War war = new War();
	}

}
