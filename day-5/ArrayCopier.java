public class ArrayCopier {
	private int[] src;
	private int[] dst;

	public void copy (int[] src,int[] dst) {
		int count = 0;
		if (src.length > dst.length) {
			for (int x : src) {
				count = 0;
				while (count <= dst.length-1) {
					dst[count] = src[count];
					count++;
				}
			}
//		System.out.println("first digit: " + dst[0]);
		}
		else if (src.length < dst.length) {
			for (int x : src) {
				count = 0;
				while (count <= src.length-1) {
					dst[count] = src[count];
					count++;
				}
			}
			for (int x : dst) {
				count = dst.length-src.length+1;
				while (count <= dst.length-1) {
					dst[count] = 0;
					count++;
				}
			}
//			System.out.println("first digit: " + dst[0]);
		} 
		else {
			count = 0;
			for (int x : dst) {
				dst[count] = src[count];
				count++;
			}
//			System.out.println("first digit: " + dst[0]);
		}
	}	

	public void printArray (int[] array) {
		int count = 0;
		while (count <= (array.length-1)) {
			System.out.println(array[count]);
			count++;
	}
	}
}
