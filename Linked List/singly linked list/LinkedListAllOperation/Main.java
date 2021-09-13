public class Main{
	public static void main(String []args){
		LinkedList list = new LinkedList();
		list.InsertAtBegin(10);
		list.InsertAtBegin(20);
		list.InsertAtBegin(30);
		list.InsertAtBegin(40);
		//list.DeleteWithKeyValue(40);
		list.DeleteNodeAtPosition(3);
		list.DeleteNodeAtPosition(1);
		list.DeleteNodeAtPosition(2);
		
		list.show();
	}
}