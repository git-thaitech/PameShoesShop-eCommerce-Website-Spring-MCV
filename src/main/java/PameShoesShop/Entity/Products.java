package PameShoesShop.Entity;

import java.sql.Date;

public class Products {
	private int productId;
	private int categoryId;
	private String productName;
	private String productImg;
	private String productStatus;
	private String detail;
	private String brand;
	private long price;
	private int quantity;
	private Date importedDate;
	private Date expiredDate;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Products(int productId, int categoryId, String productImg, String productName, String size,
			String productStatus, String detail, String brand, long price, int quantity, Date importedDate,
			Date expiredDate) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
		this.productImg = productImg;
		this.productName = productName;
		this.productStatus = productStatus;
		this.detail = detail;
		this.brand = brand;
		this.price = price;
		this.importedDate = importedDate;
	}


	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getImportedDate() {
		return importedDate;
	}
	public void setImportedDate(Date importedDate) {
		this.importedDate = importedDate;
	}
	public Date getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
}
