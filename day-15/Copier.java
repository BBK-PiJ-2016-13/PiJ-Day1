import java.io.File;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Copier {

	public void copyingStuff(File first, File second) {
		String line; //copy file 1's contents into it, reading char by char and copying
      	FileInputStream fin = null;
      	BufferedReader br = null;
      	InputStreamReader isr = null;
      	BufferedWriter bw = null;
      	FileWriter fw = null;
		File f = null;
		try {
			f = first;
			fin =  new FileInputStream(f);
     		isr = new InputStreamReader(fin);
    		br = new BufferedReader(isr);
    		fw = new FileWriter(second);
    		bw = new BufferedWriter(fw);
     		while ((line = br.readLine()) != null) {
        		bw.write(line + '\n');
			}
			bw.flush();
			bw.close();
			br.close();
			System.out.println("Writing complete.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main (String[] args) {
		Copier c = new Copier();
		File f = new File("/Users/eileen/Documents/src/PiJ-exercises/day-15",args[0]);
		File g = new File("/Users/eileen/Documents/src/PiJ-exercises/day-15",args[1]);
		System.out.println(c.copy(f,g));
	}

	public String copy (File f, File g){
		try {
			if (!f.exists()) {
				return("The first filename you provided does not exist.");
			}
			if (g.exists()) {
				System.out.println("The second filename provided already exists. Overwrite? (Y/N)");
				String str1 = System.console().readLine();

				if (str1.equals("Y")) {
					g.delete();
					g.createNewFile();
					copyingStuff(f,g); //read the file & write into the new file
					//overwrite contents - use cat class to do this?
					return ("File has been overwritten.");
				} else {
					return ("File contents unchanged.");
				}
			} else { 			//assuming both file 1 exists and file 2 does not exist
				g.createNewFile();
				copyingStuff(f,g); //read the file & write into the new file
				return ("File copy has been created.");
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}