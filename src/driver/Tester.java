package driver;
import linkedlists.SinglyLinkedList;

public class Tester {

	public static void main(String[] args) {
		
		///////////// LINKED LISTS/////////////

		// Singly Linked List
		SinglyLinkedList sll = new SinglyLinkedList();

		// Inserting and Deleting
		sll.insert(3);
		// 3 -> null
		sll.insert(4);
		// 3 -> 4 -> null
		sll.delete(3);
		// 4 -> null
		sll.insert(5);
		// 4 -> 5 -> null
		sll.insert(10);
		// 4 -> 5 -> 10 -> null
		sll.delete(5);
		// 4 -> 10 -> null
		sll.delete(4);
		// 10 -> null
		sll.delete(4);
		// 4 not found.
		sll.insert(20);
		// 10 -> 20 -> null
		sll.insertHead(5);
		// 5 -> 10 -> 20 -> null
		sll.deleteHead();

		// Printing
		sll.print();
		// 10 -> 20 -> null

	}

}
