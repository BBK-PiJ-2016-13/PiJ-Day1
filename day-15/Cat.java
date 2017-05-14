import java.io.File;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Cat {
	public static void main (String[] args) {
		String line;
      	FileInputStream fin = null;
      	BufferedReader br = null;
      	InputStreamReader isr = null;
		File f = null;
		try {
			for (String x : args) {
				f = new File("/Users/eileen/Documents/src/PiJ-exercises/day-15",x);
				if (f.exists()) {
					fin =  new FileInputStream(f);
         			isr = new InputStreamReader(fin);
        		 	br = new BufferedReader(isr);
         			while ((line = br.readLine()) != null) {
            			System.out.println(line);
					}
				} else {
					System.out.println("No file of that name exists.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}