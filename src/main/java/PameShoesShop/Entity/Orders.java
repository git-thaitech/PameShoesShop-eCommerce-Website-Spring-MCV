package PameShoesShop.Entity;

import java.sql.Date;

public class Orders {
	private int orderId;
	private int userId;
	private Date orderDate;
	private String nameOfReceiver;
	private String phone;
	private String address;
	private String status;
	private Date deliveryDate;
	private String paymentMethod;
	private String discountCode;
	private long total;
	public Orders() {
		super();
	}
	public Orders(int orderId, int userId, Date orderDate, String nameOfReceiver, String phone, String address,
			String status, Date deliveryDate, String paymentMethod, String discountCode, long total) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.orderDate = orderDate;
		this.nameOfReceiver = nameOfReceiver;
		this.phone = phone;
		this.address = address;
		this.status = status;
		this.deliveryDate = deliveryDate;
		this.paymentMethod = paymentMethod;
		this.discountCode = discountCode;
		this.total = total;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getNameOfReceiver() {
		return nameOfReceiver;
	}
	public void setNameOfReceiver(String nameOfReceiver) {
		this.nameOfReceiver = nameOfReceiver;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getDiscountCode() {
		return discountCode;
	}
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	
	
	
	
}
