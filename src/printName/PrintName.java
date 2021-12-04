package printName;

import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* [AVERAGE] 5. Keep getting input from user and print the name of the movie till the
		user enters an invalid input. */
		
		int movieNumber = 1;
		Scanner input = new Scanner(System.in);
		
		int maxMovieNum = 5;
		
		while (movieNumber < maxMovieNum)
		{
			movieNumber = movieNumber + 1;
			System.out.println("Enter the movie number(1-4): ");
			int movieName = input.nextInt();
			
			switch (movieName) 
			{
			case 1:
				System.out.println("Harry Potter and the Philosopher's Stone");
				break;
			case 2:
				System.out.println("Harry Potter and the Chamber of Secrets");
				break;
			case 3:
				System.out.println("Harry Potter and the Prisoner of Azkaban");
				break;
			case 4:
				System.out.println("Harry Potter and the Goblet of Fire");
				break;
				default:
					System.out.println("Invalid Movie Number!! Please Enter valid Movie Number");
					
			}//End of switch 
		}//End of while 
		
		input.close();
		
	}//End of main

}//End of class
