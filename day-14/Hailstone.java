public class Hailstone {

	public ArrayList hailstoneCalc(int n) {
		int count = 0;
		ArrayList arrayHailstone = new ArrayList();
		while (count < 100) {
			arrayHailstone.add(n);
			if ((n % 2) == 0) {
				n = (n / 2);
				count++;
			} else {
				n = (3 * n + 1);
				count++;
			}
		}
		return arrayHailstone;
	}

	public static void main (String[] args) {
		Hailstone test = new Hailstone();
		ArrayList example = new ArrayList();
		System.out.println ("Provide a number:");
		String str1 = System.console().readLine();
		int x = Integer.parseInt(str1);
		example = (test.hailstoneCalc(x));
		for (int i = 0; i < x; i++) {
			System.out.println (example.get(i).getReturnValue());
		}
	}
}