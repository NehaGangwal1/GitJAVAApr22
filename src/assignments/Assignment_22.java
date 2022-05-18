/*Program 1 : Print only unique characters from user defined String.
Hint : Use scanner class.

input : aashvi
output : Unique characters from aashvi is shvi
input : technocredits
output : Unique characters from technocredits is hnordis

Program 2 : Print all the name having atleast one duplicate character. Take input from user.
Hint :
boolean isNameHavingDuplicateChar(String name){
	return true;
}
 void processName(String[] arr){
	for(int index=0;index<arr.length;index++){
		boolean flag = isNameHavingDuplicateChar(arr[index]);
		if(flag == true)
			sop(arr[index]);
	}
}

Program 3 : return reverse string. Take input from user.
input : technocredits
output : stiderconhcet

Program 4 : From user defined input, print frequency of all characters.
input : technocredits

while(input.length()>0){
    char ch = input.charAt(0);
	int ol = input.length();
	input = input.replace(String.valueOf(ch),"");
	int nl = input.length();
	//if((ol-nl) > 1)
		//output += ch;
	sop(ch + "--" + (ol-nl));
}
output : t -> 2
         e -> 2
		 c -> 2
		 h -> 1
		 n -> 1
		 o -> 1
		 r -> 1
		 d -> 1
		 i -> 1
		 s -> 1
*/

package assignments;

import java.util.Scanner;

public class Assignment_22 {
	//Using For Loop
	void printUniqueCharacterFromString(String input) {
		String output = "";
		for (int index=0; index<input.length();index++) {
			 int count =0;
			 char ch = input.charAt(index);
			 for (int index2= 0;index2<input.length();index2++) {
				 if (ch == input.charAt(index2)) {
					 count++;
				 } 
			 }
			 if (count ==1) {
				 output +=ch;	 
			 }
		}
		System.out.println("Unique character from Given String is = " + output);
	}
	boolean isNameHavingDuplicateChar(String name){
		boolean flag = false ;
		String output = "";
		for (int index=0; index<name.length();index++) {
			 int count =0;
			 char ch = name.charAt(index);
			 for (int index2= 0;index2<name.length();index2++) {
				 if (ch == name.charAt(index2)) {
					 count++;
				 } 
			 }
			 if (count>1) {
				 flag = true; 
			 }
		}
		//System.out.println(flag);
		return flag;
	}	
	
	void printNameHavingDuplicateCharacter(String[]array){
		boolean flag ;
		for (int index=0;index<array.length;index++) {
			flag = isNameHavingDuplicateChar(array[index]);
			if (flag) {
				System.out.print(array[index] + " ");
			}
		}
	}
	
	String reverseString(String input){
		String output="";
		for (int index=input.length()-1;index>=0;index--) {
			char ch = input.charAt(index);
			output += ch;		
		}
		return output;
	}
	
	void printFrequencyOfAllCharacter(String str) {
		while (str.length()>0) {
			char ch = str.charAt(0);
			int orignalLen = str.length();
			str = str.replace(String.valueOf(ch),"");
			int currentLen = str.length();
			System.out.println(ch + " -- " + (orignalLen - currentLen));
		}
		
	}
	public static void main(String[] args) {
		Assignment_22 assignment_22 = new Assignment_22();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String to print unique character : ");
		String input =scanner.next();
		assignment_22.printUniqueCharacterFromString(input);
		System.out.println();
		System.out.print("Enter String to print unique character : ");
		String input1 =scanner.next();
		assignment_22.printUniqueCharacterFromString(input1);
		System.out.println();
		System.out.print("enter  Total count Of Array = ");
		int length = scanner.nextInt();
		String[] array = new String [length];
		System.out.print("Please provide String[] array -> ");
		for (int index =0;index<array.length;index++) {
			array[index] =scanner.next();
		}
		System.out.println("Duplicate Syting are ");
		assignment_22.printNameHavingDuplicateCharacter(array);
		System.out.println();
		System.out.println();
		System.out.print("Enter String to print reverse of string : ");
		String input2 =scanner.next();
		System.out.println("Reverse String is :  " + assignment_22.reverseString(input2));
		System.out.println();
		System.out.print("Enter String to print frequency of all Character : ");
		String str = scanner.next();
		assignment_22.printFrequencyOfAllCharacter(str);
	}	
}
