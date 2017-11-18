package NPC;

public class Rhombus extends NPC {

	//constructor
	public Rhombus() {
		this.health = 5;
		//this.setHealth(level);    //increase health if the level is higher
		//must know the level to call this
	}
	
	
	//functions
	public void Move() {//moves down and from right to left
		//moves down the grid (we could add sideways movement too)
		yLoc++;
		xLoc--;
		if(xLoc == 0) {
			xLoc = 500;//other side
		}
	}//end Move
	
	
	public void Shoot() {
		// shoot in one direction
	}//end shoot

}
