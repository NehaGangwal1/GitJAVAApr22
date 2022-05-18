/*
Program 1 : Find max value at differed index.
              i/p:- arr1: {10,2,9,14,3}
                     arr2: {10,2,18,14,3}
              o/p :- Values are not matching at index -> 2, From (9,18) max value is 18

Program 2 :  Find all differ index from given arrays.
               i/p:- arr1: {"Maulik", "Harsh", "Krishna", "Technocredits"}
                       arr2: {"Maulik","Harsh","Technocredits","Krishna"}		
               o/p:- Values are not matching at index -> 2, [arr1 value is Krishna, arr2 value is Technocredits] 
                        Values are not matching at index -> 3, [arr1 value is Technocredits, arr2 value is Krishna]*/

package assignments;

import java.util.Arrays;

public class Assignment21_Array {

	void maxValueAtDifferedIndex(int[] arr1, int[] arr2) {
		for (int index = 0; index < arr1.length; index++) {
			if (arr1[index] != arr2[index]) {
				System.out.println("Values are not matching at index " + index);
				if (arr1[index] < arr2[index])
					System.out
							.println("from (" + arr1[index] + "," + arr2[index] + ")" + "Max Value is " + arr2[index]);
				else
					System.out
							.println("from (" + arr1[index] + "," + arr2[index] + ")" + "Max Value is " + arr1[index]);
				break;
			}
		}
	}

	void allDifferIndexFromGivenArray(String[] array1, String[] array2) {
		for (int index = 0; index < array1.length; index++) {
			if (array1[index] != array2[index]) {
				System.out.println("Values are not matching at index " + index + "," + "[array1 value is "
						+ array1[index] + ", " + "array2 value is " + array2[index] + "]");
			}
		}
	}

	public static void main(String[] args) {
		Assignment21_Array assignment21_Array = new Assignment21_Array();
		System.out.println("OutPut 1 ");
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3 };
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		assignment21_Array.maxValueAtDifferedIndex(arr1, arr2);
		String[] array1 = { "Maulik", "Harsh", "Krishna", "Technocredits" };
		String[] array2 = { "Maulik", "Harsh", "Technocredits", "Krishna" };
		System.out.println("OutPut 2 ");
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		assignment21_Array.allDifferIndexFromGivenArray(array1, array2);

	}

}
