package linkedlists;

///////////// CIRCULAR LINKED LIST /////////////

public class CircularLinkedList {
	private Node head;
	private int size = 0;

	///////////// INNER NODE /////////////

	public class Node {
		private int data;
		private Node next;

		/**
		 * Node constructor
		 * 
		 * @param data
		 */
		public Node(int data) {
			this.data = data;
			this.next = null;
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
	}

	/**
	 * List constructor
	 */
	public CircularLinkedList() {
		this.head = null;
	}

	/**
	 * Helper to reassign the last nodes pointer to the head
	 */
	public void pointHead() {
		Node current = this.head;

		// Loop to last node
		for (int i = 0; i < this.size; i++) {
			current = current.next;

		}

		current.next = this.head;
	}

	///////////// INSERTIONS /////////////

	/**
	 * Insert a new head
	 * 
	 * @param data
	 */
	public void insertHead(int data) {
		Node newHead = new Node(data);

		// Empty list
		if (this.size == 0) {
			this.head = newHead;
			this.head.next = this.head;
			this.size++;
			return;
		}

		// Reassign pointers
		newHead.next = this.head;
		this.head = newHead;
		this.pointHead();
		this.size++;
	}

	/*
	 * Insert an element to the end of the list
	 */
	public void insertEnd(int data) {
		Node newEnd = new Node(data);

		// Make it the head if the list is empty
		if (this.head == null) {
			this.insertHead(data);
			return;
		}

		Node current = this.head;

		// Loop to the end of the list
		while (current.next != this.head) {
			current = current.next;
		}

		current.next = newEnd;
		newEnd.next = this.head;
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

		// Make sure the index is valid
		if (index >= this.size || index < 0) {
			System.out.println("Invalid index");
			return;
		}

		// Index is 0, insert at head
		if (index == 0) {
			this.insertHead(data);
			return;
		}

		// Asking to insert at the end
		if (index == this.size) {
			this.insertEnd(data);
			return;
		}

		Node current = this.head;

		// Loop to desired position
		while (current.next != this.head) {
			current = current.next;
		}

		// Link the node in
		newNode.next = current.next;
		current.next = newNode;
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

		// Delete the only node
		if (this.size == 1) {
			this.head = null;
			return;
		}

		Node current = this.head;

		// Loop to the last node
		while (current.next != this.head) {
			current = current.next;
		}

		// Reassign pointers
		this.head = this.head.next;
		current.next = this.head;
		this.size--;
	}

	/**
	 * Delete the final node in the list
	 * 
	 * @param data
	 */
	public void deleteEnd() {
		Node current = this.head;
		Node previous = current;

		// List is empty
		if (this.size == 0) {
			System.out.println("List is already empty");
			return;
		}

		// Loop to the end
		while (current.next != this.head) {
			previous = current;
			current = current.next;
		}

		// At the end
		previous.next = this.head;
		this.size--;
	}

	/**
	 * Deletes a node at an index
	 * 
	 * @param index
	 */
	public void deleteAt(int index) {
		Node current = this.head;

		// List is empty
		if (this.size == 0) {
			System.out.println("List is already empty");
			return;
		}

		// If index is 0, remove head
		if (index == 0) {
			this.deleteHead();
			return;
		}

		// Make sure index is valid
		if (index > this.size - 1 || index < 0) {
			System.out.println("Invalid Index");
			return;
		}

		// Asking to delete at the end
		if (index == this.size) {
			this.deleteEnd();
			return;
		}

		// Loop to the index
		for (int i = 0; i < index - 1; i++) {
			current = current.next;

		}

		// Remove pointers to the node
		current.next = current.next.next;
		this.size--;
	}

	///////////// OTHER FUNCTIONS /////////////

	/*
	 * Print the entire list
	 */
	public void print() {
		System.out.printf("\nYour Circular Linked List of size %d:\n", this.size);
		Node current = this.head;

		// Loop through the list
		for (int i = 0; i < this.size; i++) {
			System.out.print(current.getData() + " -> ");
			current = current.next;
		}

		System.out.print("Back to Head: ");
		for (int i = 0; i < this.size; i++) {
			System.out.print(current.getData() + " -> ");
			current = current.next;
		}
		System.out.print("Back to Head");
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
		while (current.next != this.head) {
			current = current.next;

			// Found it
			if (current.data == key) {
				return true;
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
