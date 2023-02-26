package kknr.euler.util;

import java.util.List;
import java.util.NoSuchElementException;

public class Seq23579 implements ISeq<Integer> 
{
	public Seq23579() 
	{
		this.curr = 0;
	}

	@Override
	public boolean has() 
	{
		return true;
	}

	@Override
	public Integer adv() 
	{
		if (curr > Integer.MAX_VALUE - 2)
		{
			throw new NoSuchElementException();
		}
		
		if (curr == 0)
		{
			curr = 2;
		}
		else if (curr == 2) 
		{
			curr = 3;
		}
		else 
		{
			curr += 2;
		}
		
		return curr;
	}

	@Override
	public Integer curr() 
	{
		if (curr == 0)
		{
			throw new NoSuchElementException();
		}
		
		return curr;
	}

	private int curr;
}
