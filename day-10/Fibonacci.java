public class Fibonacci {
	private int fibOf;

	public int fib (int n) {
			if ((n == 1) || (n == 2)) {
				return 1;
				} else {
				int result = fib (n-1) + fib (n-2);
				return result;
			}
		}

	public static void main (String[] args) {
		Fibonacci myFib = new Fibonacci();
		myFib.launch();
	}

	public void launch () {
		System.out.println(fib(7));
	}
}