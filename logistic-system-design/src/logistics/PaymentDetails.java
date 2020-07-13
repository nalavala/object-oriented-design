package logistics;

import java.math.BigDecimal;

public class PaymentDetails {

	private String id;
	private PaymentMode paymentMode;
	private BigDecimal amout;
	private PaymentStatus status;
	
	public PaymentDetails(String id, BigDecimal amount) {
		this.id = id;
		this.amout = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public BigDecimal getAmout() {
		return amout;
	}

	public void setAmout(BigDecimal amout) {
		this.amout = amout;
	}

	public PaymentStatus getStatus() {
		return status;
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}
	
	
}
