package ArrayList;

import java.util.ArrayList;

public class Programm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<>();
		liste.add("Hugo");
		liste.add("Hans");
		liste.add("Heinz");
		liste.add("Henry");
		liste.add("Henno");
		
		System.out.println(liste);
		
		liste.add(4, "Hermann");
		System.out.println(liste);
		
		liste.addAll(liste);
		System.out.println(liste);
		
		liste.remove(2);
		liste.remove("Henno");
		System.out.println(liste);

	}

}
