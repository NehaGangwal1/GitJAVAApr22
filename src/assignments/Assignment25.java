/*
WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVr
uti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};
Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};
Hint : 0 to 9 --> 48 to 57
          A to Z --> 65 to 90
          a to z --> 97 to 122
*/
package assignments;

import java.util.Arrays;

public class Assignment25 {
	String convertCaseOfString(String input) {
		String output="";
		for (int index= 0; index< input.length(); index++) {
			char ch = input.charAt(index);
			int ascii =ch;
			if (ascii>=65 && ascii<=90) 
				ascii +=32;
			else if (ascii >=97 && ascii<=122)
				ascii -=32;	
			ch = (char)ascii;
			output +=ch;
		}
		return output;	
	}
	
	String[] convertCaseInAllElementOfArray(String[] array) {
		
		for (int index =0;index<array.length;index++) {
			 array[index] =convertCaseOfString(array[index]);
		}
		return array;	
	}
	
	public static void main(String[] args) {
		Assignment25 assignment25 = new Assignment25();
		String[] array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};
		System.out.println("Input = " + Arrays.toString(array));
		System.out.println("Output = " + Arrays.toString(assignment25.convertCaseInAllElementOfArray(array)));
		}
}