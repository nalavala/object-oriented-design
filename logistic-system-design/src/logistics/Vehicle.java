package logistics;

public class Vehicle {

	private String id;
	private String vehicleNo;
	private String name;
	private int capacity;

	public Vehicle(String id, String vechicleNo, int capacity) {

		this.id = id;
		this.vehicleNo = vechicleNo;
		this.capacity = capacity;
	}

	public Location track() {

		return new Location(123.12, 12312323.2);
	}
}
