package linkedlist;

public interface ISLL<E>{
	int size();
	boolean isEmpty();
	E first();
	Object getlast();
	E last();
	Object getHead();
	void addFirst(E e);
	void addLast(E e);
	E removeFirst();
	E removeLast();
	void printList();
	Object findNode(E e);
}

