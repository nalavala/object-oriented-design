package logistics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LogisticSystem {

	List<Order> orders = new ArrayList<>();
	List<User> users= new ArrayList<>();
	List<Vehicle> vehicles= new ArrayList<>();

	public static void main(String args[]) {
		LogisticSystem system = new LogisticSystem();
		// add user
		User user = new User("u123", "harsha");
		system.addUser(user);

		// add vehicles
		system.addVehicle(new Truck("v123", "AP"));
		system.addVehicle(new Bike("v124", "BP"));

		// create order
		List<Item> items = List.of(new Item("i1", "shoes", new BigDecimal(25), 2),
				new Item("i2", "books", new BigDecimal(20), 1));

		// add Destination address to order
		Location dest = new Location(12.34, 234.43);
		// Find total amount
		// items.stream().map(Item :: getPrice).red
		PaymentDetails paymentDetails = new PaymentDetails("p123", new BigDecimal(70));
		Order order = new Order(items, paymentDetails, "u123", dest);

		// Assign vehicle to order
		// randomly pick first vehicle
		order.addVehicle(system.getVehicles().get(0));

		// track order
		Location track = order.getVehicle().track();

		System.out.println("current location of vehicle" + track.toString());

		// Deliver order
		system.deliverOrder(order);

		if (order.getStatus() == OrderStatus.DELIVERED) {
			System.out.println("order deliver succesfully");
		}

	}

	public void deliverOrder(Order order) {
		PaymentDetails paymentDetails = order.getPaymentDetails();
		if (paymentDetails.getStatus() == PaymentStatus.PAID) {
			// deliver order
			order.setOrderDelivered(System.currentTimeMillis());
			order.setStatus(OrderStatus.DELIVERED);
		} else {
			processPayment(paymentDetails);
			order.setOrderDelivered(System.currentTimeMillis());
			order.setStatus(OrderStatus.DELIVERED);
		}
	}

	public void processPayment(PaymentDetails paymentDetails) {
		paymentDetails.setPaymentMode(PaymentMode.CARD);
		paymentDetails.setStatus(PaymentStatus.PAID);
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public List<Vehicle> getVehicles() {
		return this.vehicles;
	}

	public void addUser(User user) {
		users.add(user);
	}

}
