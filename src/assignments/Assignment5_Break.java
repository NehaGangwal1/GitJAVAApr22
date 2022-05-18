/*
1. On user define range print first 5 number which is divisible by 7 or 13. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : 
		 7 is divisible by 7
		 13 is divisible by 13
		 14 is divisible by 7
		 21 is divisible by 7
		 26 is divisible by 13
		   
2. Print only first 3 odd numbers in reverse order.
Input : Range -> 10 to 20
output : 19
         17
         15
         
3 Find sum of all the numbers in user define range.
Input : Range -> 1 to 5
output : sum is 15

4. On user define range count all numbers which is divisible by 7 or 13. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, Count is : 8
*/
package assignments;

public class Assignment5_Break {

	int count;

	void printNoDivBy7And13(int startRan, int endRan) {
		count = 0;

		for (int num = startRan; num <= endRan; num++) {

			if (num % 7 == 0) {
				System.out.println(num + " is divisible by 7");
				count++;
			} else if (num % 13 == 0) {
				System.out.println(num + " is divisible by 13");
				count++;
			}

			if (count == 5) {
				break;
			}
		}
	}

	void printOddNo(int startRan, int endRan) {
		count = 0;
		System.out.println("First 3 Odd Numbers in  reverse order in the given range " + startRan + ", " + endRan);
		for (int num = endRan; num >= startRan; num--) {
			if (num % 2 == 0) {
			} else {
				System.out.println(num);
				count++;
			}

			if (count == 3) {
				break;
			}
		}
	}

	void printSumOfNum(int startRan, int endRan) {
		count = 0;
		for (int num = startRan; num <= endRan; num++) {
			count = count + num;
		}
		System.out.println("Sum of All Numbers from " + startRan + " to " + endRan + " is " + count);
	}

	void printCountNo(int startRan, int endRan) {
		count = 0;
		for (int num = startRan; num <= endRan; num++) {
			if (num % 7 == 0 || num % 13 == 0) {
				count++;
			}
		}
		System.out.println(
				"Count of Numbers which is divisible by 7 and 13 between " + startRan + " to " + endRan + " is " + count);
	}

	public static void main(String[] args) {
		
		Assignment5_Break assignment5_Break = new Assignment5_Break();
		assignment5_Break.printNoDivBy7And13(5, 40);
		assignment5_Break.printOddNo(10, 20);
		assignment5_Break.printSumOfNum(1, 5);
		assignment5_Break.printCountNo(5, 40);
	}
}
