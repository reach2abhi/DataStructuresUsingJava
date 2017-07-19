package stackTest;

import java.util.Scanner;

public class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack S = new StackArray();
		System.out.println("size of the stack is: " + S.size());
		
		Scanner scan = new Scanner(System.in);
		while(true){
		System.out
				.println("Menu\n 1. Push Element 2. Pop 3. Multipop 4. Size 5. Print Stack 6. Top 7. Stop");
		
		int choice = scan.nextInt();
		
			switch (choice) {
			case 1:
				System.out.println("Enter the element to be pushed:");
				int ele = scan.nextInt();
				S.push(ele);
				break;

			case 2:
				Integer popele = S.pop();
				System.out.println(popele + " is popped.");
				break;

			case 3:
				System.out.println("Enter the number of elements to be popped:");
				int multipopele = scan.nextInt();
				//S.multipop(S.size(), multipopele);
				System.out.println("Size after the pop is " + S.size());
				break;

			case 4:
				System.out.println("Size after the stack is " + S.size());
				break;

			case 5:
				S.printStack();
				break;
			case 6:
				System.out.println(S.top());
				break;
			case 7:
				System.exit(1);
				break;
			}
		}
		
	}

}
