
/*Assignment - 9 : 21st April'2022

Create a class to satisfy below requirements. 
  a) Print Number is prime if Given number is prime. (parameterized method)
  b) Print all the prime numbers between range 100->120. (parameterized method)
       along with that Print total count of prime numbers between same range.
       along with that print sum of all prime numbers between same range
       along with that print avg of prime numbers between same range.

Note : Create methods to satisfy a) and b), call them from main method. (total 3 methods)*/

package assignments;

public class Assignment9_PrimeNumber {
	
	float count=0;
	float sum=0;
	float avg=0;	
	
	void checkPrimeNumber(int num){
			
		boolean isPrimeFlag= true;
		for (int index=2;index<num;index++){
			if (num%index==0){
				isPrimeFlag= false;
			    break;
	     }
			}
			if (isPrimeFlag==true){
				System.out.println(num+ " is prime no");
				count++;
				sum= sum + num;
				avg =sum/count;
			}	
	}
	
	void printPrimeNumber(int startRange, int endRange) {
		count=0;
		sum=0;
		avg=0;
		for(int index=startRange; index<=endRange;index++) {
			checkPrimeNumber(index);
		}
		System.out.println("Total count of prime numbers between " + startRange + " to " + endRange + " is "+ count);
		System.out.println("Sum Of All Prime Numbers Between "+ startRange + " to " + endRange + " is "+ sum);
		System.out.println("Average Of All Prime Numbers Between "+ startRange + " to " + endRange + " is "+ avg);
	}
		public static void main(String[] args){
			Assignment9_PrimeNumber assignment9 = new Assignment9_PrimeNumber();
			assignment9.checkPrimeNumber(17);
			assignment9.checkPrimeNumber(10);
			assignment9.printPrimeNumber(100, 120);
		}
	}

