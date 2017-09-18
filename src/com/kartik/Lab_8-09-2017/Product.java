public class Product {

    int productId;
    Manufacturer man;
    String productName;
    
    public Product(Manufacturer man, int productId, String productName) {
        
        this.productName = productName;
        this.productId = productId;
        this.man = man;
        
    }
    
    
    public int getNumberOfUnits() {
    	
    	return numberOfUnits;
    
    }
    
    public int getProductId() {
    	
    	return productId;
    
    }
