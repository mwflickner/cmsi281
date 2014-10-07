public class StringBag implements SimpleCollection{

	private java.util.ArrayList<String> bag;
	private int elements;
	private final int DEFAULTSIZE = 100;
	private int arrayDouble = 1;

	//constuctor of empty array
	public StringBag(){
		this.bag = new java.util.ArrayList<String>(DEFAULTSIZE);
	}
	public StringBag(String s){
		this.bag = new java.util.ArrayList<String>(DEFAULTSIZE);
		bag.add(s);
	}
	public StringBag(int arraySize){
		this.bag = new java.util.ArrayList<String>(arraySize);
	}
	public StringBag(String[] args){
		this.bag = new java.util.ArrayList<String>(args.length);
		for (int i = 0; i < args.length; i++) {
			this.bag.add(args[i]);
		}
	}

	public boolean add ( Object o ){
		if(o instanceof String){
			bag.add((String) o);
			return true;
		}
		return false;
	}

	public void clear(){
		this.bag.clear();
	}

	public boolean contains ( Object o ){
		if(o instanceof String){
			return this.bag.contains(o);
		}
		return false;
	}

	public boolean isEmpty(){
		return this.bag.isEmpty();
	}

	public boolean remove ( Object o ){
		if(o instanceof String){
			return this.bag.remove(o);
		}
		return false;
	}

	public int size(){
		return this.bag.size();
	}

	public Object[] toArray(){
		return this.bag.toArray();
	}

}