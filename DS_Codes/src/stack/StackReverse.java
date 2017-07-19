package stack;

import java.util.Arrays;

public class StackReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[ ] a = {1, 2, 3, 2, 2, 1}; // autoboxing allows this
		Integer[] temp=a;
		 //String[ ] s = {"Vamsee", "Kiran", "Venki", "Ramya", "Deepthi"};
		 stack<Integer> S = new StackArray<Integer>();
		 System.out.println("initial array = " + Arrays.toString(a));
		 //System.out.println("s = " + Arrays.toString(s));
		 //System.out.println("Reversing...");
		 S.reverse(a);
		 //reverse(s);
		 System.out.println("reversed array = " + Arrays.toString(a));
		 if(a.equals(temp))
		 {
			System.out.println("Palindrome"); 
		 }
		 else
			 System.out.println("Not palindrome");
		 //System.out.println("s = " + Arrays.toString(s));
	}

	
}
