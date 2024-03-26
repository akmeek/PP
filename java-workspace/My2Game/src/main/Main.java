package main;

import javax.swing.JFrame;

public class Main {
	
	public static void main (String[] args) {

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("First Game");
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		
		window.pack();	//window will be sized to fit the settings and layout from GamePanel
		
		
		window.setLocationRelativeTo(null);		//will be displayed at the center of the screen	
		window.setVisible(true);
		
	}

	
}
