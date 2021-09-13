public class Main{
	public static void main(String []args){
		LinkedList list = new LinkedList();
		list.InsertAtBegin(10);
		list.InsertAtBegin(20);
		list.InsertAtPosition(30,1);
		list.InsertAtPosition(40,2);
		list.InsertAtPosition(50,5);
		list.InsertAtPosition(50,7);
		list.InsertAtPosition(50,-2);
		
		list.show();
	
	}
}