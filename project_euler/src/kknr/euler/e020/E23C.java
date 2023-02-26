package kknr.euler.e020;

import java.util.ArrayList;
import java.util.List;

import kknr.euler.Solution;
import kknr.euler.prime.Primes3;
import kknr.euler.util.Util;

public class E23C extends Solution
{	
	public E23C(boolean doPrint) {
		super(doPrint);
	}

	public long solve()
	{
		int lim = E23.LIM;
		
		long[] sieve = Primes3.makeSieve(lim);
		List<Integer> primes = Primes3.collect(sieve, lim, null);
				
		boolean[] isAbundant = new boolean[lim + 1];
		List<Integer> abs = new ArrayList<Integer>();

		markAndCollect(lim, isAbundant, abs, primes);
		
		return E23B.sumAll(lim, abs, isAbundant);
	}

	public static void markAndCollect(int lim, 
		boolean[] isAb, 
		List<Integer> ab, 
		List<Integer> primes)
	{
		// For all n <= lim.
		for(int n = 1; n <= lim; n++) 
		{
			// Calc proper divisor sum.
			int s = Util.sumOfProperDivisors(n, primes);

			// If greater, then abundant.
			if (s > n) 
			{
				// Mark and collect.
				isAb[n] = true;
				ab.add(n);
			}
		}		
	}
}

