package dsa_LinkedList;

/**
 * @Traversal
 * @(Remove a node)
 * @(Insert a node) @(Sort - selection sort)
 */
public class Opertaor_LinkedList {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void traverseAndPoint(Node head) {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}
		System.out.println("End");
	}

	public static Node nodeToDelete(Node head, Node delete_Node) {
		// If first element need to be deleted
		if (head == delete_Node)
			return head.next;

		// Condition if node exist
		Node currentNode = head;
		while (currentNode.next != null && currentNode.next != delete_Node) {
			currentNode = currentNode.next;
		}

		// Condition if node not exist
		if (currentNode.next == null)
			return head;

		currentNode.next = currentNode.next.next; // deleting or swapping the current node
		// Here deleted node will be free up using garbage collector since no reference
		// is allowed for same

		return head;
	}

	public static Node insertNodeAtPosition(Node head, Node insert_Node, int _index) {
		if (_index == 1)
			insert_Node.next = head;

		Node currentNode = head;

		for (int i = 1; i < _index - 1 && currentNode.next != null; i++) {
			currentNode = currentNode.next;
		}

		// logic to add the new node
		if (currentNode != null) {
			insert_Node.next = currentNode.next;
			currentNode.next = insert_Node;
		}

		return head;
	}

	public static void main(String[] args) {
		Node node_1 = new Node(7);
		Node node_2 = new Node(11);
		Node node_3 = new Node(3);
		Node node_4 = new Node(2);
		Node node_5 = new Node(7);

		// Linking the node here
		node_1.next = node_2;
		node_2.next = node_3;
		node_3.next = node_4;
		node_4.next = node_5;

		System.out.print("Starting of node:     ");
		traverseAndPoint(node_1);
		System.out.print("After deleting node:  ");
		nodeToDelete(node_1, node_4);
		traverseAndPoint(node_1);
		System.out.print("After inserting node: ");
		Node newNode = new Node(25);
		insertNodeAtPosition(node_1, newNode, 3);
		traverseAndPoint(node_1);
	}

}
