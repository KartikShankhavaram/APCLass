public class Company {
    
    int companyId;
    String companyName;
    int numberOfUnits;
    
    public Company(int companyId, String companyName) {
    	
    	this.companyId = companyId;
    	this.companyName = companyName;
  	
  	}
  	
  	public void manufacture(int numberOfUnits) {
  		
  		this.numberOfUnits += numberOfUnits;
  		 
}

