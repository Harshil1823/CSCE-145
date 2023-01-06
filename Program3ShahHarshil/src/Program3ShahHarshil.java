import javax.swing.JOptionPane;

public class Program3ShahHarshil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//show prices
		JOptionPane.showMessageDialog(null, "Cone = $3 + $2per extra scoop + $1 per topping");

		
		//3c
		//ask the user how many cones?
		
		/*For my knowledge:
		 * reason it is string is because it accepts message as a text not as a number, 
		 * So don't forget to create another variable that stores the value and have that new 
		 * variable store the value as an int using Integer.parseInt
		*/
		
	
		String numberOfCones = JOptionPane.showInputDialog(null, "How many cones?");
		int coneCount = Integer.parseInt(numberOfCones);
		if(coneCount < 1) {
			JOptionPane.showMessageDialog(null, "Error: Too few cones. Using value 1");
			coneCount = 1;
		}
		else if(coneCount > 5) {
			JOptionPane.showMessageDialog(null, "Error: Too many cones. Using value 5");
			coneCount = 5;
		}
		
		
		//create arrray of cone objects
		Cone[] cones = new Cone[coneCount];
		
		
	
		/*For my knowledge:
		 * i has to be less than cone (array) 
		 * or 
		 * else it will be out of bounds
		 */
		for(int i=0; i<cones.length; i++) {
			cones[i]= new Cone(i);
		}
		
		//printing users order
		
		JOptionPane.showMessageDialog(null, "Total cones: " + Cone.getTotalCones());
		
		JOptionPane.showMessageDialog(null, "Your order is listed as: ");
		for(int i = 0; i<cones.length; i++) {
            JOptionPane.showMessageDialog(null,cones[i]);
		}
	
		
		JOptionPane.showMessageDialog(null, "\n Total price: " + "$" + Cone.getTotalPrice()
									+ "\n Thank you for your order!");

		
	}//main class

}//class 
