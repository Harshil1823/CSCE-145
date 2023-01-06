//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Animals {
	
	private int walkSpeed;
	private String type;
	
	//default constructor
	public Animals() {
		//Scanner kb = new Scanner(System.in);
		
		//System.out.println("Enter the walk speed: ");
		String enterWalkSpeed = JOptionPane.showInputDialog(null, "Enter the walk speed: ");
		setWalk(Integer.parseInt(enterWalkSpeed));
		
		//setWalk(kb.nextInt());
		setType("Animal");
	}
	//sets value of the private variable walkSpeed
	public void setWalk(int newWalkSpeed) {
		walkSpeed = newWalkSpeed;
	}
	//sets a type of animals, did not asked from the user, Hard coded it
	public void setType(String newType) {
		type = newType;
	}
	//getter
	public String getMove() {
		return ("walks "+ walkSpeed);
	}
	//getter
	public String getSkin() {
		return "an epidermis";
	}
	//getter
	public String getMessage() {
		return ("The " + type + " has " + getSkin() + " and " + getMove());
	}
	//getter
	public int getWalkSpeed() {
		return walkSpeed;
	}
	
	public String toString() {
		String Print = "";
		Print += "The " + type + " has " + getSkin() + " and " + getMove();
		return Print;
	}
}
