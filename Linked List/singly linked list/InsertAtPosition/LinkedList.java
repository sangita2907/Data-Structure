public class LinkedList{
	Node head;
	public void InsertAtPosition(int data, int position){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if(position < 0){
			System.out.println("Please insert a valid range");
		}
		if(position == 1){
			newNode.next = head;
			head = newNode;
		}else{
			int count = 1;
			Node tmp = head;
			while(count < position - 1){
				tmp = tmp.next;
				if(tmp == null){
					System.out.println("insert a valid range");
					return;
				}
				count++;
			}
			newNode.next = tmp.next;
			tmp.next = newNode;
		}
		
	}
	
	
	
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
	
	public void show(){
		Node tmp = head;
		while(tmp != null){
			System.out.println(tmp + "->" + tmp.data + "->" + tmp.next);
			tmp = tmp.next;
		}
	
	}

}