public class ArrayChecker {

	public boolean isSymmetrical(int[] array) {
		int count = 0;
		boolean palindrome = true;
		while (count < (array.length-1)) {
			if (array[count] != array[(array.length-1-count)]) { //if the counter char isn't
				count++; //equal to the length minus the counter
				palindrome = false;
				break;
			} else {
				count++;
			}
		}
		return palindrome;
	}

	public int[] reverse (int[] array) {
		int[] reverseArray = new int[(array.length)];
		int count = 0;
		while (count <= (array.length-1)) {
			reverseArray[count] = array[(array.length-1-count)];
				count++;
			}
		return reverseArray;
	}
	

	void printArray (int[] array) {
		int count = 0;
		while (count <= (array.length-1)) {
			System.out.println(array[count]);
			count++;
	}
	}
}
