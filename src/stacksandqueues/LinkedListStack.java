package stacksandqueues;

import linkedlists.SinglyLinkedList;
import linkedlists.SinglyLinkedList.Node;

///////////// ARRAY STACK /////////////

public class LinkedListStack {
	private SinglyLinkedList list = new SinglyLinkedList();

	/**
	 * Push a number to the top of the stack
	 * 
	 * @param data
	 */
	public void push(int data) {
		System.out.println(data + " pushed into the stack");

		// Insert at the head of the list
		this.list.insertHead(data);
	}

	/**
	 * Remove a number from the top of the stack
	 * 
	 * @return
	 */
	public int pop() {

		// Get value of the head and then delete it from the list
		int value = this.list.getHead().getData();
		this.list.deleteHead();
		return value;
	}

	/**
	 * Display the top of the stack, but don't remove it
	 */
	public void peek() {

		// Empty list
		if (this.list.getSize() <= 0)
			System.out.println("Stack underflow");

		// Print head data
		else
			System.out.println("Current top: " + this.list.getHead().getData());
	}

	/**
	 * Print the elements in the stack with it's filled capacity
	 */
	public void print() {
		System.out.println("Your Stack: ");

		// Empty
		if (this.list.getSize() == 0) {
			System.out.println("EMPTY");
		}

		// Place the most recent numbers on top
		Node current = this.list.getHead();

		// Loop through the stack list
		while (current != null) {

			// First element case
			if (current == this.list.getHead())
				System.out.println("|" + current.getData() + "| <- LAST IN FIRST OUT");

			// Remaining elements case
			else
				System.out.println("|" + current.getData() + "|");

			current = current.getNext();
		}

		// Current capacity
		System.out.println("Current capacity: " + this.list.getSize() + "/oo\n");
	}

	/**
	 * Search the element for a stack
	 * 
	 * @param key
	 * @return
	 */
	public boolean search(int data) {

		// Search the list for a key
		this.list.search(data);
		return true;
	}
}