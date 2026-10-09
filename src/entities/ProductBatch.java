package entities;

import java.time.LocalDate;

public class ProductBatch {
	
	private int id;
	private Product product;
	private String productBatch;
	private LocalDate expirationDate;
	private LocalDate manufaturingDate;
	private double unitPrice;
	private int quantity;

	public ProductBatch() {
		
	}

	public ProductBatch(int id, Product product, String productBatch, LocalDate expirationDate, LocalDate manufaturingDate,
			double unitPrice, int quantity) {
		
		this.id = id;
		this.product= product;
		this.productBatch = productBatch;
		this.expirationDate = expirationDate;
		this.manufaturingDate = manufaturingDate;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getProductBatch() {
		return productBatch;
	}

	public void setProductBatch(String productBatch) {
		this.productBatch = productBatch;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public LocalDate getManufaturingDate() {
		return manufaturingDate;
	}

	public void setManufaturingDate(LocalDate manufaturingDate) {
		this.manufaturingDate = manufaturingDate;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "LoteProduto [id = " + id +
				", product = " + product + 
				", productBatch = " + productBatch + 
				", expirationDate = "
				+ expirationDate +
				", manufaturingDate = " + manufaturingDate + 
				", unitPrice = " + unitPrice + ", quantity = "
				+ quantity + "]";
	}
	
	
	
}
