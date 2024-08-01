import java.util.ArrayList;
/**
 * This is the main class, it calls the input and prime calculator classes
 * @author Liana Rigby
 * @version 1.0
 * @since 2024=08-01
 */
class Main {

	public static void main(String[] args)
	{
		//Collecting valid user input
		Input objInput = new Input(); 
		String numberPrompt = "Please enter a number: "; 
		int userNumber = objInput.acceptIntegerInput(numberPrompt);
		
		//Calculating prime numbers from 1 to input number
		PrimeCalculator objPrimeCalculator = new PrimeCalculator();
		ArrayList<Integer> primes = objPrimeCalculator.calculatePrimes(userNumber);
		
		//Output results
		System.out.println("Primes from 1 to " + userNumber + " are:");
		System.out.println(primes);
	}	
}
