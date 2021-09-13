public class LeftViewBT{
	static int max_level = 0;
	
	public static void main(String []args){
		
		//Creating a tree
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.left.left = new Node(5);
		root.right.left.right = new Node(6);
	
		//to find left view of the tree
		leftView(root, 1);
	}
	
	static void leftView(Node node, int level){
		
		//base case
		if(node == null)
			return;
		
		//check if the node is the first element of the level or not
		if(max_level < level){
			System.out.print(node.data + " ");
			max_level = level;
		}
		
		leftView(node.left, level + 1);
		leftView(node.right, level + 1);
		
	}

}


class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data){
		this.data = data;
		left = right = null;
	}
}