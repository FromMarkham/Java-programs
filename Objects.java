
public class Objects{
	//They fields 
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	private String material;
	private String price;
	
	@Override
	public String toString() {
		return "Objects [material=" + material + ", price=" + price + "]";
	}
	public Objects(String material, String price) {
		super();
		this.material = material;
		this.price = price;
	}
	
	//add utility methods here lol 
	//specific things the object can do
	
}



