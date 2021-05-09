package AbstractionInterface;

public class Mango extends Fruit {
	private double price;
	private double weight;
	private String country;
	
	public Mango(String name, double p, double w, String c) {
		super (name);
		this.price = p;
		this.weight = w;
		this.country = c;
		
		if(country.equals("Malaysia(")) {
			UnitPrice();//overloading no argument
			System.out.println("Fruit: "+name);
			System.out.println("Country: "+country);
			System.out.println("Total Tax: " +"-");//no tax as it is from Malaysia
			System.out.println("Price/unit: " +"RM "+price);
			System.out.println("Total Weight: "+weight + "KG");
			System.out.println("Total Paid: "+"RM "+TotalPrice());
			
	}
		else if(country.equals("India")) {
			double importTax1 = 0.15;
			UnitPrice(importTax1);//1 argument OL
			double np1 = UnitPrice(importTax1);
			TotalPrice(np1);
			System.out.println("Fruit: "+name);
			System.out.println("Country: "+country);
			System.out.println("Total Import Tax: " +importTax1*100 +"%");
			System.out.println("Price/unit: " +"RM "+UnitPrice(importTax1));
			System.out.println("Total Weight: "+weight + "KG");
			System.out.println("Total Paid: "+"RM "+TotalPrice(np1));
		}
		
		else if (country.equals("Florida")) {
			double importTax2 = 0.25;
			double gg;
			Discount ff = new DiscountMango();//buat new obj
			gg = ff.DiscountRate();
			unitPrice(importTax2,gg);//2 arguments OL
			double np2 = unitPrice(importTax2,gg);
			TotalPrice(np2,gg);
			System.out.println("Fruit: "+name);
			System.out.println("Country: "+country);
			System.out.println("Total Tax: " +importTax2*100 +"%");
			System.out.println("Price/unit: " +"RM "+unitPrice(importTax2,gg));
			System.out.println("Total Weight: "+weight + "KG");
			System.out.println("Discount Received: " +ff.DiscountRate() +"%");
			System.out.println("Total Paid: "+"RM "+TotalPrice(np2));
		}
		
	}
	public double UnitPrice() {
		return price;
			
	}
	public double UnitPrice(double importTax1) {
		return price*(1+importTax1);
		
	}
	public double unitPrice(double importTax2, double gg) {
		return price*(1+importTax2)*(1-gg);
	}
		
		public String toString() {//OR
			return "A Maango is good for our health!";
		}
		@Override//As I cant instantiate the type, I need to add this method
		public double TotalPrice() {
			// TODO Auto-generated method stub
			return price;
		}
		@Override
		public double TotalPrice(double np1) {
			// TODO Auto-generated method stub
			return np1*weight;
		}
		@Override
		public double TotalPrice(double np2, double gg) {
			// TODO Auto-generated method stub
			return np2*weight;
		}
	
	
}
