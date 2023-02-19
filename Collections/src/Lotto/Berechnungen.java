package Lotto;

public class Berechnungen {
	public int neueZufallszahl49(){
		return (int)(Math.random()*49+1);
	}
	
	public void zehnMalLotto(){
		int[] lottozahlen = new int[6];
		
		for (int i = 1; i <= 10; i++){
			lottozahlen[0] = neueZufallszahl49();
			lottozahlen[1] = neueZufallszahl49();
			lottozahlen[2] = neueZufallszahl49();
			lottozahlen[3] = neueZufallszahl49();
			lottozahlen[4] = neueZufallszahl49();
			lottozahlen[5] = neueZufallszahl49();
			
			for (int zahl : lottozahlen){
				System.out.print(zahl + " ");
			}
			System.out.println();
		}
	}
}
