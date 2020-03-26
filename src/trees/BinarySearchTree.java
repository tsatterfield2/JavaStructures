package trees;

import java.util.LinkedList;
import java.util.Queue;

///////////// BINARY SEARCH TREE /////////////

public class BinarySearchTree {
	Node root;

	/**
	 * Inner Node class
	 *
	 */
	public class Node {
		int key;
		Node left, right;

		/**
		 * Node constructor
		 * 
		 * @param data
		 */
		public Node(int data) {
			this.key = data;
			this.left = this.right = null;
		}

		/**
		 * Get the node value
		 * 
		 * @return
		 */
		public int getData() {
			return this.key;
		}

		/**
		 * Get the left child
		 * 
		 * @return
		 */
		public Node getLeft() {
			return this.left;
		}

		/**
		 * Get the right child
		 * 
		 * @return
		 */
		public Node getRight() {
			return this.right;
		}
	}

	/**
	 * Tree constructor
	 */
	public BinarySearchTree() {
		this.root = null;
	}

	/**
	 * First function to insert a node into the tree
	 * 
	 * @param data
	 */
	public void insert(int data) {
		System.out.println(data + " inserted into the BST");

		// Empty tree
		if (this.root == null) {
			this.root = new Node(data);
			return;
		}

		// Call the recursive helper function
		this.insertHelp(this.root, data);
	}

	/**
	 * Primary function to insert a node into the tree
	 * 
	 * @param current
	 * @param data
	 */
	private void insertHelp(Node current, int data) {

		// Base case
		if (current == null) {
			return;
		}

		// Less than root, node goes on left side
		if (data < current.key) {

			// Found the position
			if (current.left == null) {
				current.left = new Node(data);
				return;
			}

			// Recurse across left subtree to find position
			else {
				this.insertHelp(current.left, data);
			}
		}

		// Greater than root, node goes on right side
		else {

			// Found the position
			if (current.right == null) {
				current.right = new Node(data);
				return;
			}

			// Recurse across right subtree to find position
			else {
				this.insertHelp(current.right, data);
			}
		}
	}

	/**
	 * First function to search the tree for a node
	 * 
	 * @param data
	 * @return
	 */
	public boolean search(int data) {

		// The root is the correct key
		if (this.root.key == data) {
			return true;
		}

		// Traverse the tree using the recursive function
		else {
			return searchHelp(this.root, data);
		}
	}

	/**
	 * Primary recursive function to search the tree for a node
	 * 
	 * @param current
	 * @param data
	 * @return
	 */
	private boolean searchHelp(Node current, int data) {

		// Base case
		if (current == null) {
			return false;
		}

		// Found it
		if (current.key == data) {
			return true;
		}

		// Move to left side
		if (data < current.key) {
			return this.searchHelp(current.left, data);
		}

		// Move to right side
		else {
			return this.searchHelp(current.right, data);
		}
	}

	/**
	 * Prints a Breadth First Traversal of the tree
	 */
	public void breadthFirst() {
		System.out.println("Breadth First Search of your BST:");
		Node current = this.root;

		// Use a Queue
		Queue<Node> que = new LinkedList<Node>();
		que.add(this.root);
		System.out.print("[");

		// Run while there are still more nodes to explore
		while (!que.isEmpty()) {

			// Dequeue from the queue as the current node
			current = que.remove();
			System.out.print(" " + current.getData());

			// Add the left child to the queue so long as it isn't empty
			if (current.left != null) {
				que.add(current.left);
			}

			// Add the right child to the queue so long as it isn't empty
			if (current.right != null) {
				que.add(current.right);
			}
		}
		System.out.print(" ]\n");
	}

	/**
	 * Traversal for the pattern left, root, right
	 */
	public void inOrder() {
		System.out.println("In-Order Traversal of your BST:");
		System.out.print("[");
		this.inOrderHelp(this.root);
		System.out.print(" ]\n");
	}

	/**
	 * Recursive helper
	 * 
	 * @param current
	 */
	private void inOrderHelp(Node current) {

		// Base case
		if (current == null) {
			return;
		}

		// Left first
		this.inOrderHelp(current.left);

		// Print the node
		System.out.print(" " + current.key);

		// Right next
		this.inOrderHelp(current.right);
	}

	/**
	 * Traversal for the pattern root, left, right
	 */
	public void preOrder() {
		System.out.println("Pre-Order Traversal of your BST:");
		System.out.print("[");
		this.preOrderHelp(this.root);
		System.out.print(" ]\n");
	}

	/**
	 * Recursive helper
	 * 
	 * @param current
	 */
	private void preOrderHelp(Node current) {

		// Base case
		if (current == null) {
			return;
		}

		// Print the node
		System.out.print(" " + current.key);

		// Left next
		this.preOrderHelp(current.left);

		// Right next
		this.preOrderHelp(current.right);
	}

	/**
	 * Traversal for the pattern left, right, root
	 */
	public void postOrder() {
		System.out.println("Post-Order Traversal of your BST:");
		System.out.print("[");
		this.postOrderHelp(this.root);
		System.out.print(" ]\n");
	}

	/**
	 * Recursive helper
	 * 
	 * @param current
	 */
	private void postOrderHelp(Node current) {

		// Base case
		if (current == null) {
			return;
		}

		// Left first
		this.postOrderHelp(current.left);

		// Right next
		this.postOrderHelp(current.right);

		// Print the node
		System.out.print(" " + current.key);
	}

	/**
	 * Delete a node from the tree
	 * 
	 * @param data
	 */
	public void delete(int data) {
		System.out.println(data + " deleted from the BST");
		this.deleteHelp(this.root, data);
	}

	/**
	 * Primary recursive function to delete and replace a node
	 * 
	 * @param current
	 * @param data
	 * @return
	 */
	private Node deleteHelp(Node current, int data) {

		// Base case
		if (current == null) {
			return current;
		}

		// Traverse down left side
		if (current.key > data) {
			current.left = this.deleteHelp(current.left, data);
		}

		// Traverse down right side
		else if (current.key < data) {
			current.right = this.deleteHelp(current.right, data);
		}

		// Found the node to be deleted
		else {

			// The node only has a right child
			if (current.left == null) {
				return current.right;
			}

			// The node only has a left child
			else if (current.right == null) {
				return current.left;
			}

			// If it reached here, the node must have 2 children
			int min = current.key;
			Node temp = current.right;

			// Find the smallest value on the right side of the tree
			while (temp.left != null) {
				min = temp.left.key;
				temp = temp.left;
			}

			// Move node
			current.key = min;

			// Delete the moved node from the right side
			current.right = deleteHelp(current.right, current.key);
		}
		return current;
	}

	/**
	 * Return the root of the tree
	 * 
	 * @return
	 */
	public Node getRoot() {
		return this.root;
	}
}
