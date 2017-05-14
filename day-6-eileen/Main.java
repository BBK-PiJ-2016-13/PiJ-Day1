public class Main {	
	public static void main (String[] args) {
		Main myMain = new Main();
		myMain.launch();
	}

	private void testPerson(PersonList list) {
		System.out.println("Testing the list..."); 
		list.add(9);
		list.add(2);
		list.delete(5);
		list.delete(100);
		list.print();
	}

	public void launch() {
		PersonList yerMan = new PersonList();
		int count = 0;
		String name = "";

		while (name != "stop") {
			System.out.println ("Input the new person's employee number: ");
			String str1 = System.console().readLine();
			int x1 = Integer.parseInt(str1);

			System.out.println ("Input the new person's name: (stop to finish): ");
			String name = System.console().readLine();
			Person x1 = new Person(x1,name);
			count++;

			System.out.println EmployeeNumberArray[count];
			System.out.println " " + EmployeeNameArray[count];
			}
	}

		main.testPerson(yerMan);
}
