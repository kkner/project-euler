package kknr.euler.e000;

import kknr.euler.Solution;
import kknr.euler.util.Util;

/**
 * Analytical solution.
 * Inclusion-exclusion principle.
 * 
 *   3 +  6 +  9 + ... + 999
 *   5 + 10 + 15 + ... + 995
 * -15 - 30 - 45 - ... - 990
 * 
 *  3 + 6 + 9 + ... + 999 =
 * (1 + 2 + 3 + ... + 333) * 3 
 * 
 */
public class E01B extends Solution
{
	public E01B(boolean doPrint) {
		super(doPrint);
	}

	public int solve(int n)
	{
		n--;
		
		int sum = 0;
		
		sum += 3 * Util.triangular(n / 3);
		sum += 5 * Util.triangular(n / 5);
		sum -= 15 * Util.triangular(n / 15);
		
		return sum;
	}
}
