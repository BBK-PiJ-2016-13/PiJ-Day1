public class OldPhone<P> implements Phone<P> {
	private String number;
	protected String brand = null;

	public OldPhone(String brand) {
		this.brand = brand;
	}

	public void call(String number) {
		System.out.println ("Calling " + number + "...");
	}

	public String getBrand() {
		return brand;
	}
}