public class main{
	public static void main(String []args){
		LinkedList list = new LinkedList();
		list.InsertAtBegin(10);
		list.InsertAtBegin(20);
		list.InsertAtBegin(30);
		list.InsertAtEnd(40);
		list.InsertAtEnd(50);
		list.InsertAtParticularPosition(60,7);
		
		list.show();
	}

}