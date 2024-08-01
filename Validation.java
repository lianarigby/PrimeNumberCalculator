/**
 * This class is responsible for validating the input of users
 * @author Liana Rigby
 * @version 1.0
 * @since 2024-08-01
 */

public class Validation
{
	/**
	 * The default constructor
	 */
	public Validation()
	{
		//No fields to be set
	}

	/**
	 * This method checks to see if the input can be converted if it canconverted to an integer
	 * @param userInputString (String) The string input by the user
	 * @return A boolean, true if the string can be converted to integer, else false. 
	 */
       public boolean isInteger(String userInputString)
       {
		try
	 	{
			int userInputInt = Integer.parseInt(userInputString);
			return true;
		}
		catch (NumberFormatException e)
		{
			return false; 
		}
       }
}       
