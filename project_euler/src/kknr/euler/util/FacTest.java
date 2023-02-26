package kknr.euler.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

class FacTest
{
	@Test
	void test() 
	{
		testFactors(new int[] {2,5,5,11});
		testFactors(new int[] {2,5});
		testFactors(new int[] {2});
		testFactors(new int[] {7});
		testFactors(new int[] {7,7});		
		testFactors(new int[] {});
	}

	/**
	 * 
	 * @param factors Must be sorted prime numbers.
	 */
	private void testFactors(int[] factors) 
	{
		// Calculate product of all factors.
		long num = 1;
		for(int e: factors)
		{
			num *= e;
		}
		
		Fac f = new Fac(num);
		
		assertThrows(NoSuchElementException.class, () -> f.curr() );
		assertThrows(NoSuchElementException.class, () -> f.curr() );

		for(int e: factors)
		{
			assertEquals(true, f.has());
			assertEquals(true, f.has());
			assertEquals(e, f.adv());
			assertEquals(e, f.curr());
			assertEquals(e, f.curr());
		}
		
		assertThrows(NoSuchElementException.class, () -> f.adv() );
		assertThrows(NoSuchElementException.class, () -> f.adv() );
		assertEquals(false, f.has());

		if (factors.length > 0)
		{
			assertEquals(factors[factors.length-1], f.curr());
			assertEquals(factors[factors.length-1], f.curr());
		}
		
	}

}
