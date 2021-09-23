/*
	Find the maximum and minimum element in an array using minimum number of comparison.
	
	
		Time complexity : O(n)
		Number of comparison :
								If n is odd = 3(n - 1)/2
								If n is even = 3(n - 2)/2 + 1


*/


import java.util.Arrays;
public class MaxMin2{
	public static void main(String []args){
	
		int []arr = new int[]{5, 8, 1, 6, 3, 4};
		//int []arr = new int[]{5, 4};
		//int []arr = new int[]{1};
		
		
		System.out.println("Array :: " + Arrays.toString(arr));
		int min = 0;
		int max = 0;
		int i = 0;
		
		if(arr.length % 2 == 0){
			if(arr[0] > arr[1]){
				max = arr[0];
				min = arr[1];
			} else{
				max = arr[1];
				min = arr[0];
			}
			i = 2;
		} else{
			max = arr[0];
			min = arr[0];
			i = 1;
		}
		
		
		for(; i < arr.length; i = i + 2){
			if(arr[i] > arr[i + 1]){
				if(arr[i] > max)
					max = arr[i];
					
				if(arr[i + 1] < min)
					min = arr[i + 1];
			} else{
				if(arr[i] < min)
					min = arr[i];
				
				if(arr[i + 1] > max)
					max = arr[i + 1];
			
			}
		}
		
		System.out.println("Max :: " + max + "\nMin :: " + min);
	
	}

}