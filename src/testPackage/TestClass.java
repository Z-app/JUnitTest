package testPackage;
import jUnitPackage.*;
import static org.junit.Assert.assertTrue;
import jUnitPackage.Subject;

import org.junit.Test;

import org.junit.BeforeClass;



public class TestClass {
	private static Subject theSubject;
	
	@BeforeClass
	public static void initiate()
	{
		theSubject = new Subject();
	}
	
	/* Test the add function, should work */
	@Test
	public void testAdd(){
		assertTrue(10 == theSubject.add(7,3));
	}
	
	/* Test the multiply function, should not work */
	@Test
	public void testMultiply(){
		assertTrue(50 == theSubject.multiply(5,10));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testCrash(){
		theSubject.crash();
	}
}
