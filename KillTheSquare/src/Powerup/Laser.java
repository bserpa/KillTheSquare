package Powerup;
import java.awt.*;
import javax.swing.*;



public class Laser extends Power_Up{

	public Laser(double x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean shoot() {
		this.y = this.y + this.speed;
		
		//check if the bullet hit another enemie or reached the top
		
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	


}
