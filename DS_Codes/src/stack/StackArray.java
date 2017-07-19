package stack;

import java.util.ArrayList;
import java.util.List;

public class StackArray<E> implements stack<E>{
public static final int CAPACITY=20;
private E[] data;
private int t=-1;
	public StackArray(){
		// TODO Auto-generated constructor stub
		data=(E[]) new Object[CAPACITY];
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

	public void push(E e) {
		// TODO Auto-generated method stub
		
		if(t>=CAPACITY-1)
			System.out.println("Stack Overflow");
		else{
			t++;
		data[t]=e;
		}
	}

	public E top() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			String err=new String("Stack Empty exception");
			return (E) err;
		}
		else
		return(data[t]);	
	}
	

	public E pop() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return null;
		}
		else{
			E temp=data[t];
			data[t]=null;
			t--;
			return temp;
		}
	}
	public E multipop(int size,int n) {
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
	}
	
	public void printStack(){
		for (int i=0;i<CAPACITY;i++){
			System.out.print(data[i] + ":");
		}
		System.out.println();
	}
	public void reverse(E[] a) {
		stack<E> buffer = new StackArray<E>();
		for (int i = 0; i < a.length; i++)
			buffer.push(a[i]);
		for (int i = 0; i < a.length; i++)
			a[i] = buffer.pop();
	}
	
}
