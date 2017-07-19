package recursion;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 40, 50 };
		ReverseArray.reverseArray(arr, 0, arr.length - 1);
		System.out.println("Reversed Array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

	public static void reverseArray(int[] data, int low, int high) {
		if (low < high) { // if at least two elements in subarray
			int temp = data[low]; // swap data[low] and data[high]
			data[low] = data[high];
			data[high] = temp;
			reverseArray(data, low + 1, high - 1); // recur on the rest
		}
	}
}
