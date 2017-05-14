/**
* A phone makes calls
*/
public interface Phone<P> {
	/**
	 * Just print on the screen: "Calling <number>...".
	 */
	void call(String number);
}