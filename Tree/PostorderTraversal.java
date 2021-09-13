import java.util.Scanner;
import java.util.Stack;

public class PostorderTraversal{
	public static void main(String []args){
		Node root = buildTree();
		System.out.println("--Postorder Traversal in recursive way--");
		postorderRecursive(root);
		System.out.println("\n--Postorder Traversal in Iterative way--");
		postorderIterative(root);
	}
	
	public static Node buildTree(){
		Scanner scan = new Scanner(System.in);
		Node root = null;
		System.out.println("Enter data: ");
		int data = scan.nextInt();
		if(data == -1)
			return null;
		root = new Node(data);
		
		System.out.println("Enter data for "+ root.data +"'s left: ");
		root.left = buildTree();
		
		System.out.println("Enter data for "+ root.data +"'s right: ");
		root.right = buildTree();
		
		return root;
	}
	
	public static void postorderRecursive(Node root){
		if(root != null){
			postorderRecursive(root.left);
			postorderRecursive(root.right);
			System.out.print(root.data + " --> ");
		}
		
	}
	
	public static void postorderIterative(Node root){
		Stack<Node> s1 = new Stack<Node>();
		Stack<Integer> s2 = new Stack<Integer>();
		Node pop_node = null;
		
		s1.push(root);
		while(!s1.isEmpty()){
			pop_node = s1.pop();
			s2.push(pop_node.data);
			if(pop_node.left != null)
				s1.push(pop_node.left);
			if(pop_node.right != null)
				s1.push(pop_node.right);
		}
		while(!s2.isEmpty())
			System.out.print(s2.pop() + "-->");
	}

}

class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data){
		this.data = data;
	}
}