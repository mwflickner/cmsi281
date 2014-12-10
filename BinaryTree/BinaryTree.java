import java.util.Collection;
import java.util.Iterator;

public class BinaryTree implements Collection {
	private TreeNode current = new TreeNode();

	public BinaryTree(){
		this.current = new TreeNode();

	}

	public void makeSon(){
		TreeNode newSon = new TreeNode();
		this.current.setLSon(newSon);
	}

	public void makeBro(){
		TreeNode newBro = new TreeNode();
		this.current.setRBro(newBro);
	}

	public boolean add (Object o){
		current.setData(o);
		return true;
	}

	public boolean contains (Object o){

	}

	public boolean equals (Object o){

	}

	public int hashCode(){

	}

	public boolean isEmpty(){

	}

	public Iterator iterator(){

	}

	public int size(){

	}

	public Object[] toArray(){

	}

	public <T> T[] toArray(T[]a){

	}

}