import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;
/**
 * This class is responsible for calculating all of the prime numbers from 2 to a input n. 
 * @author Liana Rigby
 * @version 1.0
 * @since 2024-08-01
 */
public class PrimeCalculator
{
	/**
	 * The default constructor
	 */
	public PrimeCalculator()
	{
		//No fields to be set
	}

	public ArrayList<Integer> calculatePrimes(int n)
	{
		//Create an array of true boolean length of n
		boolean[] primeIndex = new boolean[n];
		Arrays.fill(primeIndex, true);	

		for (int i = 2; i < Math.sqrt(n); i++)
		{
			if (primeIndex[i - 1])
			{
				int j = 2; 
				
				//Set all multiples of the found prime to false
				while (i * j <= n)
				{
					primeIndex[(i*j) - 1] = false;
					j++;
				}
			}	
		}
		
		//Create an array of only the prime number to output
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>(); 
		for (int i = 0; i < n; i++)
		{
			if (primeIndex[i])
			{
				primeNumbers.add(i+1);
			}
		}
		return primeNumbers;


	}
}
