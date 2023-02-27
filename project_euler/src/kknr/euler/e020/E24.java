package kknr.euler.e020;

import java.util.Arrays;

import kknr.euler.Solution;
import kknr.euler.util.Util;

public class E24 extends Solution
{	
	public E24(boolean doPrint) {
		super(doPrint);
	}

	public long solve()
	{		
		// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		int[] arr = new int[10];
		Arrays.setAll(arr, i -> i);
		
		for(int i = 1; i < TARGET; i++) 
		{
			nextPerm(arr);
		}

		return Util.read(arr, 0, arr.length);
	}

	/**
	 * Replace the contents of the given array with the next lexicographical permutation 
	 * 
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
		int t;
		for(t = len - 1; t > 0 && a[t - 1] >= a[t]; t--) { }
		
		if (t == 0)
		{
			// No more permutations can be generated. 
			return false;
		}
		
		// Find exch point:
		int b;
		for(b = len - 1; a[t - 1] >= a[b]; b--) { }
		
		Util.exch(a, t - 1, b);
		
		Util.reverse(a, t, len - 1);
		
		return true;
	}


	
	public static final int TARGET = 1000_000;
}