package uebung_2_2;

public class BinomischeFormel {

	public static void main(String[] args) {
		double a = 8;
		double b = 3;
		
		double links = Math.pow(a + b, 2);
		
		double TeilEins = Math.pow(a, 2);
		double TeilZwei = 2 * a * b;
		double TeilDrei = Math.pow(b, 2);
		
		double loesung1 = TeilEins + TeilZwei + TeilDrei;
		
		System.out.println("(a + b)² = " + links);
		System.out.println("a² + 2ab + b² = " + loesung1);
	
	}

}
