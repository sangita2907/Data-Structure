import java.util.HashMap;
public class CreateTreeInPre2{

	//create a hashmap to store char and index value pairs
	static HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
	
	static int preInd = 0;
	
	public static void main(String []args){
		char []in = new char[]{'D','B', 'E', 'A', 'F', 'C'};
		char []pre = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
		
		
		Node root = searchNode(in, pre, 0, in.length - 1);
		
		postOrder(root);
		 
	}
	
	static Node searchNode(char []in, char []pre, int inS, int inE){
		for(int i = inS; i <= inE; i++){
			mp.put(in[i], i );
		}
		return buildTree(in, pre, inS, inE);
	}
	
	static Node buildTree(char []in, char []pre, int inS, int inE){
	
		//base case
		if(inS > inE)
			return null;
			
		Node newNode = new Node(pre[preInd++]);
		
		//no child
		if(inS == inE)
			return newNode;
			
		int index = mp.get(newNode.data);
		
		//left subtree
		newNode.left = buildTree(in, pre, inS, index - 1);
		
		//right subtree
		newNode.right = buildTree(in,pre, index + 1, inE);
		
		return newNode;
	}
	
	static void postOrder(Node root){
		//base case
		if(root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

}
class Node{

	char data;
	Node left;
	Node right;
	
	public Node(char data){
		this.data = data;
		left = right = null;
	}
}