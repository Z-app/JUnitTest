package jUnitPackage;

import static org.junit.Assert.*;
import java.util.Vector;

import org.junit.Test;


public class Main {

	/**
	 * @param args
	 */
	public int thirdAngle(int angle1,int angle2){
		return 360-angle1-angle2;
	}
	
	/* Test the add function, should work */
	@Test
	public void testAdd(){
		assertTrue(10 == add(7,3));
	}
	
	/* Test the multiply function, should not work */
	@Test
	public void testMultiply(){
		assertTrue(50 == multiply(5,10));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testCrash(){
		crash();
	}
	
	public int add(int n1, int n2){
		return n1 + n2;
	}
	
	public int multiply(int n1, int n2){
		return n1/n2;
	}
	
	public void crash(){
		Vector<Object> v = new Vector<Object>();
		v.get(0);
	}

}
