//Generate  Parenthesis in java

public class GenerateParenthesis{
	public static void main(String []args){
		possibleParenthesis(2, 0 , 0, "");
		
	}
	
	public static void possibleParenthesis(int size, int open, int close, String ans){
		// +ve base case
		if(open == size && close == size){
			System.out.println(ans);
			return;
		}
		// -ve base case
		if(open > size || open < close)
			return;
		possibleParenthesis(size, open + 1, close, ans + "(" );
		possibleParenthesis(size, open, close + 1, ans + ")");
	}
}