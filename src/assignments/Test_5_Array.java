
/*Programming Test 5 : 10th May'2022

Only 1 java file having 3 programs in same PR
Max time to raise PR - 1 hr

Program 1: Create a new method to print middle character of all words. 

Input = "Harsh Maulik Krishna";
Output : r is middle character in Harsh
              u is middle character in Maulik 
              s is middle character in Krishna

Program 2: Find first differ index from given arrays. 
                   i/p :- arr1: {10,2,9,14,3}
                            arr2: {10,2,18,14,3}
                   o/p:- Values are not matching at index -> 2
 
 
Program 3: Find all differ index from given arrays. 
                 i/p:- arr1: {10,2,9,14,3}
                        arr2: {10,2,18,14,13}
                o/p:- Values are not matching at index -> 2
                         Values are not matching at index -> 4*/

package assignments;

import java.util.Arrays;

public class Test_5_Array {

	char getMiddleCharacterOfWord(String input) {
		char ch = ' ';
		if (input.length() % 2 == 0) {
			ch = input.charAt(((input.length()) / 2) - 1);
		} else {
			ch = input.charAt(((input.length()) / 2));
		}
		return ch;
	}

	void printMiddleCharacterOfAllWorld(String input) {
		String[] array = input.split(" ");
		for (int index = 0; index < array.length; index++) {
			char ch = getMiddleCharacterOfWord(array[index]);
			System.out.println(ch + " is middle character in " + array[index]);
		}
	}

	void firstDifferIndexFromGivenArray(int arr1[], int arr2[]) {
		for (int index = 0; index < arr1.length; index++) {
			if (arr1[index] != arr2[index]) {
				System.out.println("Values are not matching at index " + index);
				break;
			}
		}
	}

	void allDifferIndexFromGivenArray(int[] array1, int[] array2) {

		for (int index = 0; index < array1.length; index++) {
			if (array1[index] != array2[index]) {
				System.out.println("Values are not matching at index " + index);
			}
		}
	}

	public static void main(String[] args) {
		Test_5_Array test_5_Array = new Test_5_Array();
		String input = "Harsh Maulik Krishna";
		System.out.println("OutPut 1 :");
		test_5_Array.printMiddleCharacterOfAllWorld(input);
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3 };
		System.out.println("OutPut 2 ");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		test_5_Array.firstDifferIndexFromGivenArray(arr1, arr2);
		System.out.println("Output 3");
		int[] array1 = { 10, 2, 9, 14, 3 };
		int[] array2 = { 10, 2, 18, 14, 13 };
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		test_5_Array.allDifferIndexFromGivenArray(array1, array2);

	}

}
