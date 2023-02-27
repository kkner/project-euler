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
		lim = LIM;	
		
		abs = new ArrayList<Integer>();
		isab = new boolean[lim + 1];

		collect();

		int result = sumConditional();
		
		abs = null;
		isab = null;
		
		return result;
	}	

	private void collect() 
	{
		for(int n = 1; n <= lim; n++)
		{
			boolean isAbundant = calcIsAbundant(n);
			
			isab[n] = isAbundant;
			
			if (isAbundant) 
			{
				abs.add(n);
			}
		}
	}

	public static boolean calcIsAbundant(int n)
	{
		// Calculate proper divisor sum.
		long s = Util.sumOfDivisors(n) - n;
		
		// If proper divisor sum is greater than n. 
		return s > n; 
	}

	private int sumConditional() 
	{
		int sum = 0;
		
		for(int n = 1; n <= lim; n++) 
		{
			if (!isSumOfTwo(n))
			{
				sum += n;
			}
		}
		
		return sum;
	}

	private boolean isSumOfTwo(int n) 
	{		
		for(int a: abs) 
		{
			if (a >= n)
			{
				break;
			}
			
			int b = n - a;
			
			if (isab[b]) 
			{
				return true;
			}
		}
		
		return false; 
	}

	private int lim;
	private List<Integer> abs;
	private boolean[] isab;

	public static final int LIM = 28123;
}

