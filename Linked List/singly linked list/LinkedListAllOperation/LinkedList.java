public class LinkedList{	
	Node head;
	public void InsertAtBegin(int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if(head == null){
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;	
		}
	}
	
	public void DeleteWithKeyValue(int key){
		Node tmp = head;
		Node prev = null;
		if(tmp != null && tmp.data == key){
			head = tmp.next;
			tmp.next = null;
			return;
		}
		while(tmp != null && tmp.data != key){
			prev = tmp;
			tmp = tmp.next;
		}
		if(tmp == null){
			System.out.println("Data doesn't exist");
			return;
		}
		prev.next = tmp.next;
	}
	
	public void DeleteNodeAtPosition(int pos){
		Node tmp = head;
		int count = 1;
		if(pos < 1){
			System.out.println("Invalid Position");
			return;
		}
		if(count == pos){
			head = tmp.next;
			tmp.next = null;
			return;
		}
		while(count < pos - 1 && tmp != null){
			tmp = tmp.next;
			count++;
		}
		if(tmp == null){
			System.out.println("Invalid Position..");
			return;
		}
		tmp.next = tmp.next.next;
	}
	
	public void show(){
		Node tmp = head;
		while(tmp != null){
		
		
			System.out.println(tmp +"->"+ tmp.data +"->"+ tmp.next);
			tmp = tmp.next;
		}
	}

}