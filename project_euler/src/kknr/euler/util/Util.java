package kknr.euler.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Util 
{
	public static final BigInteger B0 = BigInteger.ZERO;
	public static final BigInteger B1 = BigInteger.ONE;
	public static final BigInteger B2 = BigInteger.valueOf(2);

	public static final long TRIANGULAR_MAX_N = (long)Math.sqrt(Long.MAX_VALUE); 

	/**
	 * Construct a BigInteger from a long.
	 * @param x
	 * @return
	 */
	public static BigInteger B(long x)
	{
		return BigInteger.valueOf(x);
	}
	
	// TODO add test
	/**
	 * Return if a divides b.
	 * 
	 * @param a Dividend.
	 * @param b Divisor.
	 * @return If a divides b.
	 */
	public static boolean divides(long a, long b) {
		return (a % b) == 0;
	}

	/**
	 * Calculates the nth triangular number.
	 */
	public static long triangular(long n)
	{
		assert n >= 0 && n <= TRIANGULAR_MAX_N;
		
		return n * (n + 1) / 2;
	}

	public static final long TRIANGULAR2_MAX_N = (long)Math.sqrt(Long.MAX_VALUE * 2.0) - 1L;

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
	
    // TODO add test
    // TODO add comment
	public static List<Integer> asList(int[] selected)
	{
		List<Integer> dst = new ArrayList<Integer>();
		
		for(int e: selected)
		{
			dst.add(e);
		}
		
		return dst;
	}

	/**
	 * Convert list of ints to array of ints.
	 * @param li Input list of ints.
	 * @return Array containing same ints.
	 */
	public static int[] toArray(List<Integer> li)
	{
		int[] arr = new int[li.size()];
		
		int index = 0;
		
		for(int e: li) 
		{
			arr[index++] = e;
		}
		
		return arr;
	}
	
	/**
	 * Calculates base ^ power.
	 * Uses bits in the binary representation of count. 
	 * @param base
	 * @param count
	 * @return
	 */
	public static long ipow(long base, int count) 
	{		
		// If base=3, values of base will become 3,9,81,6561,... 
		long result = 1;
		
		for(; count > 0; count >>>= 1) 
		{
			// Next bit of count from right * current power
			if ((count & 1) == 1)
			{
				result *= base;
			}
			
			base *= base;
		}	
		
		return result;
	}

	/**
	 * Calculates base ^ power. 
	 * Brute force loop. 
	 * @param base
	 * @param power
	 * @return
	 */
	public static long ipowBrute(long base, int power)
	{
		long result = 1L;
		
		for(int i = 0; i < power; i++) 
		{
			result *= base;
		}
		
		return result;
	}
	
    // TODO add comment
	public static long sumOfDivisors(int n)
	{		
		return sumOfDivisors(n, new FactorsFixed(n));
	}
	
    // TODO add test
    // TODO add comment
	public static long sumOfDivisors(int n, List<Integer> primes)
	{		
		//return sumOfProperDivisors(n, new FactorsPList(n, primes));
		return sumOfDivisors(n, new Factors<>(n, new SeqList<>(primes)));
	}

    // TODO add test
	/**
	 * 
	 * Formula for sum of divisors.
	 * https://planetmath.org/formulaforsumofdivisors
	 * 
	 * 
	 * @param n
	 * @param f
	 * @return
	 */
	public static long sumOfDivisors1(int n, ISeq<Long> f)
	{	
		Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
		
		while(f.has())
		{
			int p = (int)(long)f.adv();
			Integer count = counts.get(p);
			count = count == null ? 0 : count;
			counts.put(p, count + 1);
		}
		
		// It is interesting that (prime - 1) can always divide
		// the current numerator, so our running denominator
		// is always 1.
		
		// Does (p-1) always divide (p^n - 1) when p is prime?

		long num = 1;
		long den = 1;
		
		for(Map.Entry<Integer, Integer> e: counts.entrySet()) 
		{
			int prime = e.getKey();
			int count = e.getValue();

			// Multiply running product with this prime's term.			

			// Multiply with term's numerator.
			num *= ipow(prime, count + 1) - 1;
			
			// Multiply with term's denominator.
			den *= prime - 1;
			
			long g = Util.gcd(num, den);
			num /= g;
			den /= g;
		}
		
		return num;		
	}	
	
	
	
	
    // TODO add test
	/**
	 * 
	 * Formula for sum of divisors.
	 * https://planetmath.org/formulaforsumofdivisors
	 * 
	 * 
	 * @param n
	 * @param f
	 * @return
	 */
	public static long sumOfDivisors(int n, ISeq<Long> f)
	{	
		long prevP = 0;

		// It is interesting that (prime - 1) can always divide
		// the current numerator, so our running denominator
		// is always 1.
		
		// Does (p-1) always divide (p^n - 1) when p is prime?

		long prod = 1;
		long term = 1;
		
		while(f.has())
		{
			long p = (long)f.adv();
			
			if (p != prevP) 
			{
				if (term > 1) 
				{
					prod *= (term * prevP) - 1;
					assert prod % (prevP - 1) == 0;
					prod /= prevP - 1;
				}
				term = 1;
				prevP = p;
			}
			
			term *= p;
		}

		if (term > 1) 
		{
			prod *= (term * prevP) - 1;
			assert prod % (prevP - 1) == 0;
			prod /= prevP - 1;
		}
		
		// assertEquals(sumOfProperDivisors1(n, new FactorsFixed(n)), prod);
				
		return prod;		
	}		

	// TODO add test
	/**
	 * Reverses the elements in an array in the given range. 
	 * @param a The array to be modified.
	 * @param b First index (inclusive).
	 * @param e Last index (inclusive).
	 */
	public static void reverse(int[] a, int b, int e)
	{
		for(; b < e; b++, e--) 
		{
			exch(a, b, e);
		}
	}

	// TODO add test
	/**
	 * Swaps two elements in an array
	 * @param a The array.
	 * @param p Index of element 1.
	 * @param q Index of element 2.
	 */
	public static void exch(int[] a, int p, int q)
	{
		if (p != q) 
		{
			int temp = a[p];
			a[p] = a[q];
			a[q] = temp;		
		}
	}

	// TODO add test
	/**
	 * Interpret array elements as digits and convert to a single integer. 
	 * @param arr The array of digits
	 * @return The reconstructed number.
	 */
	public static long read(int[] arr, int offset, int len)
	{
		long result = 0;
		
		for(int i = offset; i < offset + len; i++)
		{
			int d = arr[i];
			assert d >= 0 && d <= 9;
			
			result = result * 10 + d;
		}
		
		return result;
	}

    // TODO add comment
	/**
	 * Uses the Factorize class.
	 */
	public static Map<Integer, Integer> countDPF(int x)
	{		
		Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
		
		FactorsFixed fac = new FactorsFixed(x);
		
		while(fac.has()) {
			long p = fac.adv();
			assert(p <= Integer.MAX_VALUE);
			Integer count = counts.get((int)p);
			count = count == null ? 0 : count;
			counts.put((int)p, count + 1);
		}
		
		return counts;
	}
    // TODO add comment
	/**
	 * Uses the Factorize class.
	 */
	public static Map<Long, Integer> countDPF(long x)
	{		
		Map<Long, Integer> counts = new HashMap<Long, Integer>();
		
		FactorsFixed fac = new FactorsFixed(x);
		
		while(fac.has()) {
			long p = fac.adv();
			Integer count = counts.get(p);
			count = count == null ? 0 : count;
			counts.put(p, count + 1);
		}
		
		return counts;
	}}
