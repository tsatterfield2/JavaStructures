package driver;

import linkedlists.SinglyLinkedList;

public class Tester {

	public static void main(String[] args) {

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
		sll.delete(10);
		// 1 -> 3 -> 7 -> null

		///////////// OTHER FUNCTIONS /////////////
		sll.print();
		// 1 -> 3 -> 7 -> null
		boolean ft = sll.search(7);
		// ft == true
		boolean ff = sll.search(12);
		// ff == false
		int s = sll.getSize();
		// s == 3
	}
}
