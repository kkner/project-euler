package kknr.euler;

import static kknr.euler.Answers.E01_ANS;
import static kknr.euler.Answers.E01_ANS_TOY;
import static kknr.euler.Answers.E01_PRM;
import static kknr.euler.Answers.E01_PRM_TOY;
import static kknr.euler.Answers.E02_ANS;
import static kknr.euler.Answers.E03_ANS;
import static kknr.euler.Answers.E03_ANS_TOY;
import static kknr.euler.Answers.E03_PRM;
import static kknr.euler.Answers.E03_PRM_TOY;
import static kknr.euler.Answers.E04_ANS;
import static kknr.euler.Answers.E04_ANS_TOY;
import static kknr.euler.Answers.E04_PRM;
import static kknr.euler.Answers.E04_PRM_TOY;
import static kknr.euler.Answers.E05_ANS;
import static kknr.euler.Answers.E05_ANS_TOY;
import static kknr.euler.Answers.E05_PRM;
import static kknr.euler.Answers.E05_PRM_TOY;
import static kknr.euler.Answers.E06_ANS;
import static kknr.euler.Answers.E06_ANS_TOY;
import static kknr.euler.Answers.E06_PRM;
import static kknr.euler.Answers.E06_PRM_TOY;
import static kknr.euler.Answers.E07_ANS;
import static kknr.euler.Answers.E08_ANS;
import static kknr.euler.Answers.E08_ANS_TOY;
import static kknr.euler.Answers.E08_PRM;
import static kknr.euler.Answers.E08_TOY_PRM;
import static kknr.euler.Answers.E09_ANS;
import static kknr.euler.Answers.E10_ANS;
import static kknr.euler.Answers.E10_PRM;
import static kknr.euler.Answers.E11_ANS;
import static kknr.euler.Answers.E11_PRM;
import static kknr.euler.Answers.E12_ANS;
import static kknr.euler.Answers.E13_ANS;
import static kknr.euler.Answers.E14_ANS;
import static kknr.euler.Answers.E15_ANS;
import static kknr.euler.Answers.E16_ANS;
import static kknr.euler.Answers.E17_ANS;
import static kknr.euler.Answers.E18_ANS;
import static kknr.euler.Answers.E19_ANS;
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
import kknr.euler.e000.E09;
import kknr.euler.e010.E10;
import kknr.euler.e010.E10B;
import kknr.euler.e010.E11;
import kknr.euler.e010.E11Brute;
import kknr.euler.e010.E11Data;
import kknr.euler.e010.E11Read;
import kknr.euler.e010.E12;
import kknr.euler.e010.E12B;
import kknr.euler.e010.E13;
import kknr.euler.e010.E13B;
import kknr.euler.e010.E14;
import kknr.euler.e010.E14B;
import kknr.euler.e010.E15;
import kknr.euler.e010.E16;
import kknr.euler.e010.E16B;
import kknr.euler.e010.E18;
import kknr.euler.e010.E18B;
import kknr.euler.e010.E19;
import kknr.euler.e010.E19B;
import kknr.euler.e010.e17.E17;
import kknr.euler.e010.e17.E17B;
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

	@Test
	public void e09() {
		assertEquals(E09_ANS, new E09(false).solve());
	}

	@Test
	public void e10() {
		assertEquals(E10_ANS, new E10(false).solve(E10_PRM));
	}

	@Test
	public void e10B() {
		assertEquals(E10_ANS, new E10B(false).solve(E10_PRM));
	}
	
	@Test
	public void e11ReadItem() {
		assertEquals(15, E11Read.readItem(E11Data.LINES, 0, 5));
		assertEquals(81, E11Read.readItem(E11Data.LINES, 1, 5));
		assertEquals(14, E11Read.readItem(E11Data.LINES, 2, 6));
	}

	@Test
	public void e11ReadDigit() {
		assertEquals(1, E11Read.readDigit("123", 0));
		assertEquals(2, E11Read.readDigit("123", 1));
		assertEquals(3, E11Read.readDigit("123", 2));
	}

	@Test
	public void e11() {
		assertEquals(E11_ANS, new E11(false).solve(E11_PRM));
	}	

	@Test
	public void e11Brute() {
		assertEquals(E11_ANS, new E11Brute(false).solve(E11_PRM));
	}	
	
	@Test
	public void e12() {
		assertEquals(E12_ANS, new E12(false).solve());
	}
	
	@Test
	public void e12b() {
		assertEquals(E12_ANS, new E12B(false).solve());
	}
	
	@Test
	public void e13() {
		assertEquals(E13_ANS, new E13(false).solve());
	}	

	@Test
	public void e13B() {
		assertEquals(E13_ANS, new E13B(false).solve());
	}	
	
	@Test
	public void e14() {
		assertEquals(E14_ANS, new E14(false).solve());
	}	
	
	@Test
	public void e14b() {
		assertEquals(E14_ANS, new E14B(false).solve());
	}

	@Test
	public void e15() {
		assertEquals(E15_ANS, new E15(false).solve());
	}	

	@Test
	public void e16() {
		assertEquals(E16_ANS, new E16(false).solve());
	}	

	@Test
	public void e16B() {
		assertEquals(E16_ANS, new E16B(false).solve());
	}	

	@Test
	public void e17() {
		assertEquals(E17_ANS, new E17(false).solve());
	}	

	@Test
	public void e17b() {
		assertEquals(E17_ANS, new E17B(false).solve());
	}	

	@Test
	public void e18() {
		assertEquals(E18_ANS, new E18(false).solve());
	}	

	@Test
	public void e18b() {
		assertEquals(E18_ANS, new E18B(false).solve());
	}	
	
	@Test
	public void e19() {
		assertEquals(E19_ANS, new E19(false).solve());
	}	

	@Test
	public void e19B() {
		assertEquals(E19_ANS, new E19B(false).solve());
	}	
}
