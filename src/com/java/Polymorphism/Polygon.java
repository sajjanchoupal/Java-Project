package com.java.Polymorphism;

public class Polygon {
public void render() {
	System.out.println("Rendering polygon....");
}}
class Circle extends Polygon{
	public void render() {
		System.out.println("Rendering Circle....");
	}
}

class Rectangle extends Polygon{
	public void render() {
		System.out.println("Rendering Rectangle....");
	}
}


