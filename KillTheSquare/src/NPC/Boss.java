package NPC;

public class Boss extends NPC {
	private int xDir;
	private int counter;
	//Constructor
	public Boss() {
		this.health = 50;
		xDir = 1;
		counter = 0;
	}
	
	public void Move() {
		//moves from side to side, stays in the upper half of the grid
		if(counter == 10) {
			xLoc+=xDir;
			if(xLoc == 1000) {
				xDir = -1;
			}
			else if(xLoc == 0) {
				xDir = 1;
			}
		}
		else {
			counter++;
		}
	}
	
	public void Shoot() {
		//shoots like the octagon, all directions
		// we can make it shoot in pulses of 3-6 bullets
	}
	
}
