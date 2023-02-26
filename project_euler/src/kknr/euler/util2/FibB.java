package kknr.euler.util2;

import java.math.BigInteger;

import kknr.euler.util.Util;

public class FibB implements ISeq<BigInteger> 
{
	@Override
	public boolean has() 
	{
		return true;
	}

	@Override
	public BigInteger curr() 
	{
		return curr;
	}

	@Override
	public BigInteger adv() 
	{
		// (prev, curr) <- (curr, curr + prev)
		BigInteger next = curr.add(prev);
		prev = curr;
		curr = next;
		return prev;
	}

	private BigInteger prev = Util.B1, curr = Util.B1;
}
