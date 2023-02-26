package kknr.euler.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UtilTest 
{
	@Test
	public void triangular() {
		assertEquals(6, Util.triangular(3));
		assertEquals(10, Util.triangular(4));
		assertEquals(15, Util.triangular(5));
		assertEquals(15, Util.triangular(5));
		assertEquals(0, Util.triangular(0));
		assertEquals(4611686016981624750L, Util.triangular( (long)Math.sqrt(Long.MAX_VALUE) ) );
	}

	@Test
	public void triangular2() {
		assertEquals(15, Util.triangular2(5));
		assertEquals(0, Util.triangular2(0));
		assertEquals(9223372034707292160L, Util.triangular2( (long)Math.sqrt(Long.MAX_VALUE * 2.0) - 1 ) );
	}
	
	@Test
	public void isEven()
	{
		assertEquals(true, Util.isEven(-2));
		assertEquals(false, Util.isEven(-1));
		assertEquals(true, Util.isEven(0));
		assertEquals(false, Util.isEven(1));
		assertEquals(true, Util.isEven(2));
		assertEquals(false, Util.isEven(3));
	}

	@Test
	public void isOdd()
	{
		assertEquals(false, Util.isOdd(-2));
		assertEquals(true, Util.isOdd(-1));
		assertEquals(false, Util.isOdd(0));
		assertEquals(true, Util.isOdd(1));
		assertEquals(false, Util.isOdd(2));
		assertEquals(true, Util.isOdd(3));
	}

	@Test
	public void isPalindrome() {
		assertEquals(true, Util.isPalindrome(0));
		assertEquals(true, Util.isPalindrome(1));
		assertEquals(true, Util.isPalindrome(12321));
		assertEquals(false, Util.isPalindrome(12322));		
		assertEquals(false, Util.isPalindrome(1232));
	}

	@Test
	public void gcd()
	{
		assertEquals(4, Util.gcd(20, 12) );
		assertEquals(4, Util.gcd(-20, 12) );
		assertEquals(4, Util.gcd(20, -12) );
		assertEquals(4, Util.gcd(-20, -12) );
		
		assertEquals(4, Util.gcd(12, 20) );		
		assertEquals(4, Util.gcd(-12, 20) );
		assertEquals(4, Util.gcd(12, -20) );
		assertEquals(4, Util.gcd(-12, -20) );
	}

	@Test
	public void pyramidal() {
		assertEquals(1+4+9, Util.pyramidal(3));
		assertEquals(1+4+9+16, Util.pyramidal(4));
	}
}
