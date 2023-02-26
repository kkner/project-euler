package kknr.euler.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

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
		assertEquals(4611686016981624750L, Util.triangular( Util.TRIANGULAR_MAX_N ) );

		assertThrows(AssertionError.class, () -> Util.triangular(-1) );
		assertThrows(AssertionError.class, () -> Util.triangular(Util.TRIANGULAR_MAX_N + 1) );
	}

	@Test
	public void triangular2() {
		assertEquals(15, Util.triangular2(5));
		assertEquals(0, Util.triangular2(0));
		assertEquals(9223372034707292160L, Util.triangular2(Util.TRIANGULAR2_MAX_N));
		
		assertThrows(AssertionError.class, () -> Util.triangular2(-1) );
		assertThrows(AssertionError.class, () -> Util.triangular2(Util.TRIANGULAR2_MAX_N + 1) );
		
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
	
	@Test
	public void sieveSizeUpperLimit() {
		// 2 3 5 7 11 13 17 19
		assertTrue(Util.sieveSizeUpperLimit(1) >= 2);
		assertTrue(Util.sieveSizeUpperLimit(2) >= 3);
		assertTrue(Util.sieveSizeUpperLimit(3) >= 5);
		assertTrue(Util.sieveSizeUpperLimit(4) >= 7);
		assertTrue(Util.sieveSizeUpperLimit(5) >= 11);
		assertTrue(Util.sieveSizeUpperLimit(6) >= 13);
		assertTrue(Util.sieveSizeUpperLimit(7) >= 17);
		assertTrue(Util.sieveSizeUpperLimit(8) >= 19);
		assertTrue(Util.sieveSizeUpperLimit(100) >= 541);
	}
}
