package driver;

import linkedlists.CircularLinkedList;
import linkedlists.DoublyLinkedList;
import linkedlists.SinglyLinkedList;
import stacksandqueues.ArrayQueue;
import stacksandqueues.ArrayStack;
import stacksandqueues.LinkedListQueue;
import stacksandqueues.LinkedListStack;
import trees.BinarySearchTree;

public class Tester {

	public static void main(String[] args) {
		boolean found;
		int size;
		int popped;
		int dequeued;

		System.out.println("---------------------------------------");
		System.out.println("	    LINKED LISTS");
		System.out.print("---------------------------------------");

		///////////// LINKED LISTS /////////////

		///////////// SINGLY LINKED LIST /////////////
		SinglyLinkedList sll = new SinglyLinkedList();

		///////////// INSERTIONS /////////////
		sll.insertEnd(3);
		// 3 -> null
		sll.insertHead(4);
		// 4 -> 3 -> null
		sll.insertEnd(10);
		// 4 -> 3 -> 10 -> null
		sll.insertAt(7, 2);
		// 4 -> 3 -> 7 -> 10 -> null
		sll.insertAt(1, 0);
		// 1 -> 4 -> 3 -> 7 -> 10 -> null
		sll.insertHead(8);
		// 8 -> 1 -> 4 -> 3 -> 7 -> 10 -> null

		///////////// DELETIONS /////////////
		sll.deleteAt(2);
		// 8 -> 1 -> 3 -> 7 -> 10 -> null
		sll.deleteHead();
		// 1 -> 3 -> 7 -> 10 -> null
		sll.deleteEnd();
		// 1 -> 3 -> 7 -> null

		///////////// OTHER FUNCTIONS /////////////
		sll.print();
		// Your Singly Linked List of size 3:
		// 1 -> 3 -> 7 -> null
		found = sll.search(7);
		// found == true
		found = sll.search(12);
		// found == false
		size = sll.getSize();
		// size == 3

		///////////// DOUBLY LINKED LIST /////////////
		DoublyLinkedList dll = new DoublyLinkedList();

		///////////// INSERTIONS /////////////
		dll.insertEnd(3);
		// null <- 3 -> null
		dll.insertHead(4);
		// null <- 4 <-> 3 -> null
		dll.insertEnd(10);
		// null <- 4 <-> 3 <-> 10 -> null
		dll.insertAt(7, 2);
		// null <- 4 <-> 3 <-> 7 <-> 10 -> null
		dll.insertAt(1, 0);
		// null <- 1 <-> 4 <-> 3 <-> 7 <-> 10 -> null
		dll.insertHead(8);
		// null <- 8 <-> 1 <-> 4 <-> 3 <-> 7 <-> 10 -> null

		///////////// DELETIONS /////////////
		dll.deleteAt(2);
		// null <- 8 <-> 1 <-> 3 <-> 7 <-> 10 -> null
		dll.deleteHead();
		// null <- 1 <-> 3 <-> 7 <-> 10 -> null
		dll.deleteEnd();
		// null <- 1 <-> 3 <-> 7 -> null

		///////////// OTHER FUNCTIONS /////////////
		dll.print();
		// Your Doubly Linked List of size 3:
		// null <- 1 <-> 3 <-> 7 -> null
		dll.printReverse();
		// Your Reversed Doubly Linked List of size 3:
		// null <- 7 <-> 3 <-> 1 -> null
		found = dll.search(7);
		// found == true
		found = dll.search(12);
		// found == false
		size = dll.getSize();
		// size == 3

		///////////// CIRCULAR LINKED LIST /////////////
		CircularLinkedList cll = new CircularLinkedList();

		///////////// INSERTIONS /////////////
		cll.insertEnd(3);
		// null <- 3 -> null
		cll.insertHead(4);
		// null <- 4 <-> 3 -> null
		cll.insertEnd(10);
		// null <- 4 <-> 3 <-> 10 -> null
		cll.insertAt(7, 2);
		// null <- 4 <-> 3 <-> 7 <-> 10 -> null
		cll.insertAt(1, 0);
		// null <- 1 <-> 4 <-> 3 <-> 7 <-> 10 -> null
		cll.insertHead(8);
		// null <- 8 <-> 1 <-> 4 <-> 3 <-> 7 <-> 10 -> null
		///////////// DELETIONS /////////////
		cll.deleteAt(2);
		// null <- 8 <-> 1 <-> 3 <-> 7 <-> 10 -> null
		cll.deleteHead();
		// null <- 1 <-> 3 <-> 7 <-> 10 -> null
		cll.deleteEnd();
		// null <- 1 <-> 3 <-> 7 -> null

		///////////// OTHER FUNCTIONS /////////////
		cll.print();
		// Your Circular Linked List of size 3:
		// 1 -> 3 -> 7 -> Back to Head: 1 -> 3 -> 7 -> Back to Head
		found = cll.search(7);
		// found == true
		found = cll.search(12);
		// found == false
		size = cll.getSize();
		// size == 3

		///////////// LINKED LISTS /////////////

		System.out.println("---------------------------------------");
		System.out.println("	        STACKS");
		System.out.println("---------------------------------------");

		///////////// STACKS /////////////

		///////////// ARRAY STACK /////////////
		ArrayStack as = new ArrayStack(5);

		as.peek();
		// Stack underflow
		as.push(12);
		// 12 pushed into stack
		as.push(1);
		// 1 pushed into stack
		as.push(2);
		// 2 pushed into stack
		as.peek();
		// Current top: 2
		popped = as.pop();
		// popped == 2
		as.peek();
		// Current top: 1
		as.push(15);
		// 15 pushed into stack
		as.push(13);
		// 13 pushed into stack
		as.push(90);
		// 90 pushed into stack
		as.push(20);
		// Stack overflow
		found = as.search(13);
		// found == true
		as.print();
		// Your stack:
		// |90| <- TOP
		// |13|
		// |15|
		// |1|
		// |12|
		// Current capacity: 5/5

		///////////// LINKED LIST STACK /////////////
		LinkedListStack ls = new LinkedListStack();

		ls.peek();
		// Stack underflow
		ls.push(12);
		// 12 pushed into stack
		ls.push(1);
		// 1 pushed into stack
		ls.push(2);
		// 2 pushed into stack
		ls.peek();
		// Current top: 2
		popped = ls.pop();
		// popped == 2
		ls.peek();
		// Current top: 1
		ls.push(15);
		// 15 pushed into stack
		ls.push(13);
		// 13 pushed into stack
		ls.push(90);
		// 90 pushed into stack
		ls.push(20);
		// 20 pushed into stack
		found = ls.search(13);
		// found == true
		ls.print();
		// Your stack:
		// |20| <- TOP
		// |90|
		// |13|
		// |15|
		// |1|
		// |12|
		// Current capacity: 6/oo

		///////////// STACKS /////////////

		System.out.println("---------------------------------------");
		System.out.println("	        QUEUES");
		System.out.println("---------------------------------------");

		///////////// QUEUES /////////////

		///////////// ARRAY QUEUE /////////////
		ArrayQueue aq = new ArrayQueue(5);

		dequeued = aq.dequeue();
		// Queue is empty
		aq.enqueue(3);
		// 3 pushed into the queue
		aq.enqueue(5);
		// 5 pushed into the queue
		aq.enqueue(9);
		// 9 pushed into the queue
		aq.enqueue(7);
		// 7 pushed into the queue
		aq.enqueue(1);
		// 1 pushed into the queue
		aq.enqueue(8);
		// Queue is full
		dequeued = aq.dequeue();
		// dequeued == 3
		dequeued = aq.dequeue();
		// dequeued == 5
		found = aq.search(5);
		// found == false
		aq.print();
		// Your Queue:
		// |1|
		// |7|
		// |9| <- FIRST IN FIRST OUT
		// Current capacity: 3/5

		///////////// LINKED LIST QUE /////////////
		LinkedListQueue lq = new LinkedListQueue();

		dequeued = lq.dequeue();
		// Queue is empty
		lq.enqueue(3);
		// 3 pushed into the queue
		lq.enqueue(5);
		// 5 pushed into the queue
		lq.enqueue(9);
		// 9 pushed into the queue
		lq.enqueue(7);
		// 7 pushed into the queue
		lq.enqueue(1);
		// 1 pushed into the queue
		lq.enqueue(8);
		// 8 pushed into the queue
		dequeued = lq.dequeue();
		// dequeued == 3
		dequeued = lq.dequeue();
		// dequeued == 5
		found = lq.search(5);
		// found == false
		lq.print();
		// Your Queue:
		// |8|
		// |1|
		// |7|
		// |9| <- FIRST IN FIRST OUT
		// Current capacity: 4/oo

		///////////// QUEUES /////////////

		System.out.println("---------------------------------------");
		System.out.println("	        TREES");
		System.out.println("---------------------------------------");

		///////////// TREES /////////////

		///////////// BINARY SEARCH TREE /////////////
		BinarySearchTree bt = new BinarySearchTree();

		bt.insert(10);
		// 10 inserted into the BST
		bt.insert(5);
		// 5 inserted into the BST
		bt.insert(15);
		// 15 inserted into the BST
		bt.insert(12);
		// 12 inserted into the BST
		bt.insert(1);
		// 1 inserted into the BST
		bt.insert(3);
		// 3 inserted into the BST
		bt.insert(11);
		// 11 inserted into the BST
		bt.delete(10);
		// 10 deleted from the BST
		bt.delete(1);
		// 1 deleted from the BST
		bt.breadthFirst();
		// Breadth First Search of your BST:
		// [ 10 5 15 1 12 ]
		bt.inOrder();
		// In-Order Traversal of your BST:
		// [ 1 5 10 12 15 ]
		bt.preOrder();
		// Pre-Order Traversal of your BST:
		// [ 10 5 1 15 12 ]
		bt.postOrder();
		// Post-Order Traversal of your BST:
		// [ 1 5 12 15 10 ]
		found = bt.search(5);
		// found == true

		///////////// TREES /////////////
	}
}
