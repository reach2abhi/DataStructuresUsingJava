package recursion;

public class LinearSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,20,30,40,50};
		int sum=0;
		sum=LinearSum.linearSum(arr, 5);
		System.out.println("Sum of the elements is: "+sum);

	}
	public static int linearSum(int[ ] data, int n) {  
		if (n == 0)
		 return 0;
		 else
		 return linearSum(data, n-1) + data[n-1];
		 }
}
