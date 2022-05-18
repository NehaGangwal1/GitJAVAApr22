/*Program 1 : Reverse the element position in a given array. [10 mins]
input : {"Prachi", "Prasad", "Nilofar", "Amar", "Dipali"};
output : {"Dipali", "Amar", "Nilofar", "Prasad", "Prachi"};

Program 2 : Reverse the element and place it at the same index. [15-17 mins]

input : {"Prachi", "Prasad"};
output : {"ihcarP", "dasarP"};

Hint : 
String reverseName(String name){
	
	return output;
}
void reverseArrayElement(String[] input){

	String revString = reserseName(input[0]);
	input[0] = revString;
}

Program 3 : Reverse the element and place it in reserve order. [20-22 mins]

input : {"Prachi", "Prasad", "Nilofar", "Amar", "Dipali"};
output : {"ilapiD", "Amar", "Nilofar", "Prasad", "ihcarP"};

	String str1 = revString(input[0]); // "ihcarP"
	String str2 = revString(input[4]); // "ilapiD"
	
	String temp = str1; // "ihcarP"
	name[0] = str2; // name[0] = "ilapiD"
	name[4] = temp; // name[4] = "Prachi"

--> string reserve
--> for array logic [i<j]
--> position replacement logic

String temp = arr[0];
arr[0] = arr[4];
arr[4] = temp; 

Program 4 : Replace given Strings without using temp String.

input :
name1 = "Techno";
name2 = "Credits";

output :
name2 = "Credits";
name1 = "Techno";

Program 5 : WAP to reverse number without converting the number into String.
input : 123
output : 321*/

package assignments;

import java.util.Arrays;

public class Assignment_14 {

	String[] reverseTheElementPositionInGivenArray(String[] array) {

		for (int startIndex = 0, endIndex = array.length - 1; startIndex < endIndex; startIndex++, endIndex--) {
			String temp = array[startIndex];
			array[startIndex] = array[endIndex];
			array[endIndex] = temp ;
		}
		return array;
	}
	
	String reverseString(String input) {

		for (int startIndex =0,endIndex = input.length() -1;startIndex< endIndex; startIndex++,endIndex--) {
			 char ch1 = input.charAt(endIndex);
			 char ch2 = input.charAt(startIndex);
			 input = input.substring(0,startIndex)+ ch1 + input.substring(startIndex + 1 ,endIndex) + ch2 + input.substring(endIndex+1);
		}
		return input;
	}
	
	String[] reverseArrayElement(String[] input){
		for (int index =0 ;index < input.length;index++) {
			String reverseStr = reverseString(input[index]);
			input[index] = reverseStr;
		}
		return input;
	}
	
	String[] reverseElementAndPlaceInReverseOrder(String[] inputArr) {
		inputArr = reverseArrayElement(inputArr);
		inputArr = reverseTheElementPositionInGivenArray(inputArr);
		return inputArr;
	}
	
	void replaceStringWithoutUsing3rdVariable(String str1, String str2) {
		System.out.println("Input :");
		System.out.println(str1);
		System.out.println(str2);
		str1 = str1 + str2;
		str2= str1.substring(0,str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("Output :");
		System.out.println(str1);
		System.out.println(str2);
	}
	
	int reverseNumber (int num) {
		int reverseNum = 0;
		while (num> 0) {
			 int remainder =num%10;
			 num = num/10; 
			 reverseNum = reverseNum * 10 + remainder;
		}
		return reverseNum ;
	}
	
	public static void main(String[] args) {
		Assignment_14 assignment_14 = new Assignment_14();
		System.out.println("Output 1 : ");
		String[] array = {"Prachi", "Prasad", "Nilofar", "Amar", "Dipali"};
		System.out.println("Reverse of given array " + Arrays.toString(array)+ " is " + Arrays.toString(assignment_14.reverseTheElementPositionInGivenArray(array)));
		System.out.println("Output 2 : ");
		String[] input = {"Prachi", "Prasad"};
		System.out.println("Reverse array element of  given input "+ Arrays.toString(input) + " is = " + Arrays.toString(assignment_14.reverseArrayElement(input)));
		System.out.println("Output 3 : ");
		String[] inputArr = {"Prachi", "Prasad", "Nilofar", "Amar", "Dipali"};
		System.out.println("Reverse of  given Array and its element " + Arrays.toString(inputArr) + " is = " + Arrays.toString(assignment_14.reverseElementAndPlaceInReverseOrder(inputArr)));
		System.out.println("Output 4 : ");
		assignment_14.replaceStringWithoutUsing3rdVariable("Techno", "Credits");
		System.out.println("Output 5 : ");
		int num = 123;
		System.out.println("Reverse Number of " + num + " is = " + assignment_14.reverseNumber(num));
		
	}

}
