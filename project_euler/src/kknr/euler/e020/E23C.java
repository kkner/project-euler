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
		lim = E23.LIM;
		
		// We won't need primes > sqrt(28123).
		int maxPrime = (int)Math.ceil(Math.sqrt(E23.LIM));
		maxPrime += 10; // We need a few extra to fetch the next prime.
		
		long[] sieve = Primes3.makeSieve(maxPrime);
	
		List<Integer> primes = Primes3.collect(sieve, maxPrime, null);				
		
		isAbundant = new boolean[lim + 1];
		abs = new ArrayList<Integer>();
		
		markAndCollect(primes);
		
		int result = sumConditional();
		
		return result;
	}

	public void markAndCollect(List<Integer> primes)
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
				abs.add(n);
			}
		}		
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
			
			if (isAbundant[b]) 
			{
				return true;
			}
		}
		
		return false; 
	}

	private int lim;
	private boolean[] isAbundant;
	private List<Integer> abs;
}

