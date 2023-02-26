package kknr.euler.prime;


import static kknr.euler.prime.Primes.*;
import static kknr.euler.prime.Primes2.*;

import java.util.ArrayList;
import java.util.List;

public class Primes3
{
	/**
	 * Skip even numbers.
	 * Use bit array.
	 * 
	 * @param maxPrime Largest prime candidate checked by the algorithm, inclusive.
	 */
	public static long[] makeSieve(long maxPrime)
	{
		// when maxPrime = 511, arrSize will be 4.
		// when maxPrime = 512, arrSize will be 4.
		// isPrime3(511) will look up arr position 3.
		// isPrime3(512) would use arr position 4, if not for even number check.
		// when maxPrime = 512, isPrime(x) with x > 512 will throw exception.

		// max p should be such that this should not overflow:
		// return (int)(p >>> 7); 

		assert maxPrime <= MAX_PRIME3;
		
		final long arrSize = calcArrSize(maxPrime);
		
		// Redundant bc of the first assertion.
		assert arrSize <= MAX_ARRAY_SIZE;
		
		// Round up to include all the bits at the end.
		maxPrime = correctMaxPrime(maxPrime);
		
		long[] sieve = new long[(int)arrSize];

		// Mark 1 (and 0) as non-prime
		// set(sieve, 0);
		sieve[0] = 1;

		// 2,3,5,7,9,...
		// Only need to check p when p * p <= maxPrime.
		// Condition equivalent to p <= maxPrime / p.
		for (long p = 3; p <= maxPrime / p; p += 2)
		{
			// If p is prime,
			// if (!read(sieve, p / 2))
			if ((sieve[(int)(p >>> 7)] & (1L << ((p >>> 1) & 63))) == 0) 
			{
				// Mark all multiples.
				// Multiples < p * p are already marked.
				for (long k = p * p; k <= maxPrime; k += p << 1) 
				{
					// Mark as non-prime.
					// set(sieve, k / 2);
					sieve[(int)(k >>> 7)] |= 1L << ((k >>> 1) & 63);
				}
			}
		}

		return sieve;
	}
	
	/**
	 * 
	 * maxPrime is corrected with this method inside method3.
	 * 
	 * Round maxPrime up to cover the entire array.
	 * This way, all the bits in the last element will be processed.
	 * 
	 * A called of method3 may use this to discover the actual maxPrime 
	 * that was used inside method3.
	 * 
	 *  
	 * maxPrime = 511 -> arrSize = 4, corrected to 512
	 * maxPrime = 512 -> arrSize = 4, corrected to 512
	 * maxPrime = 513 -> arrSize = 5, corrected to 640
	 * 
	 * @param maxPrime
	 * @return
	 */
	public static long correctMaxPrime(long maxPrime)
	{
		// If divisible by 128, no need to change.
		if ((maxPrime & 127) == 0)
		{
			return maxPrime;
		}
		else
		{
			return maxPrime / 128 * 128 + 128;
		}
	}
	
	public static long calcArrSize(long maxPrime) 
	{
		assert maxPrime <= MAX_PRIME3;
		
		return ((maxPrime + 1) / 2 + 63) / 64;	
	}
	

	/**
	 * Called does not have to check for whether p > the initial maxPrime given to method3.
	 * any value > inital maxPrime but <= corrected maxPrime will produce a correct result.
	 * any value above corrected maxPrime   
	 * 
	 * 
	 * @param sieve array generated by a call to method3
	 * @param p 
	 * @return
	 */
	public static boolean isPrime(long[] sieve, long p)
	{
		if (p < 2) return false; // negative numbers and 0, 1 are not prime
		if (p < 4) return true; // 2 and 3 are primes
		if ((p & 1) == 0) return false; // even numbers > 2 are not prime
				
		return (sieve[(int)(p >>> 7)] & (1L << ((p >>> 1) & 63))) == 0;
	}
	
	public static boolean read(long[] arr, int index) 
	{
		return (arr[index >>> 6] & (1L << (index & 63))) != 0;
	}

	public static void set(long[] arr, int index) 
	{
		arr[index >>> 6] |= 1L << (index & 63);
	}

	public static List<Integer> collect(long[] sieve, long maxPrime, List<Integer> li)
	{
		if (li == null)
		{
			li = new ArrayList<Integer>();
		}
		
		listAdd(li, 2);
		
		for (long i = 1; i <= maxPrime; i += 2) 
		{
			// if (!read(sieve, i / 2))
			if ((sieve[(int)(i>>>7)] & (1L << ((i>>>1) & 63))) == 0) 
			{
				listAdd(li, i);
			}
		}
		
		return li;
	}
	
	public static List<Long> collectL(long[] sieve, long maxPrime, List<Long> li)
	{
		if (li == null) 
		{
			li = new ArrayList<Long>();
		}
		
		listAddL(li, 2);
		for (long i = 1; i <= maxPrime; i += 2) 
		{
			// if (!read(sieve, i / 2))
			if ((sieve[(int)(i>>>7)] & (1L << ((i>>>1) & 63))) == 0) 
			{
				listAddL(li, i);
			}
		}
		
		return li;
	}

	public static List<? extends Number> collectGeneric(
			long[] sieve, 
			long maxPrime, 
			List<? extends Number> li, 
			boolean useInt)
	{
		if (li == null) 
		{
			if (useInt)
			{
				li = new ArrayList<Integer>();
			}
			else
			{
				li = new ArrayList<Long>();
			}
		}
		
		listAddGeneric(li, 2, useInt);
		
		for (long i = 1; i <= maxPrime; i += 2) 
		{
			// if (!read(sieve, i / 2))
			if ((sieve[(int)(i>>>7)] & (1L << ((i>>>1) & 63))) == 0)
			{
				listAddGeneric(li, i, useInt);
			}
		}
		
		return li;
	}
	
	// Simplified from ((MAX_ARRAY_SIZE - 1L) * 64 + 63 - 63) * 2 + 1 - 1;
	public static final long MAX_PRIME3 = (MAX_ARRAY_SIZE - 1L) * 128L;
}
