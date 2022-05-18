/*
1. On user define range print all numbers which is divisible by 5. 
	Hint : pass start and end index as a parameter.
	Input : Range -> 10 to 30
	Output : Divisible by 5, numbers are:
			 10
			 15
			 20
			 25
			 30	

2. On user define range print all numbers which is divisible by 5 and divisible by 3. 
	Hint : pass start and end index as a parameter.
	Input : Range -> 5 to 18
	Output : Divisible by 5 & 3, numbers are:
			 15
			 
3. Find sum of all the numbers in user define range.
	Input : Range -> 1 to 5
	output : sum is 15

4. Find difference between sum of odd numbers and even numbers in a given range
	Input : Range -> 3 to 9
	output : 6
	hint : (3+5+7+9) - (4+6+8) = 6
*/
package assignments;

public class Assignment4_ForLoop {

	void displayNo1(int startRange, int endRange) {
		System.out.println("Numbers divisible by 5 in given range are: ");
		for (int index = startRange; index <= endRange; index++) {
			if (index % 5 == 0) {
				System.out.println(index);
			}
		}
	}

	void displayNo2(int startRange, int endRange) {
		System.out.println("Numbers Divisible by 5 and 3 in given range are:");
		for (int index = startRange; index <= endRange; index++) {
			if (index % 5 == 0 && index % 3 == 0) {
				System.out.println(index);
			}
		}
	}

	void displayNo3(int startRange, int endRange) {
		int sum = 0;
		for (int index = startRange; index <= endRange; index++) {
			sum = sum + index;
		}
		System.out.println("Sum of all numbers in given range is " + sum);
	}

	void displayNo4(int startRange, int endRange) {
		int sumOdd = 0;
		int sumEven = 0;
		int diff;
		for (int index = startRange; index <= endRange; index++) {
			if (index % 2 == 0) {
				sumEven = sumEven + index;
			} else {
				sumOdd = sumOdd + index;
			}
		}
		diff = sumOdd - sumEven;
		System.out.println("Difference between Sum of odd numbers and even numbers is " + diff);
	}

	public static void main(String[] args) {
		Assignment4_ForLoop forLoop = new Assignment4_ForLoop();
		forLoop.displayNo1(10, 30);
		forLoop.displayNo2(5, 18);
		forLoop.displayNo3(1, 5);
		forLoop.displayNo4(3, 9);
	}
}
