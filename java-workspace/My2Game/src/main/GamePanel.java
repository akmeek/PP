package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

//GamePanel will work as a kind of game screen.

public class GamePanel extends JPanel{
	
	//SCREEN SETTINGS
	
	final int originalTileSize = 16; //meaning it's a 16x16 tiles
	final int scale = 3;
	
	final int tileSize = originalTileSize * scale;		//we are re-scaling the tiles so we can see them more easily
	final int maxScreenCol = 16;
	final int maxScreenRow = 12;
	final int screenWidth = tileSize * maxScreenCol;
	final int screenHeigth = tileSize * maxScreenRow;
	
	Thread gameThread = new Thread();		//Basically the game clock
	
	//Constructor
	
	public GamePanel() {
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeigth));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
	}

}
