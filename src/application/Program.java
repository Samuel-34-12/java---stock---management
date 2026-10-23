package application;

import java.time.LocalDate;

import entities.Product;
import entities.ProductBatch;
import service.EstoqueService;

public class Program {

	public static void main(String[] args) {
		
		Product p1 = new Product(1, "Açucar", "Crystal");
		Product p2 = new Product(2, "Café", "3Coracoes");
		
		ProductBatch lp = new ProductBatch(1, p1 , "12A3B", LocalDate.of(2026, 11, 1),
				LocalDate.of(2026, 10, 1), 12.60, 3);
		ProductBatch lp2 = new ProductBatch(2, p2, "202609ZW", LocalDate.of(2028,10 ,1),
				LocalDate.of(2026, 10, 1), 42.50, 20);
		EstoqueService estoque = new EstoqueService();
		estoque.addBatch(lp);
		estoque.addBatch(lp2);
		estoque.stocktentry("12A3B", 5 );
		estoque.outflowStock("12A3B", 3);
		
		
		estoque.listBatch();
		
		//System.out.println(p1);
		System.out.println(lp);

	}

}
