public class CircularList{
	private Node cursor = new Node(null,null,null);
	private int size = 0;

	//Constructs an empty Circular List
	public CircularList(){
		this.cursor = new Node(null, null, null);
		this.cursor.setNext(cursor);
		this.cursor.setPrevious(cursor);

	}

	public CircularList(Object obj){
		this.cursor = new Node(obj, null, null);
		this.cursor.setNext(cursor);
		this.cursor.setPrevious(cursor);
		size++;
	}

	public void setCursor(Node node){
		this.cursor = node;
	}

	public Node getCursor(){
		return cursor;
	}

	public Node indexAt(int index){
		if (index < 0 || index > size){
			throw new IndexOutOfBoundsException("Index is not in range");
		}
		for(int i = 0; i <= index; i++){
			setCursor(cursor.getNext());
		}
		return cursor;

	}

	public void traverse(int distance){
		if(distance < 0){
			throw new IndexOutOfBoundsException();
		}
		while(distance != 0){
			setCursor(cursor.getNext());
			distance--;
		}
	}

	public int indexAt(Object obj){
		int index = 0;
		for(Node n = cursor.getNext(); n!=cursor; n = n.getNext()){
			if(n.equals(obj)){
				return index;
			}
			index++;
		}
		return index;
	}

	public int getSize(){
		return size;
	}

	public void addAtStart(Object obj){
		insertBefore(obj, cursor.getNext());
		setCursor(cursor.getNext());
	}

	public void addToEnd(Object obj){
		insertBefore(obj, cursor);
	}

	public void insertBefore(Object obj, Node node){
		Node newNode = new Node(obj, node, node.getPrevious());
		newNode.getPrevious().setNext(newNode);
		newNode.getNext().setPrevious(newNode);
		size++;

	}



	public void remove(Node node){
		node.getPrevious().setNext(node.getNext());
		node.getNext().setPrevious(node.getPrevious());
		size--;

	}


	


}