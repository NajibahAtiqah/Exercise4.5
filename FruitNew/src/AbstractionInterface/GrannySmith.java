package AbstractionInterface;

public class GrannySmith extends Apple {
		private String colour;
		private String taste;
		
		public GrannySmith(String name, int q, double p, String c, String t) {
			super(name, q, p);
			this.colour = c;
			this.taste = t;
		}

		
		public String getColour() {
			return this.colour;
		}
		
		public String getTaste() {
			return this.taste;
			
		}
		
		public double CalPrice() {
			return super.price * super.quantity;
		
		}
		
		public String toString() {
			return "Granny Smith is good for our health!";
		}


		@Override
		public double TotalPrice(double np2, double gg) {
			// TODO Auto-generated method stub
			return 0;
		}
	
}
