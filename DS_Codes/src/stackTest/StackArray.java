package stackTest;

import java.util.ArrayList;
import java.util.List;

public class StackArray implements stack{
public static final int CAPACITY=20;
private int[] data;
private int t=-1;
	public StackArray(){
		// TODO Auto-generated constructor stub
		data= new int[CAPACITY];
	}
//	public StackArray(int size){
//		// TODO Auto-generated constructor stub
//		data=(E[]) new Object[size];
//	}
	public int size() {
		// TODO Auto-generated method stub
		return (t+1);
		
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(t==-1)
			return true;
		else
			return false;
	}

	public void push(int e) {
		// TODO Auto-generated method stub
		
		if(t>=CAPACITY-1)
			System.out.println("Stack Overflow");
		else{
			t++;
		data[t]=e;
		}
	}

	public int top() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			String err=new String("Stack Empty exception");
			return 0;
		}
		else
		return(data[t]);	
	}
	

	public int pop() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return 0;
		}
		else{
			int temp=data[t];
			data[t]=0;
			t--;
			return temp;
		}
	}
	/*public E multipop(int size,int n) {
		// TODO Auto-generated method stub
		int i=0;
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return null;
		}
		else{
			E[] temp=(E[]) new Object[CAPACITY];
			while(n!=0){
			temp[i]=data[t];
			data[t]=null;
			t--;
			i++;
			n--;
			}
			return (E) temp;
		}
	}*/
	
	public void printStack(){
		for (int i=0;i<CAPACITY;i++){
			System.out.print(data[i] + ":");
		}
		System.out.println();
	}
	/*public void reverse(E[] a) {
		stack<E> buffer = new StackArray<E>();
		for (int i = 0; i < a.length; i++)
			buffer.push(a[i]);
		for (int i = 0; i < a.length; i++)
			a[i] = buffer.pop();
	}*/
	
}
