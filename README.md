# Java-Structures
A bunch of data structures and their operations designed in Java for educational purposes.

## Linked Lists
- Dynamically sizing
- No random access
- Nodes point to other nodes

| List Type  | Trait |
| ------------- | ------------- |
| **Singly Linked List**  | Nodes only point to the next node  |
| **Doubly Linked List**  | Nodes point to previous and next node  |
| **Circular Linked List**  | Last node points back to the head node  |

#### Operations:
- insertHead - Inserts a new head node
- insertEnd - Inserts a node to the end
- insertAt - Inserts a node at an index (starting at 0=head)
- deleteHead - Deletes the head node
- deleteEnd - Deletes the last node
- deleteAt - Deletes a node at an index (starting at 0=head)
- print - Prints easily readable list
- printReverse (Doubly Linked List Only) - Prints the list in reverse
- search - Searches the list for a key
- getSize - Returns how many nodes are in the list

## Stacks
-  Last In First Out (LIFO)
-  Array or Linked List versions

| Stack Type  | Trait |
| ------------- | ------------- |
| **Array Stack**  | Fixed capacity when created  |
| **Linked List Stack**  | No max capacity  |

#### Operations:
- push - Inserts an element to the top of the stack
- pop - Returns and removes the top element in the stack
- peek - Prints the current top element in the stack
- search - Searches the stack for a key
- print - Prints all contents of the stack

## Queues
- First In First Out (FIFO)
- Array or Linked List versions

| Queue Type  | Trait |
| ------------- | ------------- |
| **Array Queue**  | Fixed capacity when created  |
| **Linked List Queue**  | No max capacity  |

#### Operations:
- enqueue - Inserts an element to the end of the queue
- dequeue - Returns and removes the first element in the queue
- search - Searches the queue for a key
- print - Prints all contents of the queue
- isFull (Array Queue Only) - Checks if the queue is full
        
## Trees
- Each tree contains nodes with attached child nodes
- Maximum height of O(n)
- Minimum height of O(logn)

| Tree Type  | Trait |
| ------------- | ------------- |
| **Binary Search Tree**  | Left nodes are smaller than root; Right nodes are larger than root  |

#### Operations:
- insert - Insert a node into the BST
- delete - Delete a node from the BST
- search - Search the tree for a node
- breadthFirst - Print the level order list of the tree
- inOrder - Print the in-order list of the tree
- preOrder - Print the pre-order list of the tree
- postOrder - Print the post-order list of the tree
