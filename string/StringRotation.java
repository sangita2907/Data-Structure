public class StringRotation{
	public static void main(String []args){
		String str1 = "ABCD";
		String str2 = "CDAB";
		if(isRotable(str1, str2) == true)
			System.out.println("Strings are rotations of each other");
		else
			System.out.println("Strings are not rotations of each other");
	}
	
	public static boolean isRotable(String str1, String str2){
		if(str1.length() == str2.length() && (str1 + str1).indexOf(str2) != -1)
			return true;
		return false;
	}
}