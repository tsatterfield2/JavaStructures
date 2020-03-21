package driver;

import linkedlists.CircularLinkedList;
import linkedlists.DoublyLinkedList;
import linkedlists.SinglyLinkedList;

public class Tester {

	public static void main(String[] args) {

		///////////// LINKED LISTS /////////////

		///////////// SINGLY LINKED LIST /////////////
		SinglyLinkedList sll = new SinglyLinkedList();
		boolean found;
		int size;

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
	}
}
