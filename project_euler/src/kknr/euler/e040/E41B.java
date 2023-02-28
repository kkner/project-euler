package kknr.euler.e040;


import java.util.Arrays;

import kknr.euler.Solution;
import kknr.euler.e020.E24;
import kknr.euler.miller.MillerRabin3;
import kknr.euler.util.Util;

public class E41B extends Solution
{
	public E41B(boolean doPrint) {
		super(doPrint);
	}

	/*
	 * All 9-digit and 8-digit permutations can be divided by 3.
	 * Search in 7-digit ones.
	 */
	public long solve()
	{	
		// Start from last permuation and go back.
		// The first prime number we find, is the result.
		
		// Starting digits. 
		int [] arr = new int[ARRAY_LEN];
		
		// 7 6 5 4 3 2 1
		Arrays.setAll(arr, i -> arr.length - i);

		do 
		{
			// Interpret current digits as a single number.  
			int p = (int)Util.read(arr, 0, arr.length);
			
			// Check for primality.
			if (MillerRabin3.isPrime(p)) 
			{
				return p;
			}
			
			// Coninue to next (previous) lex. perm.
		} while(nextPerm(arr));

		return 0; 
	}

	/**
	 * Replace the contents of the given array with the next lexicographical permutation 
	 * @param a The array to be modified.
	 * @return true if successful, false if a was already the last possible permutation.
	 */
	public static boolean nextPerm(int[] a)
	{		
		final int len = a.length;
		
		assert len >= 1;
		
		if (len == 1) 
		{
			return false;
		}
		
		// Find tail:
		int t = len - 1;
		while(t > 0 && ge(a[t - 1], a[t]))
		{
			t--;
		}
		
		// No more permutations can be generated. 
		if (t == 0)
		{
			return false;
		}
		
		// Find swap point with linear search:
		int b = len - 1;		
		while(ge(a[t - 1], a[b]))
		{
			b--;
		}
		
		Util.exch(a, t - 1, b);
		
		Util.reverse(a, t, len - 1);
		
		return true;
	}

	public static boolean ge(int a, int b)
	{
		// Reverse direction.
		return a <= b;
	}

	private static final int ARRAY_LEN = 7;
}
