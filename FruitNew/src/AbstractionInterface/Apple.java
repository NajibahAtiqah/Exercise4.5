package AbstractionInterface;

public class Apple extends Fruit {
	
	protected int quantity;
	protected double price;
	
	public Apple(String name, int q, double p) {//constructor with 3 arguments
		super(name);
		this.price=p;
		this.quantity=q;
				
		if(quantity <= 3) {
			TotalPrice();//overloading no arguments (price & quantity no change)
			System.out.println("Fruit: "+name);
			System.out.println("Quantity: "+quantity);
			System.out.println("Price/unit: " +"RM "+price);
			System.out.println("Total Paid: "+"RM "+TotalPrice());
		}
		else if(quantity >3 && quantity <= 10) {
			double np1= 2.50;//new price is set
			TotalPrice(np1);//overloading 1 argument
			System.out.println("Fruit: "+name);
			System.out.println("Quantity: "+quantity);
			System.out.println("Price/unit: " +"RM "+np1);
			System.out.println("Total Paid: "+"RM "+TotalPrice(np1));
		}
		else {
			double np2=2.00;//new price = RM2 if buy > 10
			double dd;
			
			Discount ee = new DiscountApple();//buat new obj
			dd = ee.DiscountRate();
			totalPrice(np2,dd);//overloading 2 arguments
			System.out.println("Type: "+name);
			System.out.println("Quantity: "+quantity);
			System.out.println("Price/unit: "+"RM "+np2);
			System.out.println("Discount Received: " +ee.DiscountRate() +"%");
			System.out.println("Total Paid: RM "+(totalPrice(dd,np2)));
		}
		
	}
	
	public double TotalPrice() {
		return this.price*this.quantity;
	}
	
	public double TotalPrice(double np1) {
		return np1*this.quantity;
	}
	
	public double totalPrice(double qq, double np2) {
		return (np2*this.quantity)* (1-qq);
	}
	
	public String toString() {//overriding
		return "An Apple is good for our health!";
	}

	@Override
	public double TotalPrice(double np2, double gg) {
		// TODO Auto-generated method stub
		return 0;
	}
}

