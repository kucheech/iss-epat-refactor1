import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AllTests extends TestCase {
	public static TestSuite suite() {
		TestSuite suite = new TestSuite("Test for default package");
		//$JUnit-BEGIN$
		suite.addTestSuite(ManagerTest.class);
		suite.addTestSuite(SalesEmployeeTest.class);
		//$JUnit-END$
		return suite;
	}
}
