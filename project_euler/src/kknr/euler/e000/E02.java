package kknr.euler.e000;

import kknr.euler.Solution;
import static kknr.euler.util.Util.isEven;

/**
 * Brute force.
 */
public class E02 extends Solution
{
	public E02(boolean doPrint) {
		super(doPrint);
	}

	public int solve() 
	{		
		int sum = 0;		
		
		for(int prev = 1, curr = 1; curr < LIMIT; ) 
		{			
			if (isEven(curr))
			{
				sum += curr;
			}
			
			// Calculate next fibonacci number.
			// (prev, curr) <- (curr, prev + curr)
			curr += prev;
			prev = curr - prev;
		}
		
		return sum;
	}
	
	private static final int LIMIT = 4_000_000;
}
