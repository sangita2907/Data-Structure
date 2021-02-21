public class ClimbingStairs{
	public static void main(String []args){
		possibleStairs(0, 5, " ");
	}
	
	public static void possibleStairs(int cur, int totalStairs, String ans){
		// +ve based case
		if(cur == totalStairs){
			System.out.println(ans);
			return;
		}
		/*if(cur + 1 <= totalStairs )
			possibleStairs(cur + 1, totalStairs, ans + "1");
		if(cur + 2 <= totalStairs )
			possibleStairs(cur + 2, totalStairs, ans + "2");
		if(cur + 3 <= totalStairs )
			possibleStairs(cur + 3, totalStairs, ans + "3");
		*/
		// -ve base case
		if(cur > totalStairs)
			return;
		possibleStairs(cur + 1, totalStairs, ans + "1");
		possibleStairs(cur + 2, totalStairs, ans + "2");
		possibleStairs(cur + 3, totalStairs, ans + "3");
	}
}