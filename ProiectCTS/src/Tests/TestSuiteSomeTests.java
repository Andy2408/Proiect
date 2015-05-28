package Tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestSuiteSomeTests {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(TestCNP.class);
		suite.addTestSuite(TestContBancar.class);
		suite.addTestSuite(TestEmail.class);
		suite.addTestSuite(TestLista.class);
		suite.addTestSuite(TestMarireTaiereSalariu.class);
		return suite;
}
}