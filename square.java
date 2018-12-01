
public class square extends rectangle {
	
	public square(String name,double s1,double s2){
		super(name,s1,s2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		square s = new square("Miti",10,5);
		System.out.println("Area : "+s.area());
		System.out.println("Perimeter : "+s.perimeter());

	}

}
