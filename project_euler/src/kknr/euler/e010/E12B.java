package kknr.euler.e010;

import kknr.euler.util.Fac;

/**
 * Inherits solve from E12, changes divisorCount method.
 */
public class E12B extends E12
{
	public E12B(boolean doPrint) {
		super(doPrint);
	}

	public int divisorCount(int x)
	{
		int prod = 1;
	
		// Previously found prime factor.
		int prevP = -1;
		
		// Counter for same prime factors. 
		int counter = 0;		
		
		for(Fac fac = new Fac(x); fac.has(); counter++) 
		{
			int p = (int)(long)fac.adv();
			
			// If found a different prime factor than the previous one:
			if (p != prevP) 
			{
				// Now, pCount is the count of occurence of p in x's prime factors.
				prod *= counter + 1;
				
				// Reset counter.
				counter = 0;
			}
			
			prevP = p;			
		}
		
		// Count for the last distinct prime factor.
		prod *= counter + 1;
		
		return prod;
	}
	
	private static final int TARGET = 500;	
}
