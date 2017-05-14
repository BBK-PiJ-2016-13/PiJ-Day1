import java.io.File;

public class lsFiles {
	public static void main (String[] args) {

		try {
			File location = new File("/Users/eileen/Documents/src/PiJ-exercises/day-15");
			File[] fileList = location.listFiles();
			for (File x : fileList) {
				System.out.println(x);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}