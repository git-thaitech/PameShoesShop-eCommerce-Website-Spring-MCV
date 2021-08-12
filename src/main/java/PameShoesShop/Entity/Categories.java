package PameShoesShop.Entity;

public class Categories {
	private int categoryId;
	private String name;
	private int numberOfProduct;

	public Categories() {
		super();
	}
	
	

	public Categories(int categoryId, String name, int numberOfProduct) {
		super();
		this.categoryId = categoryId;
		this.name = name;
		this.numberOfProduct = numberOfProduct;
	}



	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int id) {
		this.categoryId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfProduct() {
		return numberOfProduct;
	}

	public void setNumberOfProduct(int numberOfProduct) {
		this.numberOfProduct = numberOfProduct;
	}

}
