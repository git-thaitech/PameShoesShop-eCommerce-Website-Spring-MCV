package PameShoesShop.Entity;

public class ProductsInOrders {
	private int orderId;
	private int productId;
	private int quantity;
	private long price;
	
	
	public ProductsInOrders() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ProductsInOrders(int orderId, int productId, int quantity, long price) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public long getPrice() {
		return price;
	}


	public void setPrice(long price) {
		this.price = price;
	}
	
	
	
	
}
