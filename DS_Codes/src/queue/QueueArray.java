package queue;

public class QueueArray<E> implements Queue<E> {
	public static final int CAPACITY=10;
	private E[] data;
	private int f=0;
	private int r=-1;
	private int sz=0;
	
	public QueueArray() { 
		data= (E[]) new Object[CAPACITY];
	}
	public int size() {
		return sz;
		
	}

	public boolean isEmpty() {
		return(sz==0);
		
	}

	public void enqueue(E e) throws IllegalStateException {
		if(sz==CAPACITY)
		{
			System.out.println("Queue is FULL");
		}
		else{
			r=(r+1)%CAPACITY;
			data[r]=e;
			sz++;
		}
				
	}
	public E dequeue() {
		E temp=data[f];
		data[f]=null;
		f=(f+1)%CAPACITY;
		sz--;
		return temp;
	}

	public E front() {
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return null;
		}
		else{
			return data[f];
		}
	}
	
	public void printQueue(){
		for (int i=0;i<CAPACITY;i++){
			System.out.print(data[i] + ":");
		}
		System.out.println();
	}

}
