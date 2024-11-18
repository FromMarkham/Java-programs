
//Name: Bob Wang, Shoe.java
//Date: November 18 2024 
//Description:  class for making shoes 

//The Shoe class 
public class Shoe{
	
	//Variables 
	private String Brand;
	private String Name;
	private double Size;
	private int Cost;
	
	//Constructor 
	public Shoe(String brand, String name, double size, int cost) {
		super();
		
		Brand = brand;
		
		Name = name;
		
		Size = size;
		
		Cost = cost;
	}

	//Brand getter 
	public String getBrand() {
		return Brand;
	}
	
	//Brand setter 
	public void setBrand(String brand) {
		Brand = brand;
	}
	
	//Name getter 
	public String getName() {
		return Name;
	}
	
	//Name setter 
	public void setName(String name) {
		Name = name;
	}

	//Size getter 
	public double getSize() {
		return Size;
	}
	
	//Size setter 
	public void setSize(int size) {
		Size = size;
	}

	//Cost getter 
	public int getCost() {
		return Cost;
	}
	
	//Cost setter 
	public void setCost(int cost) {
		Cost = cost;
	}
	
	//The toString method 
	@Override
	public String toString() {
		return "Shoe [Brand=" + Brand + ", Name=" + Name + ", Size=" + Size + ", Cost=" + Cost + "]";
	}
	

	
}
