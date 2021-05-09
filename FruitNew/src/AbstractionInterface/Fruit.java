package AbstractionInterface;

public abstract class Fruit {
//just define Fruit(superclass) as obj (Dont need to create instance of fruit)
//class yang dah declare as abstract cannot create instance of obj
	
	private String name;
	
	public Fruit (String name) {
		this.name = name;
	}
	
	public abstract double TotalPrice();
	public abstract double TotalPrice(double np1);
	public abstract double TotalPrice(double np2, double gg);
}
//untuk declare method yang tiada implementation + abstraction for super class 

