package methode;

public class Punkt<T> {
	private T x;
	private T y;
	
	public Punkt(T a, T b){
		setX(a);
		setY(b);
	}
	
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
	public String toString(){
		return "(" + x + "," + y + ")";
	}
}
