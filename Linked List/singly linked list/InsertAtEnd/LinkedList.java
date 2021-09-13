public class LinkedList{
	Node head;
	public void InsertAtEnd(int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if(head == null){
			head = newNode;
		}
		else{
			Node n = head;
			while(n.next != null){
				n = n.next;
			}
			n.next = newNode;
		}
	}
	
	public void show(){
		Node n = head;
		while(n.next != null){
			System.out.println(n+"-->"+n.data+"-->"+n.next);
			n = n.next;
		}
		System.out.println(n+"-->"+n.data+"-->"+n.next);
	}


}