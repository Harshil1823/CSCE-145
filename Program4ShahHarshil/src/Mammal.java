
public class Mammal extends Animals {

	// constructor
	public Mammal() {
		setType("Mammal");
	}
	
	//overrieds the getSkin method in Animal
	public String getSkin() {
		return "Fur"; 
	}
}
