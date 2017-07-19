package stack;

public interface stack<E>{

int size();
boolean isEmpty();
void push(E e); 
E pop(); 
E top();
E multipop(int size,int n);
void printStack();
void reverse(E[] e);
}