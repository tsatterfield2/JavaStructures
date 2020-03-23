package stacksandqueues;

///////////// ARRAY STACK /////////////

public class ArrayStack {
	private int capacity;
	private int top = -1;
	private int stack[];
	private int filled;

	/**
	 * Stack constructor
	 * 
	 * @param capacity
	 */
	public ArrayStack(int capacity) {
		this.capacity = capacity;
		this.stack = new int[capacity];
	}

	/**
	 * Push a number to the top of the stack
	 * 
	 * @param data
	 */
	public void push(int data) {

		// Capacity is reached
		if (top >= this.capacity - 1)
			System.out.println("Stack overflow");

		// Change top to index the newest element
		else {
			this.stack[++this.top] = data;
			System.out.println(data + " pushed into the stack");
			this.filled++;
		}
	}

	/**
	 * Remove a number from the top of the stack
	 * 
	 * @return
	 */
	public int pop() {

		// No numbers in the stack
		if (top < 0) {
			System.out.println("Stack underflow");
			return 0;
		}

		// Return the top number
		this.filled--;
		return this.stack[this.top--];
	}

	/**
	 * Display the top of the stack, but don't remove it
	 */
	public void peek() {

		// Empty
		if (top < 0)
			System.out.println("Stack underflow");

		// Get top element
		else
			System.out.println("Current top: " + this.stack[this.top]);
	}

	/**
	 * Print the elements in the stack with it's filled capacity
	 */
	public void print() {
		System.out.println("Your stack: ");

		// Empty
		if (this.filled == 0) {
			System.out.println("EMPTY");
		}

		// Place the most recent numbers on top
		for (int i = 0; i < this.filled; i++) {

			// First element case
			if (i == 0)
				System.out.println("|" + stack[this.filled - 1 - i] + "| <- TOP");

			// Remaining elements case
			else
				System.out.println("|" + stack[this.filled - 1 - i] + "|");
		}

		// Current capacity
		System.out.println("Current capacity: " + this.filled + "/" + this.capacity + "\n");
	}

	/**
	 * Search the element for a stack
	 * 
	 * @param key
	 * @return
	 */
	public boolean search(int key) {

		// Loop through stack only for the amount of numbers placed in it
		for (int i = 0; i < this.filled; i++) {
			if (stack[i] == key)
				return true;
		}
		return false;
	}
}
