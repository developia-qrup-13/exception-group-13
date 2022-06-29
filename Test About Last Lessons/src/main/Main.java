package main;

public class Main {

	public static void main(String[] args) {
		String name = "Nuran";
		String name2 = "Sehv Rasim";
		if (name.equals(name)) {
			System.out.println("Duz Nuran");
		} else {
			System.out.println("Sehv Rasim");
		}

		String b = name2.equals("Sehv Rasim") ? "Beli Rasim Sehvdir" : "Beli Nuran Duzdur";
		System.out.println(b);
	}

}
