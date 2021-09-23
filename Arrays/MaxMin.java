/*
	Find the maximum and minimum element in an array using minimum number of comparison.
	
	
		Time complexity : O(n)
		Number of comparison : 2(N -2) +1


*/

import java.util.Arrays;
public class MaxMin{
	public static void main(String []args){
		int []arr = new int[]{2, 5, 1, 6, 3, 4};
		
		System.out.println("Array :: " + Arrays.toString(arr));

		//declaring two variables for storing max and min value
		int max = 0;
		int min = 0;
		
		if(arr.length == 1){
			max = arr[0];
			min = arr[0];
		}else{
			
			//Assign the max and min value of the first two position in our variables.
			if(arr[0] < arr[1]){
				max = arr[1];
				min = arr[0];
			} else{
				max = arr[0];
				min = arr[1];
			}
			
			//Iteration from index 2, change the min and max accordingly.
			for(int i = 2; i < arr.length; i++){
				if(arr[i] > max){
					max = arr[i];
				}
				if(arr[i] < min){
					min = arr[i];
				}
			}
		}	
		System.out.println("Min :: " + min + "\nMax :: " + max);
	}
}