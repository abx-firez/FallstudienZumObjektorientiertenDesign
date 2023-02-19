package upperBound;

public class Punkt<T extends Number> {
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
	public double abstand(Punkt<?> p){
		double d, xThisInDouble, yThisInDouble, xPInDouble, yPInDouble;
		xThisInDouble = this.getX().doubleValue();
		xPInDouble = p.getX().doubleValue();
		yThisInDouble = this.getY().doubleValue();
		yPInDouble = p.getY().doubleValue();
		d = Math.sqrt(Math.pow(xThisInDouble - xPInDouble, 2) + Math.pow(yThisInDouble - yPInDouble, 2));
		return d;
	}
	public String toString(){
		return "(" + x + "," + y + ")";
	}
}
