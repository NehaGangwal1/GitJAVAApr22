/*Program 1 : WAP to get expected output.
String input = "TeCHn#oc4re1di-tS";
output : 41TCHSenocredit
Hint : Digit+UC+LC

Program 2 : WAP to return reverse string.

input = "technoCRedits";
output = "stideRConhcet";

Program 3: WAP to reverse a string and covert character case.

input = "te3CHNOCRedit-s";
output = "S-TIDErconhc3ET";

Program 4 : Print first index and last index of Capital letter.
input = "teChnOcreDits";
output : First Uppercase found at index 2, last uppercase found at index 9.

Program 5 : return total space character in a given string.
input  = "Hi He llo How are you";
output = 5;*/

package assignments;

public class Assignment11_String {
	
	String getExpectedOutput(String input) {
		String output="";
		String outputUpperCase ="" ;
		String outputLowerCase="";
		String digit = "";
		System.out.println("Output 1:");
		for (int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					outputUpperCase += ch;
				}
				else {
					outputLowerCase+= ch;
				}		
			}
			else if (Character.isDigit(ch)) {
				digit+=ch;
			}
		}
		
		return output =  digit + outputUpperCase + outputLowerCase;
	}
	
	String reverseString(String input) {
		String output = "";
		System.out.println("Output 2: ");
		for(int index = input.length()-1; index>=0; index--) {
			char ch = input.charAt(index);
			output += ch;
		}
		return output;
	}
	
	String reverseStringCase(String input) {
		String output = "";
		System.out.println("Output 3: ");
		for (int index = input.length()-1; index>=0;index--) {
			char ch = input.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					output += Character.toLowerCase(ch);
				}
				else {
			    output += Character.toUpperCase(ch);	
				}
			}
			else {
				output += ch;
			}	
		}
		return output;
	}
		
	void printFirstAndLastIndex(String input) {
		int startIndex=-1;
		int endIndex=-1;
		System.out.println("Output4:");
		
		for (int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				if (startIndex==-1) {
					startIndex= index;
				}
				endIndex=index ;		
			}	
		}
		System.out.println("First UpperCase found at index " + startIndex);
		System.out.println("Last  UpperCase found at index " + endIndex);
	}
	
	int totalSpaceChar(String input) {
		System.out.println("Output4: ");
		int totalSpace;
		int length = input.length();
		input = input.replace(" ", "");
		int currentLength = input.length();
	return totalSpace = length - currentLength;
	}
	
	public static void main(String[] args) {
		Assignment11_String assignment11_String = new Assignment11_String();
		String output= assignment11_String.getExpectedOutput("TeCHn#oc4re1di-tS");
		System.out.println("Expected Output is " + output);
		String ans = assignment11_String.reverseString("technoCRedits");
		System.out.println("Reverse String  = " + ans);
		String reverseCase = assignment11_String.reverseStringCase("te3CHNOCRedit-s");
		System.out.println(reverseCase );
		assignment11_String.printFirstAndLastIndex("teChnOcreDits");
		System.out.println("Total Space character in given input 'Hi He llo How are you' is "+assignment11_String.totalSpaceChar("Hi He llo How are you"));
		
	}

	
}
