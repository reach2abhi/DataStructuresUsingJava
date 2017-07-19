package linkedlist;

public class TestSLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISLL<Integer> list = new SinglyLinkedList<Integer>();
		System.out.println("size="+list.size());
		System.out.println("is Empty="+list.isEmpty());
		
		list.addFirst(10);
		list.addFirst(9);
		list.addLast(11);
		System.out.println("List is : ");
		list.printList();
		
		System.out.println("size="+list.size());
		System.out.println("first="+(list.first()));
		System.out.println("last="+(list.last()));
		System.out.println("is Empty="+list.isEmpty());
		System.out.println("deleted last="+list.removeLast());
		System.out.println("deleted last="+list.removeLast());
		System.out.println("size="+list.size());
		
		list.addFirst(8);
		list.addLast(12);
		System.out.println("List is : ");
		list.printList();
		System.out.println("deleted first="+list.removeFirst());
		list.printList();
		Node<Integer> cur = new Node<Integer>();
		cur = (Node<Integer>) list.getHead();
		System.out.println("testt...");
		while (cur !=null){
			System.out.print("..."+cur.getElement());
			cur=cur.getNext();
		}
		Node<Integer> find=(Node<Integer>)list.findNode(12);
		System.out.println("Element found is"+find.getElement());
		
		
	}

}
