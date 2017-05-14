import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {

@Test
public void testsNormalName() {
	Person p = new Person();
	String input = "Dereck Robert Yssirt";
	String output = p.getInitials(input);
	String expected = "DRY";
	assertEquals(expected, output);
}

@Test
public void testsNameWithSpaces() {
	Person p = new Person();
	String input = "Pitt The  Elder";
	String output = p.getInitials(input);
	String expected = "PTE";
	assertEquals(expected, output);
}
}