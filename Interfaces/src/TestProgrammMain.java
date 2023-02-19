
public class TestProgrammMain {

	public static void main(String[] args) {
		
		Professorin profMayer = new Professorin();
		profMayer.setPersnr(1002);
		
		Professorin profBartel = new Professorin();
		profBartel.setPersnr(1000);

		Professorin profWild = new Professorin();
		profWild.setPersnr(999);
		
		Student studMustermann = new Student();
		studMustermann.setMatrikelnr(2000);
		
		Student studMusterfrau = new Student();
		studMusterfrau.setMatrikelnr(2008);

		Student studMustermax = new Student();
		studMustermax.setMatrikelnr(2001);
	
		ISortierbar [] arr =  new ISortierbar[6];
		arr[0] = studMusterfrau;
		arr[1] = profBartel;
		arr[2] = profWild;
		arr[3] = studMustermax;
		arr[4] = profMayer;
		arr[5] = studMustermann;
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i].groesser(1500));
		}
				
	}
	
	

}
