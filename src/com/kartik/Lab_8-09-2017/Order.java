public class Order {
	
	int productId;
	Company buyer;
	Company seller;
	int numberOfUnits;
	
	public Order(int productId, Company buyer, Company seller, int numberOfUnits) {
	
		this.productId = productId;
		this.buyer = buyer;
		this.seller = seller;
		this.numberOfUnits = numberOfUnits;		
		
	}
	
	
	
}
