public class Node {

	//object object elment to hold data
	private Object data;
	private Node next;
	private Node previous;


	// constructor with a previous pointer
	public Node(Object data, Node next){
		this.data = data;
		this.next = next;
		this.previous = null;

	}

	//constructor with a next pointer and a previous pointer
	public Node(Object contents, Node nextNode, Node prevNode){
		this.data= contents;
		this.next= nextNode;
		this.previous= prevNode;
	}

	//set the data in the Node
	public boolean setData(Object contents){
		this.data = contents;
	}

	//set the next pointer
	public boolean setNext(Node newNext){
		this.next = newNext;
		return true;
	}

	//sets the previous pointer
	public boolean setPrevious(int newPrev){
		this.previous = newPrev;
		return true;
	}

	public int getNext(){
		return this.next;
	}

	public int getPrevious(){
		return this.previous;
	}


}