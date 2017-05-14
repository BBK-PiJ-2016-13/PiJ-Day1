public class PersonQueueScript {
    public static void main(String[] args) {
	  PersonQueueScript script = new PersonQueueScript();
	  script.launch();
    }

    public void launch() {
	  PersonQueue firstStack = new PointerPersonQueue();
	  testStack(firstStack);
    }

    private void testStack(PersonQueue stack) {
	  System.out.println("Testing the stack..."); 
	  stack.insert(1, Bob);
	  stack.insert(2, Mario);
	  stack.insert(3, Ranjeet);
	  System.out.println("Visible element in the stack: '" + stack.peek() + "'");
	  stack.insert(4, Horatio);
	  stack.insert(5, Goodluck);
	  stack.insert(6, Eduardo);
	  stack.insert(7, Tomas);
	  System.out.println("Visible element in the stack: '" + stack.peek() + "'");
	  stack.Person.retrieve();
	  stack.Person.retrieve();
	  stack.insert(6, Sheryl);
	  stack.insert(7, Antonia);
	  stack.insert(8, Cristal);
	  stack.insert(9, Tammy);
	  stack.insert(10, Tammy Lynn);
	  stack.insert(11, Sheryllynn);
	  System.out.println("Now let's see all the elements in the stack: ");
	  while (!stack.isEmpty()) {
		System.out.println("Next element: '" + stack.retrieve() + "'");
	  }
    }
}