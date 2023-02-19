
public class Dummy {

	private String name;
	private int nr;

	public Dummy(String name, int nr) {
		this.name = name;
		this.nr = nr;
	}
	
	@Override
	public String toString() {
		return "Dummy: " + name + " Nr: " + nr;
	}

}
