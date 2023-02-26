package kknr.euler.e000;

import kknr.euler.Solution;
import kknr.euler.util.Util;

public class E06 extends Solution
{
	public E06(boolean doPrint) {
		super(doPrint);
	}

	public long solve(int n) 
	{		
		long tri = Util.triangular(n);
		return tri * tri - Util.pyramidal(n);
	}

}
