import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;


public class preorderTraversal{
	public static void main(String []args){
		Node root = buildTree();
		System.out.println("---Recursive Preorder-----");
		preorder(root);
		System.out.println("\n---Iterative Preorder-----");
		preorderIterative(root);
	}
	
	public static Node buildTree(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter data:");
		int data = scan.nextInt();
		if(data == -1) return null;
		
		Node root = new Node(data);
		
		System.out.println("Enter data for "+data+"'s left:");
		root.left = buildTree();
		
		System.out.println("Enter data for "+data+"'s right:");
		root.right = buildTree();
		
		return root;
	}
	
	public static void preorder(Node root){
		if(root != null){
			System.out.print(root.data + " --> ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public static void preorderIterative(Node root){
		Stack<Node> s = new Stack<Node>();
		ArrayList<Integer> arr= new ArrayList<Integer>();
		s.push(root);
		while(!s.isEmpty()){
			Node element = s.pop();
			arr.add(element.data);
			if(element.right != null){
				s.push(element.right);
			} 
			if(element.left != null){
				s.push(element.left);
			} 
		}
		System.out.println(arr.toString());
	}
}

class Node{
	Node left;
	int data;
	Node right;
	
	public Node(int data){
		this.data = data;
	}
}