package service;

import java.util.ArrayList;
import java.util.List;

import entities.ProductBatch;

public class EstoqueService {

	
	private List<ProductBatch> batchs = new ArrayList<>();
	
	public void addBatch(ProductBatch batch) {
		
		batchs.add(batch);
	}
	
	public void listBatch() {
		for (ProductBatch batch : batchs) {
			System.out.println(batch);
		}
		
	}
	public  ProductBatch searchBatch(String numberBatch) {
		for (ProductBatch batch : batchs) {
			if(batch.getProductBatch().equals(numberBatch)) {
				
				return batch;
			}
		}
		return null;
	}
	public boolean removeBatch(String numberBatch) {
		ProductBatch foundBatch = searchBatch(numberBatch);
		
		if(foundBatch != null) {
			
			batchs.remove(foundBatch);
			return true;
			}
		return false;
		
	}
	public List<ProductBatch> getBatch(){
		return batchs;
	}
	
	public int totalquantity() {
		 
		int total = 0;
		
		for(ProductBatch batch : batchs) {
			total = total + batch.getQuantity();
		}
		return total;
	}
	
	public boolean stocktentry(String numberBatch, int quantity) {
		ProductBatch batch = searchBatch(numberBatch);
		
		if (batch == null) {
			return false;	
		}
		
		if (quantity <= 0) {
			return false;
		}
		batch.setQuantity(batch.getQuantity() + quantity);
		
		return true;
	}
	public boolean outflowStock(String numberBatch, int quantity) {
		ProductBatch batch = searchBatch(numberBatch);
		
		if(batch == null) {
			return false;
		}
		if(quantity <= 0) {
			return false;
		}
		if(quantity > batch.getQuantity()) {
			return false;
		}
		batch.setQuantity(batch.getQuantity() - quantity);
		return true;
	}
}
