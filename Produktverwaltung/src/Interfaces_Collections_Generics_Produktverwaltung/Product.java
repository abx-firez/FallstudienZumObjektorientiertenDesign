package Interfaces_Collections_Generics_Produktverwaltung;

/**
 * Product (Attribute, Interface Displayable, Comparable) Die "Product"-Klasse
 * soll folgende Attribute besitzen: Name, Beschreibung, Preis, Kategorie
 * 
 * @author bartela
 *
 */
public class Product implements Comparable<Product>, IDisplayable {

	private String name;
	private String description;
	private double price;
	private String category;

	public Product(String name, String desc, double p, String cat) {
		this.name = name;
		this.description = desc;
		this.price = p;
		this.category = cat;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	public double getPrice() {
		return this.price;
	}

	public String getCategory() {
		return this.category;
	}

	@Override
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Description: " + this.description);
		System.out.println("Price: " + getPrice());
		System.out.println("Category: " + getCategory());
	}

	@Override
	public int compareTo(Product o) {
		return Double.compare(getPrice(), o.getPrice());
	}

}
