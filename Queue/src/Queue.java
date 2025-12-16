
public class Queue {

	private Node anfang;
	private Node ende;

	public Queue() {
		anfang = null;
		ende = null;
	}

	// Wir limitieren den Speicherplatz einer Queue hier nicht, weshalb hier kein boolean zurückgegeben wird,
	// ob das Einfügen erfolgreich war. Unsere Queue kann also ohne Begrenzung wachsen, wohlwissend, dass diese
	// Methodensignatur in der Java-Implementierung anders aussieht.
	public void add(Object inhalt) {
		if (inhalt != null) {
			if (isEmpty()) {
				anfang = new Node(inhalt);
				ende = anfang;
			} else {
				ende.setNaechster(new Node(inhalt));
				ende = ende.getNaechster();
			}
		}
	}

	public void remove() {
		if (!isEmpty()) {
			if (ende == anfang) { // nur ein Node vorhanden
				anfang = null;
				ende = null;
			} else { // mehrere Nodes vorhanden
				anfang = anfang.getNaechster();
			}
		}
	}
	
	
	public Object peek() {
		if (!isEmpty()) {
			return anfang.getInhalt();
		} else {
			return null;
		}
	}
	
	public Object poll() {
		Object element = null;
		if (!isEmpty()) {
			if (ende == anfang) { // nur ein Node vorhanden
				element = anfang;
				anfang = null;
				ende = null;
			} else { // mehrere Nodes vorhanden
				element = anfang;
				anfang = anfang.getNaechster();
			}
		}
		return element;
	}

	public boolean isEmpty() {
		return anfang == null;
	}

}
