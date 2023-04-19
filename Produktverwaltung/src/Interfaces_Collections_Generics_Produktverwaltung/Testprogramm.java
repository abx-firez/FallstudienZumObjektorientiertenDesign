package Interfaces_Collections_Generics_Produktverwaltung;

import java.util.ArrayList;
import java.util.Collections;

public class Testprogramm {

	public static void main(String[] args) {
		// die Methoden des ProductManagers testen
		ProductManager pm = new ProductManager();
		
		Product buchKomTech = new Product("Kommunikationssysteme im Automobil", "Ein Buch für Komtech, IMA", 39.99, "Buch");
		Product macBook = new Product("Macbook Air", "Ich bin Apfelkiste", 345678.99, "Laptop");
		Product kalterTee = new Product("Kalter Tee Wildbeere", "Ich bin ein kalter Tee", 2.99, "Was zum Trinken");
		Product buchHackingUndSec = new Product("Hacking & Security", "Buch für Komtech", 99.99, "Buch");

		pm.addProduct(buchHackingUndSec);
		pm.addProduct(kalterTee);
		pm.addProduct(macBook);
		pm.addProduct(buchKomTech);
		
		displayAllProducts(pm.getProducts());
		
		pm.removeProduct(buchHackingUndSec);
		
		System.out.println("Nach Entfernen: ");
		displayAllProducts(pm.getProducts());
		
		System.out.println("Anzeigen eines Products");
		pm.getProduct(1).display();
		System.out.println("\n---");
		
		String keyword = "Ich";
		System.out.println("Suchen eines Keywords: " + keyword);
		ArrayList<Product> gefundeneProdukte = pm.searchProducts(keyword);
		displayAllProducts(gefundeneProdukte);
		
		System.out.println("Sortierung nach Preis");
		Collections.sort(pm.getProducts());
		displayAllProducts(pm.getProducts());
		
	}
	
	private static void displayAllProducts(ArrayList<Product> list) {
		for (Product p : list) {
			p.display();
			System.out.println("---");
		}
	}

}
