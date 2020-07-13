package logistics;

import java.math.BigDecimal;

public class Item {

	private String id;
	private String productName;
	private int quantity;
	private BigDecimal price;

	public Item(String id,String productName, BigDecimal price, int quantity) {
		this.id = id;
		this.price = price;
		this.productName = productName;
		this.quantity = quantity;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
}
