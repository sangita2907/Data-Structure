public class CreateTreeInPost{
	public static void main(String []args){
		char []inOrder = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
		char []postOrder = new char[]{'D', 'E', 'B', 'F', 'C', 'A'};
		
		
		Node root = builtTree(inOrder, postOrder, 0, inOrder.length-1, 0, postOrder.length-1);
		preOrder(root);	
	}
	
	static Node builtTree(char inOrder[], char postOrder[], int inStart, int inEnd, int postStart, int postEnd){
		//base case
		if(inStart > inEnd)
			return null;
				
		Node node = new Node(postOrder[postEnd]);
			
		//No child
		if(inStart == inEnd)
			return node;
				
		int nodeIndex = searchNode(inOrder, inStart, inEnd, node.data);
			
		node.left = builtTree(inOrder, postOrder, inStart, nodeIndex-1, postStart, postStart - inStart + nodeIndex - 1);
			
		node.right = builtTree(inOrder, postOrder, nodeIndex+1, inEnd, postEnd - inEnd + nodeIndex, postEnd-1);
		
		return node;
	}
		
	static int searchNode(char in[], int start, int end, char data){
		int i;
		for( i = start;  i <= end ; i++){
			if(data == in[i])
				break;
		}
		return i;
	}	
	
	static void preOrder(Node root){
		if(root == null)
			return;
			
		System.out.print(root.data+"\t");
		preOrder(root.left);
		preOrder(root.right);
	}
	
}
	
class Node{
	char data;
	Node left;
	Node right;
		
	public Node(char data){
		this.data = data;
		left=right=null;
	}
}
