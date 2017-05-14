public class Factorial_R {
	private int factOf;

	public int factorial(int factOf) {
			if (factOf == 1) {
			return 1;
			} else {
			int result = factOf * factorial(factOf-1);
			return result;
			}
		}

	public static void main (String[] args) {
		Factorial_R myFactorial = new Factorial_R();
		myFactorial.launch();
	}

	public void launch () {
		System.out.println(factorial(3));
	}
}