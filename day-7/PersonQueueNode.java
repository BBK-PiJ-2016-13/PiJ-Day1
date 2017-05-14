/**
 * A node in a dynamic singly-linked list of Strings
 */
public class PersonQueueNode {
    private Person head = null;
    private PersonQueueNode next;

    public PersonQueueNode(Person newPerson) {
      return newPerson.getEmployeeNumber();
	  return newPerson.getEmployeeName();
	  next = null;
    }

    /**
     * Returns the string in this node
     */
    public void peek(Person newPerson) {
        return newPerson.getEmployeeNumber();
        return newPerson.getEmployeeName();
    }
    /**
     * Set the next node to point to the given node
     */
    public void setNext(PersonQueueNode node) {
	  next = node;		
    }

    /**
     * Set the next node to point to the given node
     */
    public PersonQueueNode getNext() {
	  return next;		
    }
}