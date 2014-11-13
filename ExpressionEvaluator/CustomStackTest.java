public class CustomStackTest{

	public static void main(String[] args){
		CustomizedStack testStack = new CustomizedStack();
		testStack.push(args[0]);
		Object output = testStack.getTopData();
		System.out.println("The Stack top data is " + output);
		testStack.push(args[1]);
		output = testStack.pop();
		System.out.println("The Stack pops " + output);

	}


}

	