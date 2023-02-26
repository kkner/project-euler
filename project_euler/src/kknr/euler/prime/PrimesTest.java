package kknr.euler.prime;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import kknr.euler.util.Util;

import java.util.ArrayList;
import java.util.List;

public class PrimesTest 
{
	private static final int SIEVE_SIZE = 4000;

	@Test
	public void primesTest() 
	{
		boolean[] sieve = Primes.makeSieve(SIEVE_SIZE);
		List<Integer> primes = new ArrayList<Integer>();
		Primes.collect(sieve, SIEVE_SIZE, primes);
		assertArrayEquals(Util.toArray(primes), Primes4000.primes4000);
	}
}
