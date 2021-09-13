import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class inorderTraversal{
		public static void main(String []args){
			Node root = buildTree();
			System.out.println("----Inorder Traversal in recursive way---");
			inorder(root);
			System.out.println("\n----Inorder Traversal in Iterative way---");
			inorderIterative(root);
		}
		
		public static Node buildTree(){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter data");
			int data = scan.nextInt();
			
			if(data == -1) return null;
			
			//create a new node
			Node root = new Node(data);	
			
			System.out.println("Enter data for" + data + "'s left");
			root.left = buildTree();
			
			System.out.println("Enter data for" + data + "'s right");
			root.right = buildTree();
			
			return root;
			
		}
		
		public static void inorder(Node root){
			if(root != null){
				inorder(root.left);
				System.out.print(root.data + "-->");
				inorder(root.right);
			}
		}
		
		public static void inorderIterative(Node root){
			Stack<Node> s = new Stack<Node>();
			ArrayList<Integer> res = new ArrayList<Integer>();
			Node cur = root;
			boolean done = false;
			while(!done){
				if(cur != null){
					s.push(cur);
					cur = cur.left;
				} else{
					if(s.isEmpty())
						done = true;
					else{
						cur = s.pop();
						res.add(cur.data);
						cur = cur.right;
					}
				}
			}
			System.out.println(res.toString());	
			
		}
		
}

class Node{
	Node left;
	int data;
	Node right;
	
	public Node(int data){
		this.data=data;
	}
}