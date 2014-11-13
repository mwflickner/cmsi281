public class CustomizedStack{

	private Node top = null;
	
	public CustomizedStack(){
		this.top = null;
	}

	public void push(Object item){
		top = new Node(item, top);
	}

	public Object getTopData(){
		if(top == null){
			throw new java.util.EmptyStackException();
		}
		return top.getData();
	}

	public Object pop(){
		Object popper = getTopData();
		top = top.getNext();
		return popper;
	}

	public int stackSize(){
		int size = 0;
		for (Node i = top; i != null; i = i.getNext()){
			size++;
		}
		return size;
	}

	


}