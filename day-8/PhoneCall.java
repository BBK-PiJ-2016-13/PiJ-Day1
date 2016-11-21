public class PhoneCall {
	public static void main(String[] args) {
		PhoneCall script = new PhoneCall();
		script.launch();
	}

	public void launch() {
		System.out.println ("Enter a number to call: ");
		String number = System.console().readLine();
		System.out.println ("You have entered: " + number);	
		OldPhone contact = new OldPhone();
		contact.call(number);
	}
}
