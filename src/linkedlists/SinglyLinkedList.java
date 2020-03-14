package linkedlists;

public class SinglyLinkedList {
	private Node head;
	private int size = 0;

	// Inner Node class
	public class Node {
		private int data;
		private Node next;

		// Constructor
		public Node(int data) {
			this.data = data;
			this.next = null;
		}

		// Return the data of the node
		public int getData() {
			return this.data;
		}

		// Return the next node
		public Node getNext() {
			return this.next;
		}
	}

	// List constructor
	public SinglyLinkedList() {
		this.head = null;
		size++;
	}

	// Insert a new head
	public void insertHead(int data) {
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
	}

	// Insert an element into the list
	public void insert(int data) {
		Node newNode = new Node(data);
		newNode.next = null;

		// Make it the head if the list is empty
		if (this.head == null) {
			this.head = newNode;
		}

		// Insert it to the end of the list
		else {
			Node lastNode = this.head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
		}

		// Increment size
		this.size++;
	}

	// Print the entire list
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

	// Delete the head from the list
	public void deleteHead() {
		this.head = this.head.next;
		size--;
	}

	// Delete an element from the list
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

	// Return the head
	public Node getHead() {
		return this.head;
	}

	// Return the size
	public int getSize() {
		return this.size;
	}
}
