package kknr.euler.e020;

import java.util.ArrayList;
import java.util.List;

import kknr.euler.Solution;
import kknr.euler.prime.Primes3;
import kknr.euler.util.Util;

public class E23D extends Solution
{	
	public E23D(boolean doPrint) {
		super(doPrint);
	}
	
	public long solve()
	{
		lim = E23.LIM;		
		mult = new int[lim + 1];		
		abundants = new ArrayList<Integer>();

		collect();

		int result = sumConditional();
		
		abundants = null;
		mult = null;
		
		return result;
	}

	private void collect() 
	{
		for(int i = 0; i < mult.length; i++)
		{
			mult[i] = 1;
		}
		
		for(int i = 2; i <= lim; i++) 
		{
			if (mult[i] == 1) // If prime, 
			{
				if (i > lim / 2)
				{
					// Stopping here doesn't change the result.
					break;
				}

				for(int j = i; j <= lim; j += i) 
				{					
					if (j % i == 0) 
					{
						long p = i;
						for(int x = j; (x % i == 0) && x > 1; x /= i) 
						{
							p *= i;
						}
						mult[j] *= (p - 1) / (i - 1);
					}
				}
			} 
			else 
			{
				if (mult[i] - i > i)
				{
					//format("%d: %d\n", i, mult[i]);
					abundants.add(i);
				}
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
		for(int a: abundants) 
		{
			if (a >= n)
			{
				break;
			}
			
			int b = n - a;
			
			// If b is abundant?
			if (mult[b] - b > b) 
			{
				return true;
			}
		}

		return false;
	}

	private int lim;
	private List<Integer> abundants;
	private int[] mult;
}

