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

	/**
	 * Is the number a palindrome?
	 * @param p
	 * @return
	 */	
	public static boolean isPalindrome(long p)
	{
		assert p >= 0;
		
		// The reconstructed number.		
		long r = 0; 

		// Remove digits from p one by one.
		for(long t = p; t > 0; t /= 10L)
		{
			// Concatenate last digit of t to the end of r. 
			r = r * 10L + t % 10L;
		}
		
		// Is the reconstructed number same as p?
		return r == p;
	}
	
	/**
	 * Euclid's algorithm.
	 */
	public static long gcd(long a, long b)
	{	
		while(b != 0) {
			long rem = a % b;
			a = b;
			b = rem;
		}
		return Math.abs(a);
	}	
	
	/**
	 * Calculates the nth square pyramidal number.
	 * @param n
	 * @return
	 */
	public static long pyramidal(int n)
	{
		return n * (n + 1) * (2 * n + 1) / 6;
	}	

    // TODO add test
	/**
	 * Given a prime count n, calculate an integer guaranteed 
	 * to be greater than the nth prime.
	 * 
	 * @param n Prime count. Must be >= 6.
	 * @return An integer guaranteed to be > nth prime.
	 */
	public static long sieveSizeUpperLimit(long n)
	{		
		//https://en.wikipedia.org/wiki/Prime-counting_function#Inequalities
		//Here are some inequalities for the nth prime, pn.
		//The left inequality holds for n ≥ 2 and the right inequality holds for n ≥ 6.
		
		assert n > 0;

		if (n < 6) 
		{
			// Fixed values.
			switch((int)n)
			{
				case 1: return 2;
				case 2: return 3;
				case 3: return 5;
				case 4: return 7;
				case 5: return 11;
			}
		}
		
		double upper = n * Math.log(n * Math.log(n));
		
		return (long)Math.ceil(upper);		
	}
}
