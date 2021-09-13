public class LetterCombination{
	public static void main(String []args){
		combinations("23", "");
	}
	public static String getCode(char ch){
		switch(ch){
			case 2:
				return "abc";
			case 3:
				return "def";
			case 4:
				return "ghi";
			case 5:
				return "jkl";
			case 6:
				return "mno";
			case 7:
				return "pqrs";
			case 8:
				return "tuv";	
			case 9:
				return "wxyz";
			default:
				return "";
		}
	}
	
	public static void combinations(String ques, String ans){
		if(ques.length() == 0){
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		String code = getCode(ch);
		System.out.println(code);
		for(int i = 0; i < code.length(); i++){
			combinations(roq, ans + code.charAt(i));
		}
	}
	
}