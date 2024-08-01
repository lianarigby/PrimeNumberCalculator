import java.util.Scanner; 
/**
 * This class is responsible for presenting a message to the user and accept user input via the keyboard. 
 * @author Liana Rigby
 * @version 1.0
 * @since 2024-08-01
 */

public class Input
{
	/**
	 * The default constructor
	 */
	public Input()
	{
		//No fields to be set
	}

	/**
	 * This method accepts any input from the user and returns is as a string. 
	 * @param displayMessage (String) The message that is displayed to the user to prompt their input
	 * @return The input from the user. 
	 */
	public int acceptIntegerInput(String displayMessage)
	{
		//Display message and collect user input
		Scanner console = new Scanner(System.in); 
		Validation objValidation = new Validation();
		System.out.println(displayMessage);
		String userInput = console.next(); 
		
		//Check if input is integer, re-prompt until integer is entered. 
		while (!objValidation.isInteger(userInput))
		{
			System.out.println("Input was not an integer, try again"); 
			System.out.println(displayMessage);
			userInput = console.next();
		}

		return Integer.parseInt(userInput);


	}



}
