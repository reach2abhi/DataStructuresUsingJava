package recursion;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,20,40,50};
		int key=80;
		boolean result=BinarySearch.binarySearch(arr, key, 0, arr.length-1);
		System.out.println(result?"Element found":"Element not found");

	}

	public static boolean binarySearch(int[] data, int target, int low, int high) {
		if (low > high)
			return false; // interval empty; no match
		else {
			int mid = (low + high) / 2;
			if (target == data[mid])
				return true; // found a match
			else if (target < data[mid])
				return binarySearch(data, target, low, mid - 1); // recur left
																	// of the
																	// middle
			else
				return binarySearch(data, target, mid + 1, high); // recur right
																	// of the
																	// middle
		}
	}

}
