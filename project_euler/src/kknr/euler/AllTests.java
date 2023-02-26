package kknr.euler;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import kknr.euler.util.UtilTest;
import kknr.euler.util2.FibBTest;
import kknr.euler.util2.FibTest;

@Suite
@SelectClasses({ 
	EulerTests.class,
	UtilTest.class,
	FibTest.class,
	FibBTest.class,
	})
public class AllTests {
}

