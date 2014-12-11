import java.util.*;

public class BinaryTree<E> implements java.util.Collection<E> {
	private TreeNode root = new TreeNode();
	private BinaryTree leftSubtree;
	private BinaryTree rightSubtree;
	private BinaryTree parent;
	private BinaryTree leftMostNode;

	public BinaryTree(){
		this.root = new TreeNode();
		this.parent = null;
		this.leftSubtree = null;
		this.rightSubtree = null;
		this.leftMostNode = this;
	}

	public BinaryTree(Object o){
		this.root = new TreeNode(o);
		this.parent = null;
		this.leftSubtree = null;
		this.rightSubtree = null;
		this.leftMostNode = this;
	}

	public boolean add (Object o){
		leftMostNode.leftSubtree = new BinaryTree(o);
		this.leftSubtree.parent = this.leftMostNode;
		this.leftMostNode = this.leftSubtree;
		return true;
	}

	public boolean addAll(Collection<? extends E> c){
		throw new UnsupportedOperationException();
	}

	public void clear(){
		throw new UnsupportedOperationException();
	}

	public boolean contains (Object o){
		throw new UnsupportedOperationException("i just can't");
	}

	public boolean containsAll (Collection<?> c){
		throw new UnsupportedOperationException();
	}

	public boolean equals (Object o){
		throw new UnsupportedOperationException("i cri evertiem");
	}

	public int hashCode(){
		throw new UnsupportedOperationException("pls no am crying");
	}

	public boolean isEmpty(){
		if(this.root == null){
			return true;
		}
		else{
			return false;
		}
	}



	public Iterator iterator(){
		throw new UnsupportedOperationException("still crying");
	}

	public boolean remove(Object o){
		throw new UnsupportedOperationException();
	}

	public boolean removeAll(Collection<?> c){
		throw new UnsupportedOperationException();
	}

	public boolean retainAll(Collection<?> c){
		throw new UnsupportedOperationException();
	}

	public int size(){
		throw new UnsupportedOperationException("crying");
	}

	public Object[] toArray(){
		throw new UnsupportedOperationException("gooby pls");
	}

	public Object[] toArray(Object[] a){
		throw new UnsupportedOperationException();
	}

	public static BinaryTree createFromData ( Object rootData, BinaryTree leftSubtree, BinaryTree rightSubtree ){
		throw new UnsupportedOperationException();
		
	}

}