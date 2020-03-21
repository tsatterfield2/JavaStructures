package linkedlists;

///////////// SINGLY LINKED LIST /////////////

public class SinglyLinkedList {
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
	public SinglyLinkedList() {
		this.head = null;

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
			this.size++;
			return;
		}

		newHead.next = this.head;
		this.head = newHead;
		this.size++;
	}

	/*
	 * Insert an element to the end of the list
	 */
	public void insertEnd(int data) {
		Node newEnd = new Node(data);
		newEnd.next = null;

		// Make it the head if the list is empty
		if (this.size == 0) {
			this.head = newEnd;
			this.size++;
			return;
		}

		Node current = this.head;

		// Loop to the end of the list
		while (current.next != null) {
			current = current.next;
		}

		current.next = newEnd;
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

		// Loop to before desired position
		for (int i = 0; i < index - 1; i++) {
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

		this.head = this.head.next;
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
		while (current.next != null) {
			previous = current;
			current = current.next;
		}

		// At the end
		previous.next = current.next;
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

		// Loop to before the index
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
		System.out.printf("\nYour Singly Linked List of size %d:\n", this.size);
		Node current = this.head;

		// Loop through the list
		for (int i = 0; i < this.size; i++) {
			System.out.print(current.getData() + " -> ");
			current = current.next;
		}

		// Display the final node as null
		System.out.print("null\n");
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
