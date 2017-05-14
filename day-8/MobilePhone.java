public class MobilePhone extends OldPhone {
	private String number;
	private String[] ten = new String[10];

	public MobilePhone(String brand) {
		super(brand);
	}

	public void ringAlarm (String number) {
		System.out.println ("Beep Beep! Beep Beep! It's" + number + " o'clock!");
	}
	
	public void playGame (String number) {
		System.out.println ("How much would you rather be playing a game now on a scale of 1 to 10: " + number);
	}
	
	public void printLastNumbers () {
		System.out.println ("The last ten numbers you rang are: "); 
			for (int i = 0; i<10; i++) {
				System.out.println (ten[i]);
			}

	}

	@Override
	public void call(String number) {
		super.call(number);
		for (int i = 0; i < 10; i++) {
			if (ten[i] == null) {
				ten[i] = number;
				break;
			}
		}
		ten[0] = number;

	//need to fix this so that each slot fills with the correct number
	}
}