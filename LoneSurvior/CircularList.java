public class CircularList{
	private Node current = null;
	private Node last = null;

	//Constructs an empty Circular List
	public CircularList(){
		this.current = null;
		this.last = null;

	}

	public void insert(<Object> int digit){
		last = current;
		current = new Node(digit, last);
		last.setNext(current);

	}

	public void remove(){
		last.setNext(current.next);
		current.next.setPrev(last);
		current = null;
	}


}