public class Node {

	private Object data;
	private Node next;
	private Node previous;


	public Node(Object data, Node next){
		this.data = data;
		this.next = next;
		this.previous = null;
	}

	public Node(Object contents, Node nextNode, Node prevNode){
		this.data= contents;
		this.next= nextNode;
		this.previous= prevNode;
	}

	public boolean setData(Object contents){
		this.data = contents;
		return true;
	}

	public Object getData(){
		return this.data;
	}

	public boolean setNext(Node newNext){
		this.next = newNext;
		return true;
	}

	public boolean setPrevious(Node newPrev){
		this.previous = newPrev;
		return true;
	}

	public Node getNext(){
		return this.next;
	}

	public Node getPrevious(){
		return this.previous;
	}
}