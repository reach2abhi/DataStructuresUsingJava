package stackTest;

public interface stack<E>{

int size();
boolean isEmpty();
void push(int e); 
int pop(); 
int top();
//E multipop(int size,int n);
void printStack();
//void reverse(int[] e);
}