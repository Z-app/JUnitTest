package jUnitPackage;

import java.util.Vector;

public class Subject 
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
