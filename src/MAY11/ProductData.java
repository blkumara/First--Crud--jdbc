package MAY11;

public class ProductData {
	
	public void saveProduct(Product product)
	{
		System.out.println("Product Id Is:"+product.getId());
		System.out.println("The Product Name Is:"+product.getName());
		System.out.println("The Product Brand Is:"+product.getBrand());
		System.out.println("The Product Type Is:"+product.getType());
		System.out.println("The Product Cost Is:"+product.getCost());
	}

}
