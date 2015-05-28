package Tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteAllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(TestSuiteAllTests.class.getName());
		suite.addTestSuite(TestCNP.class);
		suite.addTestSuite(TestContBancar.class);
		suite.addTestSuite(TestEmail.class);
		suite.addTestSuite(TestLista.class);
		suite.addTestSuite(TestMarireTaiereSalariu.class);
		suite.addTestSuite(TestMock.class);
		suite.addTestSuite(TestNrTelefon.class);
		return suite;
	}

}
