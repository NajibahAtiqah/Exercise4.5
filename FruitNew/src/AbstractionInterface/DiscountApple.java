package AbstractionInterface;

class DiscountApple implements Discount {
	public double DiscountRate() {
		return 0.1;
	}
}

class DiscountMango implements Discount {
	public double DiscountRate() {
		return 0.15;
	}
}