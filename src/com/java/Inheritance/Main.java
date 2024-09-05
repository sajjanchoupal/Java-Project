package com.java.Inheritance;

public class Main {

	public static void main(String[] args) {
		Dog d=new Dog();
		Cat c=new Cat();
		c.name="Mew Mew";
		c.eat();
		d.name="Pappy";
		d.Display();
		d.eat();
		System.out.println(d.name);
		System.out.println(c.name);

	}

}
