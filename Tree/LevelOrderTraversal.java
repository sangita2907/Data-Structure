import java.util.Queue;
import java.util.LinkedList;

public class LevelOrderTraversal extends BinaryTree{
	public static void main(String args[]){
		Node root = createTree();
		iterativeLevelOrderTraversal(root);
	}
	
	public static void iterativeLevelOrderTraversal(Node root){
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		do{
			Node currentElement = q.remove();
			System.out.print(currentElement.data);
			if(currentElement.left != null)
				q.add(currentElement.left);
			if(currentElement.right != null)
				q.add(currentElement.right);
		}while(!q.isEmpty());
	}

}