package Powerup;

import java.awt.*;
import javax.swing.*;

public abstract class Power_Up {
	public double damage;
	public double y;
	public double speed;
	public Color color;
	
	public Power_Up() {
		
	}
	
	public Power_Up (double y) {
		this.y = y;
		this.color = Color.red;
		this.speed = 15;
	}
	
	public abstract boolean shoot();
	
	public abstract void draw(Graphics g);
	
	
}
