package AbstractionInterface;

public class Grape extends Fruit {
	private char size;
	
	public Grape(String name, char s) {
		super(name);
		this.size = s;
		
		switch (s) {
		case 'S':
			System.out.println("Grape size " +size + " is " + "RM " + TotalPrice());
			break;
		case 'M':
			System.out.println("Grape size "+size + " is" + " RM " + TotalPrice(15.0));
			break;
		case 'L':
			System.out.println("Grape size "+size + " is" + " RM " + TotalPrice(25.0));
			break;

		}
	}
	
	public double TotalPrice (double p) {
		return p;
	}

	@Override
	public double TotalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double TotalPrice(double np2, double gg) {
		// TODO Auto-generated method stub
		return 0;
	}
}

