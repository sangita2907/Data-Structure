import java.util.Arrays;
public class ReverseArray{
	public static void main(String []args){
		int []arr = new int[]{5, 3, 4, 7, 1};
		int start = 0;
		int end = arr.length - 1;
		
		System.out.println("Array :: " + Arrays.toString(arr));
		while(start < end){
			int tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
			start++;
			end--;
		}
		
		System.out.println("Reverse :: " + Arrays.toString(arr));
		
	}
}