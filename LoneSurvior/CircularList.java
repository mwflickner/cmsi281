public class CircularList{
	private Node cursor = new Node(null,null,null);
	private int size = 0;

	//Constructs an empty Circular List
	public CircularList(){
		cursor = new Node(null, null, null);
		cursor.setNext(cursor);
		cursor.setPrevious(cursor);

	}

	public CircularList(Object obj){
		cursor = new Node(obj, null, null);
		cursor.setNext(cursor);
		cursor.setPrevious(cursor);
		size++;
	}

	public Node traverse(int index){
		if (index < 0 || index > size){
			throw new IndexOutOfBoundsException("Index is not in range");
		}
		Node base = cursor;
		for(int i = 0; i <= index; i++){
			base = base.getNext();
		}
		return base;

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

	}


	


}