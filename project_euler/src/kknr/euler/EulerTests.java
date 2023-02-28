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
import static kknr.euler.Answers.E20_ANS;
import static kknr.euler.Answers.E21_ANS;
import static kknr.euler.Answers.E22_ANS;
import static kknr.euler.Answers.E23_ANS;
import static kknr.euler.Answers.E24_ANS;
import static kknr.euler.Answers.E25_ANS;
import static kknr.euler.Answers.E26_ANS;
import static kknr.euler.Answers.E27_ANS;
import static kknr.euler.Answers.E28_ANS;
import static kknr.euler.Answers.E29_ANS;
import static kknr.euler.Answers.E30_ANS;
import static kknr.euler.Answers.E31_ANS;
import static kknr.euler.Answers.E32_ANS;
import static kknr.euler.Answers.E33_ANS;
import static kknr.euler.Answers.E34_ANS;
import static kknr.euler.Answers.E35_ANS;
import static kknr.euler.Answers.E36_ANS;
import static kknr.euler.Answers.E37_ANS;
import static kknr.euler.Answers.E38_ANS;
import static kknr.euler.Answers.E39_ANS;
import static kknr.euler.Answers.E40_ANS;
import static kknr.euler.Answers.E41_ANS;
import static kknr.euler.Answers.E42_ANS;
import static kknr.euler.Answers.E43_ANS;
import static kknr.euler.Answers.E44_ANS;
import static kknr.euler.Answers.E45_ANS;
import static kknr.euler.Answers.E46_ANS;
import static kknr.euler.Answers.E47_ANS;
import static kknr.euler.Answers.E48_ANS;
import static kknr.euler.Answers.E49_ANS;
import static kknr.euler.Answers.E50_ANS;
import static kknr.euler.Answers.E51_ANS;
import static kknr.euler.Answers.E52_ANS;
import static kknr.euler.Answers.E53_ANS;
import static kknr.euler.Answers.E54_ANS;
import static kknr.euler.Answers.E55_ANS;
import static kknr.euler.Answers.E56_ANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import kknr.euler.e000.E01;
import kknr.euler.e000.E01B;
import kknr.euler.e000.E02;
import kknr.euler.e000.E02B;
import kknr.euler.e000.E03;
import kknr.euler.e000.E03B;
import kknr.euler.e000.E03C;
import kknr.euler.e000.E04;
import kknr.euler.e000.E05;
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
import kknr.euler.e020.E20;
import kknr.euler.e020.E21;
import kknr.euler.e020.E22;
import kknr.euler.e020.E24;
import kknr.euler.e020.E25;
import kknr.euler.e020.E25B;
import kknr.euler.e020.E25BProof;
import kknr.euler.e020.E25C;
import kknr.euler.e020.E26;
import kknr.euler.e020.E27;
import kknr.euler.e020.E28;
import kknr.euler.e020.E28B;
import kknr.euler.e020.E29;
import kknr.euler.e020.E29B;
import kknr.euler.e020.e23.E23A;
import kknr.euler.e020.e23.E23B;
import kknr.euler.e020.e23.E23C;
import kknr.euler.e030.E30;
import kknr.euler.e030.E31;
import kknr.euler.e030.E31Print;
import kknr.euler.e030.E32;
import kknr.euler.e030.E33;
import kknr.euler.e030.E34;
import kknr.euler.e030.E35;
import kknr.euler.e030.E36;
import kknr.euler.e030.E36B;
import kknr.euler.e030.E37;
import kknr.euler.e030.E38;
import kknr.euler.e030.E39;
import kknr.euler.e030.E39B;
import kknr.euler.e040.E40;
import kknr.euler.e040.E40B;
import kknr.euler.e040.E40C;
import kknr.euler.e040.E41B;
import kknr.euler.e040.E42;
import kknr.euler.e040.E43;
import kknr.euler.e040.E44;
import kknr.euler.e040.E44B;
import kknr.euler.e040.E45;
import kknr.euler.e040.E46;
import kknr.euler.e040.E47;
import kknr.euler.e040.E47B;
import kknr.euler.e040.E48;
import kknr.euler.e040.E48B;
import kknr.euler.e040.E49;
import kknr.euler.e050.E50;
import kknr.euler.e050.E51;
import kknr.euler.e050.E52;
import kknr.euler.e050.E53;
import kknr.euler.e050.E54;
import kknr.euler.e050.E54B;
import kknr.euler.e050.E55;
import kknr.euler.e050.E56;
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
	public void e03C() {
		assertEquals(E03_ANS_TOY, new E03C(false).solve(E03_PRM_TOY));
		assertEquals(E03_ANS, new E03C(false).solve(E03_PRM));
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
	public void e05C() {
		assertEquals(E05_ANS_TOY, new E05C(false).solve(E05_PRM_TOY, E05C.PRIMES));
		assertEquals(E05_ANS, new E05C(false).solve(E05_PRM, E05C.PRIMES));
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

	@Test
	public void e20() {
		assertEquals(E20_ANS, new E20(false).solve());
	}	

	@Test
	public void e21() {
		assertEquals(E21_ANS, new E21(false).solve());
	}
	
	@Test
	public void e22() throws IOException {
		assertEquals(E22_ANS, new E22(false).solve());
	}		

	@Test
	public void e23a() {
		assertEquals(E23_ANS, new E23A(false).solve());
	}	

	@Test
	public void e23b() {
		assertEquals(E23_ANS, new E23B(false).solve());
	}	

	@Test
	public void e23c() {
		assertEquals(E23_ANS, new E23C(false).solve());
	}
	
	@Test
	public void e24() {
		assertEquals(E24_ANS, new E24(false).solve() );
	}		

	@Test
	public void e25() {
		assertEquals(E25_ANS, new E25(false).solve() );
	}

	@Test
	public void e25b() {
		assertEquals(E25_ANS, new E25B(false).solve() );
	}

	// @Test
	public void e25BProof() {
		new E25BProof().test();
	}
	
	@Test
	public void e25c() {
		assertEquals(E25_ANS, new E25C(false).solve() );
	}

	@Test
	public void e26() {
		assertEquals(E26_ANS, new E26(false).solve() );
	}

	@Test
	public void e27() {
		assertEquals(E27_ANS, new E27(false).solve() );
	}

	@Test
	public void e28() {
		assertEquals(E28_ANS, new E28(false).solve() );
	}

	@Test
	public void e28b() {
		assertEquals(E28_ANS, new E28B(false).solve() );
	}

	@Test
	public void e29() {
		assertEquals(E29_ANS, new E29(false).solve() );
	}

	@Test
	public void e29B() {
		assertEquals(E29_ANS, new E29B(false).solve() );
	}

	@Test
	public void e30() {
		assertEquals(E30_ANS, new E30(false).solve() );
	}

	@Test
	public void e31() {
		assertEquals(E31_ANS, new E31(false).solve() );
	}

//	@Test
	public void e31Print() {
		assertEquals(E31_ANS, new E31Print().solve() );
	}

	@Test
	public void e32() {
		assertEquals(E32_ANS, new E32(false).solve() );
	}

	@Test
	public void e33() {
		assertEquals(E33_ANS, new E33(false).solve() );
	}

	@Test
	public void e34() {
		assertEquals(E34_ANS, new E34(false).solve() );
	}

	@Test
	public void e35() {
		assertEquals(E35_ANS, new E35(false).solve() );
	}

	@Test
	public void e36() {
		assertEquals(E36_ANS, new E36(false).solve() );
	}

	@Test
	public void e36b() {
		assertEquals(E36_ANS, new E36B(false).solve() );
	}

	@Test
	public void e37() {
		assertEquals(E37_ANS, new E37(false).solve() );
	}

	@Test
	public void e38() {
		assertEquals(E38_ANS, new E38(false).solve() );
	}

	@Test
	public void e39() {
		// 2 seconds for 1000 runs
		assertEquals(E39_ANS, new E39(false).solve() );
	}

	@Test
	public void e39b() {
		// 0.183 seconds for 1000 runs
		assertEquals(E39_ANS, new E39B(false).solve() );
	}

	@Test
	public void e40() {
		// 0.579 seconds for 100 iterations
		assertEquals(E40_ANS, new E40(false).solve() );
	}

	@Test
	public void e40b() {
		// 0.558 seconds for 100 iterations
		assertEquals(E40_ANS, new E40B(false).solve() );
	}
	
	@Test
	public void e40c() {
		// 0.017 seconds for 100 iterations
		assertEquals(E40_ANS, new E40C(false).solve() );
	}

	@Test
	public void e41B() {
		assertEquals(E41_ANS, new E41B(false).solve() );
	}

	@Test
	public void e42() throws IOException {
		assertEquals(E42_ANS, new E42(false).solve() );
	}

	// @Test
	public void E42_isTriangleSimple()
	{
		// Test method with every integer <= T(100000) 
		
		long tested = 1;
		for(long n = 1; n < 100000; n++)
		{
			long t = n * (n + 1) / 2;
			for (; tested < t; tested++) 
			{
				assertEquals(false, E42.isTriangleSimple(tested));
			}
			assertEquals(true, E42.isTriangleSimple(tested));
			
			tested++;
		}
	}

	@Test
	public void e43() {
		assertEquals(E43_ANS, new E43(false).solve() );		
	}	

	// @Test
	public void e44() {
		// This solution takes 20 seconds.
		assertEquals(E44_ANS, new E44(false).solve() );
	}

	@Test
	public void e44B() {
		// This is faster but not a proved way to reach the solution.
		assertEquals(E44_ANS, new E44B(false).solve() );
	}

	@Test
	public void e45() {
		assertEquals(E45_ANS, new E45(false).solve() );
	}

	@Test
	public void e46() {
		assertEquals(E46_ANS, new E46(false).solve() );
	}

	@Test
	public void e47() {
		assertEquals(E47_ANS, new E47(false).solve() );
	}

	@Test
	public void e47B() {
		assertEquals(E47_ANS, new E47B(false).solve() );
	}

	@Test
	public void e48() {
		assertEquals(E48_ANS, new E48(false).solve() );
	}

	@Test
	public void e48B() {
		assertEquals(E48_ANS, new E48B(false).solve() );
	}

	@Test
	public void e49() {
		assertEquals(E49_ANS, new E49(false).solve() );
	}

	@Test
	public void e50() {
		assertEquals(E50_ANS, new E50(false).solve() );
	}

	@Test
	public void e51() {
		assertEquals(E51_ANS, new E51(false).solve() );
	}

	@Test
	public void e52() {
		assertEquals(E52_ANS, new E52(true).solve() );
	}

	@Test
	public void e53() {
		assertEquals(E53_ANS, new E53(false).solve() );
	}

	@Test
	public void e54() {
		assertEquals(E54_ANS, new E54(false).solve() );
	}	

	@Test
	public void e54b() {
		assertEquals(E54_ANS, new E54B(false).solve() );
	}
	
	@Test
	public void e55() {
		assertEquals(E55_ANS, new E55(false).solve() );
	}

	@Test
	public void e56() {
		assertEquals(E56_ANS, new E56(false).solve() );
	}
}
