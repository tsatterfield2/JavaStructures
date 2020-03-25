package stacksandqueues;

import linkedlists.DoublyLinkedList;
import linkedlists.DoublyLinkedList.Node;

///////////// LINKED LIST QUEUE /////////////

public class LinkedListQueue {
	private DoublyLinkedList list = new DoublyLinkedList();

	/**
	 * Place an element into the queue
	 * 
	 * @param data
	 */
	public void enqueue(int data) {
		System.out.println(data + " pushed into the queue");

		// Place the element at the end of the list
		this.list.insertEnd(data);
	}

	/**
	 * Remove an element from the beginning of the queue
	 * 
	 * @return
	 */
	public int dequeue() {

		// Empty
		if (this.list.getSize() == 0) {
			System.out.println("Queue is empty");
			return 0;
		}

		// Remove the head element and shift the list up
		int item = this.list.getHead().getData();
		this.list.deleteHead();
		return item;
	}

	/**
	 * Searches the queue for an element
	 * 
	 * @param data
	 * @return
	 */
	public boolean search(int data) {
		return this.list.search(data);
	}

	/**
	 * Print the queue
	 */
	public void print() {
		System.out.println("Your Queue: ");

		// Empty
		if (this.list.getSize() == 0) {
			System.out.println("EMPTY");
		}

		Node current = this.list.getHead();

		// Loop through to reach the end
		while (current.getNext() != null) {
			current = current.getNext();
		}

		// Iterate backwards using the doubly linked list previous nodes
		while (current != null) {

			// First element case
			if (current == this.list.getHead())
				System.out.println("|" + current.getData() + "| <- FIRST IN FIRST OUT");

			// Remaining elements case
			else
				System.out.println("|" + current.getData() + "|");

			current = current.getPrevious();
		}

		// Current capacity
		System.out.println("Current capacity: " + this.list.getSize() + "/oo");
	}

	/**
	 * Return the list
	 * 
	 * @return
	 */
	public DoublyLinkedList getList() {
		return this.list;
	}
}
