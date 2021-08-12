package PameShoesShop.Entity;

import java.sql.Date;

public class DiscountCode {
	private int id;
	private String discountCode;
	private int percentageDiscount;
	private int limitOfUses;
	private Date expiredDate;
	
	public DiscountCode() {
		super();
	}
	
	

	public DiscountCode(int id, String discountCode, int percentageDiscount, int limitOfUses, Date expiredDate) {
		super();
		this.id = id;
		this.discountCode = discountCode;
		this.percentageDiscount = percentageDiscount;
		this.limitOfUses = limitOfUses;
		this.expiredDate = expiredDate;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public int getPercentageDiscount() {
		return percentageDiscount;
	}

	public void setPercentageDiscount(int percentageDiscount) {
		this.percentageDiscount = percentageDiscount;
	}

	public int getLimitOfUses() {
		return limitOfUses;
	}

	public void setLimitOfUses(int limitOfUses) {
		this.limitOfUses = limitOfUses;
	}

	public Date getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}
	
	
	
}
