package Player;
import Powerup.*;
import java.awt.*;
import javax.swing.*;
public class Player extends JPanel {
	private int health;
	private Power_Up power;
	private int lives;
	private int score;
	private int xLoc; 
	private int yLoc;
	
	public Player(){
		//new square
		health = 100;
		power = new Basic(5);
		lives = 3;
		score = 0;
		xLoc = 300;
		yLoc = 300;
	}
	public void setHealth(int temp) {
		health = temp;
	}
	public int getHealth() {
		return health;
	}
	public void setPower(Power_Up temp) { //replaced AssignPower
		power = temp;
	}
	public Power_Up getPower() {
		return power;
	}
	public void setLives(int chances) {
		lives = chances;
	}
	public int getLives() {
		return lives;
	}
	public void setScore(int temp) {
		score = temp;
	}
	public int getScore() {
		return score;
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
	

	
	
	public void PlusHealth() {
		if(health >= 100) {//if health is full, player is rewarded with a life
			PlusLife();
		}
		else {//else player refills 25% of his health
			health += 25;
			if(health > 100) { // if over 100%, player is set to 100 to be too OP
				health = 100;
			}
		}
	}
	public void PlusLife() { //Adds 1 life
		lives++;
	}
	public void Move(int x, int y){//moves player based on given x and y values
		xLoc = xLoc + x; yLoc = yLoc + y;
	}
	public void Shoot() {
		//creates shot object that moves across map on set path
		
	}
	public void HitByShot() {//just got shot then -25 to health
		health = health - 25;
		if(health <= 0) {// if health is less than 0, take away one life.
			lives--;
			health = 100;
		}
	}
	public void  HitByNPC() {//hit by suicide triangle or crashed into NPC
		lives--;
	}
	public void AddScore(int value) {
		score= score + value;
	}
	
	public void printInfo() {
		System.out.println("Printing Player Info");
		System.out.println("\tHealth: "+health);
		System.out.println("\tLives: "+lives);
		System.out.println("\tScore: "+score);
		System.out.println("\tX-Coordinate: "+xLoc);
		System.out.println("\tY-Coordinate: "+yLoc+"\n");
	}
	
	/*
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.red); //color has to be before draw
		g2d.drawRect(xLoc, yLoc, 10, 10); //draw shape is empty, fill shape is full
		
	}*/
}
