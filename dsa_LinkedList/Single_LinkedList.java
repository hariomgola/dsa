package dsa_LinkedList;

/*
 * A Linked list consists of nodes with some of data, and a pointer, or link, to the next node.
 * A Big benefit with using linked list is that nodes are stored wherever there is free space in memory.
 * A nodes do not have to be stored contiguously right after each other like elements are stored in arrays.
 * No need to shift or unshify the pending notes when removing or adding the element. 
 */
public class Single_LinkedList {
	// creating custom node class
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		// creating individual node
		Node Node_1 = new Node(3);
		Node Node_2 = new Node(5);
		Node Node_3 = new Node(13);
		Node Node_4 = new Node(2);

		// linking nodes together
		Node_1.next = Node_2;
		Node_2.next = Node_3;
		Node_3.next = Node_4;

		// Printing linked list
		Node currentNode = Node_1;
		while (currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}

		System.out.print("null");

	}
}
