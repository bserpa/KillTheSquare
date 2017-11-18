package Game;
import NPC.*;
import Player.*;
import Powerup.*;
import javax.swing.*;

public class Main {
	public static void main (String[] args) {
		Player p1 = new Player();
		p1.printInfo();
		p1.HitByNPC();//checks hits
		p1.HitByShot();
		p1.AddScore(100);
		p1.AddScore(5000);//checks scores
		p1.printInfo();
		p1.PlusHealth();
		p1.PlusHealth();
		//p1.Move(3, 1);
		p1.Move(50, -50);
		p1.printInfo();
		p1.setHealth(1);
		Life l1 = new Life();
		Health h1 = new Health();
		l1.Plus(p1);//checks supports
		h1.Plus(p1);
		l1.Plus(p1);
		h1.Plus(p1);
		p1.printInfo();
		
		Triangle t1 = new Triangle();
		t1.printInfo();
		int cnt = 0;
		while(cnt < 25) {//checks movement to player
			t1.Move(p1);
			cnt++;
		}
		t1.printInfo();
		p1.Move(-200, 150);
		cnt = 0;
		while(cnt < 30) {//checks movement to player
			t1.Move(p1);
			cnt++;
		}
		p1.printInfo();
		t1.printInfo();
		
		
		Rhombus r1 = new Rhombus();
		r1.printInfo();
		cnt = 0;
		while(cnt < 30) {//checks movement of rhombus, should move diagonally left, down
			r1.Move();
			cnt++;
		}
		r1.printInfo();
		
		Octagon o1 = new Octagon();
		o1.printInfo();
		cnt = 0;
		while(cnt < 30) {//checks movement of octagon, should move down
			o1.Move();
			cnt++;
		}
		o1.printInfo();
		
		Boss b1 = new Boss();
		b1.printInfo();
		cnt=0;
		for(cnt = 0; cnt < 2500; cnt++) { //checks boss movement
			b1.Move();
		}
		b1.printInfo();
		
		
		
		
		
	}
}
