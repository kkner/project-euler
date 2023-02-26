package kknr.euler.e000;

import kknr.euler.Solution;

public class E05B extends Solution
{
	public E05B(boolean doPrint) {
		super(doPrint);
	}

	public long solve(int hi, int[] primes)
	{	
		int prod = 1;
		
		for(int p: primes) 
		{
			if (p > hi) 
			{
				break;
			}
			
			// Find the highest number of factor p encountered.  
			int best = 0;
			for(int x = p; x <= hi; x++)
			{
				best = Math.max(best, countFactor(x, p));
			}
			
			// Multiply with that many ps.
			for(int i = 0; i < best; i++)
			{
				prod *= p;
			}
		}
		
		return prod;
	}

	/**
	 * How many times can x be divided by f?
	 * @param p
	 * @param x
	 * @return
	 */
	public static int countFactor(int x, int f) 
	{
		int count = 0;
		
		for(; x > 0 && x % f == 0; x /= f)
		{
			count++;
		}
		
		return count;
	}

	public static final int[] PRIMES = {2,3,5,7,11,13,17,19};
}
