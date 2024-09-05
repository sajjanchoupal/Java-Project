package com.java.Abstration;

abstract class Shape {
abstract void draw();
}

class Pentagon extends Shape{
	void draw() {
		System.out.println("Pentagon drawing...");
	}
}
class Hexagon extends Shape{
	void draw() {
		System.out.println("Hexagon drawing...");
	}
}
 