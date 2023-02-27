package kknr.euler.e020.e23;

import java.util.List;

import kknr.euler.util.Util;

public class SolverA extends Solver
{		
	public SolverA(int lim) 
	{
		super(lim);
		
		isAbundant = new boolean[lim + 1];
	}
	
	protected void collect(List<Integer> li) 
	{
		for(int n = 1; n <= lim; n++)
		{
			boolean isAb = calcIsAbundant(n);
			
			isAbundant[n] = isAb;
			
			if (isAb) 
			{
				li.add(n);
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

	@Override
	protected boolean isAbundant(int b) {
		return isAbundant[b];
	}
	
	private boolean[] isAbundant;
}