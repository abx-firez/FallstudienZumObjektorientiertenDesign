package vererbungshierarchie;

public class TestProgrammMain {

	public static void main(String[] args) {

		Professor prof = new Professor();
		
		System.out.println("IGroesser: " + (prof instanceof IGroesser));
		System.out.println("IKleiner: " + (prof instanceof IKleiner));
		System.out.println("IGleich: " + (prof instanceof IGleich));
		System.out.println("Person: " + (prof instanceof Person));
		System.out.println("ISortierbar: " + (prof instanceof ISortierbar));
		System.out.println("Hochschulangehoeriger: " + (prof instanceof Hochschulangehoeriger));
		System.out.println("Professor: " + (prof instanceof Professor));
		System.out.println("Object: " + (prof instanceof Object));
		
		
	}

}
