package dsa_LinkedList;

/**
 * Single linked list | data - node | Double linked list | node - data - node |
 * Circular Linked list | data - node | / | node - data - node |
 */
public class Double_LinkedList {
	// double linked List
	static class Node {
		Node prev;
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		// Creating the node
		Node node_1 = new Node(3);
		Node node_2 = new Node(5);
		Node node_3 = new Node(13);
		Node node_4 = new Node(2);

		// link next node
		node_1.next = node_2;
		node_2.next = node_3;
		node_3.next = node_4;

		// link previous node
		node_2.prev = node_1;
		node_3.prev = node_2;
		node_4.prev = node_3;

		// printing node forward
		Node currentNode = node_1;
		System.out.print("Forward: ");
		while (currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}
		System.out.println("null");

		// printing node forward
		currentNode = node_4;
		System.out.print("Backward: ");
		while (currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.prev;
		}
		System.out.println("null");
	}

}
