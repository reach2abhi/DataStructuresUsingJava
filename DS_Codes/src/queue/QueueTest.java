package queue;


public class QueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q1 =new QueueArray<Integer>();
		System.out.println("Size"+q1.size());
		for (int i=0;i<10;i++){
			q1.enqueue(i);
		}
		
		q1.printQueue();
		System.out.println("Size"+q1.size());
		System.out.println(q1.dequeue());
		System.out.println("Size"+q1.size());
		System.out.println(q1.dequeue());
		q1.enqueue(21);
		q1.printQueue();
		System.out.println(q1.front());
	}

}
