package kknr.euler;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import kknr.euler.util.UtilTest;

@Suite
@SelectClasses({ 
	EulerTests.class,
	UtilTest.class,
	})
public class AllTests {
}

