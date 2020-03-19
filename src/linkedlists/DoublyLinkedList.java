package linkedlists;

///////////// DOUBLY LINKED LIST /////////////

public class DoublyLinkedList {
	private Node head;
	private int size = 0;

	///////////// INNER NODE /////////////

	public class Node {
		private int data;
		private Node previous;
		private Node next;

		/**
		 * Node constructor
		 * 
		 * @param data
		 */
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.previous = null;
		}

		/**
		 * Get the info within the node
		 * 
		 * @return
		 */
		public int getData() {
			return this.data;
		}

		/**
		 * Return the next node
		 * 
		 * @return
		 */
		public Node getNext() {
			return this.next;
		}

		/**
		 * Return the previous node
		 * 
		 * @return
		 */
		public Node getPrevious() {
			return this.previous;
		}
	}

	/**
	 * List constructor
	 */
	public DoublyLinkedList() {
		this.head = null;
	}

	///////////// INSERTIONS /////////////

	public void insertHead(int data) {
		Node newHead = new Node(data);

		// List is empty
		if (this.size == 0) {
			this.head = newHead;
			size++;
			return;
		}

		// List isn't empty
		newHead.next = this.head;
		this.head.previous = newHead;
		this.head = newHead;
		this.size++;
	}

	/*
	 * Insert an element to the end of the list
	 */
	public void insertEnd(int data) {
		Node newEnd = new Node(data);
		Node current = this.head;

		// List is empty
		if (this.size == 0) {
			this.insertHead(data);
			return;
		}

		// Get to the end
		while (current.next != null) {
			current = current.next;
		}

		// Assign pointers
		current.next = newEnd;
		newEnd.previous = current;
		this.size++;
	}

	/**
	 * Insert at a position
	 * 
	 * @param data
	 * @param index
	 */
	public void insertAt(int data, int index) {
		Node newNode = new Node(data);
		Node current = this.head;

		// Asking to insert at head
		if (index == 0) {
			this.insertHead(data);
			return;
		}

		// Asking to insert at end
		if (index == this.size) {
			this.insertEnd(data);
			return;
		}

		// Make sure the index is valid
		if (index >= this.size || index < 0) {
			System.out.println("Invalid index");
			return;
		}

		// Loop to right before the index
		for (int i = 0; i < index - 1; i++) {
			current = current.next;
		}

		// Assign pointers
		newNode.next = current.next;
		newNode.next.previous = newNode;
		current.next = newNode;
		newNode.previous = current;
		this.size++;
	}

	///////////// DELETIONS /////////////

	/**
	 * Delete the head from the list
	 */
	public void deleteHead() {

		// List is empty
		if (this.size == 0) {
			System.out.println("List is already empty");
			return;
		}

		this.head = this.head.next;
		this.head.previous = null;
		this.size--;
	}

	/**
	 * Delete the final node in the list
	 * 
	 * @param data
	 */
	public void deleteEnd() {
		Node current = this.head;

		// List is empty
		if (this.size == 0) {
			System.out.println("List is already empty");
			return;
		}

		// Get to the end
		while (current.next != null) {
			current = current.next;
		}

		current.previous.next = current.next;
		this.size--;
	}

	/**
	 * Deletes a node at an index
	 * 
	 * @param index
	 */
	public void deleteAt(int index) {
		Node current = this.head;

		// Asking to delete the head
		if (index == 0) {
			this.deleteHead();
			return;
		}

		// Asking to delete the end
		if (index == this.size - 1) {
			this.deleteEnd();
			return;
		}

		// Make sure the index is valid
		if (index >= this.size || index < 0) {
			System.out.println("Invalid index");
			return;
		}

		// Loop to right before the index
		for (int i = 0; i < index - 1; i++) {
			current = current.next;
		}

		// Reassign pointers
		current.next = current.next.next;
		current.next.previous = current;
		this.size--;
	}

	///////////// OTHER FUNCTIONS /////////////

	/*
	 * Print the entire list
	 */
	public void print() {
		System.out.printf("\nYour Doubly Linked List of size %d:\n", this.size);
		Node currentNode = this.head;
		System.out.print("null <- ");

		// Print and format every node
		while (currentNode.next != null) {
			System.out.print(currentNode.getData() + " <-> ");
			currentNode = currentNode.next;
		}

		System.out.print(currentNode.getData() + " -> null\n");
	}

	/**
	 * Print the entire list in reverse
	 */
	public void printReverse() {
		System.out.printf("\nYour Reversed Doubly Linked List of size %d:\n", this.size);
		Node currentNode = this.head;
		System.out.print("null <- ");

		// Get to the end
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}

		// From the end to to start, print and format every node
		while (currentNode.previous != null) {
			System.out.print(currentNode.getData() + " <-> ");
			currentNode = currentNode.previous;
		}

		System.out.print(currentNode.getData() + " -> null\n");
	}

	/**
	 * Search for a key in the list
	 * 
	 * @param key
	 */
	public boolean search(int key) {
		Node current = this.head;

		// If there's only 1 node
		if (this.head.data == key) {
			return true;
		}

		// Loop through the list
		while (current.next != null) {
			current = current.next;

			// Found it
			if (current.data == key) {
				return true;
			}

			// Didn't find it
			if (current.next == null) {
				break;
			}
		}
		return false;
	}

	/**
	 * Return the head
	 * 
	 * @return
	 */
	public Node getHead() {
		return this.head;
	}

	/**
	 * Return the size
	 * 
	 * @return
	 */
	public int getSize() {
		return this.size;
	}
}
