package com.java.Inheritance;

public class Animal {
	String name;

	void eat() {
		System.out.println("I can eat");
	}
}

class Dog extends Animal {
	void Display() {
		System.out.println("I can Walk");
	}
}

class Cat extends Animal {
	void Display() {
		System.out.println("I can Walk");
	}
}


