package com.misc;

class Parent {
	void display() {
		System.out.println(" I'm parent ");
	}
}

class Child extends Parent {
	void display() {
		System.out.println(" I'm Child ");
	}

}

public class ParentChildTest {
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.display();
		
		// class cast exception occurs
		Child p2 = (Child) new Parent();
		p2.display();
	}

}
