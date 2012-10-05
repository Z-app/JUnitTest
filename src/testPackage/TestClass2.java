package testPackage;
import jUnitPackage.*;
import static org.junit.Assert.assertTrue;
import jUnitPackage.Subject;

import org.junit.Test;

import org.junit.Before;

public class TestClass2 {
	Subject2 theSubject;
	
	@Before
	public void init()
	{
		theSubject = new Subject2();
	}
	
	@Test
	public void testSubtract()
	{
		assertTrue(3 == theSubject.subtract(6,3));
	}
}
