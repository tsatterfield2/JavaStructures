package stacksandqueues;

///////////// ARRAY QUEUE /////////////

public class ArrayQueue {
	private int capacity;
	private int size;
	private int queue[];

	/**
	 * ArrayQueue constructor
	 * 
	 * @param capacity
	 */
	public ArrayQueue(int capacity) {
		this.queue = new int[capacity];
		this.capacity = capacity;
		this.size = 0;
	}

	/**
	 * Place an element into the queue
	 * 
	 * @param data
	 */
	public void enqueue(int data) {
		System.out.println(data + " pushed into the queue");

		// Queue is at capacity
		if (this.isFull()) {
			System.out.println("Queue is full.");
			return;
		}

		// Place newest items nearer the end
		this.queue[this.size] = data;
		this.size++;
	}

	/**
	 * Remove an element from the beginning of the queue
	 * 
	 * @return
	 */
	public int dequeue() {

		// Empty queue
		if (this.size <= 0) {
			System.out.println("Queue is empty");
			return 0;
		}

		// Retrieve the first item
		--this.size;
		int item = this.queue[0];

		// Copy the array over to one that has the first element removed
		int temp[] = new int[this.capacity];
		for (int i = 0; i < this.size; i++) {
			temp[i] = this.queue[i + 1];
		}

		this.queue = temp;
		return item;
	}

	/**
	 * Checks if the queue is full
	 * 
	 * @return
	 */
	public boolean isFull() {
		return this.size >= this.capacity;
	}

	/**
	 * Searches the queue for an element
	 * 
	 * @param data
	 * @return
	 */
	public boolean search(int data) {

		// Loop through only the amount inserted
		for (int i = 0; i < this.size; i++) {
			if (this.queue[i] == data)
				return true;
		}

		return false;
	}

	/**
	 * Print the queue
	 */
	public void print() {
		System.out.println("Your Queue: ");

		// Empty
		if (this.size == 0) {
			System.out.println("EMPTY");
			return;
		}

		// Loop through all elements
		for (int i = 0; i < this.size; i++) {

			// First element case
			if (i == this.size - 1)
				System.out.println("|" + this.queue[this.size - i - 1] + "| <- FIRST IN FIRST OUT");

			// Remaining elements case
			else
				System.out.println("|" + this.queue[this.size - i - 1] + "|");
		}

		// Current capacity
		System.out.println("Current capacity: " + this.size + "/" + this.capacity + "\n");
	}
}
