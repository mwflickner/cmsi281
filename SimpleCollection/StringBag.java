public class StringBag implements SimpleCollection{

	private String[] bag;
	private int elements;
	private boolean isEmpty;
	private final int DEFAULTSIZE = 100;
	private int arrayDouble = 1;

	//constuctor of empty array
	public StringBag(){
		this.elements = 0;
		this.isEmpty = true;
		this.bag = new String[DEFAULTSIZE];
	}
	public StringBag(String s){
		this.elements = 1;
		this.isEmpty = false;
		this.bag = new String[DEFAULTSIZE];
		bag[0] = s;
	}
	public StringBag(int arraySize){
		this.elements = 0;
		this.isEmpty = true;
		this.bag = new String[arraySize];
	}
	public StringBag(String[] args){
		this.isEmpty = args.length == 0;
		this.bag = new String[args.length];
		this.elements = args.length;
		for (int i = 0; i < args.length; i++) {
			this.bag[i] = args[i];
		}
	}

	public boolean add ( Object o ){
		if(o instanceof String){
			if(this.elements >= this.bag.length){
				String[] newArray;
				if (this.bag.length == 0) {
					newArray = new String[DEFAULTSIZE];
				} else {
					newArray = new String[this.bag.length * 2];
				}
				for (int i = 0; i < this.elements; i++) {
					newArray[i] = this.bag[i];
				}
				this.bag = newArray;
			}
			this.isEmpty = false;
			this.bag[elements] = (String) o;
			elements++;
			return true;
		}
		return false;
	}

	public void clear(){
		this.elements = 0;
		this.isEmpty = true;
		this.bag = new String[DEFAULTSIZE];
	}

	public boolean contains ( Object o ){
		if(o instanceof String){
			for(int i = 0; i < this.elements; i++){
				if(o.equals(this.bag[i])){
					return true;
				}
			}
		}
		return false;
	}

	public boolean isEmpty(){
		return this.isEmpty;
	}

	public boolean remove ( Object o ){
		if(o instanceof String){
			for (int i = 0; i < elements; i++) {
				if (o.equals(this.bag[i])) {
					this.bag[i] = this.bag[elements - 1];
					this.bag[elements - 1] = null;
					elements--;
					return true;
				}
			}
		}
		return false;
	}

	public int size(){
		return this.elements;
	}

	public Object[] toArray(){
		return this.bag;
	}

}