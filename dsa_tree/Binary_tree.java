package dsa_tree;

public class Binary_tree {

	String treeStructure = """
			            R
			      A          B
			   C     D    E      F
			                   G
			""";

	private static class TreeNode {
		String data;
		TreeNode left;
		TreeNode right;

		public TreeNode(String data) {
			super();
			this.data = data;
		}
	}

	private static TreeNode createNewNode(String data) {
		return new TreeNode(data);
	}

	public static void main(String[] args) {
		// creating the tree
		TreeNode root = createNewNode("R");
		TreeNode rootA = createNewNode("A");
		TreeNode rootB = createNewNode("B");
		TreeNode rootC = createNewNode("C");
		TreeNode rootD = createNewNode("D");
		TreeNode rootE = createNewNode("E");
		TreeNode rootF = createNewNode("F");
		TreeNode rootG = createNewNode("G");

		// mapping the node
		root.left = rootA;
		root.right = rootB;

		rootA.left = rootC;
		rootA.right = rootD;

		rootB.left = rootE;
		rootB.right = rootF;

		rootF.right = rootG;

		// functionality
		System.out.println("  ****  pre order ****  ");
		preOrderTraversal(root);
		System.out.println("\n  ****  in order ****  ");
		inOrderTraversal(root);
		System.out.println("\n  ****  post order ****  ");
		postOrderTraversal(root);

	}

	// pre order traversal - is the technique for depth first search
	public static void preOrderTraversal(TreeNode node) {
		// - R -- A -- C -- D -- B -- E -- F -- G -
		if (node == null) {
			return;
		}
		System.out.print("- " + node.data + " -");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}

	// in order traversal - is the technique where the depth first search is
	// followed
	public static void inOrderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		preOrderTraversal(node.left);
		System.out.print("- " + node.data + " -");
		preOrderTraversal(node.right);
	}

	public static void postOrderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print("- " + node.data + " -");
	}
}
