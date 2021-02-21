public class CoinToss{
	public static void main(String []args){
		String ans = " ";  
		tossResult(3, ans);
	}
	public static void tossResult(int n, String ans){
		if(n == 0){
			System.out.println(ans);
			return;
		}
		tossResult(n - 1, ans + "H");
		tossResult(n - 1, ans + "T");
	}
}