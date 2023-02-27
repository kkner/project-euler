package kknr.euler.e020.e23;

import java.util.List;

public class SolverC extends Solver 
{	
	public SolverC(int lim) 
	{
		super(lim);

		mult = new int[lim + 1];		
	}
	
	@Override
	protected void collect(List<Integer> li) 
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
					li.add(i);
				}
			}
		}
	}

	@Override
	protected boolean isAbundant(int b) {
		return mult[b] - b > b;
	}

	private int[] mult;
}
