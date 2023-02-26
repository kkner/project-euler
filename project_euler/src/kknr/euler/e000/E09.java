package kknr.euler.e000;

import kknr.euler.Solution;

public class E09 extends Solution
{
	public E09(boolean doPrint) {
		super(doPrint);
	}

	public long solve()
	{
		return pyth_tree(3, 1);
	}

	/**
	 * https://en.wikipedia.org/wiki/Tree_of_primitive_Pythagorean_triples#Alternative_methods_of_generating_the_tree
	 */
	private long pyth_tree(int u, int v)
	{				
		// Generate triplet from u, v.
		final int u2 = u * u, v2 = v * v;
		int a = u * v;
		int b = (u2 - v2) / 2;
		int c = (u2 + v2) / 2;

		int perimeter = a + b + c;

		// Termination condition.
		// This tree's leaves always seem to have a larger perimeter than their parent.
		if (perimeter > TARGET)
			return 0;
		
		if (TARGET % perimeter == 0)
		{
			int k = 1000 / perimeter;
			return (a*k) * (b*k) * (c*k);
		}

		// Continue generating recursively:
		long r = pyth_tree(2 * u - v, u); 
		if (r != 0)
		{
			return r;
		}
		
		r = pyth_tree(2 * u + v, u); 
		if (r != 0)
		{
			return r;
		}
		
		return pyth_tree(u + 2 * v, v);
	}

	private static final int TARGET = 1000;		
}
