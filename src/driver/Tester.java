package driver;

import linkedlists.CircularLinkedList;
import linkedlists.DoublyLinkedList;
import linkedlists.SinglyLinkedList;
import stacksandqueues.ArrayStack;
import stacksandqueues.LinkedListStack;

public class Tester {

	public static void main(String[] args) {
		boolean found;
		int size;
		int popped;

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

		System.out.println("\n");

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
	}
}
