public class SmartPhone<P> extends MobilePhone<P> {
	private String number;
	private String[] ten = new String[10];
	private String url;

	public SmartPhone(String brand) {
		super(brand);
	}

	public void browseWeb (String url) {
		System.out.println ("Navigating to http://" + url);
	}
	
	public void findPosition() {
		System.out.println ("Your position is 5434,123857");
	}

	@Override
	public void call(String number) {
		if ((number.charAt(0) == '0') && (number.charAt(1) == '0')) {
			System.out.println ("Calling " + number + " through the internet to save money...");
		} else {
		    super.call(number);
		}
	}
}