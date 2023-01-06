import javax.swing.JOptionPane;

public class Cone {
	
	//static variables
	private static int totalCones=0, totalPrice=0;

	//instance variables
	private int scoopCount;
	private int topCount;
	private int conePrice;
	private int conePlace;
	
	
	//properties of an individual cone
	private String [] scoopFlavors;
	private String [] toppings;


	private String[] places = {"1st", "2nd", "3rd", "4th", "5th"};
	
	
	//default constructor
	public Cone() {
		scoopCount = 0;
		topCount = 0;
		conePrice = 0;
		conePlace = 0;
		addCone();
	}
	
	//constructor for number, 4Ci, Ask professor
	public Cone(int num) {
		this(); //calling the default constructor
		conePlace = num;
		setScoops(places[num]);
        setTops(places[num]);
        setPrice();
	}	
	
	//add total cones, and cone method
	public static void addCone() {
		totalCones++;
	}
	
	//total price
	//changed
	public void addTotalPrice() {
        totalPrice += conePrice;
}
	/*
	public static void addTotalPrice(Cone cones) {
		totalPrice += cones.conePrice;
	}
	*/
	
	public void setScoops() {
		scoopCount = Integer.parseInt(JOptionPane.showInputDialog("Enter total scoops for a cone: "));
		if (scoopCount < 1) {
			JOptionPane.showMessageDialog(null, "Error: Too few scoops. Enter minimum value 1");
			scoopCount = 1;
		} else if (scoopCount > 3) {
			JOptionPane.showMessageDialog(null, "Error: Too many scoops. Limit is 3");
			scoopCount = 3;
		}
		
		scoopFlavors = new String[scoopCount];
		//to set each flavor of scoop
		for (int i = 0; i < scoopFlavors.length; i++) {
			if(scoopCount == 1) {
				scoopFlavors[i] = JOptionPane.showInputDialog("Enter scoop flavor");
			}
			else {
				scoopFlavors[i] = JOptionPane.showInputDialog("Enter " + places[i]+" scoop flavor");
			}
		}//end of for loop
	}
	
	
	//Overload setScoops method, 4ei
	public void setScoops(String conePlace) {
		scoopCount = Integer.parseInt(JOptionPane.showInputDialog("Enter total scoops for " + conePlace + " cone: "));
		if (scoopCount < 1) {
			JOptionPane.showMessageDialog(null, "Error: Too few scoops. Enter minimum value 1");
			scoopCount = 1;
		} else if (scoopCount > 3) {
			JOptionPane.showMessageDialog(null, "Error: Too many scoops. Limit is 3");
			scoopCount = 3;
		}
		
		scoopFlavors = new String[scoopCount];
		//to set each flavor of scoop
		for (int i = 0; i < scoopFlavors.length; i++) {
			if(scoopCount == 1) {
				scoopFlavors[i] = JOptionPane.showInputDialog("Enter scoop flavor");
			}
			else {															
				scoopFlavors[i] = JOptionPane.showInputDialog("Enter " + places[i]+" scoop flavor");
			}
		}//end of for loop
	}
	
	
	//toppings, 4f and 4fi ask questions
	public void setTops() {

		topCount = Integer.parseInt(JOptionPane.showInputDialog("Enter total topings for cone: "));
		if (topCount < 0) {
			JOptionPane.showMessageDialog(null, "Error: Too few toppings. Using value 0");
			topCount = 0;
		} else if (topCount > 2) {
			JOptionPane.showMessageDialog(null, "Error: Too many toppings. Limit is 2");
			topCount = 2;
		}

		toppings = new String [topCount];
		for(int i =0; i < toppings.length;i++) {
			if(topCount == 1) {
				toppings[i] = JOptionPane.showInputDialog("Enter the number of toppings you would like");
			}
			else {
				toppings[i] = JOptionPane.showInputDialog("Enter" + places[i]+ "flavor");
			}
		}
	}
	
	//Overload setTops method 4fi
	public void setTops(String place) {

		topCount = Integer.parseInt(JOptionPane.showInputDialog("Enter total topings for " + place + " cone: "));
		if (topCount < 0) {
			JOptionPane.showMessageDialog(null, "Error: Too few toppings. Using value 0");
			topCount = 0;
		} else if (topCount > 2) {
			JOptionPane.showMessageDialog(null, "Error: Too many toppings. Limit is 2");
			topCount = 2;
		}

		toppings = new String [topCount];
		for(int i =0; i < toppings.length;i++) {
			if(topCount == 1) {
				toppings[i] = JOptionPane.showInputDialog("Enter toppings you would like");
			}
			else {
				toppings[i] = JOptionPane.showInputDialog("Enter" + places[i]+ "flavor");
			}
		}
	}
	
	public void setPrice() {
		conePrice = 2 * scoopCount + topCount + 1;					
		addTotalPrice();
	}
	
	//getters
	public int getPrice() {
		return conePrice;
	}
	public int getFlavor() {
		return scoopCount;
	}
	public int getTop() {
		return topCount;
	}
	public static int getTotalCones() {
		return totalCones;
	}
	public static int getTotalPrice(){
		return totalPrice;
	}

	
	//overwrtiting 
	
	public String toString() {
		
		/*
		JOptionPane.showMessageDialog(null, "Cone: ");
		JOptionPane.showMessageDialog(null, "Cone total scoops: " + scoopCount);
		for(int i = 0; i <scoopFlavors.length;i++) {
			JOptionPane.showMessageDialog(null, scoopFlavors[i]);

		}	
		JOptionPane.showMessageDialog(null, "Toal toppings: " + topCount);
		for(int i =0; i<toppings.length; i++) {
			JOptionPane.showMessageDialog(null, toppings[i]);

		}
		JOptionPane.showMessageDialog(null, "$" + conePrice);
		return "";
		*/
		
		
		
		String print = ""; 
		print += places[conePlace] + " Cone: ";
		
		
		print += "\n";
		print += "\nCone total Scoops: " + scoopCount;
		for(int i = 0; i <scoopFlavors.length;i++) {
			print += "\nScoop flavour: " + scoopFlavors[i];
		}
		print += "\n";
		print += "\nTotal Toppings: " + topCount;
		for(int i =0; i<toppings.length; i++) {
			print += "\nToppings: " + toppings[i];
		}
		print += "\n";
		print += "\nPrice: $" + conePrice;
		return print;
		}
	
		/*
		System.out.print("Cone");
		System.out.println("Cone total Scoops: " + scoopCount);
		
		for(int i = 0; i <scoopFlavors.length;i++) {
				System.out.println(scoopFlavors[i]);
		}
		
		System.out.println("Total toppings: "+ topCount);
	
		for(int i =0; i<toppings.length; i++) {
			System.out.println(toppings[i]);
		}
		
		JOptionPane.showMessageDialog(null, "$" + conePrice);
		System.out.println("$" + conePrice);
		
		return "";
		*/

	

}//class