package kknr.euler.util;

import java.util.NoSuchElementException;

public class Fib implements ISeq<Long> 
{
	@Override
	public boolean has() 
	{
		return prev != ILLEGAL_VALUE;
	}

	@Override
	public Long curr() 
	{
		return curr;
	}

	@Override
	public Long adv() 
	{
		if (prev == ILLEGAL_VALUE)
		{
			throw new NoSuchElementException();
		}
		
		// If next value would overflow, 
		if (curr > Long.MAX_VALUE - prev) 
		{
			// Mark termination.
			prev = ILLEGAL_VALUE;
			
			// Return last found element.
			return curr;
		} else {
			// (prev, curr) <- (curr, curr + prev)
			curr += prev;
			prev = curr - prev;
			return prev;
		}
	}

	private long prev = 1, curr = 1;
	
	private static final long ILLEGAL_VALUE = -1;
}
