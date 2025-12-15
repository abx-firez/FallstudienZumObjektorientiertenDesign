package comparable;

public class Studentin implements Comparable<Studentin> {
	private String name;
	private String vorname;
	private int matrikelNr;

	public Studentin(String n, String v, int m) {
		setName(n);
		setVorname(v);
		setMatrikelNr(m);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public int getMatrikelNr() {
		return matrikelNr;
	}

	public void setMatrikelNr(int matrikelNr) {
		this.matrikelNr = matrikelNr;
	}

	public String toString() {
		return "Name: " + name + " Vorname: " + vorname + " Matrikelnr: " + matrikelNr;
	}

	public int compareTo(Studentin s) {
		return Integer.compare(matrikelNr, s.getMatrikelNr());
	}
}
