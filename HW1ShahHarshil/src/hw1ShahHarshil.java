import java.util.Scanner;
 
/*Name: Harshil Shah
 * Assignment: Homework 1
 * CSCE - 145
 * Fall 2021
 * USC Sumter
 */
public class hw1ShahHarshil {

	public static void main(String[] args)
	
	{
		
		// ASKING user for inputs		
		Scanner kb = new Scanner(System.in);
		String fullName = "";
		
		//while loop
		while(!fullName.equals("stop") && !fullName.equals("end"))
	
			{				
		//  Ask user for first and last name
			
			
				
				System.out.println("Enter your Fullname with space between your first name and last name: ");
				fullName = kb.nextLine().toLowerCase();
			
				if( !fullName.equals("stop") && !fullName.equals("end")) 
				{
				
						// Ask for letter grade 
					System.out.println("Enter your letter grade ");
					String letterGrade = kb.nextLine();
					// Three sides of traingle
		
					int sideA = 0;
					int sideB = 0;
					int sideC = 0;
					int perimeter = 0;
		
					System.out.println("Enter three integer number for three sides of the traingle ");
					System.out.println("Side A: ");
					sideA = kb.nextInt();
		
					System.out.println("Side B: ");
					sideB = kb.nextInt();

					System.out.println("Side C: ");
					sideC = kb.nextInt();
					kb.nextLine(); // This grabs any extra/floating return
			
					if (sideC >= sideB+sideA || sideB >= sideC+sideA || sideA >= sideB+sideC)
					{
						System.out.println("Not a triangle ");
					}
					else {
						perimeter = sideA+sideB+sideC ;
						System.out.println("Perimeter of a triangle is: " + perimeter);
					}
		
					// Case statemetns for letterGrade
		
					switch(letterGrade.toLowerCase())
					{
					case "a":
						System.out.println("Letter grade range is 92 - 100 " );
						break;
					case "b":
						System.out.println("Letter grade range is 86 - 92 " );
						break;
					case "c":
						System.out.println("Letter grade range is 76 - 86 " );
						break;
					case "d":
						System.out.println("Letter grade range is 70 - 76 " );
						break;
					default:
						System.out.println("The grade you entered is invalid" );
		
					}
		
					//Vowel count
					int vowelCount = 0;
					int l = fullName.length();// this will give you the length of the string, variable l will store that length
					char ch;
		
					for(int i = 0; i < l; i++)
					{
						ch = fullName.charAt(i);
						if (ch=='a' || ch == 'e' || ch=='i' || ch=='o' ||ch=='u') {
						vowelCount++;
						}
					}			
		
						System.out.println("Vowel Percentage in your name: " + 100 * vowelCount/fullName.length());
						//System.out.println(fullName.length());		
			
					}//if end
					
				
					
			}//while loop
		System.out.println("Program has ended");

	}
	
}
