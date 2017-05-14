public interface PersonQueue {
/*
 * Returns the last element from the stack (does not remove it).
 * If the stack is empty, returns null.
 */
Person peek();

/* 
 * Returns true if the stack contains no elements, 
 * false otherwise. 
 */

boolean isEmpty();
/**
* Adds another person to the queue.
*/

void insert(Person person);
/**
* Removes a person from the queue.
*/

Person retrieve();
}