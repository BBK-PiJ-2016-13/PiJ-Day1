public class Calculator {
	
	public int add(int int1, int int2) {
		return int1 + int2;
	}
	
	public int subtract(int int1, int int2) {
		return int1 - int2;
	}
	
	public int multiply(int int1, int int2) {
		return int1 * int2;
	}
	
	public double divide(int int1, int int2) {
		double number1 = (double) int1;
		double number2 = (double) int2;
		return number1 / number2;
	}
	
	public int modulus(int int1, int int2) {
		return int1 % int2;
	}
}