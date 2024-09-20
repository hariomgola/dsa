package dsa_LinkedList;

public class Single_Circular_LinkedList {
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
		Node_4.next = Node_1; // circular linked list

		// Printing linked list
		Node currentNode = Node_1;
		Node FirstNode = Node_1;
		System.out.print(currentNode.data + " -> ");
		currentNode = currentNode.next;

		while (currentNode != FirstNode) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}

		System.out.print("...");

	}
}
