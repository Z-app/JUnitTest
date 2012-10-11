package se.z_app.stb.api.test;


import junit.framework.TestCase;
import se.z_app.stb.api.*;

public class RCProxyTest extends TestCase {
	
	public void testUp(){
		RCProxy tester = new RCProxy();
		assertTrue("pup".equals(tester.up()));	
	}
	
	public void testUpp(){
		RCProxy tester = new RCProxy();
		assertTrue("pupp".equals(tester.up()));	
	}
	
	
}
