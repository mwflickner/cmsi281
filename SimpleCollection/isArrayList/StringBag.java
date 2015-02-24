public class StringBag extends java.util.ArrayList<Object> implements SimpleCollection{

	public StringBag(String s){
		super();
		this.add(s);
	}
	
	public StringBag(String[] args){
		super(args.length);
		for (int i = 0; i < args.length; i++) {
			this.add(args[i]);
		}
	}

	public boolean add ( Object o ){
		if(o instanceof String){
			super.add(o);
			return true;
		}
		return false;
	}


	public boolean contains ( Object o ){
		if(o instanceof String){
			return super.contains(o);
		}
		return false;
	}


	public boolean remove ( Object o ){
		if(o instanceof String){
			return super.remove(o);
		}
		return false;
	}
}