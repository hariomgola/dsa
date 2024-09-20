package dsa_LinkedList;

import dsa_LinkedList.Double_LinkedList.Node;

public class Double_Circular_LinkedList {
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
		node_4.next = node_1; // circular

		// link previous node
		node_2.prev = node_1;
		node_3.prev = node_2;
		node_4.prev = node_3;
		node_1.prev = node_4;

		// printing node forward
		Node currentNode = node_1;
		System.out.print("Forward: ");
		System.out.print(currentNode.data + " -> ");
		currentNode = currentNode.next;
		while (currentNode != node_1) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}
		System.out.println("...");

		// printing node forward
		currentNode = node_4;
		System.out.print("Backward: ");
		System.out.print(currentNode.data + " -> ");
		currentNode = currentNode.prev;
		while (currentNode != node_4) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.prev;
		}
		System.out.println("...");
	}
}
