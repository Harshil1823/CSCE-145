import javax.swing.JOptionPane;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class FileSystem {

	//private static String fileName;
	//private static String text; //text from the user
	
	public static void createFile(String fileName2) {
	
		//create file and enter the name of the text file that user entered
        //File file = new File(fileName2);
		
	        PrintWriter outPutStream = null;
	        try {
	        	outPutStream = new PrintWriter(fileName2);
	        }
	        catch (FileNotFoundException e) {
	        	System.exit(0);
	        }
        }
	
	public static void write(String fileName2, String text2) {
		//read the file
		/*
		fileName = JOptionPane.showInputDialog("Enter the name of the text file you want to write over");
		*/
		
			PrintWriter outputStream = null;
			try{
				outputStream = new PrintWriter(fileName2);
				
				//text2 = JOptionPane.showInputDialog("Enter a line of text for the file");
				
			}
			catch(FileNotFoundException e){
				System.exit(0);
			}
			outputStream.println(text2);//test written in file
			outputStream.close();
		}
	
	public static void append(String fileName2, String text2) {
		/*
		fileName = JOptionPane.showInputDialog("Enter the file name to add text to");
		*/
		
		PrintWriter outputStream = null;

		try{
			outputStream = 
					new PrintWriter(new FileOutputStream(fileName2, true));
			//text = JOptionPane.showInputDialog("Enter text to append");

		}
		catch(FileNotFoundException e){
			System.exit(0);
		}
		outputStream.println(text2);
		outputStream.close();
	}
	
	public static void read(String fileName2) {
		Scanner inputStream = null;//for reading files
		try{
			inputStream = new Scanner(new File(fileName2));
		}
		catch(FileNotFoundException e){
			System.exit(0);
		}
		while(inputStream.hasNextLine()){//go through every line
			String textInFile = inputStream.nextLine();
			//System.out.println(textInFile);
			//System.out.println(inputStream.nextLine());
			JOptionPane.showMessageDialog(null, textInFile);

		}
		inputStream.close();
	}
	
	
	
	
	
}//class
