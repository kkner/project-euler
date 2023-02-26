package kknr.euler.e000;

import kknr.euler.Solution;
import kknr.euler.util.Fib;
import kknr.euler.util.Util;

/**
 * Brute force.
 * Uses a generator class for fibonacci numbers.
 */
public class E02B extends Solution
{
	public E02B(boolean doPrint) {
		super(doPrint);
	}

	public int solve() 
	{
		int sum = 0;	
		
		for(Fib fib = new Fib(); fib.curr() < LIMIT; fib.adv())
		{
			if (Util.isEven(fib.curr()))
			{
				sum += fib.curr();
			}
		}
		
		return sum;
	}
	
	private static final int LIMIT = 4_000_000;
	
}
