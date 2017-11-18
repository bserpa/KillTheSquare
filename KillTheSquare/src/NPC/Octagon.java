package NPC;

public class Octagon extends NPC {

	//constructor
	public Octagon() {
		this.health = 8;
		//this.setHealth(level);    //increase health if the level is higher
		//must know the level to call this
	}
	
	
	//functions
	public void Move() {
		//moves straight down the grid
		yLoc++;
	}//end Move
	
	
	public void Shoot() {
		//shoots in 8 directions away from it (vertically, horizontally and all 4 diagonals)
	}//end shoot
	
}
