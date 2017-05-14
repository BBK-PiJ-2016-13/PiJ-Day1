public class PhoneCall {
	public static void main(String[] args) {
		PhoneCall script = new PhoneCall();
		script.launch();
	}

	public void launch() {
/*		System.out.println ("Select an option (0 to shut down): ");
		String input = System.console().readLine();
		int choice = Integer.parseInt(input);
		MobilePhone contact = new MobilePhone();
		String[] ten = new String[10];
		if (choice !=0) {
		System.out.println ("Enter a number to call (Stop to stop): ");
		String number = System.console().readLine();
		System.out.println ("You have entered: " + number);	
		if (number != "Stop") {
		contact.call(number);
		for (int i = 0; i < 10; i++) {
			if(ten[i]=="") {
				for (int j = i; j >= 0; j--) {
				ten[j]=ten[j++];
				}
			}
		}
		ten[0] = number;
		}
		}
		contact.printLastNumbers(ten);

*/
		// Old Phone
		OldPhone old = new OldPhone("Nokia");
		old.call("999478");
		System.out.println(old.getBrand());

		// mobile
		MobilePhone mobile = new MobilePhone("Samsung");
		mobile.ringAlarm("5");
		mobile.playGame("4");
		mobile.call("123456");
		mobile.printLastNumbers();
		System.out.println(mobile.getBrand());

		// myPhone
		MobilePhone<Phone> myPhone = new SmartPhone<Phone>("Huawei");
		System.out.println(myPhone.getBrand());
		myPhone.browseWeb("www.google.com");
		myPhone.findPosition();
		myPhone.call("111");
		myPhone.call("00987654");

		TestPhone myPhone = new TestPhone(myPhone);
		TestPhone.call("111");
	}
}
