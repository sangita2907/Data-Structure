import java.util.*;
public class BinaryTree{
	
	public static void main(String args[]){
		createTree();
	}
	
	
	public static Node createTree(){
		
		//Create an object of Node class
		Node root = null;
		System.out.println("Enter data: ");
		Scanner scan = new Scanner(System.in);
		int data = scan.nextInt();
		if(data == -1) return null;
		root = new Node(data);
		
		System.out.println("Enter data for " + data +"'s left");
		root.left = createTree();
		
		System.out.println("Enter data for " + data +"'s right");
		root.right = createTree();
		
		return root;
	}
}

class Node{
	Node left, right;
	int data;
	
	public Node(int data){
		this.data = data;
	}
}