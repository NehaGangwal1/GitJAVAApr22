/*WAP to reverse given string in place (without using temp variable).

Hint : Program already discussed in session. please revise it from recording.
*/
package assignments;

public class Assignment13_ReverseString {
	
	String reverseStringInPlace(String input){
		
		for (int index1 = 0,index2 = input.length()-1;index1<index2;index1++,index2--) {
			char ch1= input.charAt(index2);
			char ch2= input.charAt(index1);
			
			input =input.substring(0, index1)+ch1 + input.substring(index1 +1, index2) + ch2 + input.substring(index2 + 1);
		}
		return input;	
	}
	public static void main(String[] args) {
		Assignment13_ReverseString assignment13_ReverseString = new Assignment13_ReverseString();
		String input1 = "Technocredits";
		System.out.println("Reverse String of " + input1 + " is : " + assignment13_ReverseString.reverseStringInPlace(input1));
		String input2 = "Neha";
		System.out.println("Reverse String of " + input2 + " is : " + assignment13_ReverseString.reverseStringInPlace(input2));
		String input3 = "AB";
		System.out.println("Reverse String of " + input3 + " is : " + assignment13_ReverseString.reverseStringInPlace(input3));
	}	
}
