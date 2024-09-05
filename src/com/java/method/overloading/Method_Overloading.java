package com.java.method.overloading;

public class Method_Overloading {
double figure(int a,double b) {
	return a*b;
}

int figure(int c) {
	return c*c;
}
	public static void main(String[] args) {
	Method_Overloading m=new Method_Overloading();
	System.out.println(m.figure(12, 24.5));
	System.out.println(m.figure(12));
		
	}

}
