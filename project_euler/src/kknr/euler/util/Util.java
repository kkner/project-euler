package kknr.euler.util;

import java.math.BigInteger;

public class Util 
{
	public static final BigInteger B0 = BigInteger.ZERO;
	public static final BigInteger B1 = BigInteger.ONE;
	public static final BigInteger B2 = BigInteger.valueOf(2);

	private static final long TRIANGULAR_MAX_N = (long)Math.sqrt(Long.MAX_VALUE); 

	/**
	 * Construct a BigInteger from a long.
	 * @param x
	 * @return
	 */
	public static BigInteger B(long x)
	{
		return BigInteger.valueOf(x);
	}

	/**
	 * Calculates the nth triangular number.
	 */
	public static long triangular(long n)
	{
		assert n >= 0 && n <= TRIANGULAR_MAX_N;
		
		return n * (n + 1) / 2;
	}

	private static final long TRIANGULAR2_MAX_N = (long)Math.sqrt(Long.MAX_VALUE * 2.0) - 1L;

	/**
	 * Calculates the nth triangular number.
	 * Wider input range.
	 */
	public static long triangular2(long n)
	{
		assert n >= 0 && n <= TRIANGULAR2_MAX_N;
		
		if (n % 2L == 0)
		{
			return (n / 2L) * (n + 1L);
		} 
		else
		{
			return n * ((n + 1L) / 2L);
		}
	}
	
	/**
	 * Is the number even?  
	 * @param x
	 * @return
	 */
	public static boolean isEven(long x) {
		 return x % 2L == 0L;
	}
	
	/**
	 * Is the number odd?
	 * @param x
	 * @return
	 */
	public static boolean isOdd(long x) {
		 return x % 2L != 0L;
	}	
}
