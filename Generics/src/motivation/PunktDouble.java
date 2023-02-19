package motivation;

public class PunktDouble {
	private double x;
	private double y;
	
	public PunktDouble(){
		setX(0);
		setY(0);
	}
	
	public PunktDouble(double a, double b){
		setX(a);
		setY(b);
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public String toString(){
		return "(" + x + "," + y + ")";
	}
}
