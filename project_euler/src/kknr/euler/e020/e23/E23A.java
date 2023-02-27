package kknr.euler.e020.e23;

import kknr.euler.Solution;

public class E23A extends Solution
{
	public E23A(boolean doPrint) {
		super(doPrint);
	}
	
	public int solve()
	{		
		return new SolverA(LIM).solve();
	}	

	public static final int LIM = 28123;
}

