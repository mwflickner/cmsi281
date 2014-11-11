import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WordSort {

	//public String theSort

	public static void main(String args[]){
		char check;


		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String input = br.readLine();
			String[] wordList = new String[input.length()];
			int wordCount = 0;
			int wordStart = 0;
			int wordEnd = 0;
			String outputString;
			boolean prevWasLetter= false;

			//splits input into words
			for(int i=0; i<input.length(); i++){
				check = input.charAt(i);
				if(Character.isLetter(check)){
					if(!prevWasLetter){
						wordCount++;
						wordStart = i;
					}
					if(prevWasLetter && i==input.length()-1){
						wordEnd= i+1;
						outputString = input.substring(wordStart, wordEnd);
						wordList[wordCount-1] = outputString;
						prevWasLetter= false;
						System.out.println(outputString);
						System.out.println("Word Count is " + wordCount);
					}

					prevWasLetter = true;
				}
				if(!Character.isLetter(check)){
					if(prevWasLetter){
						wordEnd = i;
						outputString = input.substring(wordStart, wordEnd);
						wordList[wordCount-1]= outputString;
						//System.out.println(outputString);
						//System.out.println("Word Count is " + wordCount);	
					}
					prevWasLetter = false;
				}
			}
			String[] shortWordList = new String[wordCount];

			for(int i = 0; i<wordCount; i++){
				shortWordList[i]=wordList[i];
			}

			Arrays.sort(shortWordList);

			for(int i= 0; i< shortWordList.length; i++){
				System.out.println("Array index " + i + " is " + shortWordList[i]);
			}
				

			

		/*	while((input=br.readLine())!=null){
				System.out.println(input);
			}
		*/

		}catch(IOException io){
			System.out.println("Sorry it didn't work");
		}

	}
}