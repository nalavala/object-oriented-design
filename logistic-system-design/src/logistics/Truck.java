package logistics;

public class Truck extends Vehicle {

	public static final int capacity = 30;

	public Truck(String id, String vechicleNo) {
		super(id, vechicleNo, capacity);
	}

}
