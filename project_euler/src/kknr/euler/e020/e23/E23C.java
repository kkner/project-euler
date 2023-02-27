package kknr.euler.e020.e23;

import kknr.euler.Solution;

public class E23C extends Solution
{	
	public E23C(boolean doPrint) {
		super(doPrint);
	}
	
	public long solve()
	{
		return new SolverC(E23A.LIM).solve();
	}

}

