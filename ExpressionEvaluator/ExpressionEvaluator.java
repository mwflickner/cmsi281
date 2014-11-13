public class ExpressionEvaluator{

	public static boolean isInteger(String s){
		try {
			Integer.parseInt(s);
		} catch(NumberFormatException e){
			return false;
		}
		return true;
	}

	public static boolean isOperator(String operator){
		if(operator.equals("+")){
			return true;
		}
		else if(operator.equals("-")){
			return true;
		}
		else if(operator.equals("x")){
			return true;
		}
		else if(operator.equals("/")){
			return true;
		}
		else if(operator.equals("%")){
			return true;
		}
		else{
			return false;
		}

	}

	public static int operation(String operator, int var1, int var2){
		if(operator.equals("+")){
			return var1+var2;
		}
		else if(operator.equals("-")){
			return var1-var2;
		}
		else if(operator.equals("x")){
			return var1*var2;
		}
		else if(operator.equals("/")){
			return var1/var2;
		}
		else{
			return var1%var2;
		}

	}
	
	public static void main(String[] args){
		CustomizedStack reversePolish = new CustomizedStack();
		for (int i = 0; i<args.length; i++){
			if(isInteger(args[i])){
				reversePolish.push(Integer.parseInt(args[i]));
				System.out.println("pushed "+ Integer.parseInt(args[i]));
			}
			else if(isOperator(args[i])){
				int val1 = (Integer) reversePolish.pop();
				int val2 = (Integer) reversePolish.pop();
				int newPush = operation(args[i], val2, val1);
				System.out.println("New push after operation is " + newPush);
				reversePolish.push(newPush);
			}
			
			else{
				throw new IllegalArgumentException();
			}
		
		}
		int output = (Integer) reversePolish.pop();
		System.out.println("Lewandowski!!! Answer is " + output);	
	}

}