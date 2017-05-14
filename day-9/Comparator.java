public class Comparator <T> {
	public Number getMax(Number number1, Number number2) {
		if (number1.intValue() > number2.intValue()) {
			return number1;
		} else {
			return number2;
		}
	}

	public String getMax(String number1, String number2) {
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		return this.getMax(n1,n2).toString();
	}

	public static void main (String[] args){
		Comparator myComparator = new Comparator();
		myComparator.launch();
	}

	public void launch() {
		System.out.println(getMax(2,5));
		System.out.println(getMax(2.0,5.5));
		System.out.println(getMax("2","5"));
	}
}