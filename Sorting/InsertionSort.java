import java.util.Arrays;

public class InsertionSort{

	public static void main(String []args){
		int a[]  = new int[]{8, 4, 1, 5, 9, 2};
		System.out.println("Before sorting:: " + Arrays.toString(a));
		insertionSort(a);
		System.out.println("After sorting:: " + Arrays.toString(a));
	}
	
	static void insertionSort(int a[]){
		for(int i = 1; i < a.length; i++){
			int temp = a[i];
			int j = i - 1;
			while(j >= 0 && a[j] > temp){
				a[j + 1] = a[j];
				j--;
				
			}
			a[j + 1] = temp;
		}
	
	}
}