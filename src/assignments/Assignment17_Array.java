/*Assignment - 17 : 5th May'2022

Program 1 : 
Find the difference between oldest and youngest family members.
Age is in the form of an array.
int[] age = {10,34,38,68,72,95,6};
output : 89

Hint : 95 - 6 = 89

Program 2 : 
Find first N prime numbers from given range.

Input : Range -> 50 to 500, n -> 3
output : 
              53
              59 
              61*/


package assignments;

public class Assignment17_Array {
	
	int getDifferenceBtwOldestAndYongestAge(int [] inputAge) {
		int maxNum = inputAge[0];
		int minNum = inputAge[0];
		for (int index=0;index<inputAge.length;index++) {
			if (maxNum<inputAge[index]) {
				maxNum=inputAge[index];
			}
			else if (minNum> inputAge[index]) {}
				minNum=inputAge[index];	
		}
		return maxNum-minNum;
	}
	
	int count=0;
	void isPrimeNum(int num) {
		boolean flag = true;
		for(int index=2;index<num/2;index++) {
			if (num%index==0) {
				flag = false;
				break;
			}
		}
		if(flag==true) {
			System.out.println(num);
			count++;	
		}	
	}
	void printPrimeNoInRange(int startRange,int endRange,int numToPrint) {
		count =0;
		for(int index=startRange;index<=endRange && count<numToPrint;index++) {
			isPrimeNum(index);	
		}		
	}
	
	public static void main(String[] args) {
		Assignment17_Array assignment17_Array = new Assignment17_Array();
		int[] inputAge = {10,34,38,68,72,95,6};
		int diffAge = assignment17_Array.getDifferenceBtwOldestAndYongestAge(inputAge);
		System.out.println("Difference between oldest and youngest family members is " + diffAge);
		System.out.println("Output 2:");
		System.out.println("First three prime No ");
		assignment17_Array.printPrimeNoInRange(50, 500, 3);		
	}
}
