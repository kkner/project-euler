package kknr.euler.e020;


import java.util.HashSet;
import java.util.Set;

import kknr.euler.Solution;

public class E29 extends Solution
{	
	public E29(boolean doPrint) {
		super(doPrint);
	}

	public long solve()
	{
		boolean[] done = new boolean[LIM + 1];
		
		int count = 0;		
		
		for(int a = 2; a <= LIM; a++)
		{
			// Already processed as a power of a smaller number. 
			if (done[a])
			{
				continue;
			}
			
			// If this number cannot produce a power <= LIM
			if (a * a > LIM)
			{
				// All 99 powers are unique.
				count += LIM - 2 + 1;
				continue;
			}
		
			// Keep track of unique powers.
			Set<Integer> set = new HashSet<Integer>();
		
			// Iterate over all powers of a <= LIM.			
			for(int power = a, p = 1; power <= LIM; power *= a, p++)
			{
				done[power] = true;
				addPowers(set, p);
			}
			
			count += set.size();
		}
	
		return count;
	}

	private void addPowers(Set<Integer> set, int p) 
	{		
		// 4^50 -> 2^100 seen before as 2^100
		// 8^33 -> 2^99  seen before as 2^99
		// 4^51 -> 2^102 first time
		// 8^34 -> 2^102 seen before as 4^51
		
		for(int b = 2; b <= LIM; b++)
		{ 
			set.add(b * p);
		}
	}
	
	public static final int LIM = 100;
}
