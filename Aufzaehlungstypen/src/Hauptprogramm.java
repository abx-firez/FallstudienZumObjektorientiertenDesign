
public class Hauptprogramm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Jahreszeit j = Jahreszeit.HERBST;
		switch (j) {
		case FRUEHLING -> System.out.println("Die Blumen bl�hen.");
		case SOMMER -> System.out.println("Ab in's Freibad.");
		case HERBST -> System.out.println("Die Bl�tter fallen.");
		case WINTER -> System.out.println("Winter is coming...");
		}
		
		System.out.println("\n\n---------------------- Eigene Methoden in enums");		
		
		for (Tag t : Tag.values()){
			System.out.printf("Arbeitszeit am %s betr�gt %d Stunden.%n", 
					t.name(), t.arbeitszeit());
			for (Tag d : Tag.values()){
				if(t.compareTo(d) < 0) {
					System.out.printf("%s kommt vor %s.%n", t.name(), d.name());
				}
				else if(t.compareTo(d) == 0){
					System.out.printf("%s ist gleich %s.%n", t.name(), d.name());
				} else {
					System.out.printf("%s kommt nach %s.%n", t.name(), d.name());
				}
			}
		}

	}

}
