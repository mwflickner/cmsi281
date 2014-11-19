public class CircularList{
	private Node start = new Node(null,null,null);
	private int size = 0;

	//Constructs an empty Circular List
	public CircularList(){
		start = new Node(null, null, null)
		start.next = start.previous = start;

	}

	public addAtStart(Object obj){
		insertBefore(item, start.next);
	}

	public addToEnd(Object obj){
		instertBefore(obj, start)
	}

	public void insertBefore(Object obj, Node next){
		Node newNode = new Node(obj, next, next.previous);
		newNode.previous.next = newNode;
		newNode.next.previous = newNode;
		size++;

	}

	public void remove(Node obj){
		item.previous.next = item.next;
		item.next.previous = item.previous;

	}

	public void addAtEnd(Object obj){

	}


}