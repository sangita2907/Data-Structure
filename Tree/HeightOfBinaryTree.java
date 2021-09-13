public class HeightOfBinaryTree extends BinaryTree{
	public static void main(String args[]){
		Node root = createTree();
		System.out.print("Height of this tree: " + findHeight(root));
	}
	
	public static int findHeight(Node root){
		if(root == null)
			return -1;
		return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
	}
}