import javax.swing.JOptionPane;

public class Program5ShahHarshil {

	public static void main(String[] args) {

		String fileName;
		String text;
		boolean exit = false;
		//asking user to enter the name of the file and attaching it to fileName var
		
		while(!exit) {
			String userChoice = JOptionPane.showInputDialog(null, "What would you like to do with the file? \n"
																	+ "Enter 1 to create a file \n"
																	+ "Enter 2 to write to a file \n"
																	+ "Enter 3 to append to a file \n"
																	+ "Enter 4 to read to the file \n"
																	+ "Enter 5 to exit");
			int choice = Integer.parseInt(userChoice);
		
			//fileName = JOptionPane.showInputDialog("Enter the name of the text file you want to create");
			
			//case statements
			/*
			switch(choice) {
			case 1: 
				FileSystem.createFile(fileName);
				break;
			case 2:
				FileSystem.write(fileName);
				break;
			case 3:
				FileSystem.append(fileName);
				break;
			case 4:
				FileSystem.read(fileName);
				break;
			case 5:
				//exit
				JOptionPane.showMessageDialog(null, "End of program");
				break;
			}
			*/
			
			
			switch(choice) {
			case 1: 
				fileName = JOptionPane.showInputDialog("Enter the name of the text file you want to create");
				FileSystem.createFile(fileName);
				break;
			case 2:
				fileName = JOptionPane.showInputDialog("Enter the name of the text file you want to write over");
				text = JOptionPane.showInputDialog("Enter a line of text for the file");
				FileSystem.write(fileName, text);
				break;
			case 3:
				fileName = JOptionPane.showInputDialog("Enter the file name to add text to (append to) ");
				text = JOptionPane.showInputDialog("Enter text to append");
				FileSystem.append(fileName, text);
				break;
			case 4:
				fileName = JOptionPane.showInputDialog("Enter the file you want to read from");
				FileSystem.read(fileName);
				break;
			case 5:
				//exit
				exit = true;
				JOptionPane.showMessageDialog(null, "End of program");
				break;
			}
			
		}
		
		
	}//main

}//class
