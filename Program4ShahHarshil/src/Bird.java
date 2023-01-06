
public class Bird extends Animals {
	private int flySpeed;
	
	//constructor
	public Bird() {
		setType("bird");
		flySpeed = getWalkSpeed()*4;
	}
	//overrides the getMove method in Animal
	public String getMove() {
		return ("flies " + flySpeed);
	}
	//overrieds the getSkin method in Animal
	public String getSkin() {
		return "feathers";
	}
}
