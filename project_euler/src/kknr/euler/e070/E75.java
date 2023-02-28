package kknr.euler.e070;

import kknr.euler.Solution;
import kknr.euler.util.Util;

public class E75 extends Solution
{
	public E75(boolean doPrint) {
		super(doPrint);
	}

	public long solve()
	{
		int[] hitCount = new int[(int) limit + 1];

		for (long m = 2; m <= limit; m++) 
		{
			boolean found = false;
			boolean m_even = m % 2 == 0;
			for (long n = 1; n < m; n++)
			{
				boolean n_even = n % 2 == 0;
				if (m_even || n_even)
				{
					if (Util.gcd(n, m) == 1)
					{
						long sum = 2 * m * (m + n);
					
						if (sum > limit) 
						{
							break;
						}
						
						found = true;
						int isum = (int) sum;
						
						for (int j = isum; j <= limit; j += isum) 
						{
							hitCount[j]++;
						}
					}
				}
			}
			
			if (!found) 
			{
				break;
			}
		}

		int count = 0;
		for (int x : hitCount) 
		{
			if (1 == x) 
			{
				count++;
			}
		}

		return count;
	}

	private static final long limit = 1_500_000;
	// private static final long limit = 120;
	
}
