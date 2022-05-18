/*WAP to sum all the numbers in given string, without using Character class method. 
(Note : Use Ascii value concept) .

Input: J7u9y8h1h8j4b7j3j6
Ouput: Sum of all numbers in String is - 54.*/

package assignments;

public class Assignment_24_ASCII {
	
	int sumAllTheNumbersInString(String input){
		int sum = 0;
		for (int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			int ascii = ch;
			if (ascii >=48 && ascii<= 57) {
				sum +=(ascii - 48);
			}	
		}
		return sum ;	
	}
	
	//Using Enhanced For Loop
	
	int sumAllTheNumbersInString1(String input) {
		int sum = 0;
		char[] array = input.toCharArray();
		for(char ch :array) {
			int ascci = ch;
			if (ascci >=48 && ascci <=57) {
				sum +=(ascci -48);
			}
		}
		return sum ;
	}
	
	public static void main(String[] args) {
		Assignment_24_ASCII Assignment_24_ASCII = new Assignment_24_ASCII();
		System.out.println("Sum of all the numbers in given String " +Assignment_24_ASCII.sumAllTheNumbersInString("J7u9y8h1h8j4b7j3j6"));
		System.out.println("Sum of all the numbers in given String " +Assignment_24_ASCII.sumAllTheNumbersInString1("J7u9y8h1h8j4b7j3j6"));
	}

}
