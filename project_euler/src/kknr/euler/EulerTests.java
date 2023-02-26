package kknr.euler;

import static kknr.euler.Answers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import kknr.euler.e000.E01;
import kknr.euler.e000.E01B;
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
}

