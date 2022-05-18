/*WAP to find second max from user defined array.
input : 10, 20, 11, 99, 54,87, 22
output : 87*/

package assignments;

import java.util.Scanner;

public class Assignment_23 {

	int findMaxNo2FromArray(int[] array) {
		int maxNo1 = array[0];
		int maxNo2 = array[1];

		for (int index = 1; index < array.length; index++) {
			if (maxNo1 < array[index]) {
				maxNo2 = maxNo1;
				maxNo1 = array[index];
			}
			if (maxNo2 <= array[index] && maxNo1 != array[index]) {
				maxNo2 = array[index];
			}
		}
		return maxNo2;
	}

	public static void main(String[] args) {
		Assignment_23 assignment_23 = new Assignment_23();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter total numbers of integers in array : ");
		int length = scanner.nextInt();
		int[] array = new int[length];
		System.out.print("Please Provide The Numbers : ");
		for (int index = 0; index < length; index++) {
			 array[index] = scanner.nextInt();
		}
		System.out.println("Second max no from given array is " + assignment_23.findMaxNo2FromArray(array));
	}

}
