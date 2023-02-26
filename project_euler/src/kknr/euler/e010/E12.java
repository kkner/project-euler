package kknr.euler.e010;

import kknr.euler.Solution;
import kknr.euler.util.Util;

/**
 * 
 * Number of divisors = powers of every distinct prime factor + 1 multiplied.
 * 
 * 9800 = 2^3 * 5^2 * 7^2
 * has 4 * 3 * 3 = 36 divisors.
 * 
 * A triangular number:
 * T(n) = (n + 1) * n / 2
 * 
 * n and (n + 1) are coprimes.  
 * There are no shared prime factors.
 *  
 * Simply multiply the number of divisors of the two terms. 
 * 
 * divisors(T(n)) = divisors(n / 2) * divisors(n + 1)
 * 
 * 
 * 
 */
public class E12 extends Solution
{
	public E12(boolean doPrint) {
		super(doPrint);
	}

	public long solve()
	{
		// Divisor count from (n-1).
		int prev = 1;
		
		for(int n = 1; ; n++)
		{
			int term = n + 1;

			// If even, 
			if (term % 2 == 0)
			{
				// Then remove a 2.
				term /= 2;
			}
			
			int count = countDivisors(term);
			
			int combined = count * prev;
			
			// If found one,
			if (combined > TARGET) 
			{
				// Return T(n).
				return Util.triangular(n);
			}
			
			prev = count;
		}		
	}

	public static int countDivisors(int x)
	{
		// Whenever p changes, we will multiply prod with pCount.
		int prod = 1;
	
		// Current prime factor candidate.
		int p = 2;
		
		// Number of occurrences of p found.
		int pCount = 1;
		
		while(x > 1) // While not depleted,
		{	
			int d = x / p; // Try to divide.			
			
			if (d * p == x) // If it divides, 
			{
				// Found a prime factor.
				pCount++; // Increment found counter.
				x = d;    // Update remaining.
			}
			else 
			{				
				prod *= pCount; // pCount instances of p
				pCount = 1;     // Reset counter.
				// It still works when no occurences of p 
				// were found because pCount starts from 1.
				
				if (d < p) // If p >= sqrt(current x), 
				{
					// No more prime factors are possible.
					// Current value of x is the last prime factor.
					p = x;
				}
				else //  p < sqrt(current x)
				{
					// Try the next number in the sequence: 2, 3, 5, 7, 9...
					p += (p & 1) + 1; 
				}				
			}
		}
		
		// There can be one more unique prime factor.
		prod *= pCount;
		
		return prod;
	}
	
	private static final int TARGET = 500;
}



