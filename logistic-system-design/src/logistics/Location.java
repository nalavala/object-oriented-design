package logistics;

public class Location {

	private String name;
	private double logitude;
	private double latitude;

	public Location(double logitude, double latitude) {
		this(null, logitude, latitude);
	}

	public Location(String name, double logitude, double latitude) {
		this.name = name;
		this.logitude = logitude;
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "Location [name=" + name + ", logitude=" + logitude + ", latitude=" + latitude + "]";
	}
	
}
