package kknr.euler.e020;

import java.util.ArrayList;
import java.util.List;

import kknr.euler.Solution;
import kknr.euler.util.Util;

public class E23B extends Solution
{
	public E23B(boolean doPrint) {
		super(doPrint);
	}

	public int solve()
	{
		int lim = E23.LIM;
		isAbundant = new boolean[lim + 1];
		abs = new ArrayList<Integer>();
		
		markAndCollect(lim);

		return sumAll(lim, abs, isAbundant);
	}

	public static int sumAll(int lim, List<Integer> abs, boolean[] isAbundant)
	{
		int sum = 0;

		// Iterate over each possible sum.
		for(int j = 1; j <= lim; j++) 
		{
			if (!canBeWritten(j, abs, isAbundant)) 
			{
				sum += j;
			}
		}
		
		return sum;
	}

	/**
	 * Can number be written as the sum of two abundant numbers?
	 * @param n
	 * @return
	 */
	public static boolean canBeWritten(int n, List<Integer> abs, boolean[] isAbundant) 
	{
		for(int a : abs)
		{
			// Calculate the other number.
			int b = n - a;
			
			// No need to look further.
			if (b < a) 
			{
				return false;
			}
			
			// If Other number is also abundant
			if (isAbundant[b])
			{
				// So sum can be written as a + b.
				return true;
			}
		}
		
		// We couldn't find a combination.
		return false;
	}

	public void markAndCollect(int lim)
	{
		// For all n <= lim.
		for(int n = 1; n <= lim; n++)
		{
			// Calc proper divisor sum.
			int s = Util.sumOfProperDivisors(n);
			
			// If greater, then abundant.
			if (s > n) 
			{
				// Mark and collect.
				isAbundant[n] = true;
				abs.add(n);
			}
		}
		
	}

	private boolean[] isAbundant;		
	private List<Integer> abs;
}

