package kknr.euler.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.LongFunction;

import org.junit.jupiter.api.Test;

import kknr.euler.prime.Primes4000;

public class FactorsTest
{
	@Test
	void test() 
	{
		List<Integer> primes = Util.asList(Primes4000.primes4000);
		
		LongFunction<ISeq<Long>> factory1 = new LongFunction<ISeq<Long>>() {
			@Override public ISeq<Long> apply(long num) {
				return new FactorsFixed(num);
			}
		};

		LongFunction<ISeq<Long>> factory2 = new LongFunction<ISeq<Long>>() {
			@Override public ISeq<Long> apply(long num) {
				return new FactorsPList(num, primes);
			}
		};

		LongFunction<ISeq<Long>> factory3 = new LongFunction<ISeq<Long>>() {
			@Override public ISeq<Long> apply(long num) {
				return new Factors(num, new SeqList<>(primes));
			}
		};

		LongFunction<ISeq<Long>> factory4 = new LongFunction<ISeq<Long>>() {
			@Override public ISeq<Long> apply(long num) {
				return new Factors(num, new Seq23579());
			}
		};
		
		LongFunction factories[] = {factory1, factory2, factory3, factory4};

		for(LongFunction<ISeq<Long>> factory: factories) 
		{
			testFactors(factory, new int[] {2,5,5,11} );
			testFactors(factory, new int[] {2,5} );
			testFactors(factory, new int[] {2} );
			testFactors(factory, new int[] {7} );
			testFactors(factory, new int[] {7,7} );		
			testFactors(factory, new int[] {} );
		}
	}

	/**
	 * 
	 * @param factors Must be sorted prime numbers.
	 */
	private void testFactors(LongFunction<ISeq<Long>> factory, int[] factors) 
	{
		// Calculate product of all factors.
		long num = 1;
		for(int e: factors)
		{
			num *= e;
		}
		
		ISeq<Long> f = factory.apply(num);
		
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
