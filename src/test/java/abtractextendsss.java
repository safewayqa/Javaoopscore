
public class abtractextendsss extends Abstractest {

	@Override
	void Bike() {
		// TODO Auto-generated method stub
		System.out.println("BAse calse Bike");

	}

	@Override
	void brakes() {
		// TODO Auto-generated method stub
		System.out.println("base-2");
	}

	static void maile() {

		System.out.println("Good at milage");
	}

	public static void main(String[] args) {

		abtractextendsss abs = new abtractextendsss();
		abs.Bike();
		abs.brakes();
		abs.Scotoor();
		System.out.println(Abstractest.a);
		abtractextendsss.maile();

	}
}