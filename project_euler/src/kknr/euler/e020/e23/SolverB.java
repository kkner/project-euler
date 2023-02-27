package kknr.euler.e020.e23;

import java.util.List;

import kknr.euler.prime.Primes3;
import kknr.euler.util.Util;

public class SolverB extends Solver 
{
	public SolverB(int lim) 
	{
		super(lim);			

		// We won't need primes > sqrt(28123).
		int maxPrime = (int)Math.ceil(Math.sqrt(E23A.LIM));
		maxPrime += 10; // We need a few extra to fetch the next prime.
		
		long[] sieve = Primes3.makeSieve(maxPrime);	
		primes = Primes3.collect(sieve, maxPrime, null);				
		
		isAbundant = new boolean[lim + 1];
	}

	@Override
	protected void collect(List<Integer> li)
	{
		// For all n <= lim.
		for(int n = 1; n <= lim; n++) 
		{
			// Calc proper divisor sum.
			long s = Util.sumOfDivisors(n, primes) - n;

			// If greater, then abundant.
			if (s > n) 
			{
				// Mark and collect.
				isAbundant[n] = true;
				li.add(n);
			}
		}		
	}

	@Override
	protected boolean isAbundant(int b) {
		return isAbundant[b];
	}				

	private boolean[] isAbundant;
	private List<Integer> primes;

}

