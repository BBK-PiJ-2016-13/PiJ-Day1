import org.junit.*;
import static org.junit.Assert.*;

import java.io.File;

public class CopierTest {

@Test
public void testsFirstFileDNE() {
	File f = new File("/Users/eileen/Documents/src/PiJ-exercises/day-15/test1.txt");
	File g = new File("/Users/eileen/Documents/src/PiJ-exercises/day-15/test2.txt");
	Copier c = new Copier();
	String input = "/Users/eileen/Documents/src/PiJ-exercises/day-15/asdfjkl";
	String output = Copier.main(f,g);
	String expected = "The first filename you provided does not exist.";
	assertEquals(expected, output);
}

@Test
public void testsSecondFileExists() {
	Copier c = new Copier();
	File f = new File("/Users/eileen/Documents/src/PiJ-exercises/day-15/test1.txt");
	Mkfile m = new Mkfile ("/Users/eileen/Documents/src/PiJ-exercises/day-15/test2.txt");
	File g = new File("/Users/eileen/Documents/src/PiJ-exercises/day-15/test2.txt");
	String output = c(f,g);
	String expected = "The second filename provided already exists. Overwrite? (Y/N)";
	assertEquals(expected, output);
}
}