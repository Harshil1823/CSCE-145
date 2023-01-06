
public class Fish extends Animals{
	
	private int swimSpeed;
	
	// constructor
	public Fish() {
		setType("Fish");
		swimSpeed = getWalkSpeed()/4;
	}	
	//overrides the getMove method in Animal
	
	public String getMove() {
		return ("swims " + swimSpeed);
	}
	
	//overrieds the getSkin method in Animal
	public String getSkin() {
		return "scales";
	}
	
	
	
}
