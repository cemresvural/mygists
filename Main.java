package oop1;

public class Main {

	public static void main(String[] args) {
		
		Product product1=new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(2);
		product1.setImageUrl("image1.jpg");
		
		
		Product product2=new Product();
		product2.setName("Sweg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(2);
		product2.setImageUrl("image2.jpg");
	   
	    
	    Product product3=new Product();
	    product3.setName("Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(2);
		product3.setImageUrl("mage3.jpg");
		
	   
	    Product[] products= {product1,product2,product3};
	    
	    System.out.println("<ul>");
	    for(Product product: products) {
	    	System.out.println("<li>" + product.getName() +"</li>");
	   }
	    System.out.println("</ul>");
	    
	    
	    IndividualCustomer individualCustomer=new IndividualCustomer();
	    individualCustomer.setId(1);
	    individualCustomer.setPhone("05333333333");
	    individualCustomer.setCustomerNumber("789456");
	    individualCustomer.setFirstName("Cemre");
	    individualCustomer.setLastName("Vural");
	    
	    
	    
	    CorporateCustomer corporateCustomer=new CorporateCustomer();
	    corporateCustomer.setId(2);
	    corporateCustomer.setTaxNumber("741852");
	    corporateCustomer.setCompanyName("Turkgygy");
	    corporateCustomer.setCustomerNumber("963852");
	    corporateCustomer.setPhone("057777777");
	    
	    
	    
	    Customer[]  customers= {individualCustomer,corporateCustomer};

	}

}
