import java.io.File;

public class MkDirectory {

	public static void main (String args[]) {
		File f = null;
		try {
			for (String x : args) {
				f = new File("/Users/eileen/Documents/src/PiJ-exercises/day-15",x);
				f.mkdir();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}