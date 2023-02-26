package kknr.euler;

import static kknr.euler.Answers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import kknr.euler.e000.E01;
import kknr.euler.e000.E01B;
import kknr.euler.e000.E02;
import kknr.euler.e000.E02B;
import kknr.euler.e000.E03;
import kknr.euler.e000.E03B;
import kknr.euler.e000.E04;
import kknr.euler.e000.E05;
import kknr.euler.e000.E05B;
import kknr.euler.e000.E05C;
import kknr.euler.e000.E06;
import kknr.euler.e000.E06Brute;
import kknr.euler.e000.E07;
import kknr.euler.e000.E08;
import kknr.euler.e000.E08B;
import kknr.euler.util.Util;

class EulerTests 
{
	@Test
	public void e01() {
		assertEquals(E01_ANS_TOY, new E01().solve(E01_PRM_TOY));
		assertEquals(E01_ANS, new E01().solve(E01_PRM));
	}
	
	@Test
	public void e01bProofs() {
		assertEquals(3, 19/5);
		assertEquals(4, 20/5);
		assertEquals(4, 21/5);
		assertEquals(3 + 6 + 9 + 12, 3 * Util.triangular(12/3));
	}
	
	@Test
	public void e01b() {
		assertEquals(E01_ANS_TOY, new E01B(false).solve(E01_PRM_TOY));
		assertEquals(E01_ANS, new E01B(false).solve(E01_PRM));
	}

	@Test
	public void e02() {
		assertEquals(E02_ANS, new E02(false).solve());
	}
	
	@Test
	public void e02B() {
		assertEquals(E02_ANS, new E02B(false).solve());
	}

	@Test
	public void e03() {
		assertEquals(E03_ANS_TOY, new E03(false).solve(E03_PRM_TOY));
		assertEquals(E03_ANS, new E03(false).solve(E03_PRM));
	}

	@Test
	public void e03B() {
		assertEquals(E03_ANS_TOY, new E03B(false).solve(E03_PRM_TOY));
		assertEquals(E03_ANS, new E03B(false).solve(E03_PRM));
	}

	@Test
	public void e04() {		 
		assertEquals(E04_ANS_TOY, new E04(false).solve(E04_PRM_TOY));
		assertEquals(E04_ANS, new E04(false).solve(E04_PRM));
	}
	
	@Test
	public void e05() {
		assertEquals(E05_ANS_TOY, new E05(false).solve(E05_PRM_TOY));
		assertEquals(E05_ANS, new E05(false).solve(E05_PRM));
	}

	@Test
	public void e05B() {
		assertEquals(E05_ANS_TOY, new E05B(false).solve(E05_PRM_TOY, E05B.PRIMES));
		assertEquals(E05_ANS, new E05B(false).solve(E05_PRM, E05B.PRIMES));
	}

	@Test
	public void e05C() {
		assertEquals(E05_ANS_TOY, new E05C(false).solve(E05_PRM_TOY, E05B.PRIMES));
		assertEquals(E05_ANS, new E05C(false).solve(E05_PRM, E05B.PRIMES));
	}

	@Test
	public void e06Brute() {
		assertEquals(E06_ANS_TOY, new E06Brute(false).solve(E06_PRM_TOY));
		assertEquals(E06_ANS, new E06Brute(false).solve(E06_PRM));
	}

	@Test
	public void e06() {
		assertEquals(E06_ANS_TOY, new E06(false).solve(E06_PRM_TOY));
		assertEquals(E06_ANS, new E06(false).solve(E06_PRM));
	}

	@Test
	public void e07() {
		assertEquals(E07_ANS, new E07(false).solve());
	}

	@Test
	public void e08() {
		assertEquals(E08_ANS_TOY, new E08(false).solve(E08_TOY_PRM));
		assertEquals(E08_ANS, new E08(false).solve(E08_PRM));
	}

	@Test
	public void e08B() {
		assertEquals(E08_ANS_TOY, new E08B(false).solve(E08_TOY_PRM));
		assertEquals(E08_ANS, new E08B(false).solve(E08_PRM));
	}
}
