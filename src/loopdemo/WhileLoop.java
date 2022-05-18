/* Assignment - 6 : 14th April'2022

Use while loop

Program 1:
Write a method to find out minimum required numbers to generate sum 100.
output : 14

Program 2 : 
On user define range print first 3 number which is divisible by 17 or 13. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : 
		 13 is divisible by 13
		 17 is divisible by 17
		 26 is divisible by 26
		
Program 3 : 
On user define range print first 2 number which is divisible by 5 and 7. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 100
Output : 
		 35
		 70	*/

package loopdemo;

class WhileLoop{

	void findMinNoToGetSum(){
		int num=0;
		int sum=0;
		while(sum<=100){
			num++;
			sum = sum + num;
		}
		System.out.println("Minimum Required No. to generate sum 100 is "+ num);
	}
	
	void printNumDivBy7Or13(int startRan,int endRan){
		int count=0;
		while(startRan<=endRan && count<3){								//5<40
			if (startRan%17==0){
				System.out.println(startRan + " is divisible by 17");
				count++;
			}
			else if (startRan% 13==0){
				System.out.println(startRan + " is divisible by 13");
				count++;
			}
			startRan++;
			//if (count==3)
				//break;
		}	
	}
	void printNumDivBy5And7(int startRan,int endRan){
		int count=0;
		while(startRan<=endRan && count<2){								
			if (startRan%5==0 && startRan%7==0){
				System.out.println(startRan + " is divisible by 5 and 7");
				count++;
			}
			startRan++;
		}	
	}
	
	public static void main(String[] args){
		WhileLoop whileLoop = new WhileLoop();
		whileLoop.findMinNoToGetSum();
		whileLoop.printNumDivBy7Or13(5,40);
		whileLoop.printNumDivBy5And7(5,100);
	}
}













