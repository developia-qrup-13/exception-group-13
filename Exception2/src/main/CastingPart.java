package main;

class Parent {
	void show() {
		System.out.println("Parent's show()");
	}
}

class Child extends Parent {
	@Override
	void show() {
		System.out.println("Salam");
	}

	void showChild() {
		System.out.println("Rasim13");
	}
}

public class CastingPart {
	public static void main(String[] args) {
		Parent obj1 = new Child();
		Child obj2 = (Child) obj1;//Downcasting
		obj2.showChild();
	}
}