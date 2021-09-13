public class CreateTreeInPre{

	static int preIndex = 0;
	
	public static void main(String []args){
		char []in = new char[]{'D','B', 'E', 'A', 'F', 'C'};
		char []pre = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
		
		
		Node root = createTree(in, pre, 0, in.length - 1);
		postOrder(root);
	}
	
	
	static Node createTree(char []in, char []pre, int inS, int inE){
	
		
		//base case
		if(inS > inE)
			return null;
			
		Node newNode = new Node(pre[preIndex++]);
		int index = searchNode(in, inS, inE, newNode.data);
		
		//if node has no child
		if (inS == inE)
			return newNode;
			
		//left subtree
		newNode.left = createTree(in, pre, inS, index - 1);
		
		//right subtree
		newNode.right = createTree(in, pre, index + 1, inE);
		
		return newNode;
	}
	
	static int searchNode(char[] in, int inS, int inE, char data){
	
		int i;
		for( i = inS; i <= inE; i++){
			if(data == in[i])
				return i;
		}
		return i;
	}
	
	static void postOrder(Node node){
		if(node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
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