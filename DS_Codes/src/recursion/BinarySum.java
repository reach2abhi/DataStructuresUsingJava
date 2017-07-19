package recursion;

public class BinarySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,20,30,40,50};
		int sum=BinarySum.binarySum(arr, 0, arr.length-1);
		System.out.println("Binary Sum is: "+sum);
	}

	public static int binarySum(int[] data, int low, int high) {
		if (low > high) // zero elements in subarray
			return 0;
		else if (low == high) // one element in subarray
			return data[low];
		else {
			int mid = (low + high) / 2;
			return binarySum(data, low, mid) + binarySum(data, mid + 1, high);
		}
	}
}
