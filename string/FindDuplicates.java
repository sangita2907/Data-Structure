public class FindDuplicates{
	public static void main(String []args){
		String str = "geeksforgeeks";
		printDuplicate(str);
	}
	static void printDuplicate(String str){
		int []count = new int[256];
		countDups(str, count);
		for(int i = 0; i < 256; i++)
			if(count[i] > 1)
				System.out.println((char)(i) + ", count = " + count [i]);
	}
	static void countDups(String str, int []count){
		for(int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
	}
}