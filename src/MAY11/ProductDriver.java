package MAY11;

public class ProductDriver {
	public static void main(String[] args) {
		
		ProductData pd=new ProductData();
		
		Product p=new Product();
		
		p.setId(1);
		p.setName("TV");
		p.setBrand("Sony");
		p.setType("LED");
		p.setCost(45000);
		
		pd.saveProduct(p);
	}
}
