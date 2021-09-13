import java.util.Arrays;

public class BubbleSort{

	public static void main(String []args){
		int a[] = new int[]{8, 4, 1, 3, 2};
		System.out.println("Before swap:: " + Arrays.toString(a));
		bubbleSort(a);
		System.out.println("After swap:: " + Arrays.toString(a));
	}
	
	static void bubbleSort(int a[]){
		int size = a.length;
		for(int i = 0; i < size - 1; i++){
			boolean swapped = false;
			for(int j = 0; j < size - i - 1; j++){
				if(a[j + 1] < a[j]){
					swapped = true;
					swap(a, j +1, j);
				}
			}
			if(!swapped){
				break;
			}
		}
	}

	static void swap(int a[], int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}