package kknr.euler.e000;

public class E01 
{
	/**
	 * Brute force.
	 */
	public int solve(int lim)
	{		
		int sum = 0;
		
		// For each integer in [1, lim).
		for(int i = 1; i < lim; i++) 
		{			
			// If divides with either 3 or 5, 
			if (i % 3 == 0 || i % 5 == 0) 
			{				
				// Add to sum.
				sum += i;
			}
		}
		
		return sum;		
	}
}
