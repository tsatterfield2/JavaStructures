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
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
		size++;
	}

	/*
	 * Insert an element to the end of the list
	 */
	public void insertEnd(int data) {
		Node newNode = new Node(data);
		newNode.next = null;

		// Make it the head if the list is empty
		if (this.head == null) {
			this.head = newNode;
		}

		// Insert it to the end of the list
		else {
			Node lastNode = this.head;

			// Loop to the end of the list
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}

			lastNode.next = newNode;
		}

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
		Node currentNode = this.head;

		// Make sure the index is valid
		if (index > this.size || index < 0) {
			System.out.println("Invalid index");
		}

		// Index is 0, insert at head
		else if (index == 0) {
			this.insertHead(data);
		}

		// Index is valid
		else {

			// Loop to desired position
			for (int i = 0; i < index - 1; i++) {
				currentNode = currentNode.next;
			}

			// Link the node in
			newNode.next = currentNode.next;
			currentNode.next = newNode;
			this.size++;
		}
	}

	///////////// DELETIONS /////////////

	/**
	 * Delete the head from the list
	 */
	public void deleteHead() {
		this.head = this.head.next;
		size--;
	}

	/**
	 * Delete an element from the list (Only deletes the first occurrence)
	 * 
	 * @param data
	 */
	public void delete(int data) {
		Node current = this.head;
		Node previous = current;

		// Element was the head
		if (this.head.data == data) {
			this.head = current.next;
			size--;
		}

		// Element is later in the list
		else {

			// Loop through the list until we find the target
			while (current != null && current.data != data) {
				previous = current;
				current = current.next;
			}

			// Key is found
			if (current != null) {
				previous.next = current.next;
				size--;
			}

			// Key not found
			else {
				System.out.println(data + " not found.");
			}
		}
	}

	/**
	 * Deletes a node at an index
	 * 
	 * @param index
	 */
	public void deleteAt(int index) {
		Node current = this.head;

		// If index is 0, remove head
		if (index == 0) {
			this.deleteHead();
		}

		// Make sure index is valid
		else if (index > this.size - 1 || index < 0) {
			System.out.println("Invalid Index");
		}

		// Valid index
		else {

			// Loop to the index
			for (int i = 0; i < index - 1; i++) {
				current = current.next;

			}

			// Remove pointers to the node
			Node target = current.next;
			current.next = target.next;
			this.size--;
		}
	}

	///////////// OTHER FUNCTIONS /////////////

	/*
	 * Print the entire list
	 */
	public void print() {
		Node current = this.head;

		// Loop through the list
		for (int i = 0; i < this.size; i++) {
			System.out.print(current.getData() + " -> ");
			current = current.next;
		}

		// Display the final node as null
		System.out.print("null");
	}

	/**
	 * Search for a key in the list
	 * 
	 * @param key
	 */
	public boolean search(int key) {
		Node current = this.head;

		// Loop through the list
		while (true) {
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
