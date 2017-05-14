public class Comparator2 {

	public <T extends Comparable<T>> T getMax (T m, T n) {
		return (n.compareTo(m) > 0) ? n:m;
	}

	public static void main (String[] args){
		Comparator2 myComparator = new Comparator2();
		myComparator.launch();
	}

	public void launch() {
		System.out.println(getMax(2,5));
		System.out.println(getMax(2.0,5.5));
		System.out.println(getMax("2","5"));
	}
}