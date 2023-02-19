
public class Node {

	private Node naechster;
	private Object inhalt;
	
	public Node(Object inhalt) {
		this.inhalt = inhalt;
		naechster = null;
	}

	public Node getNaechster() {
		return naechster;
	}

	public Object getInhalt() {
		return inhalt;
	}

	public void setNaechster(Node naechster) {
		this.naechster = naechster;
	}

}
