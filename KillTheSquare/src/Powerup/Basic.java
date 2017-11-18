package Powerup;
import java.awt.*;
import javax.swing.*;

public class Basic extends Power_Up{

	public Basic(double y) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean shoot() {
		this.y = this.y + this.speed;
		
		//array for bullets
		//check if the bullet hit another enimie or reached the top
		
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
