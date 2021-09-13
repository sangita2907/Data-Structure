public class LinkedList{
	Node head;
	public void InsertAtBegin(int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.prev = null;
		if(head == null){
			newNode.next = null;
			head = newNode;
			return;
		} 
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	
	public void InsertAtEnd(int data){
		Node tmp = head;
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if(tmp == null){
			newNode.prev = null;
			head = newNode;
			return;
		}
		
		while(tmp.next != null){
			tmp = tmp.next;
		}
		newNode.prev = tmp;
		tmp.next = newNode;
	}
	
	public void InsertAtParticularPosition(int data, int pos){
		Node tmp = head;
		if(tmp == null){
			System.out.println("List is empty \nInsertion at particular location is not possible");
			return;
		}
		Node newNode = new Node();
		newNode.data = data;
		if(pos == 1){
			newNode.next = tmp;
			newNode.prev = null;
			tmp.prev = newNode;
			head = newNode;
		}
		int count = 1;
		while(tmp != null && count < pos - 1){
			tmp = tmp.next;
			count++;
		}
		if(count == pos - 1){
			System.out.println("Particular location is not available\nAs linked list sized is "+ (count));
			return;
		}
		newNode.prev = tmp;
		newNode.next = tmp.next;;
		tmp.next = newNode;
		newNode.next.prev = newNode;
		
	}
	public void show(){
		Node tmp = head;
		while(tmp != null){
			System.out.print(tmp.prev + "<--");
			System.out.print(tmp.data + " @ ");
			System.out.print(tmp + "-->");
			System.out.print(tmp.next + "\n");
			tmp = tmp.next;
		}
	}
	
}