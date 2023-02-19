package comparable;
import java.util.Arrays;


public class Programm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] a = new Integer[4];
		a[0] = Integer.valueOf(12);
		a[1] = Integer.valueOf(10);
		a[2] = Integer.valueOf(20);
		a[3] = Integer.valueOf(5);
		
		System.out.println("Array a:");
		for (Integer i : a) System.out.println(i);
		
		Arrays.sort(a);
		
		System.out.println("Nach Sortierung:");
		for (Integer i : a) System.out.println(i);
		
		
		Studentin[] s = new Studentin[4];
		s[0] = new Studentin("Müller", "Marta", 765432);
		s[1] = new Studentin("Maier", "Hans", 234567);
		s[2] = new Studentin("Schulze", "Hilde", 123456);
		s[3] = new Studentin("Mair", "Heike", 435261);
		
		System.out.println("Array s:");
		for (Studentin i : s) System.out.println(i);
		
		Arrays.sort(s);
		
		System.out.println("Nach Sortierung:");
		for (Studentin i : s) System.out.println(i);
	}

}
