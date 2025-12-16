package Comparator;

public class Student {
	private String name;
	private String vorname;
	private int matrikelNr;
	private int groesse;
	private int semester;

	public Student(String name, String vorname, 
			int matrikelNr, int semester,int groesse) {
		setGroesse(groesse);
		setMatrikelNr(matrikelNr);
		setName(name);
		setSemester(semester);
		setVorname(vorname);
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
	public int getGroesse() {
		return groesse;
	}
	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	
	public String toString(){
		return "Semester: %d MatrikelNr: %d Name: %s Vorname: %s Groesse: %d"
				.formatted(semester, matrikelNr, name, vorname, groesse);
	}
	
	// Verwende Name nicht, wegen Änderung bei Heirat.
	public int hashCode(){
//		return vorname.hashCode() + matrikelNr;
//		return name.hashCode();
		return vorname.hashCode() + matrikelNr + semester ;
	}
	
	// Verwende Name nicht, wegen Änderung bei Heirat.
	public boolean equals(Object o){
		if (o instanceof Student other)  {
			return (this.vorname.equals(other.vorname)
					&& this.matrikelNr == other.matrikelNr);
		}
		else {
			return false;
		}
	}

}
