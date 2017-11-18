package NPC;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import Player.Player;

public class Triangle extends NPC {
	private int counter;
	private int xDir;
	private int yDir;
	//constructor
	public Triangle() {
		this.health = 3;
		//this.setHealth(level);    //increase health if the level is higher
		//must know the level to call this
	}
	
	
	//functions
	public void Move(Player p) {
		
		if(counter == 10)
		{
			int xTemp = p.getXLocation(); int yTemp = p.getYLocation();
			xDir = ((xTemp-xLoc)/java.lang.Math.abs(xTemp-xLoc))*3;
			yDir = ((yTemp-yLoc)/java.lang.Math.abs(yTemp-yLoc))*3;
			counter = 0;
		}
		xLoc=xDir+xLoc;
		yLoc=yDir+yLoc;
		counter++;
		//takes the player position and moves down along the grid towards the player
		
	}//end Move
	
	
	public void Crash() {
		//cause explosion and damage the player
	}//end crash
	
	
	public void Shoot() {
		// trololololol triangles can't shoot
	}//end shoot

	
	/*
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.red); //color has to be before draw
		//g2d.drawRect(xLoc, yLoc, 10, 10); //draw shape is empty, fill shape is full
		int[] x= {xLoc-5,xLoc,xLoc+5};
		int[] y= {yLoc-5,yLoc+5,yLoc-5};
		g2d.drawPolygon(x, y, 3);
		
	}*/
}//end triangle
