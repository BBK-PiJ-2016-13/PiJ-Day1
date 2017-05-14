public class Hanoi {

	public double hanoi (double n) {
			if (n == 1) { 
				return 1; //base case
				} else {
				double result = n + (hanoi (n-1) + 1);
				return result;
			}
		}

//set counter
//Each move the top of stack 1 should move if possible (if stack 1 top > stack 2 and stack 3, then compare stacks 2 and 3 and move the lowest number on top of that stack
//If post 2 or post 3 have 64 numbers, then return the number of moves

	public static void main (String[] args) {
		Hanoi myHanoi = new Hanoi();
		myHanoi.launch();
	}

	public void launch () {
		System.out.println(hanoi(1));
		System.out.println(hanoi(2));
		System.out.println(hanoi(3));
		System.out.println(hanoi(4));
		System.out.println(hanoi(5));
	}
}