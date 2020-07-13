package logistics;

import java.math.BigDecimal;
import java.util.List;

public class Order {

	private String id;
	private List<Item> items;
	private OrderStatus status;
	private Vehicle assignedVehicle;
	private BigDecimal price;
	private long orderPlaced;
	private long orderDelivered;
	private PaymentDetails paymentDetails;
	private String userId;
	private Location destination;

	public Order(List<Item> items, PaymentDetails paymentDetails, String userId, Location destination) {
		this.items = items;
		this.paymentDetails = paymentDetails;
		this.userId = userId;
		this.destination = destination;
		this.orderPlaced = System.currentTimeMillis();
		this.status = OrderStatus.PROCESSING;
	}
	
	public void addVehicle(Vehicle vehicle) {
		this.assignedVehicle = vehicle;
	}
	
	public Vehicle getVehicle() {
		return this.assignedVehicle;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Vehicle getAssignedVehicle() {
		return assignedVehicle;
	}

	public void setAssignedVehicle(Vehicle assignedVehicle) {
		this.assignedVehicle = assignedVehicle;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public long getOrderPlaced() {
		return orderPlaced;
	}

	public void setOrderPlaced(long orderPlaced) {
		this.orderPlaced = orderPlaced;
	}

	public long getOrderDelivered() {
		return orderDelivered;
	}

	public void setOrderDelivered(long orderDelivered) {
		this.orderDelivered = orderDelivered;
	}

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Location getDestination() {
		return destination;
	}

	public void setDestination(Location destination) {
		this.destination = destination;
	}
	
	
	
}
