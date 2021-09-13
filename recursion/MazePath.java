public class MazePath{
	public static void main(String []args){
		findMazePath(0, 0, 2, 2, "");
	}
	
	public static void findMazePath(int currentColumn, int currentRow, int endColumn, int endRow, String ans){
		//+ve base case
		if(currentColumn == endColumn && currentRow == endRow){
			System.out.println(ans);
			return;
		}
		//-ve base case
		if(currentColumn > endColumn || currentRow > endRow)
			return;
			
		findMazePath(currentColumn + 1, currentRow, endColumn, endRow, ans + "H");
		findMazePath(currentColumn, currentRow + 1, endColumn, endRow, ans + "V");
		
	}
}