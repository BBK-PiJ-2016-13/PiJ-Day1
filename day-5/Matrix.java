public class Matrix {
	private int x;
	private int y;
	private int[][] matrix;

	public Matrix (int x, int y) {
		matrix = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				matrix[i][j] = 1;
			}
		}
	}

	public void setElement (int x, int y, int z) {
		if ((matrix.length > x) && (matrix[x].length > y)) {
			matrix[x][y] = z;
		}
	}

//change one row of array given integer position and list of numbers as string 1,2,3
//if index or string is invalid it does nothing
	public void setRow (int index, String str) {
		int numbers = 0; //counter for single digits in string
		int count = 0;
		while (count < (str.length())) { //step through characters in string
			String current = str[count];
			if (current == ",") {
				count++; //increase counter to continue stepping but take no action
			} else {
				count++;
				numbers++; //need to count how many numbers and make sure fits matrix
			}
		}
		if ((numbers == matrix[index].length) && (index <=matrix.length)) { 
 					//if digits in the string match places in matrix
			while (count < (str.length())) { //step through characters in string
				String current = str[count];
				if (current == ",") {
				count++; //increase counter to continue stepping but take no action
				} else {
				matrix[index][count] = Integer.parseInt(str[count]);
				count++; //set position in matrix equal to that digit in the string
				numbers++; //need to count how many numbers and make sure fits matrix
				}
			}
		}
	}

	public void setColumn (int x, String str) {

	}

	public String toString() {
		String str = "[";
		for (int i = 0; i < matrix.length; i++) {
			if (i > 0) {
				str += ";";
			}
			for (int j = 0; j < matrix[i].length; j++) {
				if (j > 0) {
					str += ",";
				}
				str += String.valueOf(matrix[i][j]);
			}
		}
		str += "]";
		return str;
	}

	public void prettyPrint() {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println ();
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print (matrix[i][j]);
			}
		}
		System.out.println ();
		System.out.println ();
	}
}