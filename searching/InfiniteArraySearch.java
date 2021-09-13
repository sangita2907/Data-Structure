public class InfiniteArraySearch{
	public static void main(String []args){
		int arr[] = new int[]{1, 3, 7, 8, 12, 58, 69, 70, 96};
		int key = 90;
		int result = infiniteSearch(arr, key);
		System.out.println("index:: " + result);
	}
	
	static int infiniteSearch(int arr[], int key){
		int low = 0;
		int high = 1;
		while(arr[high] < key){
			low = high;
			high = high * 2;
		}
		return binarySearch(arr, key, low, high);
	}
	static int binarySearch(int arr[], int key, int low, int high){
	
		while(low <= high){
			int mid = (low + high) / 2;
			if(arr[mid] == key)
				return mid;
			else if(arr[mid] < key)
				low = mid +1;
			else
				high = mid - 1;
		}
		return -1;
	}
}