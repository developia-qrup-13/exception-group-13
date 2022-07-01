package main;

public class Main {

	public static void main(String[] args) {
		String name = "BMW";
		String name2 = "Alphina";
		if (name.equals(name)) {
			System.out.println("BMW");
		} else {
			System.out.println("Alphina");
		}

		String b = name2.equals("Alphina") ? " Alphina" : "BMWA";
		System.out.println(b);
	}

}