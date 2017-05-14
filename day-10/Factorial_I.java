public class Factorial_I {
	private int factOf;

	public void factorial(int factOf) {
			for (int i = factOf; i == 1; i--) {
			int result = 1;
			if (i == 1) {
				result = result * 1;
				System.out.println(result);
			}
			else {
			result = factOf * i;
			System.out.println(result);
			}
		}
	}

	public static void main (String[] args) {
		Factorial_I myFactorial = new Factorial_I();
		myFactorial.factorial(7);
	}
}