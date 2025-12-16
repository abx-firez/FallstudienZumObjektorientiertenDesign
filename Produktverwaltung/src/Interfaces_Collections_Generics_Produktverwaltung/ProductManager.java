package Interfaces_Collections_Generics_Produktverwaltung;

import java.util.ArrayList;

/**
 * - 
    - 
    - 
    - 
    - 
 * @author bartela
 *
 */
public class ProductManager {

	private ArrayList<Product> products;

	public ProductManager() {
		products = new ArrayList<>();
	}

	/**
	 * addProduct(Product product): Fuegt ein Produkt zur Liste hinzu.
	 * 
	 * @param p
	 */
	public void addProduct(Product p) {
		products.add(p);
	}

	/**
	 * removeProduct(Product product): Entfernt ein Produkt aus der Liste.
	 * 
	 * @param p
	 */
	public void removeProduct(Product p) {
		products.remove(p);
	}

	/**
	 * getProduct(int index): Gibt das Produkt an der angegebenen Position in der
	 * Liste zurueck.
	 */
	public Product getProduct(int index) {
		return products.get(index);
	}

	/**
	 * getProduct(int index): Gibt das Produkt an der angegebenen Position in der
	 * Liste zurueck.
	 * 
	 * @return
	 */
	public ArrayList<Product> getProducts() {
		return products;
	}

	/**
	 * searchProducts(String keyword): Sucht nach Produkten, die das angegebene
	 * Stichwort im Namen oder in der Beschreibung enthalten, und gibt eine Liste
	 * der gefundenen Produkte zurueck.
	 */
	public ArrayList<Product> searchProducts(String keyword) {
		ArrayList<Product> results = new ArrayList<Product>();
		for (Product pr : products) {
			if (pr.getName().contains(keyword) | pr.getDescription().contains(keyword)) {
				// einer Ergebnisliste hinzugefuegt werden
				results.add(pr);
			}
		}
		// und gibt eine Liste der gefundenen Produkte zurueck
		return results;
	}
	
	
	

	
}
