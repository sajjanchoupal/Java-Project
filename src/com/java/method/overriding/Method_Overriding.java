package com.java.method.overriding;
class Vehical{
	void run() {
		System.out.println("Running vehical");
	}
}

class bike extends Vehical{
	void run() {
		System.out.println("Bike is running safely");
	}
	public static void main(String[] args) {
		bike b=new bike();
		b.run();
	}
}

	


