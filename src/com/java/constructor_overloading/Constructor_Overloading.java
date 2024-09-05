package com.java.constructor_overloading;

public class Constructor_Overloading {
	String Ename;
	int Eage;
	String Address;
	
	public Constructor_Overloading() {
		System.out.println("I am default constructor");
	}
	
	public Constructor_Overloading(String ename, int eage, String address) {
		super();
		Ename = ename;
		Eage = eage;
		Address = address;
	}

	@Override
	public String toString() {
		return "[Ename=" + Ename + ", Eage=" + Eage + ", Address=" + Address + "]";
	}

	public static void main(String[] args) {
		Constructor_Overloading c1=new Constructor_Overloading("Mohan", 28, "Mumbai");
		System.out.println(c1);
		Constructor_Overloading c=new Constructor_Overloading();	
	}

}
