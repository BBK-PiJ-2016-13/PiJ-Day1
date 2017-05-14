public class Responsive implements Runnable {
	public String completed = ""; //for listing completed tasks
	public String name = "";

	public static final int count = 10;
	public static int time = 0;

	public Responsive(String name) {
		this.name = name;
	}

	@Override
	public void run() {
			sleep();
	}

	private void sleep() {
		try {
			System.out.println("Sleeping for " + time);
			Thread.sleep(time);
			completed = completed + name;
			//if system is awaiting new str1, wait to print
			//readLine should be synchronised to block printing
			System.out.println(completed + " done!");
				//as each task ends, programme announces it unless awaiting another integer
		} catch (InterruptedException ex) {
			ex.printStackTrace(); // Nothing to do, sleep a bit less
		}
	}

	public static void main(String args[]) {
			//request from the user the length in ms of ten tasks, one at a time
		for (int i = 0; i < 3; i++) {
				System.out.println("Thread " + (i+1) + ": Enter a time in ms for this thread to take");
				String str1 = System.console().readLine();
				time = Integer.parseInt(str1);
				Runnable r = new Responsive("Thread " + i);
				Thread t = new Thread(r);
				t.start();
					//each time user enters a length integer, task begins
		}
	}
}