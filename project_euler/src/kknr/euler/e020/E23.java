package kknr.euler.e020;

import java.util.ArrayList;
import java.util.List;

import kknr.euler.Solution;
import kknr.euler.util.Util;

public class E23 extends Solution
{
	public E23(boolean doPrint) {
		super(doPrint);
	}

	public int solve()
	{		
		int lim = LIM;
		
		// Get all abundant numbers <= lim.
		List<Integer> abs = collect(lim);

		// Can number be written as sum of two abundant numbers.
		boolean[] can = new boolean[lim + 1];		

		// Iterate over every possible sum, 
		for(int j = 0; j < abs.size(); j++) 
		{
			for(int i = j; i < abs.size(); i++) 
			{
				int sum = abs.get(j) + abs.get(i);
				
				// Bc both j & i are increasing, 
				// all the rest of the sums will be greater. 
				if (sum > LIM) 
				{
					break;
				}
				
				can[sum] = true;
			}
		}
		
		return sumConditional(can, false);
	}

	/** 
	 * Sum all indices of array where the value equals target.
	 * @param can
	 * @return
	 */
	public static int sumConditional(boolean[] can, boolean target)
	{
		int sum = 0;
		for(int i = 1; i < can.length; i++) 
		{
			if (target == can[i])
			{ 
				sum += i;
			}
		}
		return sum;
	}

	/**
	 * Collect all abundant numbers <= lim
	 * @param lim
	 * @return
	 */
	public static List<Integer> collect(int lim) 
	{
		List<Integer> abs = new ArrayList<Integer>();
		
		for(int n = 1; n <= lim; n++)
		{
			if (isAbundant(n)) 
			{
				// Add to list.
				abs.add(n);
			}
		}
		
		return abs;
	}
	
	public static boolean isAbundant(int n)
	{
		// Calculate proper divisor sum.
		int s = Util.sumOfProperDivisors(n);
		
		// If proper divisor sum is greater than n. 
		return s > n; 
	}

	public static final int LIM = 28123;
}

