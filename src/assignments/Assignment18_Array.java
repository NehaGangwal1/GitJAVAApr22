/*Assignment 18 : 6th May'2022 [40 mins]

Program 1: Sum all the numbers in a given string.
String str = "10 20 30 40 50";
output : 150

Hint : Use spilt method

Program 2 : Get maximum number from given String.
String str = "10 20 130 40 50";
output : 130

Program 3 : Write a method to convert String array into int array.
int[] convertToIntArray(String[] str){
}*/

package assignments;

import java.util.Arrays;

public class Assignment18_Array {
	
	int sumOfAllNoInString(String str) {
		
		int sum=0;
		String[] arrNum = str.split(" ");
		for(int index=0;index<arrNum.length;index++) {
			sum += Integer.parseInt(arrNum[index]);
		}
		return sum;
	}
	
	int getMaxNumFromString(String str) {
		
		String [] arrNum = str.split(" ");
		int maxNum = Integer.parseInt(arrNum[0]);
		for (int index=0;index<arrNum.length;index++) {
			int temp = Integer.parseInt(arrNum[index]);
			if (maxNum < temp) {
				maxNum = temp;
			}
		}
		return maxNum;
	}
	
	int[] convertStringArrToIntArr(String[] arr) {
		
		int[] numArr = new int[arr.length];
		for (int index=0;index< arr.length;index++) {
			numArr[index] = Integer.parseInt(arr[index]);
		}
		return numArr;		
	}
	public static void main(String[] args) {
		Assignment18_Array assignment18_Array = new Assignment18_Array();
		String str = "10 20 30 40 50";
		System.out.println("Output 1:");
		System.out.println("Sum of All the Numbers in a given String is  "+ assignment18_Array.sumOfAllNoInString(str));
		String input = "10 20 130 40 50";
		System.out.println("Output 2:");
		System.out.println("Maximum Number from given String is " + assignment18_Array.getMaxNumFromString(input));
		String[] arr = {"10","20","30","40","50"};
		System.out.println("Output 3");
		System.out.println("conversion of String Array into Integer Array - "+ Arrays.toString(assignment18_Array.convertStringArrToIntArr(arr)));
	}
}
