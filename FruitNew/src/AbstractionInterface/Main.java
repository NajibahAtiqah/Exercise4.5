package AbstractionInterface;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(">>>>>> APPLE <<<<<<");	
		Apple A = new Apple ("Apple", 12, 3.50 );
		System.out.println();
		
		System.out.println(">>>>>> GRANNY SMITH <<<<<<");
		GrannySmith GS = new GrannySmith ("Granny Smith", 5, 4.10, "Green", "Sour");
		System.out.println();

		System.out.println(">>>>>> FUJI APPLE <<<<<<");	
		FujiApple FA = new FujiApple ("Fuji Apple", 2, 6.50, "Red", "Sweet");
		System.out.println();

		System.out.println(">>>>>> GRAPE <<<<<<");	
		Grape G = new Grape("Grape", 'M');
		System.out.println();

		System.out.println(">>>>>> MANGO <<<<<<");
		Mango M = new Mango ("Mango", 10.0, 2.0, "Malaysia");
		
	}

}
