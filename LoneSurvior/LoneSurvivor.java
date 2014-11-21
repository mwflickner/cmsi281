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
		if(args.length()>2){
			throw new IllegalArgumentException()
		}
		for(int i = 0; i<args.length; i++){
			if(!isInteger(args[i])){
				throw new IllegalArgumentException()
			}
		}
		int n = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);

		CircularList survive = new CircularList(<Object> n)
		for(int i = n-1, i >= 0, i--){
			survive.insertBefore(<Object> n, survive.next);
		}
		System.out.println("size of list is " + survive.getSize());

		

	}
}