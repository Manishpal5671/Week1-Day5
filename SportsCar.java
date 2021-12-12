
public class SportsCar extends Car {

	public SportsCar() {
		super(CarType.SPORTSCAR);
		
		construct();
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void construct() {
		System.out.println("building SportsCar");
	
	}
}
