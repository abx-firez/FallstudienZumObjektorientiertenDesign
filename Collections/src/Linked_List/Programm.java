package Linked_List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Programm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long start, ende;
		String test;
		ArrayList<String> arrListe = new ArrayList<String>();
		LinkedList<String> linListe = new LinkedList<String>();
		
		System.out.println("Befüllen ArrayList:");
		start = System.currentTimeMillis();
		for (int i=0; i < 100000; i++){
			arrListe.add(0, "Test");
		}
		ende = System.currentTimeMillis();
		System.out.println("Benötigte Zeit: " + (ende - start));
		
		System.out.println("Befüllen LinkedList:");
		start = System.currentTimeMillis();
		for (int i=0; i < 1000000; i++){ 			
			linListe.add(0, "Test");
		}
		ende = System.currentTimeMillis();
		System.out.println("Benötigte Zeit: " + (ende - start));
		
		System.out.println("5000-tes Element bei ArrayList ausgeben:");
		start = System.currentTimeMillis();
		for (int i=0; i < 1000000; i++){
			test = arrListe.get(5000);
		}
		ende = System.currentTimeMillis();
		System.out.println("Benötigte Zeit: " + (ende - start));
		
		System.out.println("5000-tes Element bei LinkedList ausgeben:");
		start = System.currentTimeMillis();
		for (int i=0; i < 100000; i++){ // ACHTUNG ca. Faktor 10
			test = linListe.get(5000);
		}
		ende = System.currentTimeMillis();
		System.out.println("Benötigte Zeit: " + (ende - start));

	}

}
