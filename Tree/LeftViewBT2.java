import java.util.Queue;
import java.util.LinkedList;

public class LeftViewBT2{
	public static void main(String []args){
		//Creating a tree
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.left.left = new Node(5);
		root.left.left.left.left = new Node(6);
		
		//to find the left view of the tree
		leftView(root);
		
	}
	
	static void leftView(Node root){
		
		//create a queue
		Queue<Node> queue = new LinkedList<>();
		//Push the first element
		queue.add(root);
		
		while(!queue.isEmpty()){
			int size = queue.size();
			
			for(int i = 1; i <= size; i++){
				Node value = queue.poll();
				//Check if the element is first element or not
				if(i == 1)
					System.out.print(value.data + " ");
				
				//put the left and right child in the queue if exist
				if(value.left != null)
					queue.add(value.left);
				if(value.right != null)
					queue.add(value.right);
			}
		}
	}

}


class Node{
	int data;
	Node left; 
	Node right;
	
	//constructor
	public Node(int data){
		this.data = data;
		left = right = null;
	}
}