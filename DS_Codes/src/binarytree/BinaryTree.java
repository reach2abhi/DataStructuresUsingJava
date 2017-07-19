package binarytree;

import java.util.Queue;
import java.util.LinkedList;
/**
 * @author vi
 *
 */
public class BinaryTree<E> implements IBinaryTree<E>{

	private Node<E> root;
	private int sz;
	private Node<E> nodelist[] = new Node[10];
	public BinaryTree(){
		root = null;
		sz=0;
	}


	public Node<E> getRoot() {
		// TODO Auto-generated method stub
		return root;
	}

	public void setRoot(Node<E> node) {
		// TODO Auto-generated method stub
		root = node;
		sz++;
	}

	public Node<E> findNode(E val){
		return null;
	}

	public Node<E> getNode(int pos){
		return nodelist[pos];
	}
	//inserts a node whose value is elt as a child of curnode

	public void insertChild(Node<E> curnode, E elt, char type) {
		// TODO Auto-generated method stub
		Node<E> curchild=new Node<>(elt,curnode);
		if(type=='l') curnode.setLeft(curchild);
		else curnode.setRight(curchild);

	}

	public void constructTree(E[] eltArray) {
		// TODO Auto-generated method stub
		Node<E> newnode = new Node<E>(eltArray[1],null);
		root = newnode;
		nodelist[0]=null;
		nodelist[1]=root;
		for (int i=2; i<eltArray.length;i++){
			if (eltArray[i]!=null){

				if(i%2==0){
					System.out.println(nodelist[i/2]);
					insertChild(nodelist[i/2],eltArray[i],'l');
					nodelist[i]=nodelist[i/2].getlChild();
				}
				else{
					insertChild(nodelist[i/2],eltArray[i],'r');
					nodelist[i]=nodelist[i/2].getrChild();
				}
			}
			else nodelist[i]=null;
		}
	}

	public void printTree() {
		// TODO Auto-generated method stub
		for (int i=1;i<nodelist.length;i++)
		{
			if (nodelist[i]!=null){
				System.out.println("Elt-"+nodelist[i].getElement() + "; Pos"+i);
			}
			else System.out.println("Null");
		}

	}

	public void inorderTraverse(Node<E> node) {
		// TODO Auto-generated method stub
		if(node.getlChild()!=null)
			inorderTraverse(node.getlChild());

		System.out.print("->"+node.getElement());

		if(node.getrChild()!=null)
			inorderTraverse(node.getrChild());

	}

	public void preorderTraverse(Node<E> node) {
		// TODO Auto-generated method stub
		System.out.print("->"+node.getElement());
		if(node.getlChild()!=null)
			preorderTraverse(node.getlChild());

		if(node.getrChild()!=null)
			preorderTraverse(node.getrChild());

	}

	public void postorderTraverse(Node<E> node) {
		// TODO Auto-generated method stub

		if(node.getlChild()!=null)
			postorderTraverse(node.getlChild());

		if(node.getrChild()!=null)
			postorderTraverse(node.getrChild());
		System.out.print("->"+node.getElement());
	}

	public void levelorderTraverse(Node<E> node) {
		// TODO Use the queue to do the traversal. You can also use the inbuilt Queue
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(node);
		Node tempNode=null;
		while(!queue.isEmpty()){
			tempNode=queue.poll();
			if(tempNode!=null)
			{
				if(tempNode.getlChild()!=null)
					queue.add(tempNode.getlChild());
				if(tempNode.getrChild()!=null)
					queue.add(tempNode.getrChild());

				System.out.print("->"+tempNode.getElement());
			}
		}
	}

	public int getDepth(Node<E> node) {
		// TODO Auto-generated method stub
		/*int depth=1;
		Node<E> newnode = nodelist[1];
		root = newnode;
		while(node.getParent()!=root){
			depth++;
			node=node.getParent();
		}
		return depth;*/
		if(node.isRoot())
			return 0;
		else
			return (1+getDepth(node.getParent()));
	}

	public int getHeight(Node<E> node) {
		// TODO Auto-generated method stub
		int h1=0,h2=0;
		if(node.isExternal())
			return 0;
		else
		{
			if(node.getlChild()!=null)
				h1=getHeight(node.getlChild());
			if(node.getrChild()!=null)
				h2=getHeight(node.getrChild());

			return Math.max(h1+1, h2+1);
		}
	}

	public int size() {
		// TODO Auto-generated method stub
		return sz;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (sz==0);
	}


	public boolean isProper() {
		// TODO Auto-generated method stub
		/*int flag=0;
		for(Node<E> temp:nodelist)
		{
			if(temp!=null){
				if(temp.isExternal() || (temp.getlChild()!=null)&&(temp.getrChild()!=null))
					flag=0;
				else
					flag=1;
			}
		}
		if(flag==1) return true;
		else return false;*/
		
		//level order for checking propoer is iterative.
		// preorder for checking propoer is recursive.
		//level order traversal is better as it is cost effective tham recursive.
		
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(root);
		Node tempNode=null;
		int flag=0;
		while(!queue.isEmpty()){
			tempNode=queue.poll();
			if(tempNode!=null)
			{
				if(tempNode.getlChild()!=null)
					queue.add(tempNode.getlChild());
				if(tempNode.getrChild()!=null)
					queue.add(tempNode.getrChild());

				if(((tempNode.getlChild()!=null)&&(tempNode.getrChild()==null))||((tempNode.getlChild()==null)&&(tempNode.getrChild()!=null)))
					flag=1;
			}
		}
		if(flag==1) return false;
		else return true;

	}


	public void printExternal() {
		// TODO Auto-generated method stub
		// TODO Use the queue to do the traversal. You can also use the inbuilt Queue
		for(Node<E> temp:nodelist){
			if(temp!=null && temp.isExternal())
			{
				System.out.println(temp.getElement());
			}
		}

	}



}
