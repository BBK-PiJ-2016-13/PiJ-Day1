/**
 * Implementation of interface stack using a 
 * dynamic structure as support. 
 */
public class PointerPersonQueue implements PersonQueue {
    /**
     * The head of the stack: the visible node - created concept of queue head and pointed it at null
     */
    private PersonQueueNode head;

    public PointerPersonQueue() {
	  head = null;
    }

    public void insert(Person newPerson) {
	  if (head != null) {
		newPerson.setNext(head);
	  }
	  head = newPerson;	  
    }

    public Person retrieve() {
	  if (head == null) {
		return null;
	  }
	  //point entry point to current person, and keep redefining current person as pointing to null
	  //current.next.next if more than one element, use a while loop
	  Person result = head.getEmployeeName();
	  head = head.getNext();
	  return result;
    }

    public Person peek() {
	  if (head == null) {
		return null;
	  } else {
		return head.getEmployeeName();
		return head.getEmployeeNumber();
	  }
    }

    public boolean isEmpty() {
	  if (getSize() == 0) {
		return true;
	  } else {
		return false;
	  }
    }

    /**
     * Returns the number of people in the stack
     */
    public int getSize() {
	  int result = 0;
	  PersonQueueNode currentNode = head;
	  while (currentNode != null) {
		currentNode = currentNode.getNext();
		result++;
	  }
	  return result;
    }
}