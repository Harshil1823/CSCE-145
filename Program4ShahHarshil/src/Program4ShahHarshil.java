//import java.util.Scanner;

import javax.swing.JOptionPane;
public class Program4ShahHarshil {
/*
 * Name: Harshil shah
 * Assignment: program4
 * Semester: Fall 2021
 * School: USC Sumter
 * class: CSCE 145
 * Date: Undecided
 * 
 */
	public static void main(String[] args) {
		
		//create array 
		Animals storeAnimals [] = new Animals[4];
		//create objects and store it in a array
		storeAnimals[0] = new Animals();
		storeAnimals[1] = new Bird();
		storeAnimals[2] = new Fish();
		storeAnimals[3] = new Mammal();
		
		//print the .getMessage() method to the console in for loop 
		for(int i=0; i<storeAnimals.length;i++) {
			JOptionPane.showMessageDialog(null,storeAnimals[i]);
			//System.out.println(storeAnimals[i].getMessage());
		}
		
	}

}
