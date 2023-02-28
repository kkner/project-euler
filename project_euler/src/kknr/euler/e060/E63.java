package kknr.euler.e060;

import static kknr.euler.util.Util.B;
import static kknr.euler.util.Util.B0;
import static kknr.euler.util.Util.B1;

import java.math.BigInteger;

import kknr.euler.Solution;
import kknr.euler.util.Util;

public class E63 extends Solution
{	
	
	public E63(boolean doPrint) {
		super(doPrint);
	}

	public long solve()
	{
		int count = 0;
		
		for(int n = 1; n <= 9; n++) 
		{	
			BigInteger N = BigInteger.valueOf(n);
			
			// current exponent
			int e = 0; 
			
			// current value of n^e
			BigInteger p = B1; 
			
			while(true) 
			{
				int numDigits = Util.numDigits(p);
				format("%d ^ %d = %d (%d)\n", n, e, p, numDigits);
				if (numDigits == e) {
					count++;
				} else if (numDigits < e) {
					break;
				}
				p = p.multiply(N);
				e++;
			}
		}
		
		return count;
	}

}


