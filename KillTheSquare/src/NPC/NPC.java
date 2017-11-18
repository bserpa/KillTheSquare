package NPC;

import javax.swing.*;

public abstract class NPC extends JPanel {
	
	protected int health;
	protected int xLoc;
	protected int yLoc;
	
	//constructor
	public NPC(){
		health = 5;
		xLoc = 300;//middle use random number generator to get it to spawn in different spots
		yLoc = 300;//top
	}
	public NPC(int x, int y){
		
		health = 5;
	}
	
	public void setXLocation(int tempX) {
		xLoc = tempX;
	}
	public void setYLocation(int tempY){
		yLoc=tempY;
	}
	public int getXLocation() {
		return xLoc;
	}
	public int getYLocation() {
		return yLoc;
	}
	//functions
	public void Damaged(int damage) {
		this.health = this.health - damage;
		if(this.health < 1)	//if the ship has no more health
			Destroyed(); //the ship is destroyed
	}
	
	public abstract void Shoot(); //how the ships shoot
	
	
	public void setHealth(int level) {
		this.health = this.health * level; //increases health based on level
	}//end setHealth
	
	
	public void Destroyed() {
		//makes an explosion on the screen
	}
	
	public void printInfo() {
		System.out.println("Printing NPC Info");
		System.out.println("\tHealth: "+health);
		System.out.println("\tX-Coordinate: "+xLoc);
		System.out.println("\tY-Coordinate: "+yLoc+"\n");
	}
	
}
