public class ExpressionEvaluator{

	public static boolean isInteger(String s){
		try {
			Integer.parseInt(s);
		} catch(NumberFormatException e){
			return false;
		}
		return true;
	}

	public static boolean isOperand(String s){
		if(s.length() > 1){
			return false;
		}
		char op = s.charAt(0);
		if(isPlus(op)||isMinus(op)||isTimes(op)||isDivide(op)||isMod(op)){
			return true;
		}
		return false;

	}

	public static boolean isPlus(char op){
		if(op == '+'){
			return true;
		}
		else return false;
	}

	public static boolean isMinus(char op){
		if(op == '-'){
			return true;
		}
		else return false;
	}

	public static boolean isTimes(char op){
		if(op == 'x'){
			return true;
		}
		else return false;
	}

	public static boolean isDivide(char op){
		if(op == '/'){
			return true;
		}
		else return false;
	}
	public static boolean isMod(char op){
		if(op == '%'){
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args){
		CustomizedStack reversePolish = new CustomizedStack();
		for (int i = 0; i<args.length; i++){
			if(isInteger(args[i])){
				reversePolish.push(Integer.parseInt(args[i]));
			}
			if(isOperand(args[i])){
				if(isPlus(args[i].charAt(0))){
					int val1 = (Integer) reversePolish.pop();
					int val2 = (Integer) reversePolish.pop();
					reversePolish.push(val1 + val2);
				}
				if(isMinus(args[i].charAt(0))){
					int val1 = (Integer)reversePolish.pop();
					int val2 = (Integer)reversePolish.pop();
					reversePolish.push(val1 - val2);
				}
				if(isTimes(args[i].charAt(0))){
					int val1 = (Integer)reversePolish.pop();
					int val2 = (Integer)reversePolish.pop();
					reversePolish.push(val1 * val2);
				}
				if(isDivide(args[i].charAt(0))){
					int val1 = (Integer)reversePolish.pop();
					int val2 = (Integer)reversePolish.pop();
					reversePolish.push(val1 / val2);
				}
				if(isMod(args[i].charAt(0))){
					int val1 = (Integer)reversePolish.pop();
					int val2 = (Integer)reversePolish.pop();
					reversePolish.push(val1 % val2);
				}

			}

		}
		int output = (Integer)reversePolish.pop();
		System.out.println("Lewandowski!!! Answer is " + output);	
	}

}