package dsa_tree;

public class Binary_tree {

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
		
	}
}
