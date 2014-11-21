public class LoneSurvivor{

	public static boolean isInteger(String s){
		try {
			Integer.parseInt(s);
		} catch(NumberFormatException e){
			return false;
		}
		return true;
	}

	public static void main(String[] args){
		if(args.length>2){
			throw new IllegalArgumentException();
		}
		for(int i = 0; i<args.length; i++){
			if(!isInteger(args[i])){
				throw new IllegalArgumentException();
			}
		}
		int n = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);

		CircularList survive = new CircularList(0);
		for(int i = 1; i < n; i++){
			survive.addAtStart(i);
		}
		survive.traverse(1);
		System.out.println("size of list is " + survive.getSize());

		Node bye;
		while(survive.getSize() != 1){
			survive.traverse(k);
			survive.traverse(1);
			survive.remove(survive.getCursor().getPrevious());
			
		}

		System.out.println(survive.getCursor().toString());

	}
}