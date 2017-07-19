package linkedlist;

public class SinglyLinkedList<E> implements ISLL<E>{
	private Node<E> head = null;
	private int sz = 0;
	public SinglyLinkedList( ) { }
		// constructs an initially empty list
	public int size() { return sz; }
	
	public boolean isEmpty() { return sz == 0; }
	
	public E first() {
		// returns (but does not remove) the first element
		return head.getElement();
		
	}
	
	public Node<E> getHead() {
		// returns (but does not remove) the first element
		if(sz==0)
		{
			System.out.println("Linked List is Empty");
			return null;
		}
		else
		{
			return head;
		}
	}
	
	public E last() {
		// returns (but does not remove) the last element
		Node<E> temp=new Node<E>();
		temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		return temp.getElement();
	}
	
	public Node<E> getlast() {
		// returns (but does not remove) the last element
		Node<E> temp=new Node<E>();
		temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		return temp;
	}
	
	// update methods
	public void addFirst(E e) {	// adds element e to the front of the list
			// create and link a new node
		
		Node<E> temp = new Node<E>(e,null);  
        if(head == null) 
        {
            temp.next=null;
        	head=temp;
           
        }
        else{
        	temp.next=head;
        	head=temp;
        }
        
        sz++ ;   
		
	}
	
	public void addLast(E e) {
		// adds element e to the end of the list
		if(head==null)
			head=new Node<E>(e,null);
		else{
		Node<E> temp = new Node<E>(e,null);	//a new node is created with value e and next is null
		Node<E> last=getlast();	// getlast will get the last node.
		last.next=temp;	// new value will become the last node.
		}
		sz++;
		
	}
	
	public E removeFirst( ) {
		// removes and returns the first element
	if(head==null)
		return null;
	else{
		Node<E> temp=head;	//value of current head is copied.
		head=head.next;	// current head's next is made head, i.e. second node is becoming head
		sz--;
		return temp.getElement();
		}
	
	
	}
	
	public E removeLast() {
		// removes and returns the first element
		if(isEmpty()) return null;
		Node<E> temp=head;	
		if(sz==1)	// This works even if there is only a single element in the list.
		{		
			head.next=null;
			return temp.getElement();
		}
		while(temp.next.next!=null)	//Going till last but one node.
		{
			temp=temp.next;
		}
		Node<E> ele=temp.next;	//last node element is copied
		temp.next=null;	//last but one node's next is made null.
		sz--;	//size is decremented as we removed one element.
		return ele.getElement();
		
	} 
	
	public void printList(){
		Node<E> temp = head;
		while(temp!=null){
			System.out.print(temp.getElement()+",");
			temp = temp.getNext();
		}
	}
	
	public Node<E> findNode(E elt) {
		Node<E> temp=head;
		while(temp.getElement()!=elt)
		{
			temp=temp.next;
		}
		return temp;
	}
}

