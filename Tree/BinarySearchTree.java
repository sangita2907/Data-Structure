public class BinarySearchTree{

	class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	//Creating a global variable - root
	Node root;
	
	//Constructor
	public BinarySearchTree(){
		root = null;
	}
	
	
	public static void main(String []args){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(12);
		bst.insert(3);
		bst.insert(11);
		bst.insert(15);
		bst.insert(1);
	
		bst.preOrder();
	
	}
	
	//As we are creating a object of this call so don't need to use static keyword 
	void insert(int data){
		root = insertUtil(root, data);
	}
	
	Node insertUtil(Node root, int data){
		if(root == null){
			root = new Node(data);
			return root;
		}
		
		if(data < root.data){
			root.left = insertUtil(root.left, data);
		} else if(data > root.data){
			root.right = insertUtil(root.right, data);
		}
		
		return root;
	}
	
	void preOrder(){
		preOrderUtil(root);
	}
	
	void preOrderUtil(Node root){
		if(root == null)
			return;
		preOrderUtil(root.left);
		System.out.print(root.data + " ");
		preOrderUtil(root.right);
	}


}